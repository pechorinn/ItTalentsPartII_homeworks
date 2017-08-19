package homework.homework02.Task_03;

public class Demo {

	public static void main(String[] args) {

		CarShop elitcar = new CarShop(6);
		elitcar.showFreeCells();
		System.out.println("currentCar: " + CarShop.getCurrentCar());
		Person buyer = new Person();

		Car audi = new Car("audi", 2010, 300, 25.9);
		Car bmw = new Car("bmw", 2012, 280, 26.9);
		Car vw = new Car("vw", 2013, 170, 20.99);
		Car mercedes = new Car("mercedes", 2014, 330, 29.25);
		Car opel = new Car("opel", 2015, 150, 17.5);
		Car renault = new Car("renault", 2016, 100, 23.75);
		System.out.println(audi.getName());
		buyer.buyCar(bmw);

		elitcar.addCar(audi);
		elitcar.addCar(bmw);
		elitcar.addCar(opel);
		elitcar.addCar(renault);
		elitcar.addCar(mercedes);
		elitcar.addCar(vw);
		elitcar.sellNextCar(buyer);
		System.out.println("currentCar: " + CarShop.getCurrentCar());
		elitcar.showFreeCells();
		System.out.println(elitcar.addCar(opel));
		// elitcar.showAllCarsInTheShop();
		elitcar.showFreeCells();
		System.out.println(elitcar.getMoneyInTheBank());
		elitcar.removeCar(mercedes);
		elitcar.showFreeCells();

		elitcar.removeCar(opel);
		elitcar.removeCar(renault);
		elitcar.showFreeCells();
		Car lada = new Car("lada", 2010, 150, 20.999);
		Car niva = new Car("niva", 2010, 150, 20.999);

		elitcar.addCar(lada);
		elitcar.addCar(niva);
		elitcar.showFreeCells();
		elitcar.sellNextCar(buyer);
		elitcar.sellNextCar(buyer);
		elitcar.sellNextCar(buyer);
		elitcar.sellNextCar(buyer);
		elitcar.sellNextCar(buyer);
		elitcar.sellNextCar(buyer);
		elitcar.addCar(lada);
		elitcar.addCar(niva);
		elitcar.sellNextCar(buyer);
		elitcar.sellNextCar(buyer);
		elitcar.sellNextCar(buyer);
		elitcar.addCar(lada);

		System.out.printf("%.2f%n", elitcar.getMoneyInTheBank());
		System.out.println("currentCar: " + CarShop.getCurrentCar());
		elitcar.showFreeCells();

	}

}