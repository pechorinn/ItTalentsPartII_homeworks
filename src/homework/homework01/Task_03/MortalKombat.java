package homework.homework01.Task_03;
/*
 * Реализирайте играта Mortal Kombat - пускате двама боеца да се бият, докато единия не умре. 
 * Всеки боец има име, живот, щети, които прави на удар. Всеки може да удря, да блокира удар и да избягва удар. 
 * Ако блокира, му правят 60% щети. Всеки има 30% шанс да блокира удар. 
 * Всеки има 5% шанс да направи "критичен удар", който прави двойни щети и не може да бъде блокиран.
 * 15% to avoid the strike;
 */
public class MortalKombat {

	public static void main(String[] args) {

		Fighter scorpion = new Fighter();
		scorpion.name = "Scorpion";
		Fighter kano = new Fighter();
		kano.name = "Kano";
		scorpion.enemy = kano;
		kano.enemy = scorpion;

		while (true) {

			if (scorpion.randomNumber() < 50) {
				System.out.println("An attempt to make damage by Scorpion to Kano.");
				scorpion.strike();
				System.out.println("Kano's life left: " + kano.health);
				if (kano.isDead()) {
					System.out.println("Scorpion won!!!");
					break;
				}
			} else {
				System.out.println("An attempt to make damage by Kano to Scorpion.");
				kano.strike();
				System.out.println("Scorpion's life left: " + scorpion.health);
				if (scorpion.isDead()) {
					System.out.println("Kano won!!!");
					break;
				}
			}

		}

	}
}
