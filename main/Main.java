package main;


import javax.swing.*;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import item.Item;
import staff.Staff;
import staff.StockTaker;
import staff.Supervisor;

public class Main  {
	
	public static void main(String[] args) throws FileNotFoundException {
	
 		int option;
		int end = 0;
		Scanner scanner = new Scanner(System.in);
		int itemCounter;
		int staffType;
		/**
		PrintWriter report = new PrintWriter("StockReport.txt");
		PrintWriter sWages = new PrintWriter("StockTakerWages.txt");
		PrintWriter vWages = new PrintWriter("SupervisorWages.txt");
		*/
		List<Item> itemList = new ArrayList<Item>();

		do {
         
			System.out.println("Please Enter (1) Add Item | (2) Wages | (3) Display stock worth | (-1) Exit");
			option = scanner.nextInt();
                  		} while (option != 1 && option != 2 && option != 3 && option != -1);

		while (option != -1) { // 2nd while
			
			if (option == 1) {
				
				System.out.println("Please Enter amount of Items you wish to add");
				itemCounter = scanner.nextInt();
				
				for (int i = 0; i < itemCounter; i++) {
					Item item = new Item();
					itemList.add(item);
					System.out.println(item.toString());
					//report.println (item.print());
				}
				
			} else if (option == 2) {
				System.out.println("Stockworker (1) or Supervisor (2)");
				staffType = scanner.nextInt();
				switch(staffType) {
				case 1:
					Staff stockTaker = new StockTaker();
					System.out.println(stockTaker.toString());
					//sWages.println(stockTaker.print());
					break;
				case 2:
					Staff supervisor = new Supervisor();
					System.out.println(supervisor.toString());
					//vWages.println(supervisor.print());
					break;
				}
			} else if(option == 3){
				System.out.println("Total Stock Worth: "+Item.stockWorth * Item.totalAmount);
			}


			switch(end) {
			case 1:
				System.out.println("Items Added\n\n");
				break;
			case 2:
				System.out.println("Wages printed\n\n");
				break;
			case 3:
				System.out.println("Items Removed\n\n");
				break;
			}

			do {
				System.out.println("Please Enter (1) Add Item | (2) Wages | (3) Display stock worth | (-1) Exit");
				option = scanner.nextInt();
			} while (option != 1 && option != 2 && option != 3 && option != -1);
			
		} // end of 2nd while
		 //report.close();
		 //sWages.close();
		 //vWages.close();
	}

}