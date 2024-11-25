class square
{
	int no;
	void setValue(int no)
	{
		this.no=no;
	}
	void showSquare()
	{
		System.out.println("square is :"+no*no);
	}
}
public class Squareapplication
{
	public static void main(String x[])
	{
		new square().setValue(5);
		new square().showSquare();
	}
}