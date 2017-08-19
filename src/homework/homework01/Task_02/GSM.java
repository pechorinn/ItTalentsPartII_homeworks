package homework.homework01.Task_02;

public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration = 0;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String inputNumber) {

		String number = inputNumber;
		if (isNumberValid(number)) {
			simMobileNumber = number;
			hasSimCard = true;
			System.out.println("SimCard inserted.");
		} else {
			System.out.println("Invalid number!");
		}
	}

	boolean isNumberValid(String number) {

		if (number.matches("08[0-9]{8}")) {
			return true;
		} else {
			return false;
		}
	}

	void removeSimCard() {
		if (hasSimCard) {
			hasSimCard = false;
			System.out.println("SimCard removed.");
		} else {
			System.out.println("There is no simCard inserted.");
		}
	}

	void call(GSM receiver, double duration) {

		if (duration <= 0) {
			System.out.println("Duration must be a positive value!");
			return;
		}

		if (!(receiver.hasSimCard && hasSimCard)) {
			System.out.println("Both phones must have simCards inserted.");
			return;
		}

		if (receiver.simMobileNumber.equals(simMobileNumber)) {
			System.out.println("Receiver and caller must have different phone numbers.");
			return;
		}

		Call currentCall = new Call();
		currentCall.caller = simMobileNumber;
		currentCall.receiver = receiver.simMobileNumber;
		currentCall.duration = duration;
		receiver.lastIncomingCall = currentCall;
		lastOutgoingCall = currentCall;
		outgoingCallsDuration += duration;

	}

	double getSumForCall() {

		return outgoingCallsDuration * Call.priceForAMinute;
	}

	void printInfoForTheLastOutgoingCall() {

		if (lastOutgoingCall != null) {
			StringBuilder sb = new StringBuilder();
			sb.append("Caller: " + lastOutgoingCall.caller).append("\nReceiver: " + lastOutgoingCall.receiver)
					.append("\nPrice of a minute: " + Call.priceForAMinute)
					.append("\nDuration of the call: " + lastOutgoingCall.duration)
					.append("\nTotal cost of the call: " + getSumForCall()).append("\n---------------");
			System.out.println(sb);
		} else {
			System.out.println("No calls to display.");
		}
	}

	void printInfoForTheLastIncomingCall() {

		if (lastIncomingCall != null) {
			StringBuilder sb = new StringBuilder();
			sb.append("Caller: " + lastIncomingCall.caller).append("\nReceiver: " + lastIncomingCall.receiver)
					.append("\nPrice of a minute: " + Call.priceForAMinute)
					.append("\nDuration of the call: " + lastIncomingCall.duration).append("\n---------------");
			System.out.println(sb);

		} else {
			System.out.println("No calls to display.");
		}
	}
}
