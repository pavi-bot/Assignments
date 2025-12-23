package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {

		int creditscore = 720;
		double income = 55000.0;
		boolean isemp = true;
		String customer = "John Doe";
		double DTI = 35.0;

		System.out.println(customer + "'s Loan Status");
		if (creditscore > 750) {
			System.out.println("the loan is automatically approved");
		} else if (creditscore >= 650 && creditscore <= 750) {

			if (income >= 50000) {
				if (isemp) {
					if (DTI <= 40) {
						System.out.println("Loan Approved, met all criteria");
					} else {
						System.out.println("the loan is denied, DTI is high");
					}
				} else {
					System.out.println("Loan Denied, Customer is unemployed");
				}
			} else {
				System.out.println("Loan Denied, Income dint meet criteria");
			}
		} else {
			System.out.println("the loan is denied, Credit score is low");
		}

	}

}
