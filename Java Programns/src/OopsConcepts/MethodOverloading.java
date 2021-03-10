package OopsConcepts;

public class MethodOverloading {

	public void employeeInfo(String FirstName, String LastName) {
	 System.out.println("Employee FirstName :" +FirstName);
	 System.out.println("Employee FirstName :" +LastName);
	}
	
	public void employeeInfo(int EmpId, long phoneno ) {
		 System.out.println("Employee Id :" +EmpId);
		 System.out.println("Employee phoneno :" +phoneno);
		}

	public void employeeInfo(String ProjectName) {
		 System.out.println("Employee ProjectName :" +ProjectName);
		 
		}
	public void employeeInfo(float Salary) {
		 System.out.println("Employee Salary :" +Salary);
		 
		}
	
	public static void main(String[] args) {
		MethodOverloading over=new MethodOverloading();
		over.employeeInfo("Raman","Subramani");
		over.employeeInfo(18461, 8300903294l);
		over.employeeInfo("Java Spring Boot");
		over.employeeInfo(48679f);
		}

}
