//"Welcome To Employee Wage Computation Program On Master Branch"
import java.util.*;
import java.math.*;
public class EmployeeWageComputation
{
	int dailyEmployeeWage,workingDay=20;
        int maximum=2,minimum=0;
	int presentHour=0,givenHour=100,day=1;
	int isFullTime=2,isPartTime=1,dailyHour,wagePerHour=20,i=0;
        Map<Integer, Integer> dailyWage = new HashMap<Integer, Integer>();
        Map<Integer, Integer> totalWage = new HashMap<Integer, Integer>();
	public void wageCalculate( )
        {
		while( presentHour<=givenHour && day<=workingDay)
		{
			int randomValue=(int)(Math.random() * (maximum - minimum + 1) + minimum);
	 	 	dailyHour=(getHours(randomValue));
	 	 	dailyWage.put(i, wagePerHour * dailyHour);
	 	 	presentHour=presentHour+dailyHour;
		 	totalWage.put(i, presentHour * wagePerHour);
            	 	day++;
            	 	i++;
		}
	System.out.println("Day  DailyWage");
        displayWage(dailyWage);
        System.out.println("Day TotalWage");
        displayWage(totalWage);
        }
	public static void displayWage( Map<Integer, Integer>dailyTotalWage)
        {
        	for(Map.Entry entry:dailyTotalWage.entrySet())
        	{
            	System.out.println(entry.getKey()+"   "+entry.getValue()+" ");

        	}

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
		EmployeeWageComputation object=new EmployeeWageComputation();
		object.wageCalculate();
	}
}
