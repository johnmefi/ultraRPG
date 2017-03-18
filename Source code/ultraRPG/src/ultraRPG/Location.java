package ultraRPG;

public class Location {

	public int id;
	public String name;
	public String description;
	
	public Item ItemRequiredToEnter  ;
	public Quest QuestAvailableHere  ;
	public Monster MonsterLivingHere ;
	public Location LocationToNorth;
	public Location LocationToEast;
	public Location LocationToSouth;
	public Location LocationToWest;
	
	public Location(int id, String name, String description, Item itemRequiredToEnter, 
			Quest questAvailableHere, Monster monsterLivingHere){
		setId(id);
		setName(name);
		setDescription(description);
		ItemRequiredToEnter = itemRequiredToEnter;
		QuestAvailableHere = questAvailableHere;
		MonsterLivingHere = monsterLivingHere;
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
		if(value!=null)
		description = value;
	}
	public String getDescription(){
		return description;
	}
	
}
