package homework.homework01.Task_01;

public class Computer {

	int year;
	double price;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	boolean isNotebook;

	void changeOperationSystem(String newOperationSystem) {

		operationSystem = newOperationSystem;
	}

	void useMemory(double memory) {

		if (memory > 0) {

			if (freeMemory - memory >= 0) {
				freeMemory -= memory;
			} else {
				System.out.println("Not enough free memory!");
			}

		} else {
			System.out.println("Memory used must be positive value!");
		}
	}
	
	void printCompInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Year of production: " + year)
		  .append("\n Price: " + price + " $")
		  .append("\n Hard disk memory: " + hardDiskMemory + " MB")
		  .append("\n Free memeory: " + freeMemory + " MB")
		  .append("\n Operation system: " + operationSystem)
		  .append("\n Notebook: " + isNotebook);
		System.out.println(sb);
		System.out.println("--------------------");
	}
}
