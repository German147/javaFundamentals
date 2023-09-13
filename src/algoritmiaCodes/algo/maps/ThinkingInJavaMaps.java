package algoritmiaCodes.algo.maps;

import java.util.*;

public class ThinkingInJavaMaps {
    public static void main(String[] args) {

    }
    public static class MapOfList {
        public static Map<Person, List<? extends Pet>>
                petPeople = new HashMap<Person, List<? extends Pet>>();
        {
//            petPeople.put(new Person("Dawn"),
//                    Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
//            petPeople.put(new Person("Kate"),
//                    Arrays.asList(new Cat("Shackleton"),
//                            new Cat("Elsie May"), new Dog("Margrett")));
//            petPeople.put(new Person("Marilyn"),
//                    Arrays.asList(
//                            new Pug("Louie aka Louis Snorkelstein Dupree"),
//                            new Cat("Stanford aka Stinky el Negro"),
//                            new Cat("Pinkola")));
//            petPeople.put(new Person("Luke"),
//                    Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
//            petPeople.put(new Person("Isaac"),
//                    Arrays.asList(new Rat("Freckly")));
        }

        public class Person{
            private String name;

            public Person(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }

        public static class Pet{
            private String type;

            public static List<String> createPetsList(){
                List<String> petsType = new ArrayList<>();
                petsType.add("Cymric");
                petsType.add("Mut");
                petsType.add("Cat");
                petsType.add("Dog");
                petsType.add("Rat");
                petsType.add("Pug");
                return petsType;
            }

            public Pet(String type) {
                this.type = type;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            @Override
            public String toString() {
                return "Pet{" +
                        "type='" + type + '\'' +
                        '}';
            }
        }
    }
}
