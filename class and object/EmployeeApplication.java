class Employee
{
	private int id;
	private String name;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
}
public class EmployeeApplication
{
	public static void main(String x[])
	{
		Employee e =new Employee();
		e.setid(1);
		e.setname("ABC");
		//int empid=e.getid();
		//String empname=e.getName();
		System.out.println(e.empid()+"\t"+e.empid());
	}
}