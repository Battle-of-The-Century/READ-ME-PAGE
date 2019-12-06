
public class Unit {
	private int healthPoints;
	private int attackPoints;
	private int defencePoint;
	private int movementSpeed;
	
	public Unit(int healthPoints, int attackPoints, int defencePoints, int movementSpeed) {
		this.healthPoints = healthPoints;
		this.attackPoints = attackPoints;
		this.defencePoint = defencePoints;
		this.movementSpeed = movementSpeed;
	}

	/**
	 * @return the movementSpeed
	 */
	public int getMovementSpeed() {
		return movementSpeed;
	}

	/**
	 * @param movementSpeed the movementSpeed to set
	 */
	public void setMovementSpeed(int movementSpeed) {
		this.movementSpeed = movementSpeed;
	}

	/**
	 * @return the defencePoint
	 */
	public int getDefencePoint() {
		return defencePoint;
	}

	/**
	 * @param defencePoint the defencePoint to set
	 */
	public void setDefencePoint(int defencePoint) {
		this.defencePoint = defencePoint;
	}

	/**
	 * @return the attackPoints
	 */
	public int getAttackPoints() {
		return attackPoints;
	}

	/**
	 * @param attackPoints the attackPoints to set
	 */
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints() {
		return healthPoints;
	}

	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
}
