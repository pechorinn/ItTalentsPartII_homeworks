package homework.homework05.Task_02;

public class Task {

	private String name;
	private int workingHours;

	Task(String name, int workingHours) {
		this.name = name;
		this.workingHours = workingHours;
	}

	String getName() {
		return this.name;
	}

	int getWorkingHours() {
		return this.workingHours;
	}

	void setWorkingHours(int setHours) {
		if (workingHours >= 0) {
			this.workingHours = setHours;
		} else {
			System.out.println("Working hours must be a positive value.");
		}
	}

	@Override
	public String toString() {
		return name + ", workingHours: " + workingHours;
	}
	
	
}
