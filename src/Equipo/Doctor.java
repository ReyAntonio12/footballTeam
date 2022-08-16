package Equipo;

public class Doctor extends Persona {

	private String title;
	private int yearsExperience;
	
	//Constructor of Doctor
	public Doctor(String firstName, String lastName, int age, String title, int yearsExperience) {
		super(firstName, lastName, age);
		this.title = title;
		this.yearsExperience = yearsExperience;
	}
	
	//Getters and Setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	@Override
	public String toString() {
		return "Doctor" +super.toString()+ "\nTitle: "+title + "\nYears of Experience: "+ yearsExperience;
	}
	
	
}
