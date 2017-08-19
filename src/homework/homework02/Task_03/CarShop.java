package homework.homework02.Task_03;

public class CarShop {

	private static Car[] showRoom;
	private static int freePlaces;
	private static int currentCar;
	private static String name = "Cars.bg";
	private static double moneyInTheBank;

	CarShop(int capacity) {
		showRoom = new Car[capacity];
		freePlaces = capacity;
	}

	public static int getCurrentCar() {
		if(showRoom[currentCar] == null)locateCurrentCar();
		return currentCar;
	}

	public void addMoney(double income) {
		moneyInTheBank += income;
	}

	public boolean addCar(Car car) {
		if (freePlaces > 0) {
			for (int i = 0; i < showRoom.length; i++) {
				if (showRoom[i] == null) {
					showRoom[i] = car;
					freePlaces--;
					System.out.println("Automobile " + car.getName() + " is added to the shop on position " + (i + 1));
					break;
				}
			}
			return true;
		} else {
			System.out.println("No more available places.");
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public Car getNextCar() {
		if(showRoom[currentCar] == null)locateCurrentCar();		
		return showRoom[currentCar];
	}

	public void sellNextCar(Person buyer) {
		
		if(!hasCars()) {
			System.out.println("No more cars for sale!!!");
			return;
		}
				
		buyer.buyCar(getNextCar());
		addMoney(getNextCar().getPrice());
		removeCar(getNextCar());
		if (currentCar < showRoom.length - 1) {
			currentCar++;
		} else {
			locateCurrentCar();
		}
		
		System.out.println("Car sold - " + buyer.getMyCar().getName());
	}	

	public boolean removeCar(Car car) {
		for (int i = 0; i < showRoom.length; i++) {
			if (showRoom[i] != null && car.getName().equals(showRoom[i].getName())
					&& car.getPower() == showRoom[i].getPower() && car.getPrice() == showRoom[i].getPrice()
					&& car.getYear() == showRoom[i].getYear()) {
				showRoom[i] = null;
				freePlaces++;
				System.out.println("Автомобилът e премахнат." + car.getName());
				return true;
			}
		}

		return false;
	}

	public void showAllCarsInTheShop() {
		System.out.println("The cars available at " + name + ":\n");
		for (int i = 0; i < showRoom.length; i++) {
			if (showRoom[i] != null) {
				System.out.println("Марка: " + showRoom[i].getName());
				System.out.println("Година на производство: " + showRoom[i].getYear());
				System.out.println("Мощност: " + showRoom[i].getPower());
				System.out.println("Цена: " + showRoom[i].getPrice());
				System.out.println();
			}
		}
	}

	public void showFreeCells() {
		for (int i = 0; i < showRoom.length; i++) {
			System.out.print(i + 1 + "|");
		}
		System.out.println();
		for (int i = 0; i < showRoom.length; i++) {
			System.out.print((showRoom[i] == null ? 0 : 1) + "|");
		}
		System.out.println();
	}

	public double getMoneyInTheBank() {
		return moneyInTheBank;
	}

	private static void locateCurrentCar() {
		if(!hasCars()) {
			System.out.println("No cars at the moment in show room.");
			return;
		}
		for (int i = 0; i < showRoom.length; i++) {
			if (showRoom[i] != null) {
				currentCar = i;
				return;
			}
		}
	}
	
	private static boolean hasCars() {
		
		for(int i = 0; i < showRoom.length; i++) {
			if(showRoom[i] != null) {
				return true;
			}
		}	
		return false;
	}
}