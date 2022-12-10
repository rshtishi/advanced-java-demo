package inheritance;

public class InheritanceExample {

    public static void main(String[] args){

        Elephant elephant = new Elephant();
        elephant.feed();

        HeavyAnimal animal = new Elephant();
        animal.feed();

        Hippo hippoo = new Hippo();
        hippoo.feed();

        HeavyAnimal hippo = new Hippo();
        boolean isHippoAnHeavyAnimal = hippo instanceof HeavyAnimal; //true
        boolean isHippo = hippo instanceof  Hippo; //true
        boolean isHippoAnElephant = hippo instanceof Elephant; // false
        boolean isHippoAnObject = hippo instanceof Object;  // true
        System.out.println(isHippoAnHeavyAnimal);
        System.out.println(isHippo);
        System.out.println(isHippoAnElephant);
        System.out.println(isHippoAnObject);

        Hippo nullHippo = null;
        boolean isNullHippoAnObject = nullHippo instanceof  Object;
        System.out.println(isNullHippoAnObject);






    }
}
