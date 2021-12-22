import inheritance.example1.Elephant;
import inheritance.example1.HeavyAnimal;
import inheritance.example1.Hippo;

public class App {

    public static void main(String[] args){
        HeavyAnimal hippo = new Hippo();
        boolean isHippoAnHeavyAnimal = hippo instanceof HeavyAnimal;
        boolean isHippo = hippo instanceof  Hippo;
        boolean isHippoAnElephant = hippo instanceof Elephant;
        System.out.println(isHippoAnHeavyAnimal);
        System.out.println(isHippo);
        System.out.println(isHippoAnElephant);
    }
}
