class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
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