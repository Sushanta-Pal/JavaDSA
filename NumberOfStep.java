public class NumberOfStep {
    public static void main(String[] args) {
        int n=14;
        System.out.println(numberOfSteps(n));
    }
        public static int numberOfSteps(int n) {
            if (n==0) {
                return 0;
            }
            int ans=0;
            if (n%2==0) {
                ans=1;
                return ans+numberOfSteps(n/2);
            }
            else {
                ans=1;
                return ans+numberOfSteps(n-1);
            }
        }
    
}
