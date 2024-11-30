
const express = require('express');
const bodyParser = require('body-parser');
const session = require('express-session');
const app = express();
const path = require('path');


let products = [
    { name: 'Laptop', category: 'Digital', price: 100, manufacture_date: '01-01-2024', expiration_date: '01-01-2025' },
    { name: 'FAN', category: 'Electrical', price: 200, manufacture_date: '01-01-2024', expiration_date: '01-01-2025' }
];

app.use(bodyParser.urlencoded({ extended: true }));
app.use(session({
    secret: 'your-secret-key',
    resave: false,
    saveUninitialized: true
}));

function isAdmin(req, res, next) {
    if (req.session && req.session.user && req.session.user.role === 'admin') {
        return next();
    }
    res.redirect('/admin/login');
}

function isUser(req, res, next) {
    if (req.session && req.session.user && req.session.user.role === 'user') {
        return next();
    }
    res.redirect('/user/login');
}

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.use(express.static('public'));

app.get('/', (req, res) => {
    res.render('home');
});

app.get('/admin/login', (req, res) => {
    res.render('admin-login');
});

app.get('/user/login', (req, res) => {
    res.render('user-login');
});

app.post('/admin/login', (req, res) => {
    const { username, password } = req.body;
    if (username === 'admin' && password === 'admin123') {
        req.session.user = { role: 'admin' };
        res.redirect('/admin/dashboard');
    } else {
        res.redirect('/admin/login');
    }
});
app.post('/admin/register-product', isAdmin, (req, res) => {
    const { name, productId, price, category, manufacture_date, expiration_date } = req.body;
    const newProduct = { name, productId, price, category, manufacture_date, expiration_date };
    products.push(newProduct);

    res.redirect('/admin/dashboard');
});

app.post('/user/login', (req, res) => {
    const { username, password } = req.body;
    if (username === 'user' && password === 'user123') {
        req.session.user = { role: 'user' };
        res.redirect('/user/dashboard');
    } else {
        res.redirect('/user/login');
    }
});

app.get('/admin/dashboard', (req, res) => {
    if (req.session.user && req.session.user.role === 'admin') {
        res.render('admin-dashboard', { products });
    } else {
        res.redirect('/admin/login');
    }
});

app.get('/user/dashboard', (req, res) => {
    if (req.session.user && req.session.user.role === 'user') {
        res.render('user-dashboard', { products });
    } else {
        res.redirect('/user/login');
    }
});
app.post('/user/search', isUser, (req, res) => {
    const { searchByName, searchByCategory } = req.body;

    let filteredProducts = products;

    if (searchByName) {
        filteredProducts = filteredProducts.filter(p =>
            p.name.toLowerCase().includes(searchByName.toLowerCase())
        );
    }

    if (searchByCategory) {
        filteredProducts = filteredProducts.filter(p =>
            p.category.toLowerCase().includes(searchByCategory.toLowerCase())
        );
    }

    res.render('user-dashboard', { products: filteredProducts });
});

app.get('/logout', (req, res) => {
    req.session.destroy(() => {
        res.redirect('/');
    });
});


app.listen(3000, () => {
    console.log(`Server is running on port`);
});
