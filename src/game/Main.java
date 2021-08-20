package game;

import java.util.Scanner;

public class Main {
	static boolean continuePlaying = true;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		RoomManager roomManager = new RoomManager();
		roomManager.init();
		
		Player player = new Player();
		player.currentRoom = roomManager.startingRoom;
		
		while(continuePlaying == true) {
			printRoom(player);
			String[] playerInput = collectInput(input);
			parse(playerInput, player);
			System.out.println();
		}
		input.close();
	}

	private static void printRoom(Player player) {
		System.out.println("You are located in the " + player.currentRoom.getName());
		System.out.println(player.currentRoom.getShortDescription());
		System.out.println(player.currentRoom.getLongDescription());
		System.out.println("Please select a place to navigate to. ");
	}

	private static String[] collectInput(Scanner input) {
		return input.nextLine().split(" ");
	}

	private static void parse(String[] command, Player player) throws IllegalArgumentException {
		String action = command[0];
		
		switch(action) {
			//move to a different room
			case "go":
				String direction = command[1];
				player.currentRoom = player.currentRoom.getExit(direction,player.currentRoom);
				break;
			case "interact":
				String interact = command[1];
				System.out.println(player.currentRoom.interactItem(interact));
				break;
			//exit the game
			case "quit":
				System.out.println("You quit the game");
				continuePlaying = false;
				break;
			default:
				System.out.println("Input not recognized");
				System.out.println("Please try again");
		}
	}
}
