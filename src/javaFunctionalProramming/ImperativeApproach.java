package javaFunctionalProramming;

import java.util.ArrayList;
import java.util.List;

import static javaFunctionalProramming.ImperativeApproach.Gender.FEMALE;

/*Imperative programming involves you as a developer defining every single detail of your implementation
 */
public class ImperativeApproach {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("German", Gender.MALE),
                new Person("April", FEMALE),
                new Person("German", Gender.MALE),
                new Person("Judy", FEMALE)
        );
        //Imperative Approach ...Here I create a list of females
        List<Person> females = new ArrayList<>();
        for (Person person:people) {
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        // a for loop, looping through all females...
        for (Person female:females) {
            System.out.println(female);
        }

    }

    static class Person {
        private final String name;
        private final Gender gender;


        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
