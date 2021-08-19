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
		}

	}

	private static void printRoom(Player player) {
		System.out.println("You are located in the " + player.currentRoom.getName());
		System.out.println("Please select a place to navigate to. ");
	}

	private static String[] collectInput(Scanner input) {
		return input.nextLine().split(" ");
	}

	private static void parse(String[] command, Player player) {
		String action = command[0];
		
		switch(action) {
			//move to a different room
			case "go":
				String direction = command[1];
				player.currentRoom = player.currentRoom.getExit(direction,player.currentRoom);
				break;
			//exit the game
			case "quit":
				System.out.println("You quit the game");
				continuePlaying = false;
				break;
			default:
				throw new IllegalArgumentException("Invalid Action");
		}
	}
}
