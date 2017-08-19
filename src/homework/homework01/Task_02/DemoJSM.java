package homework.homework01.Task_02;

public class DemoJSM {

	public static void main(String[] args) {

		GSM ivan = new GSM();		
		ivan.removeSimCard();
		ivan.insertSimCard("0888123456");
		ivan.removeSimCard();
		ivan.insertSimCard("0888123456");
		GSM maria = new GSM();
		maria.insertSimCard("0821212121");	
		ivan.call(maria, 5);
		ivan.call(maria, 10.35);
		maria.call(maria, 3);
		System.out.println();
		ivan.printInfoForTheLastOutgoingCall();
		maria.printInfoForTheLastIncomingCall();
		maria.printInfoForTheLastOutgoingCall();
		System.out.println();
		System.out.println("Total outgoing calls Ivan made: " + ivan.outgoingCallsDuration + " minutes.");

	}

}
	