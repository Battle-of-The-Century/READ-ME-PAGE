package Monster;

public class MonsterBoss extends MonsterUnits{
	private String name = "Hero";
	
	public MonsterBoss(int healthPoints, int attackPoints, int defencePoints, int movementSpeed) {
		super(healthPoints, attackPoints, defencePoints, movementSpeed);
		
	}
	
	@Override
	public String toString() {
		String hero = name + " HP: " + super.getHealthPoints()
							  + " Attack: " + super.getAttackPoints()
							  + " Defence: " + super.getDefencePoint()
							  + " Speed: " + super.getMovementSpeed();
		return hero;
	}

}