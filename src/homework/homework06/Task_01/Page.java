package homework.homework06.Task_01;

class Page {

	private String title;
	private String text;
	
	Page(int pageNumber) {
		this(null, null, pageNumber);
	}

	private Page(String title, String text, int pageNumber) {
		super();
		if (title != null && !title.isEmpty()) {
			this.title = title;
		} else {
			this.title = "New page" + pageNumber;
		}

		if (text != null) {
			this.text = text;
		} else {
			this.text = "";
		}
	}
		
	public void addText(String addedText) {
		this.text += addedText;
	}
	
	public void clearPage() {
		this.text = "";
	}
	
	String viewPage() {
		return title + "\n" + text;
	}
	
	String getText() {
		return text;
	}			
}
