
class Power {
	private int b;
	private int I;
	int pow=1;
	int length;
	void setValue(int base, int index)
	{
	b=base;
	I=index;
	}
	int getPower()
	{
		for(int i=1;i<I;i++)
		{
			pow=pow*b;
	
		return pow;
	}
	public static void main(String x[])
	{
		Power p =new Power();
		p.setValue(2, 03);
		int result = p.getPower();
		System.out.println("Result is "+result);
	}
	
	
}
