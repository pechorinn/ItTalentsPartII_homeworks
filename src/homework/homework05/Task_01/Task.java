package homework.homework05.Task_01;

class Task {

	private String name;
	private int workingHours;

	Task(String name, int workingHours) {
		if (name == null || name.isEmpty()) {
			this.name = "Task for the day";
		} else {
			this.name = name;
		}
		if (workingHours > 0) {
			this.workingHours = workingHours;
		}
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
