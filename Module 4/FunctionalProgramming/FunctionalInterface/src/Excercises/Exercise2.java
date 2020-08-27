package Excercises;
/*
print the courses individually by using Functional Interfaces
printing the courses that has spring
print all courses  whose name at least 4 letters

 */

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring boot", "API", "Micrososervices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        // print all the courses individually
        System.out.println("All courses ");
        courses.forEach(System.out::println);

        // printing the courses that has spring
        System.out.println("Courses has spring");
        courses.stream()
                .filter(c -> c.contains("Spring"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // print all courses  whose name at least 4 letters
        System.out.println("Courses has more than 4 letters");
        courses.stream()
                .filter(c -> c.length() >= 4)//lambda expression
                .collect(Collectors.toList())
                .forEach(System.out::println);//Method references

        // print number of characters of each courses
        System.out.println("Number of characters of each course ");

        courses.stream()
                .map(course -> course+ " "+course.length())// maping a value as a Function interface
                .forEach(p->System.out.println(p+" "));

    }
}
