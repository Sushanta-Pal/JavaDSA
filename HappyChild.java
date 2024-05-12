import java.util.Arrays;

public class HappyChild {
    public static void main(String[] args) {
        int[] happiness={1,2,3};
        int k=2;
        System.out.println(new HappyChild().maximumHappinessSum(happiness, k));
    }
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        Arrays.sort(happiness);
        for(int i=0;i<k;i++){
            if (happiness[happiness.length-1-i]-i>0) {
                ans+=happiness[happiness.length-1-i]-i;
            }
            
        }
        return ans;
    }
}
