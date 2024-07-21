class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans=new int[arr.length];
            int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[idx]==0){
                idx++;
                i++;
                continue;
            }else{
                ans[i]=arr[idx];
                idx++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
           arr[i]=ans[i];
            }
        }
        
    }
