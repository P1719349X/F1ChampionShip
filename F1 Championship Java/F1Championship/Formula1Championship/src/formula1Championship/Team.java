/**
 * 
 */
package formula1Championship;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author paulnyakeru
 */
public class Team implements Comparable<Team>, Iterable<Mechanic>{
	//fields
	private List<Mechanic> members;
	private Driver driver1;
	private Driver driver2;
	private String name;
	private int points;
	
	
	//constructors
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param driver1
	 * @param driver2
	 * @param name
	 */
	public Team(Driver driver1, Driver driver2, String name) {
		super();
		this.members = new ArrayList<Mechanic>();
		this.driver1 = driver1;
		this.driver2 = driver2;
		this.name = name;
	}

	//methods

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	public void calculatePoints() {
		this.points += driver1.getPoints() + driver2.getPoints();
	}
	
	/**
	 * @return the total salary
	 */
	public double calculateTotalSalaries() {
	    double totalSalaries = 0.0;
	    
	    //adding salaries for mechanics
	    for (Mechanic mechanic : members) {
	        totalSalaries += mechanic.getSalary();
	    }
	    
	    //adding salaries for drivers
	    totalSalaries += driver1.getSalary() + driver2.getSalary();

	    return totalSalaries;
	}

	
	/**
	 * @return the driver1
	 */
	public Driver getDriver1() {
		return driver1;
	}

	/**
	 * @param driver1 the driver1 to set
	 */
	public void setDriver1(Driver driver1) {
		this.driver1 = driver1;
	}

	/**
	 * @return the driver2
	 */
	public Driver getDriver2() {
		return driver2;
	}

	/**
	 * @param driver2 the driver2 to set
	 */
	public void setDriver2(Driver driver2) {
		this.driver2 = driver2;
	}

	/**
	 * @param mechanic the mechanic to add
	 */
	public void add(Mechanic mechanic) {
		this.members.add(mechanic);
	}
	
	/**
	 * @param index the index of mechanic to remove
	 */
	public void remove(int index) {
		this.members.remove(index);
	}
	
	public int size() {
		return members.size();
	}
		
	@Override
	public String toString() {
		return "Team [name=" + name + ", driver1=" + driver1.getDetails().getFullname() + ", points=" 
				+ driver1.getPoints() + ", driver2=" + driver2.getDetails().getFullname()  + ", points=" 
				+ driver2.getPoints()  + ", teamPoints=" + points + "] \n\n";
	}

	@Override
	public Iterator<Mechanic> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Team other) {
		// Sort in reverse order
		return Integer.compare(other.points, this.points);
	} 
}
