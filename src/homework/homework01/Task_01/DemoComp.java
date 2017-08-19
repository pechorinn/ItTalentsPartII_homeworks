package homework.homework01.Task_01;

public class DemoComp {

	public static void main(String[] args) {

		Computer ibm = new Computer();
		Computer sony = new Computer();
		ibm.year = 2005;
		ibm.price = 1000;
		ibm.hardDiskMemory = 100_000; // MB
		ibm.freeMemory = 70_000; // MB
		ibm.operationSystem = "Windows7";
        ibm.isNotebook = true;
        
        sony.year = 2007;
		sony.price = 1500;
		sony.hardDiskMemory = 200_000; // MB
		sony.freeMemory = 140_000; // MB
		sony.operationSystem = "Windows7";
        sony.isNotebook = false;
        
        ibm.useMemory(100);
        sony.changeOperationSystem("Windows10");
        
       ibm.printCompInfo();
       sony.printCompInfo();
	}
}
