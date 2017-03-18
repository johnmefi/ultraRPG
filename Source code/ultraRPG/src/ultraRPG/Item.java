package ultraRPG;

public class Item {

	public int id;
	public String name;
	public String namePlural;
	
	public Item(int id, String name, String namePlural)
	{
	 setId(id);
	 setName(name);
	 setNamePlural(namePlural);
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
	
	public void setNamePlural(String value){
		namePlural = value;
	}
	
	public String getNamePlural(){
		return namePlural;
	}
}
