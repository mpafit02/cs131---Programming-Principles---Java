
public class testBankAccount {

	public static void main(String[] args) {
		BankAccount savings = new BankAccount("Jimmy", 0.00);
		savings.deposit(10.00);
		savings.deposit(50.00);
		savings.deposit(10.00);
		savings.deposit(70.00); // balance = $140, with 4 transactions
		savings.transactionFee(5.00); // deducts $5+10+15+20; balance = $90; returns true
		savings.transactionFee(10.00); // deducts $10+20+30+40; balance = $0; returns false
		
		BankAccount ben = new BankAccount("Benson", 90.00);
		BankAccount mar = new BankAccount("Marty", 25.00);
		ben.transfer(mar, 20.00); // ben $65, mar $45 (ben loses $25, mar gains $20)
		ben.transfer(mar, 10.00); // ben $50, mar $55 (ben loses $15, mar gains $10)
		ben.transfer(mar, -1); // ben $50, mar $55 (no effect; negative amount)
		mar.transfer(ben, 39.00); // ben $89, mar $11 (mar loses $44, ben gains $39)
		mar.transfer(ben, 50.00); // ben $95, mar $ 0 (mar loses $11, ben gains $ 6)
		mar.transfer(ben, 1.00); // ben $95, mar $ 0 (no effect; no money in account)
		ben.transfer(mar, 88.00); // ben $ 2, mar $88 (ben loses $93, mar gains $88)
		ben.transfer(mar, 1.00); // ben $ 2, mar $88 (no effect; can't afford fee)
		System.out.println(ben.toString());
		System.out.println(savings.toString());
		System.out.println(mar.toString());
		}

}
