/**
 * 
 */
package formula1Championship;

/**
 * @author paulnyakeru
 *
 */
public class F1ChampionshipTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating details
		Details driverDetails1 = new Details("Max Vestappen", "Rome, Italy");
		Details driverDetails2 = new Details("Sergio Perez", "Madrid, Spain");
		Details driverDetails3 = new Details("Lewis Hamilton", "London, United Kingdom");
		Details driverDetails4 = new Details("George Russel", "Leicester, United Kingdom");
		Details driverDetails5 = new Details("Lance Stroll", "Istanbul, Turkey");
		Details driverDetails6 = new Details("Fernando Alonso", "Manila, Colombia");
		Details driverDetails7 = new Details("Carlos Sainz", "Rio, Brazil");
		Details driverDetails8 = new Details("Pierre Gasly", "Paris, France");
		Details driverDetails9 = new Details("Charles Leclerc", "Montreal, Canada");
		Details driverDetails10 = new Details("Lando Norris", "Geneva, Switzerland");
		
		Details mechanicDetails1 = new Details("John Smith", "Bristol, United Kingdom");
		Details mechanicDetails2 = new Details("Braddley Stoke", "Texas, USA");
		Details mechanicDetails3 = new Details("Joseph Ikechukwu", "Lagos, Nigeria");
		Details mechanicDetails4 = new Details("Daniel Ekpe", "Kumassi, Ghana");
		
		Details mechanicDetails5 = new Details("Claude Puel", "Montage, France");
		Details mechanicDetails6 = new Details("Bernard Kingsey", "Rome, Italy");
		Details mechanicDetails7 = new Details("Macmillan Sube", "Dubal, UAE");
		Details mechanicDetails8 = new Details("Akeson Ando", "Amsterdam, Netherlands");
		
		Details mechanicDetails9 = new Details("Geremy Doku", "Brussels, Belgium");
		Details mechanicDetails10 = new Details("Dave McConnor", "Hinkley, United Kingdom");
		Details mechanicDetails11 = new Details("Kingsley Akume", "Nairobi, Kenya");
		Details mechanicDetails12 = new Details("Austin Trusty", "Colorado, USA");
		
		Details mechanicDetails13 = new Details("Marcus Bong", "Beijing, China");
		Details mechanicDetails14 = new Details("Stephane Marroque", "Monaco, France");
		Details mechanicDetails15 = new Details("Lima Salvador", "Fatima, Portugal");
		Details mechanicDetails16 = new Details("Wissal Lemhani", "Rabat, Morocco");
		
		Details mechanicDetails17 = new Details("Johnson Jide", "Newyork, USA");
		Details mechanicDetails18 = new Details("Boris Bentashe", "Vienna, Austria");
		Details mechanicDetails19 = new Details("James Sutho", "Pretoria, South Africa");
		Details mechanicDetails20 = new Details("Peter Obi", "Abuja, Nigeria");
		
		
		//creating drivers
		Driver driver1 = new Driver(driverDetails1, 5500000, 310);
		Driver driver2 = new Driver(driverDetails2, 2500000, 180);
		
		Driver driver3 = new Driver(driverDetails3, 4500000, 340);
		Driver driver4 = new Driver(driverDetails4, 3000000, 210);
		
		Driver driver5 = new Driver(driverDetails5, 2700000, 310);
		Driver driver6 = new Driver(driverDetails6, 3200000, 90);
		
		Driver driver7 = new Driver(driverDetails7, 1500000, 100);
		Driver driver8 = new Driver(driverDetails8, 3100000, 380);
		
		Driver driver9 = new Driver(driverDetails9, 2200000, 250);
		Driver driver10 = new Driver(driverDetails10, 3700000, 630);
		
		//creating mechanics
		Mechanic mechanic1 = new Mechanic(mechanicDetails1, 230000, "Data Strategist", true);
		Mechanic mechanic2 = new Mechanic(mechanicDetails2, 170000, "Driver Support", true);
		Mechanic mechanic3 = new Mechanic(mechanicDetails3, 210000, "Basic Engineer", true);
		Mechanic mechanic4 = new Mechanic(mechanicDetails4, 220000, "Basic Engineer", true);
		
		Mechanic mechanic5 = new Mechanic(mechanicDetails5, 230000, "Data Strategist", true);
		Mechanic mechanic6 = new Mechanic(mechanicDetails6, 170000, "Driver Support", true);
		Mechanic mechanic7 = new Mechanic(mechanicDetails7, 190000, "Basic Engineer", true);
		Mechanic mechanic8 = new Mechanic(mechanicDetails8, 200000, "Basic Engineer", true);
		
		Mechanic mechanic9 = new Mechanic(mechanicDetails9, 220000, "Data Strategist", true);
		Mechanic mechanic10 = new Mechanic(mechanicDetails10, 200000, "Driver Support", true);
		Mechanic mechanic11 = new Mechanic(mechanicDetails11, 170000, "Basic Engineer", true);
		Mechanic mechanic12 = new Mechanic(mechanicDetails12, 160000, "Basic Engineer", true);
	
		Mechanic mechanic13 = new Mechanic(mechanicDetails13, 180000, "Data Strategist", true);
		Mechanic mechanic14 = new Mechanic(mechanicDetails14, 160000, "Driver Support", true);
		Mechanic mechanic15 = new Mechanic(mechanicDetails15, 140000, "Basic Engineer", true);
		Mechanic mechanic16 = new Mechanic(mechanicDetails16, 135000, "Basic Engineer", true);
		
		Mechanic mechanic17 = new Mechanic(mechanicDetails17, 250000, "Data Strategist", true);
		Mechanic mechanic18 = new Mechanic(mechanicDetails18, 190000, "Driver Support", true);
		Mechanic mechanic19 = new Mechanic(mechanicDetails19, 220000, "Basic Engineer", true);
		Mechanic mechanic20 = new Mechanic(mechanicDetails20, 200000, "Basic Engineer", true);
		
		//Creating teams
		Team team1 = new Team(driver1, driver2, "RED BULL RACING");
		Team team2 = new Team(driver3, driver4, "MERCEDES");
		Team team3 = new Team(driver5, driver6, "ASTON MARTIN");
		Team team4 = new Team(driver7, driver8, "FERRARI");
		Team team5 = new Team(driver9, driver10, "McLAREN");
		
		//Adding the machanics to each team
		team1.add(mechanic1);
		team1.add(mechanic2);
		team1.add(mechanic3);
		team1.add(mechanic4);
		
		team2.add(mechanic5);
		team2.add(mechanic6);
		team2.add(mechanic7);
		team2.add(mechanic8);
		
		team3.add(mechanic9);
		team3.add(mechanic10);
		team3.add(mechanic11);
		team3.add(mechanic12);
		
		team4.add(mechanic13);
		team4.add(mechanic14);
		team4.add(mechanic15);
		team4.add(mechanic16);
		
		team5.add(mechanic17);
		team5.add(mechanic18);
		team5.add(mechanic19);
		team5.add(mechanic20);
		
		team1.calculatePoints();
		team2.calculatePoints();
		team3.calculatePoints();
		team4.calculatePoints();
		team5.calculatePoints();
		
		
		//Creating Championship
		Championship grandPrix = new Championship();
		
		
		//Adding teams to championship
		grandPrix.add(team1);
		grandPrix.add(team2);
		grandPrix.add(team3);
		grandPrix.add(team4);
		grandPrix.add(team5);
		
		grandPrix.sortTeamsOnPoints();
		
		
		System.out.println("###################################################");
		System.out.println("# WELCOME TO THE LEICESTER FORMULA 1 CHAMPIONSHIP #");
		System.out.println("################################################### \n");
		
		System.out.println("HERE ARE THE FINAL TEAM STANDINGS");
		
		System.out.println(grandPrix);
		
		//prints the Champions (top of the list)
		System.out.println("\n Champions: " + grandPrix.get(0).getName() + "\n Team points: " + grandPrix.get(0).getPoints() + "\n Team salary: $" 
				+ grandPrix.get(0).calculateTotalSalaries() + "\n Number of team members: " + (grandPrix.get(0).size() + 2));
		
	}

}
