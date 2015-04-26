/**
 * 
 */
package edu.csupomona.cs.cs141.galaxy;

import java.util.Scanner;

/**
 * @author Edwin Rodr&iacute;guez
 *
 */
public class GalaxySim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Galaxy name:");
		
		String galaxyName = sc.nextLine();
		
		Galaxy galaxy = new Galaxy(galaxyName);
		
		// TODO: Add code to add multiple star systems
		
		System.out.println("Add first Star System:");
		
		System.out.println("System name:");
		
		String sysName = sc.nextLine();
		
		System.out.println("Name of Star:");
		
		String star = sc.nextLine();
		
		System.out.println("Galaxy to create: Name: " + galaxyName +
				"Star Systems: " + sysName + "Stars: " + star);
	}

}
