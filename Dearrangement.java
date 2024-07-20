public class Dearrangement {
    public static void main(String[] args) {
        System.out.println(new Dearrangement().countDerangements());
    }
    public int countDerangements(int n){
        if (n<=1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        return (int)(Math.ceil(.3678*fac(n)));
    }
    private int fac(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
         }
}
