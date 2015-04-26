package edu.csupomona.cs141.Prog_Assign_4;

import java.util.ArrayList;
import java.util.Scanner;

public class VetUI {
	Scanner sc = new Scanner(System.in);
	ArrayList<Animal> animals = new ArrayList<Animal>();
	ArrayList<Owner>  owners = new ArrayList<Owner>(); 
	
	public VetUI(){
		mainMenu();
	}
	
	public void mainMenu(){
		
		String input;
		int choice=0;
		boolean validChoice=false;
		while (!validChoice){
			System.out.print("*****************************************************\n"
				+ "   Welcome to the Vet Database System  \n"
				+ "\tChose From the following options : \n"
				+ "\t\t1.Add an Animal\n"
				+ "\t\t2.Add an Owner\n"
				+ "\t\t3.Create an Appointment\n"
				+ "\t\t4.View Appointments\n"
				+ "\t\t5.Find An Appointment or Appointments\n"
				+ "\t\t6.Find An Animal \n"
				+ "*******************************************************\n");
			input = sc.nextLine();
			choice = verifyInput(input);
			if ((choice>0) && (choice<7))
				validChoice =true;	
		}
		switch(choice){
		case 1:
			addAnimal();
			break;
		case 2:
			addOwner();
			break;
		case 3:
			addAppointment();
			break;
		case 4:
			viewAppointments();
			break;
		case 5:
			searchAppointments();
			break;
		case 6:
			searchAnimals();
			break;
		}
	}

	private void searchAnimals() {
		// TODO Auto-generated method stub
		
	}

	private void searchAppointments() {
		// TODO Auto-generated method stub
		
	}

	private void viewAppointments() {
		// TODO Auto-generated method stub
		
	}

	private void addAppointment() {
		// TODO Auto-generated method stub
		
	}

	private void addOwner() {
		// TODO Auto-generated method stub
		
	}

	private void addAnimal() {
		String input;
		int choice=0;
		boolean validChoice=false;
		while(!validChoice){
			System.out.println("*****************************************************\n"
				+ "Choose the Type of Animal : \n"
				+ "\t1.Bird\n"
				+ "\t2.Dog\n"
				+ "\t3.Fish \n"
				+ "*****************************************************");
		
			input = sc.nextLine();
			choice = verifyInput(input);
			if (choice>0 && choice<4)
				validChoice = true;
			}
			
		
		
		
	}
	
	private int verifyInput(String input){
		
			try{
			return Integer.parseInt(input);	
			}
			catch(NumberFormatException nfe){
			System.out.println("No number was entered. Are you trying to break me?");
			return 0;
			}
	}
	
	
	
	
}
