package assignments;

public class EmpGroups {
	
	
	

	/*String [][] emp = new String [2][3];
	emp [0][0] = obj.Emp1;
	emp [0][1] = obj.Emp2;
	emp [0][2] = obj.Emp3;
	
	emp [1][0] = obj.EmpID1; 
	emp [1][1] = obj.EmpID2; 
	emp [1][2] = obj.EmpID3; */

	public static void main(String[] args) {
		Employees obj = new Employees();
		String [] emp = {obj.Emp1, obj.Emp2, obj.Emp3};
		int [] empID = {obj.EmpID1,obj.EmpID2,obj.EmpID3};
		
		System.out.println("Employee Name: " + emp [0] + ", " +  "Employee ID: " + empID [0] );
		

	}

}
