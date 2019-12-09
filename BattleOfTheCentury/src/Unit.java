import Monster.*;
public class Unit  {
	private String name;
	private static int attackPoints = 25;

	
	public Unit(String name) {
		this.name = name;
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
	public static int getAttack() {
		
		return attackPoints;
	}
	
	public void addAttack() {
		attackPoints += 25;
		
	}
	
	

	
	
	@Override
	public String toString() {
		String info = getName() + " Attack Points: " + getAttack();
		return info;
	}
}