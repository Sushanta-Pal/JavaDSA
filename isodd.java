import java.util.Scanner;

public class isodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check its odd or not ");
        int n ;
        n=sc.nextInt();
        if (checkNo(n)) {
            System.out.println("Its Even");
        }
        else System.out.println("Its Odd");
        sc.close();

    }

    private static boolean checkNo(int n) {
        if((n & 1 )==0) return true;
        return false;
    }
}
