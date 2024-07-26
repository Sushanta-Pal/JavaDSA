import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class L1636 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,6,7,8,9};
    //    int[] ans =frequencySort(nums);
    //    for(int i=0;i<ans.length;i++){
    //     System.out.print(ans[i]+" ");
    
        L1636 lm =new L1636();
        int[] mapping={9,8,7,6,5,4,3,2,0};
       System.out.println( Arrays.toString(lm.sortArray(mapping)));


       }
    
    public static int[] frequencySort(int[] nums) {
    //    Integer[] ans=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
            }

       int[] fr=new int[201];
       for(var n:nums){
        fr[n+100]++;
       }
       Collections.sort(list, (a, b) -> {
        if (fr[a + 100] == fr[b + 100] ) {
            return b - a;
        }
        return fr[a + 100] - fr[b + 100];
    });
       
    for(int i=0;i<nums.length;i++){
        nums[i]=list.get(i);
        }
        return nums;
    //    return Arrays.stream(ans).mapToInt(Integer::intValue).toArray();
        
    }

    public  int[] sortJumbled(int[] mapping, int[] nums) {
        Integer[] ans=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(ans, (a, b) -> {
                int fr_a=fr(a,mapping);
                int fr_b=fr(b,mapping);
            if (fr_a == fr_b) {
                return 1;
                }
                return fr_a - fr_b;
        });
        return Arrays.stream(ans).mapToInt(Integer::intValue).toArray();
       


    }
    private  int fr(Integer a, int[] mapping) {
        // if (a == 0) {
        //     return mapping[0];
        // }
        int curr_fr=0;
        int p=0;
        int n=a;
        do{
            int d=n%10;
            curr_fr+=mapping[d]*Math.pow(10, p++);
            n/=10;
        }while(n!=0);
        return curr_fr;

         }


         public int[] sortArray(int[] nums) {

                // sort(nums,0,nums.length-1);
                sort2(nums,0,nums.length-1);
                return nums;

         }

        private void sort2(int[] nums, int si, int length ) {
            if ( si>=length) return; 
            
                    int mid_idx=si+(length-si)/2;
                    sort2(nums,si,mid_idx);
                    sort2(nums,mid_idx+1,length);
                    merge(nums,si,mid_idx,length);
            }

        private void merge(int[] nums, int si, int mid_idx, int length) {
                    int[] tem= new int[length-si+1];
                    int i=si;
                    int j=mid_idx+1;
                    int k=0;
                    while(i<=mid_idx && j<=length) {
                        if (nums[i]<nums[j]) {
                            tem[k++]=nums[i++];
                        }else tem[k++]=nums[j++];

                    }
                    while(i<=mid_idx) tem[k++]=nums[i++];
                    while(j<=length) tem[k++]=nums[j++];

                    for (int l=0;l<tem.length;l++) nums[si+l]=tem[l];

           }

        private void sort(int[] nums, int si, int ei) {

            if (si>=ei) {
                return;
            }

                    int mid_idx=si+(ei-si)/2;
                    int pivot=nums[mid_idx];
                    int i=si;
                    int j=ei;
                    while (i<j) {
                        while (nums[i]<pivot) {
                            i++;
                            }
                            while (nums[j]>pivot) {
                                j--;
                                }
                                if (i<=j) {
                                    int temp=nums[i];
                                    nums[i]=nums[j];
                                    nums[j]=temp;
                                    i++;
                                    j--;
                                    }       
                    }
                    sort(nums,si,j);
                    sort(nums,i,ei);
           }
           public int[] sortArray2(int[] nums) {
            int max = nums[0];
            int min = nums[0];
    
            for (int num : nums) {
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
    
            int n = max - min;
            int[] arr = new int[n + 1];
    
            for (int num : nums) {
                arr[num - min]++;
            }
    
            int index = 0;
    
            for (int i = 0; i <= n; i++) {
                while (arr[i] > 0) {
                    nums[index] = min;
                    index++;
                    arr[i]--;
                }
    
                min++;
            }
    
            return nums;
        }

        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int n=Arrays.stream(arr1).max().getAsInt();
                    int[] fr= new int[n+1];
                    for(int num:arr1){
                        fr[num]++;
                    }
                    int idx=0;
                    for(int num:arr2){
                        while (fr[num]>0) {
                                    arr1[idx++]=num;
                                    fr[num]--;
                        }
                    }
                    int[] tem=new int[arr1.length-idx+1];
                    for(int i=0;i<fr.length;i++){
                        while(fr[i]>0){
                            tem[i++]=i;
                            fr[i]--;
                        }
                        }
                        Arrays.sort(tem);
                        for(int i=0;i<tem.length;i++){
                            arr1[idx++]=tem[i];
                            }
                            return arr1;


        }

}
