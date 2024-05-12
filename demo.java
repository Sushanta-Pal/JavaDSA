

import java.util.Arrays;
import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [];
        arr = new int[5];
        // for(int i=0 ;i<arr.length;i++){
        //     arr[i]= sc.nextInt();
        // }
        // for(var i :arr){
        //     System.out.print(i+" ");
        // }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        String s = sc.next();
        // String c = sc .nextLine();
        System.out.println(s);
        // System.out.println(c);
        sc.close();
    }
}
