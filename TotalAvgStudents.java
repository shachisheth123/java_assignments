

import java.util.Scanner;

public class TotalAvgStudents {
	
	public static void main(String[] args)
	{
		int marks;
		int sub;
		int j;
		int i;
		Scanner sc=new Scanner(System.in);
		
		int student_marks[][] =new int[3][3];

		System.out.println("Enter the marks of students");
		
		for( i=0;i<3;i++)
		{
			 
		System.out.println("Student marks is" );
		marks=sc.nextInt();	
			
			
		}
		
		
		System.out.println("Enter the subjects");
		
		for( j=0;j<3;j++)
		{
			 
		System.out.println("Subjects are" );	
		sub=sc.nextInt();	
			
		}
		
		for( i=0;i<3;i++)
		{
			 
		student_marks[i]=student_marks[i]+student_marks[i][j];
		System.out.println("Total of marks are" +student_marks[i]);	
			
			
		}
		
		
		
		
	}

}
