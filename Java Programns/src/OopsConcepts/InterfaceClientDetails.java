package OopsConcepts;

public class InterfaceClientDetails implements InterfaceExample{

	public void empId() {
		System.out.println("Employee Id : 3493" );
		
	}

	public void projectName() {
		System.out.println("Project Name is : Java Spring Boot" );
		
	}

	public void companyName() {
		System.out.println("Company Name: Vee Technology" );
		
	}
	
	public static void main(String[] args) {
		InterfaceClientDetails inter= new InterfaceClientDetails();
		inter.empId();
		inter.projectName();
		inter.companyName();
	}
	}


