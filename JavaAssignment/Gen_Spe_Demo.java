package com.Inheritance;

//Generalization 
class BankAccount {
	String accountNumber;
	double balance;

	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited successfully : " + amount + "New Balance :" + balance);
		} else {
			System.out.println("deposite amount must be positive ");
		}
	}

	public void withDraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdrqw successfully : " + amount + "New Balance :" + balance);
		} else {
			System.out.println("insufficient balance ");
		}
	}

	public void checkBalance() {
		System.out.println("Balance for account " + accountNumber + " $ " + balance);
	}
}

//specialization 
class SavingsAccount extends BankAccount {
	double intRate;

	public SavingsAccount(String accountNumber, double balance, double intRate) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		this.intRate = intRate;
	}

	public void applyInterest() {
		double intr = balance * intRate;
		balance += intr;
		System.out.println("Interest of $ " + intr + " applied New balance " + balance);

	}
}

class CheckingAccount extends BankAccount {
	double fee;

	public CheckingAccount(String accountNumber, double balance, double fee) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		this.fee = fee;
	}

	@Override
	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		super.withDraw(amount);
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			balance -= fee;
			System.out.println("withdraw " + amount + " with fee of " + fee);
		} else {
			System.out.println("Insufficieant balance ");
		}
	}

}

class SIPAccount extends BankAccount {
	double monthlyInvestment;
	double durationInMonths;
	double annualRate;

	public SIPAccount(String accountNumber, double balance, double monthlyInvestment, double durationInMonths,
			double annualRate) {
		super(accountNumber, balance);
		this.monthlyInvestment = monthlyInvestment;
		this.durationInMonths = durationInMonths;
		this.annualRate = annualRate;
	}

	public void calculateReturns() {
		double ratePerMonth = annualRate / 12 / 100;
		double futureValue = monthlyInvestment * ((Math.pow(1 + ratePerMonth, durationInMonths) - 1) / ratePerMonth)
				* (1 + ratePerMonth);
		System.out.println("Future value of SIP: " + futureValue);
	}
}

//Trading Account
class TradingAccount extends BankAccount {
	double brokerageFee;

	public TradingAccount(String accountNumber, double balance, double brokerageFee) {
		super(accountNumber, balance);
		this.brokerageFee = brokerageFee;
	}

	public void trade(double tradeAmount) {
		if (tradeAmount + brokerageFee <= balance) {
			balance -= (tradeAmount + brokerageFee);
			System.out.println("Trade executed for $" + tradeAmount + ", Brokerage fee: $" + brokerageFee
					+ ", New Balance: $" + balance);
		} else {
			System.out.println("Insufficient balance for trade");
		}
	}
}

class BusinessAccount extends BankAccount {
	double loanLimit;

	public BusinessAccount(String accountNumber, double balance, double loanLimit) {
		super(accountNumber, balance);
		this.loanLimit = loanLimit;
	}

	public void requestLoan(double loanAmount) {
		if (loanAmount <= loanLimit) {
			System.out.println("Loan of $" + loanAmount + " approved for account " + accountNumber);
		} else {
			System.out.println("Loan amount exceeds limit. Maximum loan allowed: $" + loanLimit);
		}
	}
}

public class Gen_Spe_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount("SA123", 5000, 0.03);
		sa.deposit(10000);
		sa.applyInterest();// specialization apply for savingAccount

		CheckingAccount ca = new CheckingAccount("CA456", 4000, 2.5);
		ca.deposit(1000);
		ca.withDraw(200);// specialization withdraw with fee for checkingAccount

		SIPAccount sip = new SIPAccount("SIP789", 0, 500, 24, 12);
		sip.calculateReturns();

		TradingAccount ta = new TradingAccount("TRA123", 10000, 50);
		ta.trade(1000);

		BusinessAccount ba = new BusinessAccount("BUS456", 20000, 50000);
		ba.requestLoan(30000);
		ba.requestLoan(60000);
	}

}
