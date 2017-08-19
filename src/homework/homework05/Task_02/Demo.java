package homework.homework05.Task_02;

public class Demo {

	static int dayCount = 1;

	public static void main(String[] args) {

		Employee[] employees = new Employee[4];

		Employee gosho = new Employee("Georgi", 28, true, 15);
		Employee pesho = new Employee("Petar", 17, true, 10);
		Employee geri = new Employee("Geri", 19, false, 10);
		Employee kami = new Employee("Kami", 21, false, 10);
		employees[0] = gosho;
		employees[1] = pesho;
		employees[2] = geri;
		employees[3] = kami;

		Task task1 = new Task("Cleaning office", 9);
		Task task2 = new Task("Creating offers for clients", 7);
		Task task3 = new Task("Meeting the clients", 11);
		Task task4 = new Task("New project creation", 20);
		Task task5 = new Task("Making market research", 12);
		Task task6 = new Task("Cleaning office", 15);
		Task task7 = new Task("Creating offers for clients", 10);
		Task task8 = new Task("Meeting the clients", 23);
		Task task9 = new Task("New project creation", 12);
		Task task10 = new Task("Making market research", 4);
		Task task11 = new Task("Making market research", 35);

		AllWork aw = new AllWork();
		aw.addTask(task1);
		aw.addTask(task2);
		aw.addTask(task3);
		aw.addTask(task4);
		aw.addTask(task5);
		aw.addTask(task6);
		aw.addTask(task7);
		aw.addTask(task8);
		aw.addTask(task9);
		aw.addTask(task10);
		aw.addTask(task11);

		for (Employee employee : employees) {
			employee.setAllwork(aw);
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("            Office simulation");
		System.out.println("---------------------------------------------");

		while (true) {
			System.out.println("A new day starts! Day number: " + dayCount++);
			
			for (Employee employee : employees) {
				employee.startWorkingDay();
				employee.work();			
			}
			
          if(aw.isAllWorkDone()) {
        	  System.out.println("All work is done!!!");
        	  System.out.println("It took " + dayCount + " days to complete the tasks.");
        	  break;
          }
          
		}
	}
}
