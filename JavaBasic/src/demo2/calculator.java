package demo2;

public class calculator {
	public void add (int a, int b)
	{
		System.out.println(a+b);
	}
	private void multiply(int c, int d)
	{
		System.out.println(c*d);
	}
		
	protected void subtract(int e,int f)
	{
		System.out.println(e-f);
		
	}
	public static void main(String args[])
	{
		calculator obj= new calculator();
		obj.add(10, 20);
		obj.multiply(10,0);
		obj.subtract(20, 10);
	}

}
