public class onIthBit {
    public static void main(String[] args) {
        int n=8;
        int i=3;
        System.out.println(onBit(n,i));
    }

    private static int onBit(int n, int i) {
        return n|(1<<(i-1));
    }
}
