package assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment5_Arrays_Collections {

	public static void main(String[] args) {

		// 1. Create Lists with area of top 5 largest cities. Print the total area of
		// the 3rd and 4th
		// cities combined.
		System.out.println("****Problem1****");
		List<String> city = new ArrayList<String>();
		city.add("Delhi");
		city.add("Ayodhya");
		city.add("Visakhapatnam");
		city.add("Bengaluru");
		city.add("Hyderabad");

		List<Float> area = new ArrayList<Float>();
		area.add(1484F);
		area.add(872.81F);
		area.add(681.96F);
		area.add(709F);
		area.add(650F);

		float total = area.get(2) + area.get(3);
		System.out.println("Total area of 3rd and 4th: " + total);

		// Create a set of the top 10 most visited tourist attractions in the world and
		// print out all
		// of them and its size.
		System.out.println("****Problem2****");
		Set<String> TouristAttractions = new LinkedHashSet<String>();
		TouristAttractions.add("Eiffel Tower");
		TouristAttractions.add("Great Wall of China");
		TouristAttractions.add("Times Square");
		TouristAttractions.add("Colosseum");
		TouristAttractions.add("Louvre Museum");

		System.out.println(TouristAttractions);
		System.out.println(TouristAttractions.size());

		// Create an array of 10 numbers (any 10 numbers) and print out the Average of
		// 5th and
		// 6th Value.
		System.out.println("****Problem3****");
		Integer[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		Integer Avg = (numbers[4] + numbers[5]) / 2;
		System.out.println("Average of 5th and 6th Value: " + Avg);

		// Create a list of the top 5 highest-grossing movies of all time and print out
		// the third movie on the list.
		List<String> movies = new LinkedList<String>();
		movies.add("Avatar");
		movies.add("Avengers");
		movies.add("Titanic");
		movies.add("Gone Girl");
		movies.add(null);
		System.out.println(movies.get(3));
		
		
		
		
		

	}

}
