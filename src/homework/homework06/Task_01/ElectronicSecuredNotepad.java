package homework.homework06.Task_01;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {

	private boolean isStarted;

	ElectronicSecuredNotepad(int notepadPageCount, String password) {
		super(notepadPageCount, password);
		System.out.println(this);
	}

	@Override
	public void addTextToPage(int pageNumber, String text) {

		if (isStarted()) {
			super.addTextToPage(pageNumber, text);
		} else {
			System.out.println("Please turn on the notepad first!");
			System.out.println("---------------------------------");
		}
	}

	@Override
	public void overrideText(int pageNumber, String text) {
		if (isStarted()) {
			super.overrideText(pageNumber, text);
		} else {
			System.out.println("Please turn on the notepad first!");
			System.out.println("---------------------------------");
		}
	}

	@Override
	public void clearPage(int pageNumber) {
		if (isStarted()) {
			super.clearPage(pageNumber);
		} else {
			System.out.println("Please turn on the notepad first!");
			System.out.println("---------------------------------");
		}
	}

	@Override
	public void start() {
		if (!isStarted) {
			isStarted = true;
			System.out.println("The electronic notepad is switched on.");
			System.out.println("---------------------------------");

		} else {
			System.out.println("The electronic notepad is already on.");
			System.out.println("---------------------------------");
		}
	}

	@Override
	public void stop() {
		if (isStarted) {
			isStarted = false;
			System.out.println("The electronic notepad is swithched off.");
			System.out.println("---------------------------------");

		} else {
			System.out.println("The electronic notepad is already off.");
			System.out.println("---------------------------------");

		}
	}

	@Override
	public boolean searchWord(String word) {

		if (isStarted()) {
			super.searchWord(word);
			return true;
		} else {
			super.searchWord(word);
			return false;
		}
	}

	@Override
	public void printAllPagesWithDigits() {

		if (isStarted()) {
			super.printAllPagesWithDigits();

		} else {
			super.printAllPagesWithDigits();
		}
	}

	@Override
	public boolean isStarted() {
		return isStarted;
	}

	@Override
	public String toString() {
		System.out.println("==============================================");
		return "New Electronic Secured Notepad is created with " + notepadPageCount + " pages.";
	}
}
