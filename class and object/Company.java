class Company
{ private String name;
  private int id;
  private String address;
  private int sal;
   void addNewEmployee(String name,int id,int sal,String address)
   {  this.name=name;
      this.id=id;
      this.sal=sal;
      this.address=address;
   }
   void showEmployee()
   { System.out.println(name+"\t"+id+"\t"+sal+"\t"+address);
  }	
}
public class EmployeeApplication
{
    public static void main(String x[])
    {
	Company c = new Company();
	c.addNewEmployee("RAM",1,10000,"PUNE");
	c.showEmployee();
    }
}
