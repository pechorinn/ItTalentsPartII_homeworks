package homework.homework06.Task_01;

public class NotepadDemo {

	public static void main(String[] args) {

		INotepad notepad = new SimpleNotepad(10);
		notepad.addTextToPage(10, "Some text");
		notepad.addTextToPage(1, "Another text");
		notepad.addTextToPage(-50, "Another text");
		notepad.addTextToPage(5, "Another text");
		notepad.addTextToPage(5, " Another text");
		notepad.addTextToPage(10, " tough");
		notepad.addTextToPage(1, " text");
		notepad.clearPage(5);
		notepad.printAll();

		INotepad sn = new SecuredNotepad(15, "3535adidaS");
		sn.addTextToPage(2, "Iskam");
		sn.addTextToPage(5, "Be the success!!!");
		sn.clearPage(2);
		sn.printAll();
		
		ISecuredNotepad securedNotepad = new SecuredNotepad(7, "3535adidaS");
		securedNotepad.addTextToPage(1, "Let's make it easy.");
		securedNotepad.addTextToPage(1 , " It's easy indeed.");
		securedNotepad.printAll();
		
		IÅlectronicDevice ied = new ElectronicSecuredNotepad(14,"3535adidaS");
			
		ied.addTextToPage(5, "Gladiator");
		ied.start();
		ied.addTextToPage(5, "Gladiator");
		ied.addTextToPage(10, "Moscow534");
		ied.addTextToPage(11, "Kiev123");
		ied.addTextToPage(11, "Sofia");
        ied.printAll();
        ied.printAllPagesWithDigits();
        ied.searchWord("Kiev");
	}
}
