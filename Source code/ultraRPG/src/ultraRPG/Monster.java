package ultraRPG;

import java.util.ArrayList;
import java.util.List;

public class Monster extends LivingCreature{
	public int Id;
	public String Name;
	 
	public int MaximumDamage;
	public int RewardExperiencePoints;
	public int RewardGold;
	
	public List<LootItem> LootTable;
	
	public Monster(int id, String name, int maximumDamage,
			int rewardExperiencePoints, int rewardGold,
			int currentHitPoints, int maximumHitPoints){
		super(currentHitPoints, maximumHitPoints);
		Id = id;
		Name = name;
		MaximumDamage = maximumDamage;
		RewardExperiencePoints = rewardExperiencePoints;
		RewardGold = rewardGold;
		LootTable = new ArrayList<LootItem>();
	}
}
