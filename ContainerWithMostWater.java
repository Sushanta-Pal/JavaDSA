public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(height));
    }
    public int maxArea(int[] height) {
        int left=0;
        int right =height.length-1;
        int maxArea=-1;
        while(left<right){
                    int currArea=Math.min(height[left], height[right])*(right-left);
                    maxArea=Math.max(maxArea, currArea);
                    if (height[left]<height[right]) {
                        left++;
                    }else right--;
        }
        return maxArea;
    }


    public int maxScoreSightseeingPair(int[] values) {
        int i=0;
        int j =values.length-1;
        int maxScore=Integer.MIN_VALUE;
        while(i<j){
                    int currScore= values[i] + values[j] + i - j ;
                    maxScore=Math.max(maxScore, currScore);
                    if (values[i]<values[j]) {
                        i++;
                    }else j--;
        }
        return maxScore;
    }
}
