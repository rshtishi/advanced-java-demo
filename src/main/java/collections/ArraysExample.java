package collections;

public class ArraysExample {

    public static void main(String[] args) {
        //1D array
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        //2D array
        int[][] numbers2D = new int[3][];
        for (int i = 0; i < 3; i++) {
            numbers2D[i] = new int[3];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers2D[i][j] = i + j;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        String[] strArray = {"John", "Jim", "Phoebe"};
        for(String str:strArray){
            System.out.println(str);
        }

        System.out.println();
        String[][] str2DArray = {
                {"John","Jim"},
                {"Mary","Phoebe"}
        };

        for(String[] strs: str2DArray){
            for(String str:strs){
                System.out.print(str+" ");
            }
            System.out.println();
        }

        //copying an array
        System.out.println();
        char[] name = {'J','o','h','n'};
        //shallow copy
        System.out.println("Shallow Copy");
        char[] copyOfName = name;
        copyOfName[3]='y';
        System.out.println(name);
        System.out.println(copyOfName);

        //deep copy
        System.out.println("Deep Copy");
        char[] deepCopyOfName = new char[name.length];
        System.arraycopy(name,0,deepCopyOfName,0,name.length);
        deepCopyOfName[3]='n';
        System.out.println(name);
        System.out.println(deepCopyOfName);

    }
}
