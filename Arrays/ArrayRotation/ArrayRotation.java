package Arrays.ArrayRotation;

import java.util.Collection;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
      int [] arr = {10,20,30,40,50};

      int a = arr.length-1;
      int i = 0;
      int num = 0;
      while(i < a){
        num = arr[i];
        arr[i] = arr[a];
        arr[a] = num;
        a--;
        i++;
      }

    for(int j: arr){
        System.out.print(j + " ");
    }

      

      

        

    } 


}
