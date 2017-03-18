package ultraRPG;

import java.util.ArrayList;
import java.util.List;

public class Quest {

	public int id;
	public String name;
	public String description;
	public int rewardExperiencePoints;
	public int rewardGold;
	
	public Item RewardItem;
	public List<QuestCompletionItem> QuestCompletionItems;
	
	public Quest(int id, String name, String description, int rewardExperiencePoints, int rewardGold){
		setId(id);
		setName(name);
		setDescription(description);
		setRewardExperiencePoints(rewardExperiencePoints);
		setRewardGold(rewardGold);
		QuestCompletionItems = new ArrayList<QuestCompletionItem>();
	}
	
	public void setId(int value){
		if(value!=0)
		id = value;
	}
	public int getId(){
		return id;
	}
	
	public void setName(String value){
		if(value!=null)
		name = value;
	}
	public String getName(){
		return name;
	}
	
	public void setDescription(String value){
		description = value;
	}
	public String getNamePlural(){
		return description;
	}
	
	public void setRewardExperiencePoints(int value){
		rewardExperiencePoints = value;
	}
	public int rewardExperiencePoints(){
		return rewardExperiencePoints;
	}
	
	public void setRewardGold(int value){
		rewardGold = value;
	}
	public int getRewardGold(){
		return rewardGold;
		
	}
	
}
