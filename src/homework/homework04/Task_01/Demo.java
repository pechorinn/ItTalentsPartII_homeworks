package homework.homework04.Task_01;

public class Demo {

	public static void main(String[] args) {

		Person[] people = new Person[10];
		
		Person ivan = new Person("Ivan", 30, true);
		Person maria = new Person("Maria", 25, false);
		Student straho = new Student("Strahil", 26, true, 5.05);
		Student eli = new Student("Elitsa", 27, false, 5.5);
		Employee gosho = new Employee("Georgi", 28, true, 15);
		Employee pesho = new Employee("Petar", 17, true, 10);
		people[0] = ivan; people[1] = maria; people[2] = straho; people[3] = eli; people[4] = gosho ; people[5] = pesho;
		
		for(Person p : people) {
			if(p == null) break;
			if(p instanceof Employee) {
				((Employee) p).showEmployeeInfo();
			} else if(p instanceof Student) {
				((Student) p).showStudentInfo();
			} else {
				p.showPersonInfo();
			}
		}	
		
		for(Person p : people) {
			
			if(p instanceof Employee) {
				System.out.println(p.getName() + " gets " + ((Employee) p).calculateOvertime(2) + "$ for 2 hours overtime.");
			}
		}
	}
}
