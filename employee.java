/*
Write a class named Employee that has the following fields:
• name: The name field is a String object that holds the employee's name.
• idNumber: The idNumber is an int variable that holds the employee's ID number.
• department: The department field is a String object that holds the name of the department where the employee works.
• position: the position field is a string object that holds the employee's job title.

Write appropriate mutator methods that store the values in these fields and accessor methods that return the values in these fields.

Once you have written the class, add a main method that creates three Employee objects to hold the following data:

Name ID Number Department Position
Susan Meyers 47899 Marketing Sales Rep
Mark Jones 39119 IT Programmer
Joy Rogers 81774 Manufacturing Engineer

The program should store this data in the three objects and then display the data
for each employee in the format:

Name, employee number ID Number, works as a Position in Department.

For example:

Susan Meyers, employee 47899, works as a Sales Rep in Marketing.

Print each statement on a separate line in the order Susan, Mark, Joy.
*/



public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return name;	
	}
	
	public void setidNumber(int idNumber) {
		this.idNumber = idNumber;	
	}
	
	public int getidNumber() {
		return idNumber;	
	}
	
	public void setDepartment(String department) {
		this.department = department;	
	}
	
	public String getDepartment() {
		return department;	
	}
	
	public void setPosition(String position) {
		this.position = position;	
	}
	
	public String getPosition() {
		return position;	
	}
	
	public Employee() {
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position = "";
	}
	
	public static void main(String[] args) {
		Employee susan = new Employee();
		susan.setName("Susan Meyers");
		susan.setidNumber(47899);
		susan.setDepartment("Marketing");
		susan.setPosition("Sales Rep");
		
		Employee mark = new Employee();
		mark.setName("Mark Jones");
		mark.setidNumber(39119);
		mark.setDepartment("IT");
		mark.setPosition("Programmer");
		
		Employee joy = new Employee();
		joy.setName("Joy Rogers");
		joy.setidNumber(81774);
		joy.setDepartment("Manufacturing");
		joy.setPosition("Engineer");
		
		System.out.println(susan.getName() +  ", employee number " + susan.getidNumber() + ", works as a " + susan.getPosition() + " in " + susan.getDepartment() + ".");
		
		System.out.println(mark.getName() +  ", employee number " + mark.getidNumber() + ", works as a " + mark.getPosition() + " in " + mark.getDepartment() + ".");
		
		System.out.println(joy.getName() +  ", employee number " + joy.getidNumber() + ", works as a " + joy.getPosition() + " in " + joy.getDepartment() + ".");
}
}
