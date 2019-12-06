package Monster;

public class MonsterBoss extends MonsterUnits{
	private String name = "Boss";
	
	public MonsterBoss(int healthPoints, int attackPoints, int defencePoints, int movementSpeed) {
		super(healthPoints, attackPoints, defencePoints, movementSpeed);
		
	}
	
	@Override
	public String toString() {
		String Boss = name + " HP: " + super.getHealthPoints()
							  + " Attack: " + super.getAttackPoints()
							  + " Defence: " + super.getDefencePoint()
							  + " Speed: " + super.getMovementSpeed();
		return Boss;
	}

}
