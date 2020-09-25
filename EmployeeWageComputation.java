//"Welcome To Employee Wage Computation Program On Master Branch"
import java.util.*;
import java.math.*;
class EmployeeWage implements EmployeeWageBuilder
{
        int maximum=1,minimum=0;
	int presentHour=0,day;
	int addTotalWage;
	int i;
        Map<Integer, Integer> dailyWage = new HashMap<Integer, Integer>();
        Map<Integer, Integer> totalWage = new HashMap<Integer, Integer>();
	public void employeeWageBuilder(String companyName,int wagePerHour,int halfDay,int fullDay,int totalHourOfMonth,int workingDay)
        {
		 i=0;day=1;addTotalWage=0;
		while( presentHour<=totalHourOfMonth && day<=workingDay)
		{
			int randomValue=(int)(Math.random() * (maximum - minimum + 1) + minimum);
			if(randomValue==1)
			{
	 	 		dailyWage.put(i, wagePerHour * fullDay);
	 	 		presentHour=presentHour+fullDay;
		 		totalWage.put(i, presentHour * wagePerHour);
				addTotalWage=wagePerHour*presentHour;
            	 		day++;
				i++;
            	 	}
			else
			{
				dailyWage.put(i, wagePerHour * halfDay);
                                presentHour=presentHour+halfDay;
                                totalWage.put(i, presentHour * wagePerHour);
                                addTotalWage=wagePerHour*presentHour;
                                day++;
                                i++;
			}
		}
		wage();
        }
	 public void wage()
        {
                System.out.println("Total wage of your Company  "+addTotalWage);
        }
}
interface EmployeeWageBuilder
{
	 abstract void employeeWageBuilder(String companyName,int wagePerHour,int halfDay,int fullDay,int totalHourOfMonth,int workingDay);
}
class EmployeeWageComputation
{
	public static void main (String args[])
	{
		EmployeeWage object = new EmployeeWage();
		Scanner input = new Scanner(System.in);
            	System.out.println("Enter Company Name");
            	String companyName = input.nextLine();
            	System.out.println(" Enter Wage Per Hour");
            	int wagePerHour = input.nextInt();
            	System.out.println("Enter half Day");
            	int halfDay = input.nextInt();
            	System.out.println(" Enter full day");
            	int fullDay = input.nextInt();
		System.out.println("Total hour of month");
                int totalHourOfMonth = input.nextInt();
                System.out.println(" working day");
                int workingDay = input.nextInt();
		object.employeeWageBuilder(companyName,wagePerHour,halfDay,fullDay,totalHourOfMonth,workingDay);
	}
}
