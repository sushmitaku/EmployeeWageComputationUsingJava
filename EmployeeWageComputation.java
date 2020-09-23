//"Welcome To Employee Wage Computation Program On Master Branch"
import java.util.*;
import java.math.*;
public class EmployeeWageComputation
{
	String companyName;
        int wagePerHour,workingDay,totalHourOfMonth,size;
        int maximum=2,minimum=0;
	StringBuilder empWage=new StringBuilder();
	int presentHour=0,day;
	int addTotalWage;
	int isFullTime=2,isPartTime=1,dailyHour,i;
        Map<Integer, Integer> dailyWage = new HashMap<Integer, Integer>();
        Map<Integer, Integer> totalWage = new HashMap<Integer, Integer>();
	public void wageCalculate( )
        {
		 i=0;day=1;addTotalWage=0;
		while( presentHour<=totalHourOfMonth && day<=workingDay)
		{
			int randomValue=(int)(Math.random() * (maximum - minimum + 1) + minimum);
	 	 	dailyHour=(getHours(randomValue));
	 	 	dailyWage.put(i, wagePerHour * dailyHour);
	 	 	presentHour=presentHour+dailyHour;
		 	totalWage.put(i, presentHour * wagePerHour);
			addTotalWage=addTotalWage+(wagePerHour*dailyHour);
            	 	day++;
            	 	i++;
		}
		empWage.append(addTotalWage);
        }
	 public void wagePrint()
        {
                System.out.println(empWage);
        }
	public static int getHours(int randomValue)
	{

		int fullDayHour,halfDayHour,hour;
		switch (randomValue)
		{
		case 2:
            	return(fullDayHour=16);
		case 1:
            	return(halfDayHour=8);
        	default:
            	return(hour=0);
        	}
        }
	public static void main(String args[])
	{
	    	EmployeeWageComputation object = new EmployeeWageComputation();
            	Scanner input = new Scanner(System.in);
            	System.out.println("Enter Company Name");
            	object.companyName = input.nextLine();
            	System.out.println(" Enter Wage Per Hour");
            	object.wagePerHour = input.nextInt();
            	System.out.println("Enter Working Day");
            	object.workingDay = input.nextInt();
            	System.out.println(" Enter Total working Hour of month");
            	object.totalHourOfMonth = input.nextInt();
            	object.wageCalculate();
           	object.wagePrint();

	}
}
