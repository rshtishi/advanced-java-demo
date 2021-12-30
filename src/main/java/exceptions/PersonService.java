package exceptions;

import inheritance.override.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonService {

    private static List<Person> persons = new ArrayList<>();

    static {
        persons.add(new Person("Ben", 25));
        persons.add(new Person("Alen", 18));
        persons.add(new Person("Ikki", 28));
    }

    public Person findByName(String name) throws PersonNotFoundException {
        Optional<Person> person = persons.stream().filter(p -> p.getName().equals(name)).findFirst();
        if(person.isPresent()){
            throw new PersonNotFoundException();
        }
        return person.get();
    }
}
