package item;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {

	String name;
	double price;
	int amount;
	public static double stockWorth;
	public static int totalAmount;
	
	/* Adding Items to Stock List */
	List<Item> itemList = new ArrayList<Item>();

	/* Allow User Input */
	Scanner console = new Scanner(System.in);

	/* Constructor */
	public Item() {
		name = getName();
		price = getPrice();
		amount = getAmount();
	}

	/* Getters */
	public String getName() {

		System.out.print("Enter Item Name:");
		name = console.nextLine();
		return name;
	}

	public double getPrice() {

		System.out.print("Enter Item Price:");
		price = console.nextDouble();
		stockWorth += price;
		//stockWorth = stockWorth * amount;
		return price;
	}
	

	public int getAmount() {

		System.out.print("Enter Item Amount:");
		amount = console.nextInt();
		totalAmount += amount;
		return amount;
	}
	
	/* To string method & Print to file method */
	   public String toString() {
		  String str;
		  str = "\nItem Name: " + name + " | Item Price: " + price + " | Item Amount: " + amount+"\n";
		  return str;
	   }
	   
	   public String print() {
		  String str;
		  str = "\nItem Name: " + name + " | Item Price: " + price + " | Item Amount: " + amount+"\n";
		  return str;
	   }

}