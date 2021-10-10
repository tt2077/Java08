package hw6;

public class CCircle 		//定義類別CCircle
{
	double pi = 3.14;
	double radius;

	void show_periphery() 		// show_periphery(), 顯示出圓周長
	{
		System.out.println("periphery="+2*this.pi*this.radius); //(c)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir1 = new CCircle();	//(a)
		
		cir1.radius = 3.0;	//(b)
		cir1.show_periphery();  //(d)

	}

}
