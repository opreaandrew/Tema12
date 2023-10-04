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
                map(Person::name).
                collect(Collectors.toList());
    }

    public Map<String, Integer> nameToAge(){
        return people.stream().collect(Collectors.toMap(Person::name, Person::age));
    }

    public List<Person> olderThan(Integer age){
        List<Person> result = new ArrayList<>();
        return result;
    }
}
