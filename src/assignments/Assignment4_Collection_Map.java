package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment4_Collection_Map {

	public static void main(String[] args) {

		Map<String, Map<String, String>> excelData = new HashMap<>();

		// ---------------- Sheet 1: StudentDetails ----------------
		Map<String, String> student1 = new HashMap<>();
		student1.put("Name", "John Doe");
		student1.put("Age", "Twenty");
		student1.put("Gender", "Male");
		student1.put("Roll Number", "SBA12345");
		student1.put("Grade", "A++");
		student1.put("Major", "Computer Science");
		student1.put("GPA", "A3.8");
		student1.put("Email", "john@example.com");
		student1.put("PAN Number", "SDF6543210");
		student1.put("Address", "123 Elm St");
		excelData.put("StudentDetails_Row1", student1);

		Map<String, String> student2 = new HashMap<>();
		student2.put("Name", "Jane Smith");
		student2.put("Age", "Twenty One");
		student2.put("Gender", "Female");
		student2.put("Roll Number", "SBA12346");
		student2.put("Grade", "B+");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "A3.5");
		student2.put("Email", "jane@example.com");
		student2.put("PAN Number", "REW6543211");
		student2.put("Address", "456 Oak St");
		excelData.put("StudentDetails_Row2", student2);

		Map<String, String> student3 = new HashMap<>();
		student3.put("Name", "Mike Brown");
		student3.put("Age", "Twenty Two");
		student3.put("Gender", "Male");
		student3.put("Roll Number", "SBA12347");
		student3.put("Grade", "A+");
		student3.put("Major", "Physics");
		student3.put("GPA", "A3.9");
		student3.put("Email", "mike@example.com");
		student3.put("PAN Number", "TYR6543212");
		student3.put("Address", "789 Pine St");
		excelData.put("StudentDetails_Row3", student3);

		// ---------------- Sheet 2: EmployeeDetails ----------------
		Map<String, String> employee1 = new HashMap<>();
		employee1.put("Employee ID", "E001");
		employee1.put("Name", "Alice Green");
		employee1.put("Age", "Thirty");
		employee1.put("Gender", "Female");
		employee1.put("Department", "Engineering");
		employee1.put("Position", "Software Engineer");
		employee1.put("Salary", "75K Pounds");
		employee1.put("Email", "alice@example.com");
		employee1.put("PAN Number", "SDF6543210");
		excelData.put("EmployeeDetails_Row1", employee1);

		Map<String, String> employee2 = new HashMap<>();
		employee2.put("Employee ID", "E002");
		employee2.put("Name", "Bob Johnson");
		employee2.put("Age", "Thirty Five");
		employee2.put("Gender", "Male");
		employee2.put("Department", "Marketing");
		employee2.put("Position", "Marketing Manager");
		employee2.put("Salary", "85K Pounds");
		employee2.put("Email", "bob@example.com");
		employee2.put("PAN Number", "REW6543211");
		excelData.put("EmployeeDetails_Row2", employee2);

		Map<String, String> employee3 = new HashMap<>();
		employee3.put("Employee ID", "E003");
		employee3.put("Name", "Carol White");
		employee3.put("Age", "Twenty Eight");
		employee3.put("Gender", "Female");
		employee3.put("Department", "Sales");
		employee3.put("Position", "Sales Executive");
		employee3.put("Salary", "65K Pounds");
		employee3.put("Email", "carol@example.com");
		employee3.put("PAN Number", "TYR6543212");
		excelData.put("EmployeeDetails_Row3", employee3);

		// ---------------- Sheet 3: ProductDetails ----------------
		Map<String, String> product1 = new HashMap<>();
		product1.put("Product ID", "P001");
		product1.put("Name", "Laptop");
		product1.put("Category", "Electronics");
		product1.put("Price", "12K Pounds");
		product1.put("Stock Quantity", "Not Available");
		product1.put("Supplier", "Tech Supplies");
		product1.put("Warranty", "2 years");
		product1.put("Rating", "4.5 Stars");
		product1.put("Manufacturing Date", "Aug 2023");
		product1.put("Expiry Date", "Aug 2028");
		excelData.put("ProductDetails_Row1", product1);

		Map<String, String> product2 = new HashMap<>();
		product2.put("Product ID", "P002");
		product2.put("Name", "Desk Chair");
		product2.put("Category", "Furniture");
		product2.put("Price", "150K Pounds");
		product2.put("Stock Quantity", "Two");
		product2.put("Supplier", "Office Depot");
		product2.put("Warranty", "1 year");
		product2.put("Rating", "4 Stars");
		product2.put("Manufacturing Date", "Sep 2024");
		product2.put("Expiry Date", "N/A");
		excelData.put("ProductDetails_Row2", product2);

		Map<String, String> product3 = new HashMap<>();
		product3.put("Product ID", "P003");
		product3.put("Name", "Coffee Maker");
		product3.put("Category", "Kitchen");
		product3.put("Price", "75 Pounds");
		product3.put("Stock Quantity", "Two Hundred");
		product3.put("Supplier", "KitchenWorld");
		product3.put("Warranty", "6 months");
		product3.put("Rating", "4.2 Stars");
		product3.put("Manufacturing Date", "Jan 2025");
		product3.put("Expiry Date", "Jan 2027");
		excelData.put("ProductDetails_Row3", product3);

		// ---------------- Print Specific ----------------
		// Retrieve the Office Depot row directly by key
		Map<String, String> officeDepotData = excelData.get("ProductDetails_Row2");

		// Print the entire map (Map's toString handles formatting)
		System.out.println("Product details for Supplier 'Office Depot':");
		System.out.println(officeDepotData);

	}

}
