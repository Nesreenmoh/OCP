/*
Imperative programming
defining every single step what the program can do to get the result
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Person>people= List.of(
                new Person("Nesreen", Person.Gender.FEMALE),
                new Person("Anis", Person.Gender.MALE),
                new Person("Sara", Person.Gender.FEMALE),
                new Person("Yusuf", Person.Gender.MALE)
                );

//        //Imperative approach
//        List<Person> females= new ArrayList<>();
//        for(Person person:people){
//            if(Person.Gender.FEMALE.equals(person.gender)){
//                females.add(person);
//            }
//        }
//        System.out.println(females);

        // Declarative approach
        System.out.println("Declarative Approach");
        people.stream().
                filter(person ->Person.Gender.FEMALE.equals(person.gender ))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender){
            this.name=name;
            this.gender=gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        enum Gender{
            MALE,FEMALE
        }
    }
}
