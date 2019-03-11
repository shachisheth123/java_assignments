package basic_assignments;


import java.util.Scanner;
import java.util.Arrays;
public class ArraySearch {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		int[] array_Src = new int[15];
		
		
		System.out.println("Enter the numbers ");
		for(int i=0;i<array_Src.length;i++)
		array_Src[i]=sc.nextInt();
		
		System.out.println("Enter the number to be checked : ");
		int number = sc.nextInt();
		
	/*	for(int j=0;j<array_Src.length;j++) {
			
			if(array_Src[j]>array_Src[j+1])
			{
			int temp=array_Src[j];
			array_Src[j]=array_Src[j+1];
			array_Src[j+1]=temp;
			}
			
*/			
		for(int j=0;j<array_Src.length-1;j++)
		{
			if(array_Src[j]==number)
			{
				
				System.out.println("Value found ");
				
			}
		
		
			
			
		}
		
		
		
		
	}
	
}
