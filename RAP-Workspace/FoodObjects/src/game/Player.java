package game;

import model.FoodItem;
import model.Tossable;

public class Player {
	//inventory variable 
	//array of FoodItem objects 
	private FoodItem[] inventory = new FoodItem[5];
	private int numFoodItems = 0; 

	public FoodItem[] getInventory() {
		return inventory;
	}

	public void setInventory(FoodItem[] inventory) {
		this.inventory = inventory;
	}
	
	public int getNumFoodItems() {
		return this.numFoodItems;
	}
	
	public void addFoodToInventory(FoodItem item) {
		if(numFoodItems < inventory.length) {
			this.inventory[numFoodItems] = item; 
			numFoodItems++; 
		}else {
			System.out.println("Inventory is full!");
		}
	}
	
	public boolean inventoryIsFull() {
		return numFoodItems >= inventory.length; 
	}
	
	//Get an item from my inventory-- 
	//check if it can be tossed 
	//toss the item 
	public void tossItem(int positionInInventory) {
		if(positionInInventory < numFoodItems ) {
			FoodItem item = inventory[positionInInventory];
			if( item instanceof Tossable) {
				Tossable tossableRef = (Tossable) item; 
				tossableRef.toss(); 
			}else {
				System.out.println("That item can't be tossed!!");
			}
		}else {
			System.out.println("There is nothing at that position. ");
		}
	}
	
}
