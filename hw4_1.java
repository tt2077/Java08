package hw4;

class CBox {
	int length;
	int width;
	int height;
}


public class hw4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box;
		box = new CBox();
		box.length = 15;
		box.width = 10;
		box.height = 25;
		
		System.out.println("length = "+box.length);
		System.out.println("width = "+box.width);
		System.out.println("height = "+box.height);
	}

}
