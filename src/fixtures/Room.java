package fixtures;

public class Room extends Fixtures{
	Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[3];
	}
	public Room[] getExits() {
		
	}
	public Room getExit(String direction) {
		
	}	
}
