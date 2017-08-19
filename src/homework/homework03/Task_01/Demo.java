package homework.homework03.Task_01;

public class Demo {

	public static void main(String[] args) {
		
		Hero mincho = new Hero("Mincho");
		Woods goriTilileiski = new Woods("Tililei", 600);
		mincho.printInfo();

		for (int i = 0; i < 100; i++) {
			mincho.fightCreep(goriTilileiski.getRandomCreep());
			mincho.printInfo();
			mincho.fightCreep(goriTilileiski.getRandomCreep());
			mincho.printInfo();
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                   Start figthing the dragon!!!");
		System.out.println("--------------------------------------------------------------------------");
		
		mincho.printInfo();

		while(true) {
			
			mincho.fightDragon(goriTilileiski.getDragon());
			mincho.printInfo();

			if(!Dragon.isAlife || !Hero.isHeroAlife) {
			      break;
			}
		}
	}
}
