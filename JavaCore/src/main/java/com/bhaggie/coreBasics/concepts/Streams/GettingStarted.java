package main.java.com.bhaggie.coreBasics.concepts.Streams;

import main.java.com.bhaggie.coreBasics.utils.model.Gender;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GettingStarted {

    List<Person> people = List.of(
            new Person(29, "Bhaggie", Gender.MALE),
            new Person(23, "Simmi", Gender.FEMALE),
            new Person(17, "Ashwith", Gender.MALE),
            new Person(25, "Meghana", Gender.FEMALE),
            new Person(12, "Mani", Gender.MALE),
            new Person(11, "Lucky", Gender.MALE),
            new Person(17, "Shiva", Gender.MALE),
            new Person(16, "Navya", Gender.FEMALE),
            new Person(17, "Aashrith", Gender.MALE),
            new Person(15, "Shreyan", Gender.MALE),
            new Person(32, "Abhi", Gender.MALE),
            new Person(15, "Sweety", Gender.FEMALE),
            new Person(29, "Sneha", Gender.FEMALE),
            new Person(36, "Roshan", Gender.MALE),
            new Person(12, "Chitti", Gender.FEMALE),
            new Person(18, "Naveen", Gender.MALE),
            new Person(11, "Nithya", Gender.FEMALE),
            new Person(10, "Virat", Gender.MALE)

            );

    @Test
    public void imperativeApproach() throws IOException {

        List<Person> youngPeople = new ArrayList<>();
        int count = 0;
        int limit = 10;
        for (Person person : people) {
            if(person.getAge()<=18) {
                youngPeople.add(person);
                count++;
                if(count == limit) {
                    break;
                }
            }
        }
        youngPeople.forEach(System.out::println);
    }

    @Test
    public void declarativeApproachUsingStreams() throws IOException {
        List<Person> youngPeople = people.stream()
                .filter(p -> p.getAge()<=18)
                .limit(10)
                .collect(Collectors.toList());

        youngPeople.forEach(System.out::println);
    }
}
