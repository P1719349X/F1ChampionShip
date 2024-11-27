/**
 * 
 */
package formula1Championship;

/**
 * @author paulnyakeru
 *
 */
public class Mechanic extends TeamMember {
	//fields
	private String role;
	private Boolean atRace;
	
	//constructors
	public Mechanic() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param details
	 * @param salary
	 * @param role
	 * @param atRace
	 */
	public Mechanic(Details details, int salary, String role, Boolean atRace) {
		super(details, salary);
		this.role = role;
		this.atRace = atRace;
	}




	//methods
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the atRace
	 */
	public Boolean isAtRace() {
		return atRace;
	}

	/**
	 * @param atRace the atRace to set
	 */
	public void setAtRace(Boolean atRace) {
		this.atRace = atRace;
	}

	@Override
	public String toString() {
		return "Mechanic [ name=" + getDetails().getFullname() + ", address=" + getDetails().getAddress() + ", role=" + role + ", atRace=" + atRace + ", Salary="
				+ getSalary() + "]" + "\n";
	}
	
	
	
}
