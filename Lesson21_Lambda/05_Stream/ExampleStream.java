import java.util.*;
  
public class ExampleStream {
        public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("This");
		myList.add("is");
		myList.add("some");
		myList.add("text");

		// A stream
		myList
			.stream()
			.filter(s -> s.length() >= 3)
			.map(String::toUpperCase)
			.sorted()
			.forEach(s -> System.out.println(s));

		System.out.println();

		// The original list is unmodified
		myList
			.forEach(s -> System.out.println(s));
	}
}
