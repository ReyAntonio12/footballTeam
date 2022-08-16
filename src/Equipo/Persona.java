package Equipo;

public class Persona {
	
	protected String firstName;
	protected String lastName;
	protected int age;
	
	
	//Constructor
	
	public Persona(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
     
	
	//Getters And Setters
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\n Age:" + age;
	}
}