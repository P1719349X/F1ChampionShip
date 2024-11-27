/**
 * 
 */
package formula1Championship;

import java.util.Objects;

/**
 * @author paulnyakeru
 *
 */
public class TeamMember {
	//fields
	private Details details;
	private double salary;
	
	//constructors
	public TeamMember(Details details, double salary) {
		super();
		this.details = details;
		this.salary = salary;
	}

	public TeamMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//methods
	/**
	 * @return the details
	 */
	public Details getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(Details details) {
		this.details = details;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(details, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof TeamMember))
			return false;
		TeamMember other = (TeamMember) obj;
		return Objects.equals(details, other.details)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "TeamMember [details=" + details + ", salary=" + salary + "]";
	}
	
	
	
}
