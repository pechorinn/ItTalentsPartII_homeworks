package homework.homework05.Task_02;

public class AllWork {

	Task[] task;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	AllWork() {
		freePlacesForTasks = 10;
		task = new Task[freePlacesForTasks];
		currentUnassignedTask = 0;
	}

	void addTask(Task t) {
		if(freePlacesForTasks > 0) {
		this.task[this.task.length - freePlacesForTasks--] = t;
		System.out.println("New task added: " + t);
		} else {
			System.out.println("No more tasks can be added.");
		}
	}

	Task getNextTask() {
		Task t = null;
		if (currentUnassignedTask <  this.task.length && freePlacesForTasks < task.length) {
			t = task[currentUnassignedTask++];
			freePlacesForTasks++;
		} 
		return t;
	}

	boolean isAllWorkDone() {
	
		for (int i = 0; i < task.length; i++) {
			if(task[i].getWorkingHours() > 0) {
				return false;
			}
		}
		
		return true;
	}
}
