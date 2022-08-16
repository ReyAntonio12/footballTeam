package Equipo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Persona> persona = new ArrayList<Persona>();
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		
		fillTeam(); //We will fill the team with the following options

	}
	
	public static void fillTeam ()
	{
		int option, inOption;
		char answer;
		
		do {
			
			do {
				
				System.out.println("\"<===== Welcome to the Football-Soccer team =====>\"");
				System.out.println("\n Please select one of the following six options: ");
				System.out.println("\n 1) Add Players");
				System.out.println("\n 2) Add Coaches");
				System.out.println("\n 3) Add Doctors");
				System.out.println("\n 4) Go to following menu:");
				System.out.println("\n 5) Exit program");
				inOption = entrada.nextInt();
				
			}while(inOption < 1 || inOption > 5);
			
			switch (inOption)
			{
			case 1: addPlayer(); //We will add players
				break;
			case 2: addCoach();
			    break;
			case 3: addDoctor();    
			    break;
			case 4:     do {
				             System.out.println("\n Please select one of the following six options: ");
				             System.out.println("\n 1) Next Travel: ");
				             System.out.println("\n 2) Training: ");
				             System.out.println("\n 3) Futball Game: ");
				             System.out.println("\n 4) Planning Training ");
				             System.out.println("\n 5) Interviews: ");
				             System.out.println("\n 6) Heal Lession:  ");
				             System.out.println("\n 7) Exit program. ");
				             option = entrada.nextInt();
				
			                } while (option < 1 || option > 7);
			
			                switch (option) {
			                
			                       case 1: System.out.println("Next travel  will be soon \n");
				                        break;
			                       case 2: System.out.println("Training is Monday to Friday from 8AM to 12 noon");
				                        break;
			                       case 3:
			                    	   System.out.println("This is the list of the next football games: ");
			                           System.out.println("\n Sun 23/08 ----- At 7PM");  
			                           System.out.println("\n Sun 30/08 ----- At 5PM");
				                        break;
			                       case 4:
			                    	   System.out.println("These are the current strategies we are planing: \n");
			                    	   System.out.println("The Strategies are shown with the coach information \n");
			                    	   showData();
				                        break;
			                       case 5:
			                    	   System.out.println("The interviews are going to be schedule anytime soon");
				                        break;
			                       case 6:
			                    	   System.out.println("These are the current heal plans we have \n");
			                    	   System.out.println("The Strategies are shown with the Doctor information \n");
			                    	   showData();
				                        break;
			                       case 7:
				                        System.exit(0);
				                        break;	
				                   default: 
				                	   System.out.println("Wrong choice!!");
				                	   break;
			                      }
			   break;
			case 5:
				System.exit(0);
				break;
			}
			
			System.out.println("Would you like to add another team-mate: (S/N)");
			answer = entrada.next().charAt(0);
			
		} while(answer == 's' || answer == 'S');
		
	}
	//To plan a travel with the team
	public static void addPlayer()
	
	//Adding players to the team
	{
		String firstName, lastName, positionPlayed;
		int age, dorsal;
		
		System.out.println("\n Please add the players first name: ");
		firstName = entrada.next();
		System.out.println("\n Please add the players last name: ");
		lastName = entrada.next();
		System.out.println("\n Please add the players age: ");
		age = entrada.nextInt();
		System.out.println("\n Please add the dorsal of the player: ");
		dorsal = entrada.nextInt();
		System.out.println("\n Please add the position is being played: ");
		positionPlayed = entrada.next();
		
		Futbolista futbolista = new Futbolista(firstName, lastName, age, dorsal, positionPlayed);
		
		persona.add(futbolista);
	}
	
    public static void addCoach()
    {
    	String firstName, lastName, strategy;
    	int age;
    	
    	System.out.println("\n Please add Coach first name: ");
    	firstName = entrada.nextLine();
    	System.out.println("\n Please add Coach last name:");
    	lastName = entrada.nextLine();
    	System.out.println("\n Please add the coach age: ");
		age = entrada.nextInt();
    	System.out.println("\n Plase add the name of the strategy: ");
    	strategy = entrada.nextLine();
    	
    	Coach coach = new Coach(firstName, lastName, age,  strategy);
    	
    	persona.add(coach);
    }
    
    public static void addDoctor () {
    	String firstName, lastName, title;
    	int age, yearsExperience;
 
    	System.out.println("Please add Doctor first name: ");
    	firstName = entrada.nextLine();
    	System.out.println("\n Please add Doctor last name:");
    	lastName = entrada.nextLine();
    	System.out.println("\n Please add the Doctor age: ");
		age = entrada.nextInt();
		System.out.println("Please add Doctor title: ");
		title = entrada.next();		
		System.out.println("\n Please add the year of experience: ");
		yearsExperience = entrada.nextInt();
		
		Doctor doctor = new Doctor (firstName, lastName, age, title, yearsExperience);
		
		persona.add(doctor);
    }
    
    
    public static void showData () {
    	for (Persona coa: persona) {
    		System.out.println(coa.toString());
    		System.out.println("");
    	}
    }
}
