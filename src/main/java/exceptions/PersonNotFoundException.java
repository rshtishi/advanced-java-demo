package exceptions;

public class PersonNotFoundException extends Exception {

    public PersonNotFoundException() {
        super();
    }


    public PersonNotFoundException(String message) {

        super(message);
    }
}
