package homework.homework03.Task_01;

public class Dragon {
    static boolean isAlife = true;
	private final String name;
	private final String title;
	private final String color = "Black";
	private final int dmg = 101;
	private int health = 100_000;
	
	public Dragon(String name, String title) {
		this.name = name;
		this.title = title;
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDmg() {
		return dmg;
	}
	
	public void hit(Hero enemy) {
		enemy.setHealth(enemy.getHealth() - this.dmg);
	}
	
}
