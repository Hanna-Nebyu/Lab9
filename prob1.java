import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob1 {

	public static void main(String[] args)
	{
	Stream<String> stringStream = Stream.of("Bill", "Tomas","Mary");
	System.out.println(stringStream.collect(Collectors.joining(",")));
	
}
	}	



