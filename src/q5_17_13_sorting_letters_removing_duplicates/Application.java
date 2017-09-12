package q5_17_13_sorting_letters_removing_duplicates;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		//List<Character> list = 
		List<Integer> integerList = random.ints(30, 65, 91)
				.boxed()
				.collect(Collectors.toList())
				;

		List<Character> charList = new ArrayList<>();
		for(Integer integer:integerList){
			charList.add(Character.valueOf((char)((int)integer)));
		}

		charList.stream()
		.sorted()
		.forEach(System.out::print);

		System.out.println();
		charList.stream()
		.sorted(Comparator.comparing(character -> -(int)character))
		.forEach(System.out::print);
		
		System.out.println();
		charList.stream()
		.distinct()
		.sorted()
		.forEach(System.out::print);

	}
}
