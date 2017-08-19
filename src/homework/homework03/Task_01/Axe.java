package homework.homework03.Task_01;

public class Axe {

	private final String name;
	private final int dmg;
	private static final int MAX_DURABILITY = 140;//CONSTANT
	private int durability = MAX_DURABILITY;
	
	public Axe(String name, int dmg) {
		this.name = name;
		this.dmg = dmg;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDurability() {
		return durability;
	}
	
	public int getDmg() {
		return dmg;
	}

	public void crack() {
		this.durability--;
	}

	public void repair() {
		this.durability = MAX_DURABILITY;
	}
}
