package Monster;

public class MonsterMinions extends MonsterUnits{
	private String name = "Minions";
	private int minionHealth1;
	private int minionHealth2;
	
	public MonsterMinions(int healthPoints) {
		super(healthPoints);
		
	}
	
	@Override
	public String toString() {
		String Minion = name + " HP: " + super.getHealthPoints();
		return Minion;
	}

	public int getMinionHealth2() {
		return minionHealth2;
	}

	public void setMinionHealth2(int minionHealth2) {
		this.minionHealth2 = minionHealth2;
	}

	public int getMinionHealth1() {
		return minionHealth1;
	}

	public void setMinionHealth1(int minionHealth1) {
		this.minionHealth1 = minionHealth1;
	}

}
