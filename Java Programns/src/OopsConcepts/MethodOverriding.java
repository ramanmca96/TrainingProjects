package OopsConcepts;

public class MethodOverriding extends MethodOverloading{

	public void employeeInfo(String ProjectName) {
		// TODO Auto-generated method stub
		super.employeeInfo(ProjectName);
	}
	
	public void employeeInfo(String FirstName, String LastName) {
		// TODO Auto-generated method stub
		super.employeeInfo(FirstName, LastName);
	}
	public void employeeInfo(int EmpId, long phoneno) {
		// TODO Auto-generated method stub
		super.employeeInfo(EmpId, phoneno);
	}
	public static void main(String[] args) {
		MethodOverriding ride =new MethodOverriding();
		ride.employeeInfo("SQL DATABASE");
		ride.employeeInfo("Ravanan", "Rishi");
		ride.employeeInfo(18462, 9944443294l);
		
		
	}
	
	
}
