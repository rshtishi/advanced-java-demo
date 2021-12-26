import inheritance.Elephant;
import inheritance.HeavyAnimal;
import inheritance.Hippo;

public class MainExample {

    public static void main(String[] args){
        HeavyAnimal hippo = new Hippo();
        boolean isHippoAnHeavyAnimal = hippo instanceof HeavyAnimal;
        boolean isHippo = hippo instanceof  Hippo;
        boolean isHippoAnElephant = hippo instanceof Elephant;
        boolean isHippoAnObject = hippo instanceof Object;
        System.out.println(isHippoAnHeavyAnimal);
        System.out.println(isHippo);
        System.out.println(isHippoAnElephant);
        System.out.println(isHippoAnObject);

        Hippo nullHippo = null;
        boolean isNullHippoAnObject = nullHippo instanceof  Object;
        System.out.println(isNullHippoAnObject);




    }
}
