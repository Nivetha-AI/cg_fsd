package acessmod;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
public static void main(String[] args) {
	
	int[] numbers = { 3, 5, 7, 9, 3,6,4,2,8, 7, 0 ,7};
	 
	Stream<int []> num = Arrays.stream(new int[][] { numbers });

	
	num.flatMapToInt(Arrays::stream)
	.filter(num1 -> num1%2 ==0)
	.map(num1 -> num1*2)
	.forEach(System.out::println);

	int[] data= {2,4,7,3,6,8,5,4,6};
	IntStream numberstream =Arrays.stream(data);
	Stream <String> strm=Stream.of("java","js","node","html");
	
	strm.map(String :: toString).forEach(System.out :: println);
	
	IntStream rangeStream =IntStream.range(1, 15);
	
	rangeStream.filter(num2 -> num2%2 !=0).forEach(System.out::println);
	
			
}
}
