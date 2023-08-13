package Arrays.ArrayMaximum;

import java.util.Scanner;

public class ArrayMaximum {
    public static void main(String[] args) {
        //Find the maximum element in an array of integers.
        int [] nums = new int[5];

        Scanner sc = new Scanner(System.in);
        //getting inputs
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        //getting the maximum value
        int max = nums[0];
        for(int i : nums){
            if(max < i){ //compare each value of array
                max = i;
            }
        }

        System.out.println("Maximum Value: " + max);




    }
}
