package hw9;

public class CCalculator {
	int a;
	int b;
	int c;
	
	void set_value(int x, int y, int z)
	{
		a = x;
		b = y;
		c = z;
	}
	void show()		//(b)
	{
		System.out.println("a = "+a+", b = "+b+", c = "+c);
	}
	int add()		//(c)
	{
		System.out.println(a+"+"+b+"+"+c+"=");
		return (a+b+c);
	}
	int sub()		//(d)
	{
		System.out.print(a+"-"+b+"-"+c+"=");
		return (a-b-c);
	}
	int mul()		//(e)
	{
		System.out.print(a+"*"+b+"*"+c+"=");
		return (a*b*c);
	}
	double avg()  		//(f)
	{
		return ((a+b+c)/3.0);
	}



	public static void main(String[] args) { 
		
		CCalculator obj = new CCalculator();
		
		obj.set_value(25, 3, 7);		//(a)
		obj.show();
		System.out.println(obj.add());
		System.out.println(obj.sub());
		System.out.println(obj.mul());
		System.out.println("average="+obj.avg());		
		
	}
		
}	
	
