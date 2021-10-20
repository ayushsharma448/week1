package CoreJava;

import java.util.*;public class ReduceEgN3 { // Driver code
public static void main(String[] args)
{
	
List<String> words = Arrays.asList( "bbbbb", "zzzzzz",
"ccccccccccc", "AAA", "kkkkkkkkkkkkkkk"); 

int longestString = words.stream()
.reduce((word1, word2) -> {
return word1.length() < word2.length() ? word2 : word1;
}
).get().length();
System.out.println(longestString); // Displaying the longest String

}
}


