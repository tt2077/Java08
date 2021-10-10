package hw16;

class CSphere
{
	private int x; 		//圓心的x座標
	private int y; 		// 圓心的 y 座標
	private int z; 		// 圓心的 z 座標
	private int radius; // 圓球的半徑
	
	void setLocation(int a, int b, int c) { 		//(a)
		x = a;
		y = b;
		z = c;
	}
	void setRadius(int r) { 		//(b)
		radius = r;
	}
	double surfaceArea() { 			//(c)
		return 4*3.14*radius*radius*radius;
	}
	double volume() { 			//(d)
		return ((3.0/4)*3.14*radius*radius*radius);
	}
	void showCenter() { 		//(e)
		System.out.println("x = "+x+", y = "+y+", z = "+z);
	}	
}


public class hw16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSphere cs = new CSphere();
		
		cs.setLocation(3, 4, 5); //(a)
		cs.setRadius(1);		//(b)
		cs.showCenter();
		System.out.println("surface area = "+cs.surfaceArea());
		System.out.println("volume = "+cs.volume());
	}

}
