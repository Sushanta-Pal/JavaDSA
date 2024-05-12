import java.util.Arrays;

public class Noof1Bits {
    public static void main(String[] args) {
        // System.out.println(hammingWeight(5));
        // System.out.println(count1(5));
        // int arr[]=countBits(5);
        // System.out.println(Arrays.toString(arr));
      //  System.out.println(findComplement(5));
       // System.out.println(alternatingBits(3));
        System.out.println(countPrimeSetBits(6,10));
    }
    public static int countPrimeSetBits(int left, int right) {
        int ans=0;
       for(int i=left;i<=right;i++){
           int num = i;
           int count=0;
           while(num>0){
               int bit = num%2;
               if(bit==1){
                   count++;
               }
               num=num/2;
           }
           if(isPrime(count))ans++;
       }
       return ans;
   }
    private static boolean isPrime(int count) {
        if (count==0||count==1) {
            return false;
        }
        for(int i=2;i*i<=count;i++){
            if (count%i==0) {
                return false;
            }
        }
        return true;
    }
    private static boolean alternatingBits(int n) {
        while(n!=0){
            int a=(n&1);
            n>>=1;
            int b=(n&1);
            if(a==b){
               return false;
            }
        }
        return true;
            
        
    }
    public static int findComplement(int num) {
        return (int)(Math.pow(2,countDigit(num))-1)-num;
    }
    private static int countDigit(int n) {
        int ans =1;
        ans +=(int) (Math.log(n)/Math.log(2));
        return ans;
    }
    public static int[] countBits(int n) {
    
        int res[] = new int[n+1];
        for(int num = 0; num <= n; num++){
            res[num] = (count1(num));
        }
        return res;
    }
     private static int count1(int n) {
        int ans=0;
        while (n!=0) {
            
                ans++;
            
            n=n&(n-1);
        }
        return ans;
    }
    // you need to treat n as an unsigned value
     public static int hammingWeight(int n) {
        int ans=0;
        while (n!=0) {
            if ((n&1)==1) {
                ans++;
            }
            n=n>>>1;
        }
        return ans;
    
}
}
