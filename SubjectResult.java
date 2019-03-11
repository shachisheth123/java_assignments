package basic_assignments;


import java.util.Scanner;
public class SubjectResult {
	
	
	public static void main(String [] args)
	{
		
		
		
		Scanner sc=new Scanner(System.in);
		
		int marks_Sub1;
		int marks_Sub2;
		int marks_Sub3;
		System.out.println("Enter the marks for subject1 : \n");
		marks_Sub1=sc.nextInt();
		
		System.out.println("Enter the marks for subject2 : \n");
		marks_Sub2=sc.nextInt();
		
		System.out.println("Enter the marks for subject3 : \n");
		marks_Sub3=sc.nextInt();
		
		sc.close();
		
		if(marks_Sub1> 60 && marks_Sub2>60 && marks_Sub3>60)
		{
			
			System.out.println("Passed");
			
		}
		else if(marks_Sub1>60 && marks_Sub2>60 || marks_Sub2>60 && marks_Sub3>60 || marks_Sub1>60 && marks_Sub3>60 )
		{
			
			
			System.out.println("Passed");
			
		}
		else if(marks_Sub1>60 || marks_Sub2>60 || marks_Sub3>60 || marks_Sub1<60 && marks_Sub2<60 && marks_Sub3<60)
		{
			
			System.out.println("Fail");
			
		}
		else
		{
			
			
			System.out.println("Invalid input");
			
		}
		
		
		
		
		
		
		
		
	}
	
	

}
