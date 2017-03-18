package ultraRPG;

public class HealingPotion extends Item{

	
	public int amountToHeal;
	
	public HealingPotion(int id, String name, String namePlural,
			int amountToHeal) {
		super (id, name, namePlural);
		setAmountToHeal(amountToHeal);
	}
	
	public void setAmountToHeal(int value){
		amountToHeal = value;
	}
	public int getAmountToHeal(){
		return amountToHeal;
	}
	
}
