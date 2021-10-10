package hw5;

public class CBox {
	int length;
	int width;
	int height;
	
	int volume()		//(b)
	{
		return length*width*height;
	}
	int surfaceArea()		//(c)
	{
		return 2*((length*width)+(width*height)+(length*height));
	}
	void showData()			//(d)
	{
		System.out.println("length = "+length);
		System.out.println("width = "+width);
		System.out.println("height = "+height);
	}
	void showAll()
	{
		showData();
		System.out.println("surfaceArea = "+surfaceArea());
		System.out.println("volume = "+volume());	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box;		//(a)
		box = new CBox();
		
		box.length = 1;
		box.width = 1;
		box.height = 1;
		
		box.showAll();
		

	}

}
