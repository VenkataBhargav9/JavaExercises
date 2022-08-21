package day1;

public class Employee {
	
    public int empId;
	public String empName;
	public String dept;
	private String mobileNo;
	public String email;
	private static String company ="XYZ";
	
	Employee(){
		
	};
	
	Employee(int id){
		this.empId=id;
		
	};
	Employee(int id, String empName){
		this.empId=id;
		this.empName=empName;
		
	};
	Employee(int id, String empName, String dept){
		this.empId=id;
		this.empName=empName;
		this.dept=dept;
		
	};
	Employee(int id, String empName, String dept, String mobileNo){
		this.empId=id;
		this.empName=empName;
		this.dept=dept;
		this.mobileNo=mobileNo;
		
	};
	Employee(int id, String empName, String dept, String mobileNo , String email){
		this.empId=id;
		this.empName=empName;
		this.dept=dept;
		this.mobileNo=mobileNo;
		this.email=email;
		
		
	};
	
	Employee(int id, String empName, String dept, String mobileNo , String email, String company){
		this.empId=id;
		this.empName=empName;
		this.dept=dept;
		this.mobileNo=mobileNo;
		this.email=email;
		this.company=company;
		
		
	};
	
	
	
	public static void main(String[] args) {
		
		Employee emp1= new Employee(9001,"Arjun","Technical","1234567890","arjun@example.com","XYZ");
		Employee emp2= new Employee(9002,"Kavya","HR","7865432109","kavya@example.com","XYZ");
		Employee emp3= new Employee(9004,"Krish","Ops","9021345678","krish@example.com","XYZ");
		
		System.out.println(emp1);
		//System.out.println("hello");
		System.out.println(emp2.empName);
		System.out.println(emp3.email);
		System.out.println(emp2.empId);
		System.out.println(emp1.company);
		System.out.println(emp2.company);
		System.out.println(Employee.company);
		System.out.println(company);
		
		
		
	}
	

}
