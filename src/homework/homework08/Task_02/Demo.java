package homework.homework08.Task_02;

import java.util.Stack;

public class Demo {
	/*
	 * 
	 * Tasks 1. Write a program that fills Employee objects into a Company. The
	 * company has a name and a collection of Employees separated in different
	 * departments. Each employee has name, age, salary and an ID number.
	 * Departments are known by their name only. Write a demo that creates the
	 * company and adds employees into different departments. Then list all
	 * employees that the company has. The output of the program should be a
	 * list of departments and a sublist of employees for each department. 2.
	 * 
	 */

	public static void main(String[] args) {

		/*
		 * Write a program that sorts the Employee objects in the company
		 * getter: ● Based on highest salary; ● Based on their names
		 * alphabetically; ● Based on their age.
		 */

		Company company = new Company("Stars");
		company.printAllEmployees();
		company.printSortedBySalaryAscending();
		company.printSortedByNameAlphabetically();
		company.printSortedByAge();

		/*
		 * Write a method in the above program that takes the collection of
		 * employees by department as an argument and returns a collection of
		 * all employees that work in the company. The collection must be sorted
		 * by their names.
		 * 
		 */
		System.out.println(company.getAllEmployeesSortedByNames(company.getEmployees()));

		/*
		 * Write a method in the above program that eliminates the duplicate
		 * Employees. Duplicate employees have identical names and age.
		 */

		// it was achieved by using Set as value for a HashSet instead of ArrayList: -
		// "private HashMap<Department, Set<Employee>> employees;" and
		// overriding HashCodes and Equals methods as applicable

		/*
		 * Write a program that reads a piece of programming code and tells if
		 * the curly braces “{” and “}” are all put. This means that each “{”
		 * should have a corresponding “}”
		 * 
		 */

		String braces = "{{}}";
		Stack<Character> stack = new Stack<>();
		boolean theBracesAreOk = true;
			for (int i = 0; i < braces.length(); i++) {
			if (stack.isEmpty() && braces.charAt(i) == '}') {
				theBracesAreOk = false;
				break;
			}
			if (braces.charAt(i) == '{') {
				stack.push('{');
			}
			if (stack.isEmpty()) {
				theBracesAreOk = false;
				break;
			}
			if (braces.charAt(i) == '}') {
				stack.pop();
			}
		}

		if (theBracesAreOk && stack.isEmpty()) {
			System.out.println("The braces provided are ok.");
		} else {
			System.out.println("One or more braces are missing.");
		}
		
		if(theBracesAreOk) {
				System.out.println("The braces provided are ok.");
			}

	}

}
