public class L1518 {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int empty=0;
        while (empty+numBottles>=numExchange) {
            int n=numBottles+empty;
            numBottles=(numBottles+empty)/numExchange;
                ans+=numBottles;
            empty= n%numExchange;
            
        }
        return ans;
    }
}
