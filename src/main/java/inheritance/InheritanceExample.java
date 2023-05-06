package inheritance;

public class InheritanceExample {

    public static void main(String[] args){

        Elephant elephant = new Elephant();
        elephant.feed();
        elephant.healthCheck();
        elephant.noise();

        HeavyAnimal animal = new Elephant();
        animal.feed();
        if(animal instanceof Elephant){
            Elephant elephantA = (Elephant) animal;
            elephantA.noise();
        }

        Hippo hippoo = new Hippo();
        hippoo.feed();


        HeavyAnimal hippo = new Hippo();
        boolean isHippoAnHeavyAnimal = hippo instanceof HeavyAnimal; //
        boolean isHippo = hippo instanceof  Hippo; //
        boolean isHippoAnElephant = hippo instanceof Elephant; //
        boolean isHippoAnObject = hippo instanceof Object;  //
        System.out.println(isHippoAnHeavyAnimal);
        System.out.println(isHippo);
        System.out.println(isHippoAnElephant);
        System.out.println(isHippoAnObject);

        Hippo nullHippo = null;
        boolean isNullHippoAnObject = nullHippo instanceof  Object;
        System.out.println(isNullHippoAnObject);






    }
}
