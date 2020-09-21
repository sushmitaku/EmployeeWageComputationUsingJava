//"Welcome To Employee Wage Computation Program On Master Branch"
import java.util.*;
import java.math.*;
public class EmployeeWageComputation {
    public static void main(String args[])
    {
        int maximum=1,minimum=0;
        int present=1,absent=0;
        int randomValue=(int)(Math.random() * (maximum - minimum + 1) + minimum);
        if(randomValue==present)
            System.out.println("Employee Present");
        else
            System.out.println("Employee Absent");
    }
}
