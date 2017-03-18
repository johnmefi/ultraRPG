package ultraRPG;

import java.util.ArrayList;
import java.util.List;

public class World {
	public static List<Item> Items = new ArrayList<Item>();
	public static List<Monster> Monsters = new ArrayList<Monster>();
	public static List<Quest> Quests = new ArrayList<Quest>();
	public static List<Location> Locations = new ArrayList<Location>();
	public final static int ITEM_ID_RUSTY_SWORD = 1;
	public final static int ITEM_ID_RAT_TAIL = 2;
	public final static int ITEM_ID_PIECE_OF_FUR = 3;
	public final static int ITEM_ID_SNAKE_FANG = 4;
	public final static int ITEM_ID_SNAKESKIN = 5;
	public final static int ITEM_ID_CLUB = 6;
	public final static int ITEM_ID_HEALING_POTION = 7;
	public final static int ITEM_ID_SPIDER_FANG = 8;
	public final static int ITEM_ID_SPIDER_SILK = 9;
	public final static int ITEM_ID_ADVENTURER_PASS = 10;
	public final static int MONSTER_ID_RAT = 1;
	public final static int MONSTER_ID_SNAKE = 2;
	public final static int MONSTER_ID_GIANT_SPIDER = 3;
	public final static int QUEST_ID_CLEAR_ALCHEMIST_GARDEN = 1;
	public final static int QUEST_ID_CLEAR_FARMERS_FIELD = 2;
	public final static int LOCATION_ID_HOME = 1;
	public final static int LOCATION_ID_TOWN_SQUARE = 2;
	public final static int LOCATION_ID_GUARD_POST = 3;
	public final static int LOCATION_ID_ALCHEMIST_HUT = 4;
	public final static int LOCATION_ID_ALCHEMISTS_GARDEN = 5;
	public final static int LOCATION_ID_FARMHOUSE = 6;
	public final static int LOCATION_ID_FARM_FIELD = 7;
	public final static int LOCATION_ID_BRIDGE = 8;
	public final static int LOCATION_ID_SPIDER_FIELD = 9;

	World() {
		PopulateItems();
		PopulateMonsters();
		PopulateQuests();
		PopulateLocations();
	}

	private static void PopulateItems() {
		Items.add(new Weapon(ITEM_ID_RUSTY_SWORD, "Rusty sword", "Rusty swords", 0, 5));
		Items.add(new Item(ITEM_ID_RAT_TAIL, "Rat tail", "Rat tails"));
		Items.add(new Item(ITEM_ID_PIECE_OF_FUR, "Piece of fur", "Pieces of fur"));
		Items.add(new Item(ITEM_ID_SNAKE_FANG, "Snake fang", "Snake fangs"));
		Items.add(new Item(ITEM_ID_SNAKESKIN, "Snakeskin", "Snakeskins"));
		Items.add(new Weapon(ITEM_ID_CLUB, "Club", "Clubs", 3, 10));
		Items.add(new HealingPotion(ITEM_ID_HEALING_POTION, "Healing potion", "Healing potions", 5));
		Items.add(new Item(ITEM_ID_SPIDER_FANG, "Spider fang", "Spider fangs"));
		Items.add(new Item(ITEM_ID_SPIDER_SILK, "Spider silk", "Spider silks"));
		Items.add(new Item(ITEM_ID_ADVENTURER_PASS, "Adventurer pass", "Adventurer passes"));
	}

	private static void PopulateMonsters() {
		Monster rat = new Monster(MONSTER_ID_RAT, "Rat", 5, 3, 10, 3, 3);
		rat.LootTable.add(new LootItem(ItemByID(ITEM_ID_RAT_TAIL), 75, false));
		rat.LootTable.add(new LootItem(ItemByID(ITEM_ID_PIECE_OF_FUR), 75, true));
		Monster snake = new Monster(MONSTER_ID_SNAKE, "Snake", 5, 3, 10, 3, 3);
		snake.LootTable.add(new LootItem(ItemByID(ITEM_ID_SNAKE_FANG), 75, false));
		snake.LootTable.add(new LootItem(ItemByID(ITEM_ID_SNAKESKIN), 75, true));
		Monster giantSpider = new Monster(MONSTER_ID_GIANT_SPIDER, "Giant spider", 20, 5, 40, 10, 10);
		giantSpider.LootTable.add(new LootItem(ItemByID(ITEM_ID_SPIDER_FANG), 75, true));
		giantSpider.LootTable.add(new LootItem(ItemByID(ITEM_ID_SPIDER_SILK), 25, false));
		Monsters.add(rat);
		Monsters.add(snake);
		Monsters.add(giantSpider);
	}

