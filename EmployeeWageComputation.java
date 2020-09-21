//"Welcome To Employee Wage Computation Program On Master Branch"
import java.util.*;
import java.math.*;
public class EmployeeWageComputation {
    public static void main(String args[])
    {
	int DailyEmployeeWage, FullDayHour=16,HalfDayHour=8;
        int maximum=2,minimum=0;
	int IsFullTime=2,IsPartTime=1;
        int randomValue=(int)(Math.random() * (maximum - minimum + 1) + minimum);
	switch (randomValue)
	{
	case 2:
            System.out.println("MonthEmployeeWageForFullTime="+employeeWage(FullDayHour));
		break;
	case 1:
            System.out.println("MonthEmployeeWageForHalfTime="+employeeWage(HalfDayHour));
		break;
        default:
            System.out.println(" Employee Absent MonthEmployeeWage=  0");
		break;
        }
    }
	public static int employeeWage(int hours)
    {
        int WagePerHour=20;
	int TotalWorkingDayInMonth=20;
        int DailyEmployeeWage=WagePerHour*hours;
	int MonthWage=TotalWorkingDayInMonth*DailyEmployeeWage;
        return MonthWage;
    }
}
