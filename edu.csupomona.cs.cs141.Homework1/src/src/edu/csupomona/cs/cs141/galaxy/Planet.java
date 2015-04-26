/**
 * 
 */
package edu.csupomona.cs.cs141.galaxy;

/**
 * @author Edwin Rodr&iacute;guez
 *
 */
public class Planet {
	
	private boolean hasLife;
	
	private boolean isHabitable;
	
	private String name;
	
	private double density;
	
	private double mass;
	
	private double radius;

	/**
	 * @param planetName
	 * @param radius
	 * @param density
	 * @param mass
	 */
	public Planet(String planetName, double radius,
			double density, double mass) {
		this.name = planetName;
		this.radius = radius;
		this.density = density;
		this.mass = mass;
	}

	public boolean isHabitable() {
		return isHabitable;
	}

}
