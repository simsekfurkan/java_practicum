public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	double bonusSalary;
	double afterTax;
	double raisedSalary;

	

	void bonus (){
		
		//if your work hours bigger than 40 than you will get 30$ for each extra hour
		if (workHours>40){
			bonusSalary=salary+((workHours-40)*30);
		}
		else {
			bonusSalary=salary;
		}
	}

	void tax (){
		//if your salary bigger than 1000 %3 tax from your salary
		if (bonusSalary>1000){
			afterTax=bonusSalary-(bonusSalary*0.03);
		}
		else {
			afterTax=bonusSalary;
		}
		
	}

	
	void raiseSalary (){
		
		//if your hire year is lower than 10 year than you will get 5% raise
		if (2021-hireYear<10){
			raisedSalary=afterTax+(afterTax*0.05);
		}
		////if your hire year is bigger than 9 year and lower than 20 year you will get 10% raise
		else if (2021-hireYear>9 && 2021-hireYear<20){
			raisedSalary=afterTax+(afterTax*0.1);
		}
		// if your hire year is bigger than 19 year you will get 15% raise
		else if (2021-hireYear>19){
			raisedSalary=afterTax+(afterTax*0.15);
		}
		
	}
	
	// ali first employee
	public static void main(String args[]) {
		Employee ali = new Employee();
		ali.name = "Ali";
		ali.salary = 2000;
		ali.workHours = 45;
		ali.hireYear = 1985;

  
		System.out.println("Name: "+ ali.name);
		System.out.println("Base Salary: " + ali.salary);
		System.out.println("Work Hours : " + ali.workHours);
		System.out.println("Hire Year : " + ali.hireYear);
		ali.bonus();
		String calculateBonus = Double.toString(ali.bonusSalary-ali.salary);
		System.out.println("Bonus Salary : " + calculateBonus);
		System.out.println("With Bonus : " + ali.bonusSalary);
		ali.tax();
		// Payed tax
		String payTax = Double.toString(ali.bonusSalary-ali.afterTax);
		System.out.println("Payed tax : " + payTax);
		String afterTax = Double.toString(ali.afterTax);
		System.out.println("After Tax : " + afterTax);
		ali.raiseSalary();
		// Raised salary - after tax
		String raisedSalary = Double.toString(ali.raisedSalary-ali.afterTax);
		System.out.println("Raised Salary : " + raisedSalary);
		System.out.println("Final Salary : " + ali.raisedSalary);
	 }	
	 
}




	
