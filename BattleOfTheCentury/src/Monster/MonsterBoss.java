package Monster;

public class MonsterBoss extends MonsterUnits{
	private String name = "Boss";

	
	public MonsterBoss(int healthPoints) {
		super(healthPoints);
		
		 
	}
	
	@Override
	public String toString() {
		String Boss = name + " HP: " + super.getHealthPoints();
							  
		return Boss;
	}
}

	
