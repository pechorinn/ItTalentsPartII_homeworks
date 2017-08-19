package homework.homework03.Task_01;

public class Hero {
	static final int maxCountOfLives = 118;
	static boolean isHeroAlife = true;
	static int countOfLifes = 0;
	private final String name;
	private int health = 200;
	private int dmg = 10;
	private Sword sword;
	private Axe axe;

	public int getDmg() {
		return dmg;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public Hero(String name) {
		this.name = name;
	}

	public void lootSword(Sword s) {
		this.sword = s;
	}

	public void lootAxe(Axe a) {
		this.axe = a;
	}

	public boolean hasBetterSword(Sword other) {
		if (this.sword == null) {
			return false;
		}
		return this.sword.getDmg() > other.getDmg();
	}

	public boolean hasBetterAxe(Axe other) {
		if (this.axe == null) {
			return false;
		}
		return this.axe.getDmg() > other.getDmg();
	}

	public void hit(Creep enemy) {
		int totalDmg = this.dmg;
		if (sword != null && sword.getDurability() > 0) {
			totalDmg += sword.getDmg();
			sword.crack();
		}
		if (axe != null && axe.getDurability() > 0) {
			totalDmg += axe.getDmg();
			axe.crack();
		}
		enemy.setHealth(enemy.getHealth() - totalDmg);
	}

	public void fightCreep(Creep enemy) {
		System.out.println("FIGHT!");
		while (true) {
			if (enemy.getHealth() <= 0) {
				enemy.die(this);
				System.out.println("VICTORY");
				break;
			}
			if (this.health <= 0) {
				System.out.println("RETREAT!");
				this.rest();
				break;
			}
			this.hit(enemy);
			enemy.hit(this);
		}
	}

	private boolean criticallyInjured() {
		return this.health <= 1 ? true : false;
	}

	public void fightDragon(Dragon enemy) {
		System.out.println("FIGHT the Dragon!");
		if (criticallyInjured()) {
			this.rest();
		}
		while (true) {
			if (enemy.getHealth() <= 0 && health >= 0) {
				System.out.println("--------------------------------------------------");
				System.out.println("VICTORY - the dragon is dead!!!");
				System.out.println("--------------------------------------------------");
				Dragon.isAlife = false;
				break;
			}
			if (enemy.getHealth() <= 0 && health < 0) {
				isHeroAlife = false;
				System.out.println("The dragon is dead!!! But the Hero lost his life as well.");
				System.out.println("--------------------------------------------------");
				System.out.println("Silite bqha neravni!!! Geroqt padna s dostoinstvo.");
				System.out.println("--------------------------------------------------");
				break;
			}
						
			if (this.health <= 0) {
				System.out.println("RETREAT!" + " Count of life left: " + (maxCountOfLives-countOfLifes));
				this.rest();
				if(!isHeroAlife) {
					System.out.println("--------------------------------------------------");
					System.out.println("Silite bqha neravni!!! Geroqt padna s dostoinstvo.");
					System.out.println("--------------------------------------------------");
				}
				break;
			}
			this.hit(enemy);
			enemy.hit(this);
		}
	}

	private void hit(Dragon enemy) {

		int totalDmg = this.dmg;
		if (sword != null && sword.getDurability() > 0) {
			totalDmg += sword.getDmg();
			sword.crack();
		}
		if (axe != null && axe.getDurability() > 0) {
			totalDmg += axe.getDmg();
			axe.crack();
		}
		enemy.setHealth(enemy.getHealth() - totalDmg);
	}

	public void rest() {
		if (countOfLifes >= maxCountOfLives) {
			isHeroAlife = false;
			return;
		}
		System.out.println("Having a rest!!!");
		this.health = 200;
		if (this.sword != null) {
			this.sword.repair();
		}
		if (this.axe != null) {
			this.axe.repair();
		}
		countOfLifes++;
	}

	public void printInfo() {

		int totalDmg = this.dmg;
		String swordInfo = "none";
		String axeInfo = "none";
		if (sword != null && sword.getDurability() > 0) {
			totalDmg += sword.getDmg();
			swordInfo = (sword.getName() + " - " + sword.getDmg() + " - " + sword.getDurability());
		}
		if (axe != null && axe.getDurability() > 0) {
			totalDmg += axe.getDmg();
			axeInfo = (axe.getName() + " - " + axe.getDmg() + " - " + axe.getDurability());
		}
		System.out.println("------HERO------");
		System.out.println("Health = " + this.health);
		System.out.println("Sword = " + swordInfo);
		System.out.println("Axe = " + axeInfo);
		System.out.println("Dmg = " + totalDmg);
		System.out.println("----------------");
	}
}
