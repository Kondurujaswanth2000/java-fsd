package jashu;

public class constructor {
		
		int empid;
		String empname;
		String department;
		float salary;
		
		public constructor() {
			empid = 1;
			empname ="nithin";
			department = "software";
			salary = 35000;
		}
		
		public constructor(int empid,String empname,String department,float salary) {
			
			this.empid = empid;
			this.empname = empname;
			this.department= department;
			this.salary = salary;
			
		}
		
		public void display() {
			
			System.out.println("Id: "+empid);
			System.out.println("Name: "+empname);
			System.out.println("Department: "+department);
			System.out.println("Salary: "+salary);
			System.out.println();	
		}
		
	public static void main(String[] args) {
			
		constructor e= new constructor();
		constructor e1=new constructor(2, "Nikunj Smni", "Training", 450000); 

			//calling default constructor
			e.display();
			//parametrized constructor
			e1.display();
			
	}
}
