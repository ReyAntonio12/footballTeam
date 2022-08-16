package Equipo;

public class Futbolista extends Persona {

	private int dorsal;
	private String playedPosition;
	
	//Constructor for Futbolista
	
	public Futbolista(String firstName, String lastName, int age, int dorsal, String playedPosition) {
		super(firstName, lastName, age);
		this.dorsal = dorsal;
		this.playedPosition = playedPosition;
	}
	
	 //Getters and Setters

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getPlayedPosition() {
		return playedPosition;
	}

	public void setPlayedPosition(String playedPosition) {
		this.playedPosition = playedPosition;
	}

	@Override
	public String toString() {
		return "Futbolista\n" +super.toString() +"\n Dorsal: "+ dorsal + "\n Position:" + playedPosition;
	}
	
	

}
