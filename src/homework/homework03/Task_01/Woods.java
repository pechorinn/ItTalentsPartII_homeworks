package homework.homework03.Task_01;

import java.util.Random;

public class Woods {
	
	private final String name;
	private Creep[] creeps;
	private Dragon dragon;
	
	public Dragon getDragon() {
		return dragon;
	}

	public Woods(String name, int creeps) {
		this.name = name;
		this.creeps = new Creep[creeps];
		for (int i = 0; i < this.creeps.length; i++) {
			this.creeps[i] = new Creep("Gadina " + (i+1));
		}
		this.dragon = new Dragon("Spaska", "Gladnata");
		
	}
	
	public Creep getRandomCreep(){
		Random r = new Random();
		Creep c = this.creeps[r.nextInt(this.creeps.length)];
		if(c.getHealth()<1) {
			c.revive();
		}
		System.out.println("A wild creep appears! " + c.getName());
		System.out.println("Dmg = " + c.getDmg());
		System.out.println("Health = " + c.getHealth());
		return c;
	}

}
