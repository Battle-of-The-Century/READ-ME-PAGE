package Monster;

public class MonsterBoss extends MonsterUnits{
	private String name = "Boss";
	private int bossHealth;
	
	public MonsterBoss(int healthPoints) {
		super(healthPoints);
		
		 
	}
	
	@Override
	public String toString() {
		String Boss = name + " HP: " + super.getHealthPoints();
							  
		return Boss;
	}

	public int getBossHealth() {
		return bossHealth;
	}

	public void setBossHealth(int bossHealth) {
		this.bossHealth = bossHealth;
	}

}
