/**
 * 
 */
package formula1Championship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author paulnyakeru
 *
 */
public class Championship implements Iterable<Team>{
	//fields
	private ArrayList<Team> teams;
	
	

	//constructors
	public Championship() {
		super();
		this.teams = new ArrayList<Team>();
		// TODO Auto-generated constructor stub
	}

	//methods
	public void sortTeamsOnPoints() {
		Collections.sort(this.teams);
	}
	
	/**
	 * @param mechanic the mechanic to add
	 */
	public void add(Team team) {
		this.teams.add(team);
	}
	
	/**
	 * @param index the index of mechanic to remove
	 */
	public void remove(int index) {
		this.teams.remove(index);
	}
	
	public Team get(int index) {
		return this.teams.get(index);
	}
	
	public int size() {
		return this.teams.size();
	}
	
	public void clear() {
		this.teams.clear();
	}
	
	@Override
	public String toString() {
		return "\n " + teams;
	}

	@Override
	public Iterator<Team> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
