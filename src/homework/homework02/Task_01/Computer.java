package homework.homework02.Task_01;

public class Computer {

	int year;
	double price;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	boolean isNotebook;

	Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {

		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {

		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
		this.isNotebook = isNotebook;
	}

	int comparePrice(Computer c) {

		if (this.price > c.price) {
			System.out.println("The computer from " + this.year + " and operating system " + this.operationSystem
					+ " is more expensive than computer from " + c.year + " operating system " + c.operationSystem + ".");
			return -1;
		} else if (this.price == c.price) {
			System.out.println("Both computers have the same price.");
			return 0;
		} else {
			System.out.println("The computer from " + this.year + " and operating system " + this.operationSystem
					+ " is less expensive than computer from " + c.year + " operating system " + c.operationSystem + ".");
			return 1;
		}

	}

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
		sb.append("Year of production: " + year).append("\n Price: " + price + " $")
				.append("\n Hard disk memory: " + hardDiskMemory + " MB")
				.append("\n Free memeory: " + freeMemory + " MB").append("\n Operation system: " + operationSystem)
				.append("\n Notebook: " + isNotebook);
		System.out.println(sb);
		System.out.println("--------------------");
	}
}
