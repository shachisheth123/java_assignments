class Employee
{

	  private int employeeId;
	  private String employeeName;
	  private double employeeMonthlyBasicSalary;

	public Employee(int employeeId , String employeeName , double employeeMonthlyBasicSalary)
	{
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.employeeMonthlyBasicSalary=employeeMonthlyBasicSalary;
	}
	

 	public double getAnnualBasic()
	{
		return 12 * employeeMonthlyBasicSalary;
			     
	}

	public double getMonthlyGrossSalary()
	{
		
		double hra_Allowance=0.50* employeeMonthlyBasicSalary;
		int medical_Allowance=1250;
		int conveyance_Allowance=800;
		
		double monthly_Gross_Salary = employeeMonthlyBasicSalary+hra_Allowance+medical_Allowance+conveyance_Allowance;

		return monthly_Gross_Salary;
	}

	public double getAnnualGrossSalary()
	{
		
		return 12 * getMonthlyGrossSalary();
		
	}	
	
	public double getMonthlyDeductions()
	{
		
		double pf_Amount = 0.10 *  employeeMonthlyBasicSalary;
		double esic_Amount= 4.75 *  employeeMonthlyBasicSalary;
		double prof_Tax=100;

		if(pf_Amount<6500 )
		{
			pf_Amount=pf_Amount;
			esic_Amount=0;
			if( employeeMonthlyBasicSalary==5000)
			{
				esic_Amount=esic_Amount;
			}
			else if(getMonthlyGrossSalary() <=10000)
			{
				prof_Tax=prof_Tax+50;
			}

			
		}
		else if(pf_Amount > 6500)
		{
			pf_Amount=6500;
			esic_Amount=0;
			if(getMonthlyGrossSalary()==5000)
			{
				esic_Amount=esic_Amount;
			}
			else if(getMonthlyGrossSalary() <=10000)
			{
				prof_Tax=prof_Tax+50;
			}
		}	
	return pf_Amount+esic_Amount+prof_Tax;
				
		
		
	}

	public double getMonthlyTakeHome()
	{
		
		return (getMonthlyGrossSalary()-getMonthlyDeductions());
		
	}


	public double getAnnualTakeHome()
	{
		return 12*getMonthlyTakeHome();
	}




}