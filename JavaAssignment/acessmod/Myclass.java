package acessmod;

public class Myclass {
	public static double performOperation(double a , double b , MathOperation operation) {
		return operation.apply(a, b);
	}

public static void main(String[] args) {

	double x=10,y=5;
	MathOperation addition =(a,b)-> MathOperation.add(a, b);
	MathOperation sub =(a,b)-> MathOperation.subtract(a, b);

	MathOperation multiply =(a,b)-> MathOperation.multiply(a, b);
	MathOperation divide =(a,b)-> MathOperation.divide(a, b);

	
	System.out.println("addition= "+performOperation(x,y ,addition));
	System.out.println("Sub = "+performOperation(x,y ,sub));
	System.out.println("Multiply = "+performOperation(x,y ,multiply));
	System.out.println("Divide = "+performOperation(x,y ,divide));
	double result = performOperation(x,0,divide);
	
	if(Double.isNaN(result)){
		System.out.println("Diivsion by zero retiurn a error ");
	}
	MathOperation safeDivide=(a,b)->a/b;
	System.out.println("safe division: "+safeDivide.safeDivide(y, 0));
	
}

}
