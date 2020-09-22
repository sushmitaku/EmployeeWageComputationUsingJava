//"Welcome To Employee Wage Computation Program On Master Branch"
import java.util.*;
import java.math.*;
public class EmployeeWageComputation
{
    public static void main(String args[])
    {
	int DailyEmployeeWage,FullDayHour,HalfDayHour,Hour,WorkingDay=20;
        int Maximum=2,Minimum=0;
	int PresentHour=0,GivenHour=100,Day=1;
	int IsFullTime=2,IsPartTime=1,DailyHour,WagePerHour=20,i=0;
        Map<Integer, Integer> DailyWage = new HashMap<Integer, Integer>();
        Map<Integer, Integer> TotalWage = new HashMap<Integer, Integer>();
	while( PresentHour<=GivenHour && Day<=WorkingDay)
	{
		 int randomValue=(int)(Math.random() * (Maximum - Minimum + 1) + Minimum);
	 	 DailyHour=(getHours(randomValue));
	 	 DailyWage.put(i, WagePerHour * DailyHour);
	 	 PresentHour=PresentHour+DailyHour;
		 TotalWage.put(i, PresentHour * WagePerHour);
            	 Day++;
            	 i++;
	}
	System.out.println("Day  DailyWage");
        displayWage(DailyWage);
        System.out.println("Day TotalWage");
        displayWage(TotalWage);
     }
	public static void displayWage( Map<Integer, Integer>WageCalculate)
        {
        	for(Map.Entry entry:WageCalculate.entrySet())
        	{
            	System.out.println(entry.getKey()+"   "+entry.getValue()+" ");

        	}

        }
	public static int getHours(int randomValue)
	{

		int FullDayHour,HalfDayHour,Hour;
		switch (randomValue)
		{
		case 2:
            	return(FullDayHour=16);
		case 1:
            	return(HalfDayHour=8);
        	default:
            	return(Hour=0);
        	}
        }

}
