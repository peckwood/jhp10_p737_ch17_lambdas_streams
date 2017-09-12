package q6_parallelization_optimization;

import java.util.stream.IntStream;

public class IntStreamOperations {
	public static void main(String[] args) {
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

		//Sum of values with reduce method
		System.out.printf("Sum of squares of values: %d%n", 
			IntStream.of(values)
			.map(x -> x * x)
			.sum()
			)
		;

	}
}
