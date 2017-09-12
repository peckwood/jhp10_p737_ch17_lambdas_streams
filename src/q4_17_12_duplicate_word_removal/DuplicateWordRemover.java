package q4_17_12_duplicate_word_removal;

import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DuplicateWordRemover {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Regex that matches one or more consecutive whitespace characters
		Pattern pattern = Pattern.compile("\\s+");
		System.out.println("type a sentence");
		while (input.hasNext()) {
			String sentence = input.nextLine();
			pattern.splitAsStream(sentence)
			.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println)
			;
		System.out.println("type a sentence");
		}
	}
}
