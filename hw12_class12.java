package HW12;
// hw8_12,

class Cwin{
	int width, height;		//member
	String name ;
	void setW(int w) {		//(a)
		width=w;
	}
	void setH(int h) {		//(a)
		height=h;
	}
	void setName(String s) {
		name=s;
	}
	void show() {			//output
		System.out.println("Name="+this.name);
		System.out.println("W="+this.width+" ,H="+this.height);
	}
	void setWindows(int w,int h) {		//(b)
		this.width=w;
		this.height=h;
	}
	void setWindows(int w,int h, String s) {		//(c)
		this.width=w;
		this.height=h;
		name = s;
	}
}

public class class12 {

	public static void main(String[] args) {
		Cwin cw=new Cwin();
		cw.setName("My Windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();

	}

}
