package collections;

public class ArraysExample {

    public static void main(String[] args){
        //1D array
        int[] numbers = new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=i+1;
        }
        System.out.println(numbers);
        for(int number:numbers){
            System.out.println(number);
        }

        System.out.println();

        //2D array
        int[][] numbers2D = new int[3][];
        for(int i=0;i<3;i++){
            numbers2D[i]=new int[3];
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                numbers2D[i][j]=i+j;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(numbers2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}
