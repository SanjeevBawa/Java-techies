
public class DepartmentTest {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		Team team=new Team("201");
		Department dept=new Department("101", "Development",team ); //1
		System.out.println(dept.toString());
		
		team.setID("301");
		dept.getTeam().setID("601");
		System.out.println(dept.toString());
		System.out.println(team.toString());
		dept=new Department("501", "PS", team) ;
		System.out.println(dept.hashCode()+"    "+dept.toString());
		System.out.println(dept.getDepartment().toString()+"       "+dept.getDepartment().hashCode());
		
	}
}
