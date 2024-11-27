package formula1Championship;

/**
 * @author paulnyakeru
 *
 */

public class Driver extends TeamMember{
	//fields
	private int points;

	
	//contructors
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param details
	 * @param salary
	 * @param points
	 */
	public Driver(Details details, double salary, int points) {
		super(details, salary);
		this.points = points;
	}
	
	//methods
	/**
	 * @return the points
	 */
	public int getPoints() {
		return this.points;
	}

	public void addPoints(int score) {
		this.points += score;
	}

	@Override
	public String toString() {
		return "Driver [name=" + getDetails().getFullname() + ", address=" + getDetails().getAddress() + ", points=" + points + ", Salary=" + getSalary()
				+ "]" + "\n";
	}
	
}
