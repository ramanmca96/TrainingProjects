package OopsConcepts;

public class AbstractExtention extends AbstractionExample {

	void projectDetails() {
		System.out.println("Java Spring Boot ");
		
	}

	void clientDetails() {
	System.out.println("Will Smith ");
		
	}
	
	public static void main(String[] args) {
		AbstractExtention abs=new AbstractExtention();
		abs.clientDetails();
		abs.companyName();
	}

}
