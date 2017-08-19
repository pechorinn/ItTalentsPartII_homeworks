package homework.homework04.Task_01;

public class Person {
	
	private String name;
	private int age;
	private boolean isMale;
	
	public Person(String name, int age, boolean isMale) {
		super();
		this.name = name;
		
		if(age > 0 && age <150) {
		this.age = age;
		} else {
			System.out.println("Please provide realistic age for the person.");
		}
		
		this.isMale = isMale;
	}
	
	
	void showPersonInfo() {
		System.out.println("-----------------------------------");
		System.out.println("Person's name: " + name + ".");
		System.out.println("Person's age: " + age + ".");
		System.out.println("Person is a man: " + isMale + ".");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isMale() {
		return isMale;
	}


	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	
}
