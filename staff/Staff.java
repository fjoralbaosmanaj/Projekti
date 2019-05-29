package staff;


import java.util.Scanner;

public abstract class Staff {
	
	String name;
	int hoursWorked;
	double hourlyRate;
	double weeklyWage;
	
	Scanner console = new Scanner(System.in);
	
	
	public Staff() {
	this.name = getName();
	this.hoursWorked = getHoursWorked();
	this.hourlyRate = getHourlyRate();
	weeklyWage = hoursWorked * weeklyWage;
	}
	
	public String getName() {
		System.out.print("Enter Name:");
		name = console.nextLine();
		return name;
	}
	public int getHoursWorked() {
		System.out.print("Enter Hours worked:");
		hoursWorked = console.nextInt();
		return hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public double getWeeklyWage() {
		weeklyWage = hoursWorked * hourlyRate;
		return weeklyWage;
	}
	
	   public String toString() {
		  String str;
		  str = "\nName: " + name + " | Hours Worked: " + hoursWorked + " | Wage: " + weeklyWage+"\n";
		  return str;
	   }
	   
	   public String print() {
		  String str;
		  str = "\nName: " + name + " | Hours Worked: " + hoursWorked + " | Wage: " + weeklyWage+"\n";
		  return str;
	   }
	
}