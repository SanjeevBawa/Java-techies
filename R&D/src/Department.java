


/**
 * 
 *  1 Make your class final, so that no other classes can extend it.

	2 Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.
	3 Don’t expose setter methods.
	4 When exposing methods which modify the state of the class, you must always return a new instance of the class.
	5 If the class holds a mutable object:
		a Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, this is to prevent the clients who pass the object from modifying it afterwards.
		b Make sure to always return a clone copy of the field and never return the real object instance.
 * @author 
 *
 */
public final class Department implements Cloneable {//1

	private final String ID;//2 variable must be private , 3 final
	private final String name;
	private final Team team;
	
	
	protected Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public Department(String ID,String name,Team team) {
		this.ID=ID;
		this.name=name;	
		Team team2=new Team(team.getID());//5 Any dependent reference should be locally initialized with new local object
		this.team=team2;
	}
	
	//4 no setter method only getter method to be use
	public String getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public Team getTeam() throws CloneNotSupportedException {//5
		return (Team)this.team.clone();
	}

	@Override
	public String toString() {
		return "Department [ID=" + ID + ", name=" + name + ", team=" + team.toString() + "]";
	}
	
	public Department getDepartment() throws CloneNotSupportedException {//4
		return (Department)this.clone();
	}
}

class Team implements Cloneable{
	
	private  String ID;
	
	
	public Team(String ID) {
		this.ID=ID;
	}
	
	
	
	public String getID() {
		return this.ID;
	}

	public void setID(String ID) {
		this.ID=ID;
	}


	@Override
	public String toString() {
		return "Team [ID=" + ID + "]";
	}

	protected Object clone()throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
