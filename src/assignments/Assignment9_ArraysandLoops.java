package assignments;

public class Assignment9_ArraysandLoops {

	public static void main(String[] args) {
		 //Store the values in Array and Print second and third largest number from the above values without
		//using collections and default sort methods
		
		int[] num = {12,34,11,36,87,98,93};
		int temp = 0;
		
		for(int i=0;i<num.length;i++) {
			
			for (int j=i+1;j<num.length;j++) {
				if (num[i]<num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
					
				}
			}
			
		}
		
	System.out.println("Second Largest Number: " + num[1]);	
	System.out.println("Third Largest Number: " + num[2]);
	

	}

}
