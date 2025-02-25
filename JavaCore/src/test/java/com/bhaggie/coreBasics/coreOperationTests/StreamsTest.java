package test.java.com.bhaggie.coreBasics.coreOperationTests;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {
    @Test
    void streams() {
        List<String> names = List.of("Bhaggie", "Roshan", "Shashi", "Jaya");
        Stream<String> stream = names.stream();

        Stream<String> namesStream = Stream.of("Bhaggie", "Roshan", "Shashi", "Jaya");

        stream.limit(2).map(null).sorted(null)
                .dropWhile(null)
                .collect(Collectors.toList());
    }

}
