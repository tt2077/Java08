package hw7;

public class CTest {
	void test(int x)
	{
		System.out.print("x = "+x);
		
		if(x%2==1)
			System.out.println(" 此數為奇數");
		else if(x==0)
			System.out.println(" 此數為0");
		else
			System.out.println(" 此數為偶數");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest y =new CTest();
		
		y.test(3);
		y.test(8);
		y.test(0);

	}

}
