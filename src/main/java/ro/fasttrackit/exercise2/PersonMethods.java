package ro.fasttrackit.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMethods {
    private final List<Person> people;

    public PersonMethods(List<Person> people) {
        this.people = new ArrayList<>(people);  //reference escape, sensei
    }

    public List<String> peopleNames(){
        return people.stream().
                map(Person::getName).
                collect(Collectors.toList());
    }

    public Map<String, Integer> nameToAge(){
        return people.stream().
                collect(Collectors.toMap(Person::getName, Person::getAge));
    }

    public List<Person> olderThan(Integer age){
        return people.stream().
                filter(person -> person.getAge() > age).
                collect(Collectors.toList());
    }

    public Map<String, List<String>> hairToName(){
        return people.stream()
                .collect(Collectors.groupingBy(Person::getHairColour, Collectors.mapping(Person::getName, Collectors.toList())));
    }

    public Map<Integer, List<String>> ageToName(){
        return people.stream().
                collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
    }
}
