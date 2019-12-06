
public class Driver {
	static Unit soldier = new Unit("Soldier", 15);
	static Unit tank = new Unit("Tank", 20);
	static Unit hero = new Unit("Hero", 25);

	public static void main(String[] args) {
		StageGUI game = new StageGUI("ok");
		System.out.println(hero.toString());
	}
//
}
