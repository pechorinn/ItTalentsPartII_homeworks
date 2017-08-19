package homework.homework03.Task_01;

import java.util.Random;

public class Creep {

	private final String name;
	private final int dmg;
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDmg() {
		return dmg;
	}

	public Creep(String name) {
		this.name = name;
		this.dmg = new Random().nextInt(10) + 5;      // from 5 to 14
		this.health = new Random().nextInt(150) + 50; // from 50 to 199
	}

	public void hit(Hero enemy) {
		enemy.setHealth(enemy.getHealth() - this.dmg);
	}

	public void die(Hero hero) {
		if (new Random().nextBoolean()) {
			Sword sword = this.dropSword();
			if (!hero.hasBetterSword(sword)) {
				hero.lootSword(sword);
			}
		} else {
			Axe axe = this.dropAxe();
			if (!hero.hasBetterAxe(axe)) {
				hero.lootAxe(axe);
			}
		}
	}

	public Sword dropSword() {
		return new Sword("Epichniqt mech na Desi", (new Random().nextInt(120) + 30));
	}

	public Axe dropAxe() {
		return new Axe("Qkata bradva na Ivan", (new Random().nextInt(200) + 100));
	}

	public void revive() {
		System.out.println("Revived a creep.");
		this.health = new Random().nextInt(150) + 50;// from 50 to 199
	}

	public String getName() {
		return name;
	}

}
