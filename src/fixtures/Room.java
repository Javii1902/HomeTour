package fixtures;

public class Room extends Fixture{
	Room[] exits;

	public Room(String name, String shortDescription, String longDescription)
	{
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
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
			throw new IllegalArgumentException("Invalid Direction");
		}
	}
	public void setExits(Room northRoom, Room eastRoom, Room westRoom, Room southRoom ) {
		this.exits[0] = northRoom;
		this.exits[1] = eastRoom;
		this.exits[2] = westRoom;
		this.exits[3] = southRoom;	
		//return this.exits;
	}
	public String getName() {
		return name;
	}
}
