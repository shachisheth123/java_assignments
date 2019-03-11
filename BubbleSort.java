

import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args)
	{
		
		int i;
		
		int[] bubble_Aray = {5 , 12 , 14, 6, 78 , 19 , 1 ,23, 26 , 35, 37 , 7 , 52, 86, 47};
		
		for(int j=0;j<bubble_Aray.length-1;j++)
		{
			for( i=0;i<bubble_Aray.length-j-1;i++)
			{
		
				if(bubble_Aray[i] > bubble_Aray[i+1])
				{
			
				int temp=bubble_Aray[i];
				bubble_Aray[i]=bubble_Aray[i+1];
				bubble_Aray[i+1]=temp;
			
			
				}
			}
		}
	
	System.out.println("Sorted Array is");	
		
	for( i=0; i<=bubble_Aray.length-1;i++)
	{

	System.out.print( " "+bubble_Aray[i]);	
			
	}		
			
		
		
		
	
	
	}
	
}
