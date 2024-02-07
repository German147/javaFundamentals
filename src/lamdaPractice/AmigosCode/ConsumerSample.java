package lamdaPractice.AmigosCode;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Person german = new Person("German",Gender.MALE);
        greetPerson.accept(german);
    }
    static Consumer<Person> greetPerson = person ->
            System.out.println("Hello! "+ person.name);
}
