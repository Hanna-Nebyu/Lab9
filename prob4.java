import java.util.stream.IntStream;
import java.util.stream.Stream;

public class prob4 {
	
	public static void main(String[] args) {	
		printSquares(4);
	}
	public static void printSquares(int num) {
		IntStream squares = IntStream.iterate(1, n -> nextSquare(n)).limit(num);
		squares.forEach(System.out::println);
		
	}
		
	private static int nextSquare(int n) {
		return (int) Math.pow((int)Math.sqrt(n) + 1, 2);
	}
	
}

