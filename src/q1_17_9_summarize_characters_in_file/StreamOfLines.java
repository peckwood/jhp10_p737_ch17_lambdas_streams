package q1_17_9_summarize_characters_in_file;

// Fig. 17.17: StreamOfLines.java
// Counting word occurrences in a text file.
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOfLines
{
   public static void main(String[] args) throws IOException
   {
      // count occurrences of each word in a Stream<String> sorted by word
      Files.lines(Paths.get("src/o5_string_stream_from_file/Chapter2Paragraph.txt"))
      	.flatMap(line -> Arrays.asList(line.split("")).stream())
      	.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      	.forEach((letter, frequency) ->
	      	{
	      		 System.out.printf("%s %2d%n", letter, frequency);
	      	}
      	)
      ;
   }
} // end class StreamOfLines

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
