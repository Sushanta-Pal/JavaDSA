package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Stringg {
    public static void main(String[] args) {
        // String s="011101";
        // // System.out.println(maxScore(s));
        // int[] arr={1000};
        // System.out.println(findNumbers(arr));
        int[] neededTime={1,2,3,4,1};
        String colors="aabaa";
        System.out.println(minCost(colors, neededTime));
    }
    public static int maxScore(String s) {
    int zero = 0;
    int one = 0;
    int res = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '1') {
            one++;
        }

        if (i < s.length() - 1) {
            if (s.charAt(i) == '0') {
                zero++;
            } else {
                one--;
            }
            res = Math.max(res, zero + one);
        }
    }

    return res;
}
public static boolean isPathCrossing(String path) {
    HashSet<String> set = new HashSet<>();
    int x=0,y=0;
    set.add(x+","+y);
    for(int i=0;i<path.length();i++){
        switch (path.charAt(i)) {
            case 'N':
                x++;
                break;
                case 'E':
                y++;
                break;
                case 'S':
                x--;
                break;
                case 'W':
                y--;
                break;
        }
        String s=x+","+y;
        if (set.contains(s)) {
            return true;
        }
        set.add(s);

    }

        return false;
}
public static int findMaxConsecutiveOnes(int[] nums) {
        //nums[]={1,1,0,1,1,1}
        //ans =3
        int max=0;
        int d=0;
        for(var i: nums){
            if (i==0) {
                d=0;
            }else d++;
            max=Math.max(max,d);
        }
        return max;
}
public static int findNumbers(int[] nums) {
    // Input: nums = [12,345,2,6,7896]
    // Output: 2
    // Explanation: 
    // 12 contains 2 digits (even number of digits). 
    // 345 contains 3 digits (odd number of digits). 
    // 2 contains 1 digit (odd number of digits). 
    // 6 contains 1 digit (odd number of digits). 
    // 7896 contains 4 digits (even number of digits). 
    // Therefore only 12 and 7896 contain an even number of digits.
    int res=0;
    for(int i:nums){
        if (digit(i)%2==0) {
            res++;
        }
    }
    return res;
}
private static int digit(int i) {
    return (int)(Math.log10(i)+1);
}

public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int ans =0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }else
             map.put(arr[i],map.get(arr[i])+1);
        }
        for (Integer value : map.values()) {
            if (value > (n/k)) {
                ans++;
            }
        }
        return ans;
    }
    public static int minCost(String colors, int[] neededTime) {
  int time=0;
  HashMap<Character,Integer> hs= new HashMap<>();
            for(int i=0;i<neededTime.length;i++){
                if (hs.containsKey(colors.charAt(i))) {
                    if (hs.get(colors.charAt(i)) >neededTime[i]) {
                        time+=neededTime[i];
                    }
                    else {
                        time+=hs.get(colors.charAt(i));
                        hs.put(colors.charAt(i), neededTime[i]);
                    }
                }
                else{
                    hs.clear();
                    hs.put(colors.charAt(i), neededTime[i]);
                }
            }
        return time;
    }
  
    // public static int[] antiDiagonalPattern(int[][] matrix)
    // {
    //     // Code here

    // }
    public static boolean makeEqual(String[] words) {
            
        return false;
    }
    public static int findContentChildren(int[] g, int[] s) {
        int i=0;int j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (j<s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
