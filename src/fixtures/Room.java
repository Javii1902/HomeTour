package fixtures;

public class Room extends Fixture{
	Room[] exits;
	String[] items;

	public Room(String name, String shortDescription, String longDescription)
	{
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
		this.items = new String[2];
	}

	public Room[] getExits()
	{
		return exits;
	}

	public Room getExit(String direction, Room currentRoom)
	{
		switch (direction)
		{
		case "north":
			if (exits[0] == null) {
				System.out.println("You hit a wall");
				return currentRoom;
			}else
				return exits[0];
		case "east":
			if (exits[1] == null) {
				System.out.println("You hit a wall");
				return currentRoom;
			}else
				return exits[1];
		case "west":
			if (exits[2] == null) {
				System.out.println("You hit a wall");
				return currentRoom;
			}else
				return exits[2];
		case "south":
			if (exits[3] == null) {
				System.out.println("You hit a wall");
				return currentRoom;
			}else
				return exits[3];
		default:
			System.out.println("Input not recognized");
			System.out.println("Please try again");
			return currentRoom;
		}
	}
	public void setExits(Room northRoom, Room eastRoom, Room westRoom, Room southRoom ) {
		this.exits[0] = northRoom;
		this.exits[1] = eastRoom;
		this.exits[2] = westRoom;
		this.exits[3] = southRoom;	
	}
	public String getName() {
		return name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setItems(String item1,String item2) {
		this.items[0] = item1;
		this.items[1] = item2;
	}
	public String[] getItems(Room currentRoom) {
		return currentRoom.items;
	}

	public String interactItem(String item) throws IllegalArgumentException
	{
		switch (item)
		{
		case "piano":
			if ((items[0] != "piano") && (items[1] != "piano" )) {
				return "There is no piano";
			}
			else
				return "you play the piano";
		case "guitar":
			if ((items[0] != "guitar") && items[1] != "guitar" ) {
				return "There is no guitar";
			}
			else
				return "you play the guitar";
		case "couch":
			if ((items[0] != "couch") && items[1] != "couch" ) {
				return "There is no couch";
			}
			else
				return "You sit on the couch";
		case "tv":
			if ((items[0] != "tv") && items[1] != "tv" ) {
				return "There is no tv";
			}
			else
				return "You interact with the tv";
		case "stove":
			if ((items[0] != "stove") && items[1] != "stove" ) {
				return "There is no stove";
			}
			else
				return "You interact with the stove";
		case "fridge":
			if ((items[0] != "fridge") && items[1] != "fridge" ) {
				return "There is no fridge";
			}
			else
				return "You interact with the fridge";
		case "car":
			if ((items[0] != "car") && items[1] != "car" ) {
				return "There is no car";
			}
			else
				return "You admire the car";
		case "truck":
			if ((items[0] != "truck") && items[1] != "truck" ) {
				return "There is no truck";
			}
			else
				return "You admire the truck";
		case "bed":
			if ((items[0] != "bed") && items[1] != "bed" ) {
				return "There is no bed";
			}
			else
				return "You interact with the bed";
		case "mirror":
			if ((items[0] != "mirror") && items[1] != "mirror" ) {
				return "There is no mirror";
			}
			else
				return "You interact with the mirror";
		default:
			throw new IllegalArgumentException("Invalid item");
		}
	}
}
