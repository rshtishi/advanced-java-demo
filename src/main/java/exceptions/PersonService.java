package exceptions;

import inheritance.override.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonService {

    private Person[] persons = new Person[3];

    public PersonService() {
        persons[0] = new Person("Ben", 25);
        persons[1] = new Person("Alen", 18);
        persons[2] = new Person("Ikki", 28);
    }


    public Person findByName(String name) throws PersonNotFoundException  {
      if(persons==null){
          throw new NullPointerException("No data in person service");
      }
      for(Person person: persons){
          if(person.getName().equals(name)){
              return person;
          }
      }
      throw new PersonNotFoundException("Person is not present in person service");
    }
}
