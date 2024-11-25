class Employee
{  private int id;
   private String name;
   private int sal;

   public void setId(int id)
   { this.id=id;
   }
   public int getId(){
    return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName(){
      return name;
   }
   public void setSal(int sal)
   { this.sal=sal;
   }
   public int getSal(){
    return sal;
   }
}
class Company
{  private Employee emp;
    void addNewEmployee(Employee employee)
    {  emp=employee;
    }
    void showEmployee()
    { System.out.println(emp.getName()+"\t"+emp.getId()+"\t"+emp.getSal());
    }
}
public class CompanyApplication
{
    public static void main(String x[])
    {
	Company c = new Company();
	Employee e = new Employee();
	e.setId(1);
	e.setName("ABC");
	e.setSal(10000);
	c.addNewEmployee(e);
	c.showEmployee();
    }
}
