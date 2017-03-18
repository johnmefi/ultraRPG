package ultraRPG;

public class PlayerQuest
	{
		public Quest Details;
		public boolean IsCompleted;

			public PlayerQuest(Quest details)
				{
					Details = details;
					IsCompleted = false;
				}
	}