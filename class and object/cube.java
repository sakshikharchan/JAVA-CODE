//1. Write a program to create class name as Cube with two methods 
//void setValue(int x): this function accept number as parameter
//int getCube(): this function can calculate cube of number and return it
import java.util.*;
class cubeApp
{
int no;
void setValue(int x)
{
 no=x;
}
int showcube()
{
System.out.printf("the cube of given number is %d",no*no*no);
}
}
public class cube
	{
public static void main(String x[])
		{
	cubeApp c =new cubeApp();
	c.setValue(3);
	c.showcube();
		}


	}