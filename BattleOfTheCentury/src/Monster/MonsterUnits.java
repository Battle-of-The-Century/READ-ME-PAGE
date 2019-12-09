package Monster;

public class MonsterUnits  {
	private int healthPoints;
	
	
	public MonsterUnits(int healthPoints) {
		this.healthPoints = healthPoints;
		
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
	
	@Override
	public String toString() {
		String info = "Monster " + getHealthPoints();
		
		return info;
	}
}
