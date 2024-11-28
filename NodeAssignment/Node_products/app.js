const express = require('express');
const app = express();
const port = 3000;
const bodyParser = require('body-parser');

// Middleware to parse JSON data
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// In-memory database for products
let products = [
    { id: '1', name: 'Tv', description: '24 inch', price: 50000 },
    { id: '2', name: 'Fridge', description: 'Double door', price: 60000 }
];


// Route to display list of products
app.get('/products', (req, res) => {
    res.send(`
        <h1>Product Catalog</h1>
        <ul>
            ${products.map(product => `
                <li>
                    <a href="/products/${product.id}">${product.name}</a> - 
                    ${product.description} - $${product.price}
                </li>`).join('')}
        </ul>
        <form method="POST" action="/add-product">
            <input type="text" name="name" placeholder="Enter Product Name" required>
            <input type="text" name="description" placeholder="Product Description" required>
            <input type="number" name="price" placeholder="Price" required>
            <button type="submit">Add Product</button>
        </form>
    `);
});

// Route to display product details by ID
app.get('/products/:id', (req, res) => {
    const productId = req.params.id;
    const product = products.find(p => p.id === productId);

    if (!product) {
        return res.status(404).send('<h1>Product Not Found</h1>');
    }

    res.send(`
        <h1>${product.name}</h1>
        <p>Description: ${product.description}</p>
        <p>Price: $${product.price}</p>
        <a href="/products">Back to Product List</a>
    `);
});

// Route to add a new product 
app.post('/add-product', (req, res) => {
    const { name, description, price } = req.body;
    const newProduct = {
        id: (products.length + 1).toString(), 
        name,
        description,
        price: parseFloat(price)
    };

    products.push(newProduct);
    res.redirect('/products'); 
});

// Start server
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
