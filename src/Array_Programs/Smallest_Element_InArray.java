package Array_Programs;

public class Smallest_Element_InArray {
        // java program to find Largest element and display it

        public static void main(String []args){
            // calling largestElement method
            smallestElement();
        }

        // method declaration
        public static void smallestElement(){

            // creating array
            int [] numbers = new int[] {100, 70, 200, 450, 700};
            // creating Max variable to store the largest element in the array
            int Min = numbers[0];

            // using for loop, for iterating on array
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] < Min) {
                    Min = numbers[i];
                }

            }
            System.out.println("Smallest element in the array is: " + Min);



        }
    }