	private static void PopulateQuests() {
		Quest clearAlchemistGarden = new Quest(QUEST_ID_CLEAR_ALCHEMIST_GARDEN, "Clear the alchemist's garden",
				"Kill rats in the alchemist's garden and bring back 3 rat tails.You will receive a healing potion and 10 gold pieces.",
				20, 10);

		clearAlchemistGarden.QuestCompletionItems.add(new QuestCompletionItem(ItemByID(ITEM_ID_RAT_TAIL), 3));
		clearAlchemistGarden.RewardItem = ItemByID(ITEM_ID_HEALING_POTION);
		Quest clearFarmersField = new Quest(QUEST_ID_CLEAR_FARMERS_FIELD, "Clear the farmer's field",
				"Kill snakes in the farmer's field and bring back 3 snake fangs.You will receive an adventurer's pass and 20 gold pieces.",
				20, 20);
		clearFarmersField.QuestCompletionItems.add(new QuestCompletionItem(ItemByID(ITEM_ID_SNAKE_FANG), 3));
		clearFarmersField.RewardItem = ItemByID(ITEM_ID_ADVENTURER_PASS);
		Quests.add(clearAlchemistGarden);
		Quests.add(clearFarmersField);
	}

	private static void PopulateLocations() {
		// Create each location
		Location home = new Location(LOCATION_ID_HOME, "Home", "Your house. You really need to clean up the place.",
				null, null, null);
		Location townSquare = new Location(LOCATION_ID_TOWN_SQUARE, "Town square", "You see a fountain.", null, null,
				null);
		Location alchemistHut = new Location(LOCATION_ID_ALCHEMIST_HUT, "Alchemist's hut",
				"There are many strange plants on the shelves.", null, null, null);
		alchemistHut.QuestAvailableHere = QuestByID(QUEST_ID_CLEAR_ALCHEMIST_GARDEN);
		Location alchemistsGarden = new Location(LOCATION_ID_ALCHEMISTS_GARDEN, "Alchemist's garden",
				"Many plants are growing here.", null, null, null);
		alchemistsGarden.MonsterLivingHere = MonsterByID(MONSTER_ID_RAT);
		Location farmhouse = new Location(LOCATION_ID_FARMHOUSE, "Farmhouse",
				"There is a small farmhouse, with a farmer in front.", null, null, null);
		farmhouse.QuestAvailableHere = QuestByID(QUEST_ID_CLEAR_FARMERS_FIELD);
		Location farmersField = new Location(LOCATION_ID_FARM_FIELD, "Farmer's field",
				"You see rows of vegetables growing here.", null, null, null);
		farmersField.MonsterLivingHere = MonsterByID(MONSTER_ID_SNAKE);
		Location guardPost = new Location(LOCATION_ID_GUARD_POST, "Guard post",
				"There is a large, tough-looking guard here.", ItemByID(ITEM_ID_ADVENTURER_PASS), null, null);
		Location bridge = new Location(LOCATION_ID_BRIDGE, "Bridge", "A stone bridge crosses a wide river.", null, null,
				null);
		Location spiderField = new Location(LOCATION_ID_SPIDER_FIELD, "Forest",
				"You see spider webs covering covering the trees in this forest.", null, null, null);
		spiderField.MonsterLivingHere = MonsterByID(MONSTER_ID_GIANT_SPIDER);
		// Link the locations together
		home.LocationToNorth = townSquare;
		townSquare.LocationToNorth = alchemistHut;
		townSquare.LocationToSouth = home;
		townSquare.LocationToEast = guardPost;
		townSquare.LocationToWest = farmhouse;
		farmhouse.LocationToEast = townSquare;
		farmhouse.LocationToWest = farmersField;
		farmersField.LocationToEast = farmhouse;
		alchemistHut.LocationToSouth = townSquare;
		alchemistHut.LocationToNorth = alchemistsGarden;
		alchemistsGarden.LocationToSouth = alchemistHut;
		guardPost.LocationToEast = bridge;
		guardPost.LocationToWest = townSquare;
		bridge.LocationToWest = guardPost;
		bridge.LocationToEast = spiderField;
		spiderField.LocationToWest = bridge;
		// add the locations to the static list
		Locations.add(home);
		Locations.add(townSquare);
		Locations.add(guardPost);
		Locations.add(alchemistHut);
		Locations.add(alchemistsGarden);
		Locations.add(farmhouse);
		Locations.add(farmersField);
		Locations.add(bridge);
		Locations.add(spiderField);
	}

	public static Item ItemByID(int id) {
		for (Item item : Items) {
			if (item.id == id) {
				return item;
			}
		}
		return null;
	}

	public static Monster MonsterByID(int id) {
		for (Monster monster : Monsters) {
			if (monster.Id == id) {
				return monster;
			}
		}
		return null;
	}

	public static Quest QuestByID(int id) {
		for (Quest quest : Quests) {
			if (quest.id == id) {
				return quest;
			}
		}
		return null;
	}

	public static Location LocationByID(int id) {
		for (Location location : Locations) {
			if (location.id == id) {
				return location;
			}
		}
		return null;
	}
}
