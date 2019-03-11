package basic_assignments;


import java.util.Scanner;

public class IncomeTax {

	
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		 double salary;
		 double income_Tax=0;

		System.out.println("Enter the salary :");
		salary=sc.nextInt();
		
		
		sc.close();
		
		IncomeTax it=new IncomeTax();
		if(salary<=180000)
		{
		
		System.out.println("No income tax for Slab A");
		
		}
		else if(salary>=180001 && salary<300000)
		{
			
			income_Tax=salary*0.10;
			System.out.println("Income Tax for Slab B is:" +income_Tax);
			
		}
		else if(salary>=300001 && salary<500000)
		{
			
			income_Tax=salary*0.20;
			System.out.println("Income Tax for Slab C is:" +income_Tax);
			
		}
		else if(salary>=500001 && salary<1000000)
		{
			
			income_Tax=salary*0.30;
			System.out.println("Income Tax for Slab D is:" +income_Tax);
			
		}

		
		
	
}
	
		
	
	
		
		
	
}
