import java.util.*;
class Finddigit
{
	char a[];
	void setCharArray(char ch[])
	{
		a=ch;
	}
	void showDigits()
	{
		for(int i=0;i<a.length;i++)
		{
			if (a[i]>=48 && a[i]<=57)
			{
				System.out.printf("%c",a[i]);
			}
		}
	}
}
public class FinddigitApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		char ch[]=new char [10];
		System.out.printf("Enter the charcte value in array");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=xyz.nextLine().charAt(0);
		}
		Finddigit fd= new Finddigit();
		fd.setCharArray(ch);
		fd.showDigits();
		
	}
}