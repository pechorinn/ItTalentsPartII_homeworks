package homework.homework06.Task_01;

public interface INotepad {
	
	void addTextToPage(int pageNumber, String text);
	void overrideText(int pageNumber, String text);
	void clearPage(int pageNumber);
	void printAll();
	boolean searchWord(String word);
	void printAllPagesWithDigits();

}
