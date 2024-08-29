package palindrome;
import java.util.Scanner;
class Employee {
	String name,address;
	int age;
	long phonenum;
	double salary;
	Employee(String empName,int ampAge,long empPhonenum, String empAddress,double empSalary){
		name =empName;
		age=ampAge;
		phonenum=empPhonenum;
		address =empAddress;
		salary=empSalary;
	}
	void printEmployee() {
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("phone number: "+phonenum);
		System.out.println("adress "+address);
	}
	void printSalary() {
		System.out.println("Salary: "+salary);
	}
}
class Officer extends Employee {
	String specialization;
	Officer(String empName,int empAge,long empPhonenum, String empAddress,double empSalary ,String empSpecialization){
		super(empName,empAge,empPhonenum,empAddress,empSalary);
		specialization = empSpecialization;
	}
	void printSpecialization() {
		System.out.println("Specilalization: "+specialization);
	}
}
class Manager extends Employee{
	String department;
	Manager(String empName,int empAge,long empPhonenum, String empAddress,double empSalary ,String empDepartment){
		super(empName,empAge,empPhonenum,empAddress,empSalary);
		department = empDepartment;
	}
	void printDepartment() {
		System.out.println("Department: "+department);
	}
}
public class inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details of the officer: ");
		System.out.println("enter name: ");
		String offname = sc.next();
		System.out.println("enter age: ");
		int offage = sc.nextInt();
		System.out.println("enter phone number: ");
		long offphonenum = sc.nextLong();
		System.out.println("enter adress: ");
		String offaddress = sc.next();
		System.out.println("enter salary: ");
		double offsal= sc.nextDouble();
		System.out.println("enter specialization: ");
		String offspc = sc.next();
		Officer off = new Officer(offname,offage,offphonenum,offaddress,offsal,offspc);
		System.out.println();
	
	    System.out.println("enter the details of the Manager: ");
		System.out.println("enter name: ");
		String mgname = sc.next();
		System.out.println("enter age: ");
		int mgage = sc.nextInt();
		System.out.println("enter phone number: ");
		long mgphonenum = sc.nextLong();
		System.out.println("enter adress: ");
		String mgaddress = sc.next();
		System.out.println("enter salary: ");
		double mgsal= sc.nextDouble();
		System.out.println("enter Department: ");
		String mgdep = sc.next();
		Manager mg = new Manager(mgname,mgage,mgphonenum,mgaddress,mgsal,mgdep);
		System.out.println();
		
	    System.out.println("Details of officer.");
	    off.printEmployee();
	    off.printSalary();
	    off.printSpecialization();
	    System.out.println();
	    System.out.println("Details of manager.");
	    mg.printEmployee();
	    mg.printSalary();
	    mg.printDepartment();
	    
	    sc.close();
	    
	    
		}
}