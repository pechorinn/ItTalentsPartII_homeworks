package homework.homework08.Task_02;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Employee {

	public enum Months {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	};

	private String name;
	private int age;
	private double salary;
	private static int idNumber = 0;
	private int personalIdNumber;
	private Company myCompany;
	private Map<Months, Double> salaryByMonth;

	public Employee(String name, int age, double salary, Company myCompany) {
		super();
		this.personalIdNumber = ++idNumber;
		this.name = name + personalIdNumber;
		this.age = age;
		this.salary = salary;
		this.myCompany = myCompany;
		this.salaryByMonth = new HashMap<>();
		initSalaryByMonth();
	}
	
	
	

	private void initSalaryByMonth() {

		for ( Months month   : Months.values() ) {
			salaryByMonth.put(month, new Double(0));
		}
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", personalIdNumber="
				+ personalIdNumber + ", myCompany=" + myCompany.getName() + "]";
	}

	public double getSalary() {

		return salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return personalIdNumber;
	}

	public void setSalary(Months month, double salary) {

		if (!(month instanceof Months)) {
			throw new IllegalArgumentException();
		}

		if (salary < 0) {
			throw new IllegalArgumentException();
		}
		salaryByMonth.put(month, salary);
	}

	public void printSalariesByMonth() {
	
       System.out.println("Employee: " + name);
       System.out.println("================================");
		for (Months month : Months.values()) {
			System.out.println("Salary for " + month + ": " + salaryByMonth.get(month) + "$");
		}
		
		System.out.println("================================");
	}
	
	public Map<Months, Double> getSalaryByMonth() {
		
		return Collections.unmodifiableMap(salaryByMonth);
	}

}
