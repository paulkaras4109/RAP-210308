package game;

import java.util.Arrays;
import java.util.Scanner;

import model.ChipsAndSalsa;
import model.Empanada;
import model.FoodItem;
import model.Taco;

public class FoodFight {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Player player = new Player();
		while (!player.inventoryIsFull()) {
			int choice = getUserChoice();
			if(choice == 4) {
				System.out.println("goodbye");
				break; 
			}
			FoodItem item = createFood(choice);
			if (item != null) {
				player.addFoodToInventory(item);
				System.out.println(item);
				System.out.println(Arrays.toString(player.getInventory()));
			}
		}
		System.out.println("What would you like to toss?");
		
		int option = scan.nextInt(); 
		player.tossItem(option);
		scan.close();
	}

	private static int getUserChoice() {
		System.out.println("What food do you want in your inventory? Please select"
				+ " a number corresponding to the food you desire." + "\n1. Empanada" + "\n2. Taco"
				+ "\n3. Chips and Salsa. ");
		int choice = scan.nextInt();
		return choice;
	}

	private static FoodItem createFood(int choice) {
		FoodItem item= null;//Can't do this = new FoodItem(); with abstract class
		switch (choice) {
		case 1:
			// item to hold an empanada
			item = new Empanada();
			break;
		case 2:
			item = new Taco();
			break;
		case 3:
			item = new ChipsAndSalsa();
			break;
		case 4: 
			System.out.println("Quitting");
			break;
		default:
			System.out.println("That's not an option!");
		}
		return item;
	}

}
