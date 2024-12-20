package javaprojectdemo;

public class Student {
	byte num =100;
	int rollNo=234;
	String name="nivetha";
	
	// method
	void display() {
		System.out.println("name: "+name);;
		System.out.println("rollNo: "+rollNo);;
	}
	
	public static void main(String[] args) {
		float f=10.6f;
		double d=1345.6;
		char c=88;
		System.out.println(c);
		double pi,r;
		r=5.5;
		pi=3.2426;
		double area=pi*r*r;
		System.out.println("area of a circle :"+area);
		
		byte num=120;
		short num1=220;
		int lightspeed=12345;
		long days=10000;
		long second=days*24*60*60;
		long distance=lightspeed*second;
		System.out.println("in 100days distance travelled by light :"+distance+" miles");
		
		System.out.println("byte:"+num);
		System.out.println("short:"+num1);
		System.out.println("float:"+f);
		System.out.println("double:"+d);

		// object initialization y using constructor
		Student s1=new Student();
		
		s1.display();
	}
}
