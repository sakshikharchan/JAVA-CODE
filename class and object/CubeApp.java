import java.util.*;
class Cube
{
	int no;
	void setValue(int x)
	{
		no=x;
	}
	void showCube()
	{
		System.out.printf("cube is %d",no*no*no);
	}
}
public class CubeApp
{
	public static void main(String x[])
	{
		Cube c=new Cube();
		c.setValue(3);
		c.showCube();
		
	}
}