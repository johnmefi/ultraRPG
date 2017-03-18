package ultraRPG;

public class Weapon extends Item{
 
	public int minimumDamage;
	public int maximumDamage;
	
	public Weapon(int id, String name, String namePlural,
			int minimumDamage, int maximumDamage){
		super(id, name, namePlural);
		setMinimumDamage(minimumDamage);
		setMaximumDamage(maximumDamage);
	}
	
	public void setMinimumDamage(int value){
		minimumDamage = value;
	}
	public int getMinimumDamage(){
		return minimumDamage;
	}
	
	public void setMaximumDamage(int value){
		maximumDamage = value;
	}
	public int getMaximumDamage(){
		return maximumDamage;
	}
}
