import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob2 {
	
	public static void main(String[] args)
	{
		IntSummaryStatistics myIntStream = Stream.of(7,2,9,4,5,6)
				.collect(Collectors.summarizingInt(Integer::intValue));
					System.out.println("min=" + myIntStream.getMin()+"\nmax="+ myIntStream.getMax());
					
}
	}


