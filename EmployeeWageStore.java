//"Welcome To Employee Wage Computation Program On Master Branch"
import java.util.*;
import java.math.*;
class EmployeeWageComputation
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
	 EmployeeWageComputation( String companyName,int wagePerHour,int workingDay,int totalHourOfMonth)
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
class EmployeeWageStore
{
	public static void main (String args[])
	{
		   ArrayList<String> list=new ArrayList<String>();
		   EmployeeWageComputation storeCompanyOne = new EmployeeWageComputation("Tcs",20,20,100);
		   storeCompanyOne.wageCalculate();
		    //storeCompany.append(companyOne.wageCalculate();
		   //System.out.println(list);
		   EmployeeWageComputation storeCompanyTwo = new EmployeeWageComputation("Tcs",20,20,100);
                   storeCompanyTwo.wageCalculate();



	}
}
