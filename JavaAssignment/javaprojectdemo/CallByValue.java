package javaprojectdemo;

public class CallByValue {

	int change(int b) {
		++b;
		return b;
	}
	int x=20;
	void modify (int x) {
		x=x+300;
		System.out.println("vaule of x after modification "+x);
	}
	public static void main(String[] args) {
		CallByValue c1 = new CallByValue();
		c1.modify(c1.x);
		System.out.println("original value of x: "+c1.x);
	
		
		int a=20;
		int x=c1.change(a);
		System.out.println("Value of a after passing "+a);
		System.out.println("Value of x after passing "+x);
   
		int u=100;
		System.out.println("before return statement");
		if(u==100)
			return ;// return program under main method it will terminate
		System.out.println("After return statement");
		
	}
	}
