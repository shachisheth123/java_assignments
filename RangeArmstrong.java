

import java.util.Scanner;

public class RangeArmstrong {
	
public static void main(String[] args)
{
	
	 int arm_Number;
	Scanner sc=new Scanner(System.in);
	int cnt=0;
	
	
	int digit;
		for(int i=100 ; i<=999; i++)
	{
	
	 digit=i;
	 
	 int remainder=0;
	 double sum = 0;

	 while(digit>0)
	 {
		 
		 remainder=digit%10;
		 sum=sum+(remainder*remainder*remainder);
		 digit=digit/10;
	 }
	 if(i==sum)
	 {
		 System.out.println(+i +"is armstrong number");
	 }
	
	}

}
}