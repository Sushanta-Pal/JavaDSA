public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
   // you need treat n as an unsigned value
   public static int reverseBits(int n) {
    int ans=0;
          int i=0;
          while (i<32) {
            int bit=n&(n-1);
            ans+=(Math.pow(2,i)*bit);
            n=n<<1;
            i++;
          }
    return ans;
} 
}
