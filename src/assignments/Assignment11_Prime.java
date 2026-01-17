package assignments;

public class Assignment11_Prime {

	public static void main(String[] args) {
		// Given a number n, determine whether it is a prime number or not. A prime
		// number is a
		// number greater than 1 that has no positive divisors other than 1 and itself.

		int input = 25;

		boolean prime = true; // assuming the number is prime

		// check if input is > 1 otherwise its not prime
		if (input <= 1) {
			System.out.println(input + " is not a prime number");
			prime = false;
		} else {
			// if divisible by anynumber other than itself
			for (int i = 2; i < input; i++) {
				if (input % i == 0) {
					// Found a divisor other than 1 and itself, so it's not prime
					prime = false;
				}
			}

			// Final decision after checking all possible divisors
			if (prime)
				System.out.println(input + " is a prime number");
			else
				System.out.println(input + " is not a prime number");
		}
	}

}
