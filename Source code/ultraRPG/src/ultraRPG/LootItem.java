package ultraRPG;

public class LootItem {
	public Item Details ;
	public int DropPercentage;
	public boolean IsDefaultItem ;
	
		public LootItem(Item details, int dropPercentage, boolean isDefaultItem)
			{
				Details = details;
				DropPercentage = dropPercentage;
				IsDefaultItem = isDefaultItem;
			}
}
