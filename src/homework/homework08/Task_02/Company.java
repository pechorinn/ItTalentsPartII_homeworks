package homework.homework08.Task_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Company {

	public enum Department {
		SALES, HUMAN_RESOURCES, TRADERS
	}

	private String name;
	private HashMap<Department, Set<Employee>> employees;
	private Random rnd = new Random();

	public Company(String name) {
		super();
		this.name = name;
		this.employees = new HashMap<>();
		employees.put(Department.SALES, new HashSet<>());
		employees.put(Department.HUMAN_RESOURCES, new HashSet<>());
		employees.put(Department.TRADERS, new HashSet<>());

		generateDepartment(Department.SALES, 10);
		generateDepartment(Department.HUMAN_RESOURCES, 15);
		generateDepartment(Department.TRADERS, 17);
	}

	public void generateDepartment(Department department, int numberOfEmployees) {

		for (int i = 0; i < numberOfEmployees; i++) {
			employees.get(department)
					.add(new Employee("Employee ", rnd.nextInt(41) + 20, rnd.nextInt(4001) + 1000, this));
		}
	}

	public void printAllEmployees() {

		for (Entry<Department, Set<Employee>> entry : employees.entrySet()) {

			Department department = entry.getKey();
			System.out.println("Department: " + department);
			for (Employee employee : employees.get(department)) {
				System.out.println(employee);
			}
		}
	}

	private void printSortedEmployees(Comparator<Employee> comp) {

		TreeSet<Employee> sortedEmployees = new TreeSet<>(comp);
		for (Entry<Department, Set<Employee>> entry : employees.entrySet()) {
			sortedEmployees.addAll(entry.getValue());
		}

		for (Employee employee : sortedEmployees) {
			System.out.println(employee);
		}
	}

	public void printSortedBySalaryAscending() {
		System.out.println("==============================================");
		System.out.println("Employees sorted by salary amount ascending: ");
		System.out.println("==============================================");

		printSortedEmployees((Employee a1, Employee b1) -> Double.compare(a1.getSalary(), b1.getSalary()));
	}

	public void printSortedByNameAlphabetically() {
		System.out.println("==============================================");
		System.out.println("Employees sorted by name alphabetically: ");
		System.out.println("==============================================");

		printSortedEmployees((Employee a1, Employee b1) -> a1.getName().compareTo(b1.getName()));
	}

	public void printSortedByAge() {
		System.out.println("==============================================");
		System.out.println("Employees sorted by age: ");
		System.out.println("==============================================");

		printSortedEmployees((Employee a1, Employee b1) -> a1.getAge() - b1.getAge());
	}

	private ArrayList<Employee> getAllEmployeesSorted(HashMap<Department, Set<Employee>> employees,
			Comparator<Employee> comparator) {

		ArrayList<Employee> employee = new ArrayList<Employee>();

		for (Entry<Department, Set<Employee>> entry : employees.entrySet()) {
			Department dep = entry.getKey();
			
			for (Employee em : employees.get(dep)) {
				employee.add(em);
			}
		}
		
		employee.sort(comparator);
		return employee;
	}

	public ArrayList<Employee> getAllEmployeesSortedByNames(HashMap<Department, Set<Employee>> employees) {

		ArrayList<Employee> arrayList = getAllEmployeesSorted(employees, ((Employee a1, Employee b1) -> a1.getName().compareTo(b1.getName())));
        
		return arrayList;
	}

	public HashMap<Department, Set<Employee>> getEmployees() {

		return employees;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
