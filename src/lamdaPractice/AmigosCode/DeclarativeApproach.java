package lamdaPractice.AmigosCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static lamdaPractice.AmigosCode.Gender.FEMALE;

public class DeclarativeApproach {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Angela", FEMALE),
                new Person("Lucy", FEMALE),
                new Person("Marc", Gender.MALE),
                new Person("Luis", Gender.MALE),
                new Person("Elsa", FEMALE),
                new Person("Tim", Gender.MALE)
        );

        // Declarative Approach
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
