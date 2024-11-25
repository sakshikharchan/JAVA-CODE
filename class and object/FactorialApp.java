//Q2. Write program to create class name as Factorial with two functions 
//void setValue(int x): this function accept number as parameter
//int getFactorial(): this function can calculate factorial of number and return it
import java.util.*;
class Factorial
{ int x;
 int fact =1;
void setValue(int x)
{
 this.x=x;
}
int getFactorial()
{ Scanner xyz=new Scanner(System.in);
  System.out.printf("Enter the number");
 
  int num=xyz.nextInt();
 for(int i=1;i<num;i++)
 {
 fact=fact*i;
 }
 
   System.out.printf("the factorial is %d",fact);
}
}
public class FactorialApp
{
public static void main(String x[])
{
Factorial f= new Factorial();
f.setValue(5);
f.getFactorial();
}
}