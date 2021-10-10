package hw13;

class CCircle {
	double area(double r) {		//(a)
		return (3.14*r*r);
	}
	float area(float r) {		//(b)
		return (3.14f*r*r);
	}
	double area(int r) {		//(c)
		return(3.14*r*r);
	}
}

public class hw13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle obj = new CCircle();
		
		System.out.println("area(2) = "+obj.area(2));
		System.out.println("area(2.2f) = "+obj.area(2.2f));
		System.out.println("area(2.2) = "+obj.area(2.2));

	}

}
