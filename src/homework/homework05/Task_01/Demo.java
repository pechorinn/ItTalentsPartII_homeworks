package homework.homework05.Task_01;

public class Demo {

	public static void main(String[] args) {
		
        Employee ivan = new Employee("Ivan");
        ivan.setHoursLeft(8);
		Task task1 = new Task("Cleaning office", 3);
		ivan.setCurrentTask(task1);
		ivan.work();
	}

}
