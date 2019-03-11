package basic_assignments;

import java.util.Scanner;

public class CuiApplication {
	
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int login_Attempts = 3;
		
		
		
		while(login_Attempts!=0)
		{
			
			System.out.println("Enter the username");
			String userName=sc.nextLine();
			
			System.out.println("Enter password");
			String password=sc.nextLine();
			
			System.out.println("Enter username again ");
			String uname=sc.nextLine();
			
			System.out.println("Enter password again ");
			String pass=sc.nextLine();
			
			sc.close();
			
			if(userName.matches(uname) && password.matches(pass) )
			{
				
				System.out.println("Welcome"  +" "  +uname);
			}
			else
			{
				System.out.println("Contact admin :");
			}
			
			login_Attempts++;
		}
		
	}

}
