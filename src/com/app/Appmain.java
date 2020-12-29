package com.app;
import java.util.Scanner;
import com.model.PermanentEmployee;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float netsalary=0;
		float pfamount=0;
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		System.out.println("Enter the salary:");
		float salary=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the pfpercentage:");
		float pfpercentage=sc.nextFloat();
		sc.nextLine();
		PermanentEmployee permanentemployee=new PermanentEmployee(name,salary,netsalary,pfpercentage,pfamount);
		boolean valid =(boolean)(permanentemployee.validateInput(salary,pfpercentage));
		if(valid==false) {
			System.out.println("Unable t0 calculate the NetSalary");
			
		}else {
			permanentemployee.findNetSalary();
			
		}
		System.out.println("EmployeeName:"+permanentemployee.getName());
		System.out.println("PF Amount:"+permanentemployee.getPfamount());
		System.out.println("NetSalary:"+permanentemployee.getNetsalary());
		

	}

}
