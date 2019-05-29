package staff;


public class Supervisor extends Staff implements Extra {
	
	double distance;
	double bonus;
	int sundaysWorked;

	/*Constructor*/
	public Supervisor() {
		super();
		distance = distanceTravelled();
		sundaysWorked = getSundaysWorked();
		weeklyWage = getWeeklyWage();
		hourlyRate = Constants.SUPERVISOR_RATE;
	}

	/* Interface Methods */
	@Override
	public double distanceTravelled() {
		System.out.println("What distance did you travel? ");
		distance = console.nextDouble();
		return distance;
	}

	@Override
	public int getSundaysWorked() {
		System.out.println("How many sundays did you Work?");
		sundaysWorked = console.nextInt();
		return sundaysWorked;
	}
	/* Method from the Super Class*/
	public double getWeeklyWage() {
		if(sundaysWorked == 0 && distance < 100) {
			weeklyWage = hoursWorked * Constants.SUPERVISOR_RATE;
		}
		if(sundaysWorked >= 1){
			weeklyWage = (hoursWorked * Constants.SUPERVISOR_RATE) + (sundaysWorked * Constants.SUNDAY_BONUS); 
		}
		if(distance >= 100) {
			weeklyWage += Constants.DISTANCE_BONUS + 10; 
		}
		return weeklyWage;
	}
	/* To String and Print*/

	public String print()
	{
		String str1;
		
		str1 = super.print();
		str1 += "\nDistance Travelled: "+distance +"\n";
		str1 += "\nSundays Worked: "+sundaysWorked +"\n"; 
		 
		 return str1;
	}


	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "\nDistance Travelled: "+distance +"\n";
		str += "Sundays Worked: "+sundaysWorked +"\n"; 
		 
		return str;
	}
}