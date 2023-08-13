package StringRvrs;

import java.util.Scanner;

public class StringRvrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        char [] arr = name.toCharArray();

        char [] arr2 = new char[name.length()];
        int a = 0;
        for(int i=arr.length-1; i >= 0; i--){
            arr2[a] = arr[i];
            a++;
        }

        sc.close();

        String newName = new String(arr2);

        System.out.println(newName);

       
        

    }
}
