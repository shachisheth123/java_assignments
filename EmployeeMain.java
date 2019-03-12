
import java.util.Scanner;

public class EmployeeMain
{

	public static void main(String[] args)
	{

         Employee employee1= new Employee(101,"Jhon",50000);		

	 System.out.println("Annual basic salary is " +" " +employee1.getAnnualBasic());
	 System.out.println("Monthly gross salary is" +" " +employee1.getMonthlyGrossSalary());
	 System.out.println("Annual gross salary is" +" " +employee1.getAnnualGrossSalary());
	 System.out.println("Monthly deductions are" +" " +employee1.getMonthlyDeductions());
	 System.out.println("Monthly take home is" +" " +employee1.getMonthlyTakeHome());
	 System.out.println("Annual tak home is " +" " +employee1.getAnnualTakeHome());
	

	}




}