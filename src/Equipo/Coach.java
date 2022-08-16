package Equipo;

public class Coach extends Persona {

	private String strategy;
	
	//Constructor of Coach

	public Coach(String firstName, String lastName, int age, String strategy) {
		super(firstName, lastName, age);
		this.strategy = strategy;
	}

	//Getter and Setters
	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	@Override
	public String toString() {
		return "Coach" +super.toString()+ "\nStrategy we will use: "+ strategy;
	}
	
	
}
