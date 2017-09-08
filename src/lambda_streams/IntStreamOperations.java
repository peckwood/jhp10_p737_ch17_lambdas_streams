package lambda_streams;

import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class IntStreamOperations {
	public static void main(String[] args) {
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
		
		System.out.println("Original values: ");
		IntStream.of(values)
			.forEach(value -> System.out.printf("%d ", value));
		System.out.println();
		
		//count, min, max, sum and average of the values
		System.out.printf("%nCount: %d%n", IntStream.of(values).count());
		System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
		System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
		System.out.printf("Sum: %d%n", IntStream.of(values).sum());
		System.out.printf("Avergae: %.2f%n", IntStream.of(values).average().getAsDouble());
		
		//Sum of values with reduce method
		System.out.printf("%nSum via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));
		System.out.printf("Sum of squares of values via reduce method: %d%n", 
				IntStream.of(values).reduce(0, (x,y) -> x + y * y));
		System.out.printf("Product via reduce method: %d", IntStream.of(values).reduce(1, (x, y) -> x * y));
		
		System.out.printf("%nEven values displayed in sorted order: ");
		IntStream.of(values)
			.filter(value -> value % 2 == 0)
			.sorted()
			.forEach(value -> System.out.printf(" " + value));
		
		System.out.printf("%nOdd values multiplied by 10 and displayed in sorted order: ");
		IntStream.of(values).filter(value -> value%2 != 0)
		.map( value -> value * 10)
		.sorted()
		.forEach(value -> System.out.printf(" "+value));
		
		System.out.printf("%nSum of integers from 1 to 9: %d%n", IntStream.range(1, 10).sum());
		System.out.printf("Sum of integers from 1 to 10: %d%n", IntStream.rangeClosed(1, 10).sum());
		
		//System.out.printlf("", IntStream.of(values).);
		//System.out.printlf("", IntStream.of(values).);
	}
}
