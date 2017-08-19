package homework.homework02.Task_03;

public class Car {
	
	private String name;
	private int year;
	private int power;
	private double price;
	
	Car(String name, int year, int power, double price){
		this.setName(name);
		this.setYear(year);
		this.setPower(power);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		else{
			System.out.println("Invalid name " + name);
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year > 1900 && year < 2017){
			this.year = year;
		}
		else{
			System.out.println("Invalid year " + year);
		}
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if(power > 0){
			this.power = power;
		}
		else{
			System.out.println("Invalid input for Power " + power);
		}
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0){
			this.price = price;
		}
		else{
			System.out.println("Invalid input for Price " + price);
		}  	
	}	
}


