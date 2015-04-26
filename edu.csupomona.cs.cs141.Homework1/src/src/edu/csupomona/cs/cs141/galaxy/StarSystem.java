/**
 * 
 */
package edu.csupomona.cs.cs141.galaxy;

/**
 * @author Edwin Rodr&iacute;guez
 *
 */
public class StarSystem {
	
	/**
	 * 
	 */
	private Star[] suns;
	
	/**
	 * 
	 */
	private Planet[] planets;
	
	/**
	 * 
	 */
	private Asteroid[] asteroids;
	
	/**
	 * 
	 */
	private Comet[] comets;
	
	private int nextPlanet = 0;
	
	/**
	 * @return
	 */
	public boolean hasHabitablePlanet() {
		boolean result = false;
		
		for (Planet p : planets) {
			if (p.isHabitable()) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * @return
	 */
	public int numberOfPlanets(){
		return planets.length;
	}
	
	/**
	 * @param planetName
	 * @param radius
	 * @param density
	 * @param mass
	 */
	public void createPlanet(String planetName,
			double radius, double density, double mass) {
		if (nextPlanet < planets.length) {
			planets[nextPlanet++] = new Planet(planetName,
					radius, density, mass);
		} else {
			System.out.println("No more space for planets!");
		}
	}

}
