public class offIthBit {
    public static void main(String[] args) {
        int n=7;
        int i= 1;
        System.out.println(OffBit(n,i));
    }

    private static int  OffBit(int n, int i) {
        return (n &(~(1<<(i-1))));
    }
}
