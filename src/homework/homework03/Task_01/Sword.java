package homework.homework03.Task_01;

public class Sword {

	private final String name;
	private final int dmg;
	private static final int MAX_DURABILITY = 100;//CONSTANT
	private int durability = MAX_DURABILITY;
	
	public int getDurability() {
		return durability;
	}
	
	public Sword(String name, int dmg) {
		this.name = name;
		this.dmg = dmg;
	}
	
	public int getDmg() {
		return dmg;
	}
	
	public String getName() {
		return name;
	}

	public void crack() {
		this.durability--;
	}

	public void repair() {
		this.durability = MAX_DURABILITY;
	}
	
}
