package game;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] rooms;
	
	public void init() {
		
		//creating the rooms
		Room foyer = new Room("The Foyer", "a small foyer",	"The small entryway of a "
				+ "modest house. \n"
				+ "to the west is the kitchen"
				+ "To the east is the bedroom. \n"
				+ "To the north is the music room.");

		Room kitchen = new Room("The kitchen", "A small kitchen","You see a "
				+ "refrigerator and a stove. \n"
				+ "To the north is the living room"
				+ "To the south is the garage. \n"
				+ "To the east is the foyer \n");

		Room musicRoom = new Room("The music room","A room for music","You see a piano "
				+ "and a guitar. \n"
				+ "To the west is the living room. \n"
				+ "To the south is the foyer.");

		Room livingRoom = new Room("The living room","A room for living","You see a couch "
				+ "and a tv. \n"
				+ "To the east is the music room. \n"
				+ "To the south is the Kitchen.");
		Room garage = new Room("The Garage","A place to store a vehicle ","You see a "
				+ "car and a truck. \n"
				+ "To the north is the kitchen. \n");
		Room bedRoom = new Room("The bedroom","A standard bedroom", "You see a bed "
				+ "and a mirror. \n"
				+ "To the west is the foyer. \n");
		
		//adding rooms to the array
		//						  0       1        2         3 
		this.rooms = new Room[]{foyer, kitchen, musicRoom, livingRoom,
		//		   4       5 
				garage, bedRoom};
		//setting the starting room to be the foyer
		this.startingRoom = foyer;	
	
		//set the exits
		foyer.setExits(musicRoom, bedRoom, kitchen, null);
		kitchen.setExits(livingRoom, foyer, null, garage);
		musicRoom.setExits(null, null, livingRoom, foyer);
		livingRoom.setExits(null, musicRoom, null, kitchen);
		garage.setExits(kitchen, null, null, null);
		bedRoom.setExits(null, null, foyer, null);
	
		//set the items
		kitchen.setItems("fridge", "stove");
		musicRoom.setItems("piano", "guitar");
		livingRoom.setItems("couch", "tv");
		garage.setItems("car","truck");
		bedRoom.setItems("bed", "dresser");
	}
	
}
