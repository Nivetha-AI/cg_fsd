const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;

// Predefined interest rates for different loan types
const interestRates = {
    homeLoan: 8.5,    // 8.5% annual interest rate for Home Loan
    carLoan: 10,      // 10% annual interest rate for Car Loan
    educationLoan: 7  // 7% annual interest rate for Education Loan
};

// Set up middleware
app.use(bodyParser.urlencoded({ extended: true }));
app.set('view engine', 'ejs');

// Route to render the EMI form
app.get('/', (req, res) => {
    res.render('index');
});

// Route to calculate EMI based on user inputs
app.post('/calculate', (req, res) => {
    const salary = parseFloat(req.body.salary);
    const loanAmount = parseFloat(req.body.loanAmount);
    const loanType = req.body.loanType;

    // Get interest rate based on loan type
    const interestRate = interestRates[loanType];
    
    // Calculate loan duration based on salary (simplified logic)
    let loanDuration = Math.min(Math.floor(salary / 1000) * 12, 240); // Max duration: 20 years

    // Calculate EMI
    const monthlyInterestRate = interestRate / 12 / 100; // Convert annual rate to monthly
    const numPayments = loanDuration; // Duration in months
    const emi = calculateEMI(loanAmount, monthlyInterestRate, numPayments);

    // Send results to the user
    res.render('result', { emi, loanDuration });
});

// EMI calculation function
function calculateEMI(P, r, n) {
    return (P * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
}

// Start the server
app.listen(port, () => {
    console.log(`EMI Calculator app listening at http://localhost:${port}`);
});
