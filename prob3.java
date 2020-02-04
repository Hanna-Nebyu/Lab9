import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class prob3 {

	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream().filter(W -> W.length() == len).filter(W -> W.contains("" + c))
				.filter(W -> !W.contains("" + d)).count();

	}

	public static void main(String[] args)
		{
			prob3 obj = new prob3();
			
	List<String> words = Arrays.asList("Candy", "Alex", "Car","pen", "marc", "dave");
		
		System.out.println(obj.countWords(words, 'c', 'd', 3));
		
		
			
		}

}
