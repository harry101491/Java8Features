import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String args[]) {
        // creating a stream from existing array
        // String strArr[] = { "Harshit", "Pareek", "John", "Doe" };
        // Stream.of(strArr).forEach(e -> System.out.println(e));

        // creating a stream from an existing list
        // List<String> names = Arrays.asList(strArr);
        // names.stream().forEach(e -> System.out.println(e));

        // creating a stream from builder
        // Stream.Builder<String> stringBuilder = Stream.builder();
        // stringBuilder.accept("Pareek");
        // stringBuilder.accept("Harshit");
        // stringBuilder.accept("John");
        // stringBuilder.accept("Doe");

        // Stream<String> stringStream = stringBuilder.build();
        // stringStream.forEach(e -> System.out.println(e));

        // map operator :- 
        // map() produces a new stream after applying a function to each element of the original stream.
        // The new stream could be of different type.
        int integerList[] = { 1, 3, 5, 7 };
        Stream.of(integerList).map(String::valueOf).forEach(System.out::println);;
        //System.out.println("The length of string list is:"+stringList.size());
    }
}