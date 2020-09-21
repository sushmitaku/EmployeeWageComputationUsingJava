//"Welcome To Employee Wage Computation Program On Master Branch"
import java.util.*;
import java.math.*;
public class EmployeeWageComputation {
    public static void main(String args[])
    {
	int DailyEmployeeWage, FullDayHour,HalfDayHour;
        int maximum=1,minimum=0;
        int present=1,absent=0;
	int IsFullTime=2,IsPartTime=1;
        int randomValue=(int)(Math.random() * (maximum - minimum + 1) + minimum);
        if(randomValue==IsFullTime){
            System.out.println("Employee Present");
	    FullDayHour=16;
            System.out.println("DailyEmployeeWageForFullTime="+employeeWage(FullDayHour));
	}
	else if(randomValue==IsPartTime)
        {
            System.out.println("Employee Present");
            HalfDayHour=8;
            System.out.println("DailyEmployeeWageForHalfTime="+employeeWage(HalfDayHour));
        }
        else
	{
            System.out.println("Employee Absent");
	    DailyEmployeeWage = 0;
            System.out.println("DailyEmployeeWage="+DailyEmployeeWage);
        }
    }
	public static int employeeWage(int hours)
    {
        int WagePerHour=20;
        int DailyEmployeeWage=WagePerHour*hours;
        return DailyEmployeeWage;
    }
}
