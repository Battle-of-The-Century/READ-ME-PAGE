package Monster;

public class MonsterMinions extends MonsterUnits{
	private String name = "Minions";
	
	public MonsterMinions(int healthPoints, int attackPoints, int defencePoints, int movementSpeed) {
		super(healthPoints, attackPoints, defencePoints, movementSpeed);
		
	}
	
	@Override
	public String toString() {
		String Minion = name + " HP: " + super.getHealthPoints()
							  + " Attack: " + super.getAttackPoints()
							  + " Defence: " + super.getDefencePoint()
							  + " Speed: " + super.getMovementSpeed();
		return Minion;
	}

}
