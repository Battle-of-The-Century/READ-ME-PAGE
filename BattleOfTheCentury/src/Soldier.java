
public class Soldier extends Unit{
	private String name = "Soldier";
	
	public Soldier(int healthPoints, int attackPoints, int defencePoints, int movementSpeed) {
		super(healthPoints, attackPoints, defencePoints, movementSpeed);
		
	}
	
	@Override
	public String toString() {
		String soldier = name + " HP: " + super.getHealthPoints()
							  + " Attack: " + super.getAttackPoints()
							  + " Defence: " + super.getDefencePoint()
							  + " Speed: " + super.getMovementSpeed();
		return soldier;
	}

}