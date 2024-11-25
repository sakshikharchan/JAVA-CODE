import java.util.*;
class Employee
{
private int id;
private string name;
private int sal;

public void setid(int id)
{
this.id=id;
}
public int getid()
{
return id;
}
public void setname(string name)
{
this.name=name;
}
public string  getname()
{
return  name;
}
public void setsal(int sal)
{
this.sal=sal;
}
public int getsal()
{
return sal;
}
}
class Ascending
{
  


System.out.printf("name \t  id  \t sal");

for(int i=0;i<a.length;i++)
{
System.out.print(a[i].getid+"\t"+a[i].getname+"\t"+a[i].getsal);
}

for (int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;i++)
{
if (a[i].sal>a[j].sal)
{
int temp=a[i].sal;
a[i].sal=a[j].sal;
a[j].sal=temp;
}

}
}
public class EmployeeArrApp
{
public static void  main(String x[])
{
int a[]=new int [5];
Scanner xyz=new Scanner (System.in);

System.out.printf("name \t  id  \t sal");

for(int i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
ascending a =new ascending();
/*Employee emp=new Employee();

emp.setid(1);
emp.setname("abc");
emp.setsal(10000);

Employee emp1=new Employee();
emp1.setid(1);
emp1.setname("abc");
emp1.setsal(10000);

Employee emp2=new Employee();
emp1.setid(1);
emp1.setname("abc");
emp1.setsal(10000);


Employee emp3=new Employee();
emp3.setid(1);
emp3.setname("abc");
emp3.setsal(10000);


Employee emp4=new Employee();
emp4.setid(1);
emp4.setname("abc");
emp4.setsal(10000);

a.Ascending(emp,emp1,emp2,emp3,emp4);	*/
	Employee e[]=new Employee[5];
        for(int i=0;i<e.length;i++)
{ 
e[i].new Employee();
e[i].setid(sc.nextInt());
sc.nextLine();
e[i].setname(sc.nextLine());
e[i].setsal(sc.nextInt());


}
for(int i=0;i<e.length;i++)
{
System.out.printf(e[i].getid()+"\t"+e[i].getname()+"\t"+e[i].getsal());
}
}
}