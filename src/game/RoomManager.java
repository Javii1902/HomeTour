package game;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] rooms;
	
	
	
	public void init() {
		
		//creating the rooms
		Room foyer = new Room("The Foyer", "a small foyer",	"The small entryway of a modest house."
				+ " A kitchen is open to the west, where stove and refrigerator "
				+ "can be seen. \n"
				+ "To the east there is a doorway. /n"
				+ "To the north is a open room, where you can see a piano.");

		Room kitchen = new Room("The kitchen", "A small kitchen","You see a refrigerator and "
				+ "a stove."
				+ "A living room is connected"
				+ " to the north where you see a couch. /n"
				+ "To the south there there is a doorway. /n"
				+ "To the east there is the foyer /n");

		Room openRoom = new Room("The open room","An open Room","You see a piano. /n"
				+ "To the west you see the living room. /n"
				+ "To the south is the foyer.");

		Room livingRoom = new Room("The living room","A room for living","You see a couch. /n"
				+ "To the east you see the open room. /n"
				+ "To the south is the Kitchen.");
//		Room garage = new Room("The Garage","A place to store a vehicle ","You see a red car. /n"
//				+ "To the north is the kitchen. /n");
//		Room bedRoom = new Room("The bedroom","A standard bedroom", "You see a bed. /n"
//				+ "To the west is the foyer. /n"
//				+ "To the north is the restroom.");
//		Room bathRoom = new Room("The bathroom","A standard bathroom","You see a tub and toilet. /n"
//				+ "To the west you see the open room. /n"
//				+ "To the south is the bedroom.");	
		//adding the rooms to array
		
		//						  0       1        2         3
		this.rooms = new Room[]{foyer, kitchen, openRoom, livingRoom};
		//setting the starting room to be the foyer
		this.startingRoom = foyer;	
		
		
		
		foyer.setExits(rooms[2], null, rooms[1],null);
		kitchen.setExits(rooms[3], rooms[0], null, null);
		openRoom.setExits(null, null, rooms[3], rooms[0]);
		livingRoom.setExits(null, rooms[2], null, rooms[1]);
				
	}
	
}
