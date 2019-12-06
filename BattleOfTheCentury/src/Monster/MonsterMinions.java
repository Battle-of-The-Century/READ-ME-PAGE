package Monster;

public class MonsterMinions extends MonsterUnits{
	private String name = "Minions";
	
	public MonsterMinions(int healthPoints) {
		super(healthPoints);
		
	}
	
	@Override
	public String toString() {
		String Minion = name + " HP: " + super.getHealthPoints();
		return Minion;
	}

}
