package ultraRPG;

import java.util.ArrayList;
import java.util.List;

public class Player extends LivingCreature {

	public int gold;
	public int experiencePoints;
	public int level;

	public List<InventoryItem> Inventory;
	public List<PlayerQuest> Quests;

	public Player(int currentHitPoints, int maximumHitPoints, int gold, int experiencePoints, int level) {
		super(currentHitPoints, maximumHitPoints);

		setGold(gold);
		setExperiencePoints(experiencePoints);
		setLevel(level);

		Inventory = new ArrayList<InventoryItem>();
		Quests = new ArrayList<PlayerQuest>();

	}

	public void setCurrentHitPoints(int value) {
		CurrentHitPoints = value;
	}

	public int getCurrentHitPoints() {
		return CurrentHitPoints;
	}

	public void setMaximumHitPoints(int value) {
		MaximumHitPoints = value;
	}

	public int getMaximumCurrentHitPoints() {
		return MaximumHitPoints;
	}

	public void setGold(int value) {
		CurrentHitPoints = value;
	}

	public int getGold() {
		return CurrentHitPoints;
	}

	public void setExperiencePoints(int value) {
		experiencePoints = value;
	}

	public int getExperiencePoints(int value) {
		return experiencePoints;
	}

	public void setLevel(int value) {
		level = value;
	}

	public int getLevel(int value) {
		return level;
	}

}
