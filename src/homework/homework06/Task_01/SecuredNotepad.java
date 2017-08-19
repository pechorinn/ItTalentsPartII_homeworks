package homework.homework06.Task_01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {
	private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{5,}$";
	protected String password;
	private static Scanner sc = new Scanner(System.in);

	SecuredNotepad(int notepadPageCount, String password) {
		super(notepadPageCount);

		if (!SecuredNotepad.passwordSecurityCheck(password)) {
			throw new IllegalArgumentException("Notepad was not created due to weak password.");
		}

		if (password != null && !password.isEmpty()) {
			this.password = password;
		}
		if (!(this instanceof IÅlectronicDevice))
			System.out.println(this);
	}

	@Override
	public void addTextToPage(int pageNumber, String text) {

		if (password != null && passwordValidation()) {
			super.addTextToPage(pageNumber, text);
		}
	}

	@Override
	public void overrideText(int pageNumber, String text) {

		if (password != null && passwordValidation()) {
			super.overrideText(pageNumber, text);
		}
	}

	@Override
	public void clearPage(int pageNumber) {

		if (password != null && passwordValidation()) {
			super.clearPage(pageNumber);
		}
	}

	@Override
	public boolean searchWord(String word) {

		if (password != null && passwordValidation()) {
			super.searchWord(word);
			return true;
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {

		if (password != null && passwordValidation()) {
			super.printAllPagesWithDigits();

		}
	}

	public boolean passwordValidation() {

		System.out.println("Please provide password:");
		if (sc.next().equals(password)) {
			System.out.println("Password confirmed.");
			return true;
		} else {
			System.out.println("Password didn't pass validation check.");
			passwordValidation();
			return false;
		}
	}

	static boolean passwordSecurityCheck(String password) {

		if (password != null && !password.isEmpty()) {
			Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
			Matcher matcher = pattern.matcher(password);
			if (matcher.matches()) {
				return true;
			}

		} else {
			System.out.println("The password provided does not meet security requirements.");
			System.out.println(
					"Password must contain at least one small, at least one capital letter and at least one digit.");
			return false;

		}
		System.out.println("The password provided does not meet security requirements.");
		System.out.println(
				"Password must contain at least one small, at least one capital letter and at least one digit.");
		return false;
	}

	@Override
	public String toString() {
		System.out.println("==============================================");
		return "New Secured Notepad is created with " + notepadPageCount + " pages.";
	}
}
