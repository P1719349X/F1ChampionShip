package formula1Championship;


/**
 * @author paulnyakeru
 *
 */

import java.util.Objects;

public class Details {
	// fields
	private String fullname;
	private String address;
	
	//constructors
	public Details(String fullname, String address) {
//		super();
		this.fullname = fullname;
		this.address = address;
	}

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//methods
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Details [Fullname=" + fullname + ", Address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, fullname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Details))
			return false;
		Details other = (Details) obj;
		return Objects.equals(address, other.address) && Objects.equals(fullname, other.fullname);
	}
	
		
}
