//"Welcome To Employee Wage Computation Program On Master Branch"
import java.util.*;
import java.math.*;
class EmployeeWage
{
	String company;
        int wagePerHour,workingDay,totalHourOfMonth,size;
        int maximum=2,minimum=0;
	StringBuilder empWage=new StringBuilder();
	StringBuilder companyName=new StringBuilder();
	int presentHour=0,day;
	int addTotalWage;
	int isFullTime=2,isPartTime=1,dailyHour,i;
        Map<Integer, Integer> dailyWage = new HashMap<Integer, Integer>();
        Map<Integer, Integer> totalWage = new HashMap<Integer, Integer>();
	 EmployeeWage( String companyName,int wagePerHour,int workingDay,int totalHourOfMonth)
        {
		company=companyName;
        	this.wagePerHour=wagePerHour;
        	this.workingDay=workingDay;
        	this.totalHourOfMonth=totalHourOfMonth;
        }
	public void wageCalculate()
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
		companyName.append(company);
		wage();
        }
	 public void wage()
        {
        	company();
                System.out.println(empWage);
        }
	public void company()
	{
		System.out.println(companyName);
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

}
class EmployeeWageComputation
{
	public static void main (String args[])
	{
		 EmployeeWage storeCompanyOne = new EmployeeWage("Tcs",20,20,100);
		 storeCompanyOne.wageCalculate();
                 EmployeeWage storeCompanyTwo = new EmployeeWage("oracle",30,22,120);
                 storeCompanyTwo.wageCalculate();
		 EmployeeWage storeCompanyThree = new EmployeeWage("Tcs",40,23,140);
                 storeCompanyThree.wageCalculate();



	}
}
