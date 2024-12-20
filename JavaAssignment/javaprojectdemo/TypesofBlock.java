package javaprojectdemo;
// local block
// instance block
// static block

public class TypesofBlock {
	// instance initialization block
	int data;
	{
		data = 500;
	}

	public TypesofBlock() {
		super();
		System.out.println("0-args constructor");
	}

	public TypesofBlock(int x) {
		super();
		System.out.println("1-args constructor");
	}

   // instance block 1
	{
		System.out.println(" first Instance block...");
	}

	// instance block 2
	{
		System.out.println(" second Instance block...");
	}

	void disp() {
		System.out.println(data);
	}

	public static void main(String[] args) {
		TypesofBlock t = new TypesofBlock();
		new TypesofBlock(5);
		t.disp();
	}
}
