package homework.homework01.Task_03;

import java.util.Random;

public class Fighter {
	String name;
	double health = 100;
	double damage = 10;
	Fighter enemy;

	void strike() {
		
		if(avoidStrike(randomNumber())) {
			System.out.println("Avoided strike by " + enemy.name);
			return;
		}
		if (randomNumber() < 95) {
			if (blockStrike(randomNumber())) {
				System.out.println("Block by " + enemy.name);
				enemy.health -= 0.6 * damage;
			} else {
				enemy.health -= damage;
			}
		} else {
			System.out.println("Critical strike by " + name);
			enemy.health -= 2 * damage;
		}
	}

	boolean blockStrike(int random) {
		
		return random < 30 ? true : false;
	}

	boolean avoidStrike(int random) {
 
		return random < 15 ? true : false;
	}
	
	boolean isDead() {
		
		return health <= 0;
	}

	int randomNumber() {
		Random rnd = new Random();
		return rnd.nextInt(100);
	}

}
