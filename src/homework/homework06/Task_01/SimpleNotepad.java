package homework.homework06.Task_01;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SimpleNotepad implements INotepad {

	protected int notepadPageCount;
	private ArrayList<Page> pages;

	SimpleNotepad(int notepadPageCount) {
		super();
		System.out.println("An attempt to make a new notepad is made.");

		if (notepadPageCount <= 0) {
			System.out.println("Number of pages must be a positive value.");
			notepadPageCount = 100;
		}
		this.notepadPageCount = notepadPageCount;
		this.pages = new ArrayList<>();
		for (int i = 1; i <= notepadPageCount; i++) {
			pages.add(new Page(i));
		}
		if (!(this instanceof ISecuredNotepad))
			System.out.println(this);
	}

	@Override
	public void addTextToPage(int pageNumber, String text) {
		System.out.println("New request is made to add text to a page.");
		if (inputValidation(pageNumber, text)) {
			pages.get(pageNumber - 1).addText(text);
			System.out.println("Text was added to the page.");
			System.out.println("--------------------------------------------------");
		}
	}

	@Override
	public void overrideText(int pageNumber, String text) {
		System.out.println("New request is made to override text to a page.");
		if (inputValidation(pageNumber, text)) {
			pages.get(pageNumber - 1).clearPage();
			pages.get(pageNumber - 1).addText(text);
			System.out.println("Text was overriden.");
			System.out.println("--------------------------------------------------");
		}
	}

	@Override
	public void clearPage(int pageNumber) {
		System.out.println("New request is made to clear content from the page.");
		pages.get(pageNumber - 1).clearPage();
		System.out.println("Page was cleared.");
		System.out.println("--------------------------------------------------");
	}

	@Override
	public void printAll() {
		System.out.println("Printing all records: ");
		System.out.println("--------------------------------------------------");
		for (Page page : pages) {
			System.out.println(page.viewPage());
		}
		System.out.println("--------------------------------------------------");
	}

	boolean inputValidation(int pageNumber, String text) {

		if (text == null) {
			System.out.println("Please provide text to add to the page.");
			System.out.println("--------------------------------------------------");
			return false;
		}
		if (pageNumber < 1 || pageNumber > notepadPageCount) {
			System.out.println("Please provide valid number for the page.");
			return false;
		}
		return true;
	}

	@Override
	public boolean searchWord(String word) {

		for (Page page : pages) {

			if (page.getText() != null) {
				if (page.getText().contains(word)) {
					System.out.println("Such word is in the records.");
					System.out.print(page.viewPage());
					System.out.println("\n--------------------------------------------------");
					return true;
				}
			}
		}
		System.out.println("Such word is not in the records.");
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		boolean hasDigits = false;
		System.out.println("Printing pages with digits if any: ");
		System.out.println("--------------------------------------------------");
		for (Page page : pages) {
			Pattern p = Pattern.compile("([0-9])");
			if (page.getText() != null) {
				Matcher m = p.matcher(page.getText());
				if (m.find()) {
					hasDigits = true;
					System.out.println(page.viewPage());
				}
			}
		}
		if (!hasDigits) {
			System.out.println("Such word is not in the records.");
		} else {
			System.out.println("--------------------------------------------------");
		}
	}

	@Override
	public String toString() {
		System.out.println("==============================================");
		return "A new notepad created with " + notepadPageCount + " pages.";
	}

}
