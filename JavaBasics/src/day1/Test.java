package day1;

public class Test {

	
	Employee emp1= new Employee(9001,"Arjun","Technical","1234567890","arjun@example.com","XYZ");
	Employee emp2= new Employee(9002,"Kavya","HR","7865432109","kavya@example.com","XYZ");
	Employee emp3= new Employee(9004,"Krish","Ops","9021345678","krish@example.com","XYZ");
	
public static void main(String[] args) {
		
		Employee emp1= new Employee(9001,"Arjun","Technical","1234567890","arjun@example.com","XYZ");
		Employee emp2= new Employee(9002,"Kavya","HR","7865432109","kavya@example.com","XYZ");
		Employee emp3= new Employee(9004,"Krish","Ops","9021345678","krish@example.com","XYZ");
		
		System.out.println(emp1.email);
		System.out.println(emp2.empName);
		System.out.println(emp3.empId);
		
		
	}
}
