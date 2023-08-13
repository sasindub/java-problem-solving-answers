package Arrays.ArraySum;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        //Write a program to calculate the sum of all elements in an integer array.
        int [] numArrays = new int[5];

        Scanner sc = new Scanner(System.in);
        //getting inputs
        for(int i=0; i<numArrays.length; i++){
            numArrays[i] = sc.nextInt();
        }

        //get the sum of all values
        int total = 0;
        for(int i : numArrays){
            total += i; //add and assign all the values of numArray
        }

        //print the total
        System.out.println("Total: " + total);


    }
}
