package homework.homework02.Task_01;

public class DemoComp {

	public static void main(String[] args) {

		Computer ibm = new Computer();
		ibm = new Computer(2010, 2000, true, 100000, 70000, "Win 8");
		Computer lenovo = new Computer(2005, 1750, 200000, 150000);
		Computer sony = new Computer();

		ibm.printCompInfo();
		sony.printCompInfo();
		lenovo.printCompInfo();
		ibm.comparePrice(lenovo);
	}
}
