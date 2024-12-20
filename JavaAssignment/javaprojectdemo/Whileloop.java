package javaprojectdemo;

public class Whileloop {
public static void main(String[] args) {
	
	int num=1, num2=0;
	while(num<=10) {
		if(num%2==0) {
			num2+=num;
		}num++;
		
	}
	System.out.println("Sum of the even numbers"+num2);
	int row =1;
	while(row<=10) {
		int column=1;
		while(column<=10) {
			int result= row *column;
			System.out.println(result+"\t");
			  column++;
			  
		}
		System.out.println();
		row++;
	}
	System.out.println("****");
	int p=1;
	for(p=0;p<=6;p++) {
		if(p<2) continue;
		System.out.println(p+" ");
		if(p<4) continue;
		System.out.println(10*p+" ");
	}
}
}
