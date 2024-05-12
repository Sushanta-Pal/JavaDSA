package BinarySearch;
import java.util.*;
public class SearchIdx {
    public static void main(String[] args) {
        int[] arr ={1,3,5,6};
        System.out.println(searchInsert(arr, 4));
    }
    public static int searchInsert(int[] nums, int target) {
        int idx=0;
        int si=0;
        int ei=nums.length-1;
        if (target>=nums[ei]) {
            return ei+1;
        }
        if (target<nums[si]) {
            return si;
        }
        while (si<ei) {
            int mid =si+(ei-si)/2;
            if (nums[mid]==target) {
                return mid;
            }
            else if (nums[mid]<target) {
                si=mid+1;
            }else ei=mid;
        }
        return ei;
    }

    public static int peakIndexInMountainArray(int[] nums) {
        int si=0;
        int ei=nums.length-1;
        while (si<ei) {
            int mid =si+(ei-si)/2;
            if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
                return mid;
            }
            else if (nums[mid]>nums[mid-1]) {
                si=mid+1;
            }else 
            ei=mid;
        }
        return ei;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        for(int j:nums2){
            if (binarySearch(nums1,j)) {
                set.add(j);
            }
        }
        int i=0;
        int[] arr=new int[set.size()];
        for(var num:set){
            arr[i++] =num;
        }
        return arr;
        
    }
    private boolean binarySearch(int[] nums1, int j) {
        int si=0;
        int ei=nums1.length-1;
        while (si<=ei) {
            int mid =si+(ei-si)/2;

            if (nums1[mid]==j) {
                return true;
            }
            else if (nums1[mid]>j) {
                ei=mid-1;
            }else si=mid+1;
        }
        return false;
    }
     public int[] intersectionII(int[] nums1, int[] nums2) {
        List<Integer> set = new LinkedList<>();
       
        Arrays.sort(nums1);
        for(int j=0;j<nums2.length;j++){
            if (binarySearch(nums1,nums2[j])) {
                
                set.add(nums2[j]);
            }
        }
        int i=0;
         int[] arr=new int[set.size()];
        for(var num:set){
            arr[i++] =num;
        }
        return arr;
        
    }
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();   
        for (int i : arr) {
            if (seen.contains(2 * i) || i % 2 == 0 && seen.contains(i / 2))
                return true;
            seen.add(i);
        }
        return false;
    }

    public int[] searchRange(int[] nums, int target) {
        int si=0;
        int a=-1;
        int b=-1;
        int ei=nums.length-1;
        while (si<ei) {
            int mid =si+(ei-si)/2;
            if (nums[mid]==target && nums[mid]<nums[mid+1]) {
                b=mid;
                break;
            }
           else if (nums[mid]>target) {
            ei=mid;
           }
           else si=mid+1;
            
        }
        si=0;
        ei=nums.length-1;
      

        while (si<ei) {
            int mid =si+(ei-si)/2;
            if (nums[mid]==target && nums[mid]>nums[mid-1]) {
                a=mid;
                break;
            }
           else if (nums[mid]>target) {
            ei=mid;
           }
           else si=mid+1;
        }
        

        return new int[] {a,b};
    }
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }
    public int buyChoco(int[] prices, int money) {
        // Arrays.sort(prices);
        // if ((prices[0]+prices[1])-money>=0) {
        //     return (prices[0]+prices[1])-money;
        // }
        // return money;
        if (prices.length < 2) {
            return money;
        }
    
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
    
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < m1) {
                m2 = m1;
                m1 = prices[i];
            } else if (prices[i] < m2) {
                m2 = prices[i];
            }
        }
    
        int totalPrice = m1 + m2;
        int difference = money-totalPrice;
    
        return (difference >= 0) ? difference : money;
    }
    public int reachNumber(int target) {
        int start =0;
        int i=0;
        while (true) {
            if (start==target) {
                return i;
            }
            else if (start<target) {
                start+=i;
            }
            else start-=i;
            i++;
        }
    }
}
