class Solution {
    public int minOperations(String[] logs) {
         int ans =0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                        if (ans!=0) {
                            ans--;
                        }
                        continue;
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else ans++;
        

    }
    return ans;
    }
}