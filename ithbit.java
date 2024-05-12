public class ithbit {
    public static void main(String[] args) {
        int n=8;
        int i=4;
        if(ithBit(n, i)!=0){
            System.out.println("Its 1");
        }
        else System.out.println("Its 0");
    }

    private static int ithBit(int n,int i) {
//     int ans =0;
//    while (i>0) {
//     ans = n&1;
//       n =  n>>1;
//       i--;
    
//    }
//         return ans;
    return (n & (1<<(i-1)));
    }
}
