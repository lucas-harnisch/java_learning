package LambdaExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class LambaStreamExample2 {

    public static void main(String[] args) {
        

List<Person> people = Arrays.asList(
    new Person("Alice", 23),
    new Person("bob", 19),
    new Person("Charlie", 17),
    new Person("anna", 30),
    new Person("Albert", 16),
    new Person("Brian", 22)
);


       Map<String, List<Person>> grouped = people.stream()
            .filter(p -> p.getAge() > 18)
            .sorted(Comparator.comparingInt(Person::getAge))
            .collect(Collectors.groupingBy(
                p -> p.getName().substring(0,1).toUpperCase(),
                TreeMap::new,
                Collectors.toList()
            ));

        grouped.forEach((letter, group) -> {
            System.out.println(letter + ":");
            group.forEach(p -> System.out.println("  " + p.getName() + " (" + p.getAge() + ")"));
        });


    }
}