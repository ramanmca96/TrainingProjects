package OopsConcepts;

public class Company {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setFirstName("Raman");
		emp.setLastName("Subramani");
		emp.setAddress("Salem");
		
		InternEmployee intern=new InternEmployee();
		intern.setFirstName("Raavanan");
		intern.setLastName("Rishi");
		intern.setAddress("SriLanka");
		
		
		System.out.println("Employee FirstName:" +  emp.getFirstName());
		System.out.println("Employee LastName :" + emp.getLastName());
		System.out.println("Employee Address  :" + emp.getAddress());

		System.out.println("");
		
		System.out.println("InternEmployee FirstName :" + intern.getFirstName());
		System.out.println("InternEmployee LastName  :" + intern.getLastName());
		System.out.println("InternEmployee Address   :" + intern.getAddress());

		
		
	}
}
