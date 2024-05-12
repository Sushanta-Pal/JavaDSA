public class IdleSubSeq {

  public static void main(String[] args) {
      IdleSubSeq ob = new IdleSubSeq();
      System.out.println(ob.longestIdealString("dyyonfvzsretqxucmavxegvlnnjubqnwrhwikmnnrpzdovjxqdsatwzpdjdsneyqvtvorlwbkb", 7));
  }

//   public int longestIdealString(String s, int k) {
//       if (s == null || s.length() < 2) {
//           return s == null ? 0 : s.length();
//       }

//       return longestIdealStringHelper(s, k, 0, ' ', 0);
//   }

  private int longestIdealStringHelper(String s, int k, int index, char prevChar, int currentLength) {
      if (index >= s.length()) {
          return currentLength;
      }

      char currentChar = s.charAt(index);
      int diff = Math.abs(currentChar - prevChar);

      if (currentLength == 0 || diff <= k) {
          int includeLength = longestIdealStringHelper(s, k, index + 1, currentChar, currentLength + 1);
          int excludeLength = longestIdealStringHelper(s, k, index + 1, prevChar, currentLength);

          return Math.max(includeLength, excludeLength);
      } else {
          return longestIdealStringHelper(s, k, index + 1, prevChar, currentLength);
      }
  }
  public int longestIdealString(String s, int k) {
    if (s == null || s.length() < 2) {
        return s == null ? 0 : s.length();
    }
    int[] dp=new int[26];
    for(int i=0;i<26;i++){
        dp[i]=0;
    }
    for(int i=s.length()-1;i>=0;i--){
            char curr=s.charAt(i);
            int left=Math.max(0,curr-'a'-k);
            int right=Math.min(25,curr-'a'+k);
            int max=findMax(dp,left,right);
            dp[curr-'a']=max+1;
    }
    return findMax(dp,0,25);


}
   public int findMax(int[] dp,int i,int j){
    int max=-1;
    for(int si=i;si<=j;si++)
    {
        if (dp[si]>max) {
            max=dp[si];
        }
    }
    return max; 
   }
}
