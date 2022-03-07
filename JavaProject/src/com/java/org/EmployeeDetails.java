package com.java.org;

public class EmployeeDetails {
	private void EmpID() {
       System.out.println("Employee id is:23547");
	}
	private void EmpName() {
        System.out.println("Employee name is:Vijayakumar");
	}
	private void EMPDOB() {
        System.out.println("Employee DOB is:1/05/1996");
	}
    private void Empphone() {
         System.out.println("Employee Phone number is:6949546596");
	}
    private void Empadd() {
        System.out.println("Employee Emailaddress is:vijay67@gmail.com");
	}
    private void Empad() {
      System.out.println("Employee address is:1/56 ranganathan street ");
	}
    
   public static void main(String[] args) {
		EmployeeDetails driver = new EmployeeDetails();
		driver.EmpID();
		driver.EmpName();
		driver.EMPDOB();
		driver.Empphone();
		driver.Empadd();
		driver.Empad();
	}

}
