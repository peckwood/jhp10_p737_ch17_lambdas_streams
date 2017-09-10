package o4_pojo_stream;

// Fig. 17.10: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProcessingEmployees
{
	public static void main(String[] args)
	{
		// initialize array of Employees
		Employee[] employees = {
				new Employee("Jason", "Red", 5000, "IT"),
				new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"),
				new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"),
				new Employee("Wendy", "Brown", 4236.4, "Marketing")};

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println);

		/////////////////////////////////////////////////////////////////
		Predicate<Employee> salaryBetween4kAnd6k = emp -> emp.getSalary()>=4000 & emp.getSalary()<=6000;
		System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary:%n");
		list.stream()
		.filter(salaryBetween4kAnd6k)
		.sorted(Comparator.comparing(Employee::getSalary))
		.collect(Collectors.toList())
		.forEach(System.out::println);

		// Display first Employee with salary in the range $4000-$6000
		System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
				list.stream()
				.filter(salaryBetween4kAnd6k)
				.sorted(Comparator.comparing(Employee::getSalary))
				.findFirst()
				.get());
		
		// Functions for getting first and last names from an Employee
		
	} // end main
} // end class ProcessingEmployees


/*************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
