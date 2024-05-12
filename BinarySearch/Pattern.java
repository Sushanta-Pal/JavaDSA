package BinarySearch;

public class Pattern {
    public static void main(String[] args) {
        p(5);
    }

    private static void p(int i) {
        if (i<1) {
            return;
        }
        System.out.println(i);
        p(i-1);
        System.out.println(i);
    
    }
}
