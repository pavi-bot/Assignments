package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment10_ConditionalStatements_Loops {

	public static void main(String[] args) {
	
		
		        // Employee names
		        String[] employees = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};

		        // Employee data: {Base Salary, Experience, Rating}
		        Double[] emp1Data = {75000.0, 5.1, 4.2};
		        Double[] emp2Data = {68000.0, 3.2, 3.8};
		        Double[] emp3Data = {82000.0, 7.1, 4.5};
		        Double[] emp4Data = {90000.0, 10.2, 2.5};
		        Double[] emp5Data = {60000.0, 2.4, 3.5};

		        // Store employee data in a map
		        Map<String, Double[]> empData = new HashMap<>();
		        empData.put(employees[0], emp1Data);
		        empData.put(employees[1], emp2Data);
		        empData.put(employees[2], emp3Data);
		        empData.put(employees[3], emp4Data);
		        empData.put(employees[4], emp5Data);

		        // Map to store hike percentage
		        Map<String, Double> hikeMap = new HashMap<>();

		        // Calculate hike for each employee
		        for (String emp : employees) {
		            Double[] data = empData.get(emp);
		            double hikePercentage = calculateHike(data[0], data[1], data[2]);
		            hikeMap.put(emp, hikePercentage);
		        }

		        // Print results
		        System.out.println("Hike Percentage for each employee:");
		        for (String emp : employees) {
		            System.out.printf("%s: %.2f%%\n", emp, hikeMap.get(emp));  // formating used to print along with %
		        }
		    }

		    // Method to calculate hike percentage
		    public static double calculateHike(double baseSalary, double experience, double rating) {
		        double variablePayPercent;
		        double bonus;
		        double reward = 0.0;

		        // Decide variable pay and bonus based on rating
		        if (rating >= 4.0) {
		            variablePayPercent = 15.0;
		            bonus = 1500;
		        } else if (rating >= 3.0) {
		            variablePayPercent = 10.0;
		            bonus = 1200;
		        } else {
		            variablePayPercent = 3.0;
		            bonus = 300;
		        }

		        // Extra reward for experience ≥ 5 years
		        if (experience >= 5.0) {
		            reward = 5000;
		        }

		        // Calculate hike amount
		        double hikeAmount = (baseSalary * variablePayPercent / 100) + bonus + reward;

		        // Convert to percentage
		        return (hikeAmount / baseSalary) * 100;
		    }
		

}


