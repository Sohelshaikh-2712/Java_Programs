package Array_Programs;

public class Copy_Array_Program {
    // java program for copying one array into another array

    public static void main(String[] args){
        // calling the copyArray method
        copyArray();

    }

    // creating copyArray method
    public static void copyArray(){

        // defining first array
        int [] num = new int [] {10, 20, 30, 40, 50};

        // defining second array
        int [] num2 = new int[num.length];

        // copying first elements into second array
        for(int i = 0; i < num.length; i++){
            num2[i] = num[i];
        }

        System.out.println("First array elements: ");

        // displaying first array elements
        for(int i = 0; i < num.length; i++) {

            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("Second array elements: ");

        // displaying second array elements
        for(int i = 0; i < num2.length; i++){
            System.out.print(num2[i] + " ");
        }
    }
}
