class Employee
{

	  private int employeeId;
	  private String employeeName;
	  private double employeeMonthlyBasicSalary;

 
	public Employee(int employeeId , String employeeName , double employeeMonthlyBasicSalary)
	{
	this.employeeId=employeeId;
	this.employeeNAme=employeeName;
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
		
		return 12 * monthly_Gross;
		
	}	
	
	public double getMonthlyDeductions()
	{
		
		double pf_Amount = 0.10 * employeeMonthlyBasicSalary;
		double esic_Amount= 4.75 * employeeMonthlyBasicSalary;
		double prof_Tax;
		
		
	}

	public double getMonthlyTakeHome()
	{
		
		return (monthly_Gross-monthly_Deduc);
		
	}


	public double getAnnualTakeHome()
	{
		return 12*monthly_TakeHome;
	}




}