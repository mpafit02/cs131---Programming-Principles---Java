// A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.
public class BankAccount {
	private String id;
	private double balance;
	private int transactions;

	// Constructs an object with the given id/balance and 0
	// transactions.

	public BankAccount(String id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getID() {
		return id;
	}

	public int getTransactions() {
		return transactions;
	}

	public void setTransactions(int transactions) {
		this.transactions = transactions;
	}
	// Adds amount to balance if between 0-500. Also counts as 1
	// transaction.

	public void deposit(double amount) {
		if (amount >= 0 && amount <= 500) {
			balance += amount;
			transactions++;
		}
	}

	// Subtracts amount from balance if user has enough money. Counts
	// as 1 transaction.

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			transactions++;
		}
	}

	public void transactionFee(double fee) {
		boolean result = true;
		for (int i = 1; i <= transactions; i++) {
			balance -= (fee * i);
		}
		if (balance <= 0) {
			result = false;
			balance = 0;
		}else {
			result = true;
		}
		System.out.println(result);
		System.out.println();
	}

	public void transfer(BankAccount bc, double money) {
		if (this.balance <= 5 || money < 0 || money < 5) {
			// Do nothing
		} else if (this.balance - (money + 5) < 0) {
			this.balance -= 5;
			bc.setBalance(bc.getBalance() + this.balance);
			this.balance = 0;
			this.transactions++;
			bc.setTransactions(bc.getTransactions() + 1);
		} else {
			this.balance -= (money + 5);
			this.transactions++;
			bc.setBalance(bc.getBalance() + money);
			bc.setTransactions(bc.getTransactions() + 1);
		}

	}

	public String toString() {
		String s;
		s = id + ", $" + balance + "\n";
		return s;
	}
}
