/*
A Generic Method for Printing Arrays
Create a generic method called printArray that can print any type of array. 
For example, create an array of integers and an array of strings, 
and use the method to print each array.
 */

package Generics;

public class PrintArrays {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Adnan", "This is JAVA", "JavaFX"};
        Double[] douArray = {3.25, 5.09, 1.23, 0.96};

       
        printArray(intArray);
        printArray(strArray);
        printArray(douArray);
    }
}
