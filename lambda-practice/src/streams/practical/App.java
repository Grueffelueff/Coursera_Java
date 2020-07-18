package streams.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException {
		
			IntStream
			.range(1,10)
			.skip(5)
			.forEach((x) -> System.out.print(x));
		System.out.println();
		
		int val = IntStream
		.range(1,10)
		.sum();
	System.out.println();
	
	Stream.of("Hello", "Ötter", "Fisch")
	.sorted()
	.findFirst()
	.ifPresent((x) -> System.out.println(x));
	
	String[] items = {"car", "Ötter", "tüdeldü", "Fisch", "Fish"};
	Stream.of(items)
		.filter((x) ->x.startsWith("F"))
		.sorted()
		.forEach(x -> System.out.print(x + ", "));
	System.out.println();
	
	Arrays.stream(new int[] {2,4,6,8,10})
	.map((x) -> x * x)
	.average()
	.ifPresent(n -> System.out.print(n));
	System.out.println();
	
	Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
	lines.filter(l -> l.length() > 6)
	.sorted()
	.forEach(x -> System.out.println(x + ", "));
	lines.close();

	}

}
