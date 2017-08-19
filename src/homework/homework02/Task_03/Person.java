package homework.homework02.Task_03;

public class Person {
	private Car myCar;
	private double moneyInTheBank;
	
	Person() {
		this(null);
	}
	Person( Car car) {
		myCar = car;
	}

	public void buyCar(Car car) {
		this.myCar = car;
		this.moneyInTheBank -= car.getPrice();
	}

	public void sellCar(Car car, double price, Person buyer, CarShop dealer) {
		if (buyer == null) {
			dealer.addCar(car);
			System.out.println("The cas was sold to " + dealer.getName());
		}
		buyer.myCar = this.myCar;
		this.myCar = null;
	}

	public Car getMyCar() {
		return myCar;
	}
}