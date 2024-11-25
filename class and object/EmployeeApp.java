class Employee
{
	private int id;
	private String name;
	public void SetId(int id)
	{
	this.id=id;
	}
	public int getId()
	{
	return id;
	}
	public void setName(String name)
	{
	this.name=name;
	
	}
	public String  getName()
	{
	return name();
	}
}
public class EmployeeApp
{
public static void main(String x[])
{
Employee e=new Employee();
e.setId(1);
e.setName("ABC");
int empId()=e.getId();
String empName=e.getName();
System.out.println(empid+"\t"+empName);
}
}
