import Monster.*;
public class Unit  {
	private String name;
	private int attackPoints;

	
	public Unit(String name, int attackPoints) {
		this.name = name;
		this.attackPoints = attackPoints;
		
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
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
	
	
	@Override
	public String toString() {
		String info = getName() + " Attack Points: " + getAttackPoints();
		return info;
	}
}