package Array_Programs;

public class Largest_Element_InArray {
    // java program to find Largest element and display it

    public static void main(String []args){

        // calling largestElement method
        largestElement();
    }

    // method declaration
    public static void largestElement(){

        // creating array
        int [] numbers = new int[] {10, 70, 200, 450, 700};
        // creating Max variable to store the largest element in the array
        int Max = numbers[0];

        // using for loop, for iterating on array
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > Max) {
                Max = numbers[i];
            }

        }
        System.out.println("Largest element in the array is: " + Max);



    }


}
