package Project;

public class Tank extends Unit{
	private String name = "Tank";
	
	public Tank(int healthPoints, int attackPoints, int defencePoints, int movementSpeed) {
		super(healthPoints, attackPoints, defencePoints, movementSpeed);
		
	}
	
	@Override
	public String toString() {
		String tank = name + " HP: " + super.getHealthPoints()
							  + " Attack: " + super.getAttackPoints()
							  + " Defence: " + super.getDefencePoint()
							  + " Speed: " + super.getMovementSpeed();
		return tank;
	}

}



