package lamdaPractice.AmigosCode;


import java.util.ArrayList;
import java.util.List;

import static lamdaPractice.AmigosCode.Gender.FEMALE;

public class ImperativeApproach {
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

//        Imperative Approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }



    }


}
