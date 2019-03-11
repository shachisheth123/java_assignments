package basic_assignments;

import java.util.Scanner;
public class ArmstrongNumber {
	
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int cnt=0;
		System.out.println("Enter the number to be checked for armstrong : ");
		int arm_Number=sc.nextInt();
		
		double sum = 0;
		int digit;
		int remainder;
		digit=arm_Number;
		
		while(digit != 0)
		{
			cnt++;
			digit=digit/10;
			
		}
		digit=arm_Number;
		
		while(digit!=0)
		{
			
			remainder=digit%10;
			sum=sum+Math.pow(remainder,cnt);
			digit=digit/10;
			
		}
		
		
		if(arm_Number==sum)
		{
			
			System.out.println(+arm_Number + " " +"is Armstrong number");
		}
		else
		{
			
			System.out.println(+arm_Number +" " +" is not ArmStrong number");
		}
		}
	
	
		
		
		
	

}
