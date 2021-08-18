package fixtures;

public class Room extends Fixture{
	Room[] exits;
	
	public Room () {
		
	}
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[3];
	}
	public Room[] getExits(Room[] aRoom) {
		return aRoom;
	}
//	public Room getExit(String direction) {
//	}	
}
