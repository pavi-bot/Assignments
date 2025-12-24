package assignments;

public class Assignment8_ConditionalStatements_Loops {

	public static void main(String[] args) {
		// store values in array list
		int[] transactions = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };

		// Variables
		int totalCredits = 0;
		int totalDebits = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransactions = 0;

		
		for (int amount : transactions) {
			if (amount > 0) {
				
				totalCredits++; 
				totalCreditAmount += amount; 

				
				if (amount > 10000) {
					System.out.println("Suspicious credit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			} else {
				
				totalDebits++; 
				totalDebitAmount -= amount; 

				
				if (amount < -10000) {
					System.out.println("Suspicious debit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			}
		}

		// Final balance 
		int finalBalance = totalCreditAmount - totalDebitAmount;

		
		System.out.println("----- Transaction Summary -----");
		System.out.println("Total number of credit transactions: " + totalCredits);
		System.out.println("Total number of debit transactions: " + totalDebits);
		System.out.println("Total amount credited: " + totalCreditAmount);
		System.out.println("Total amount debited: " + totalDebitAmount);
		System.out.println("Final remaining amount in the account: " + finalBalance);
		System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);
	}
}
