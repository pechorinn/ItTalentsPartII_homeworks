package homework.homework04.Task_01;

public class Student extends Person {
	
	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if(score >= 2 && score <=6) {
        this.score = score; 
		} else {
			System.out.println("The score should be a value between 2 and 6");
		}
        
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("The person's score: " + score);
		System.out.println();
	}
}
