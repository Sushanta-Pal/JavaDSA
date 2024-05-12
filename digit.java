import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class digit {
public static void main(String[] args) {
    // int n=4;
    // Binary(n);
    // System.out.println();
    // int gray = grayC(n);
    // System.out.println(gray);
    // Binary(gray);
    //System.out.println(countDigit(n));
    // System.out.println(grayCode(3));
    // System.out.println(nextGreaterElement(123));
//     String s =Integer.toString(123);
//     ArrayList<Integer> list =new ArrayList<>();
//  System.out.println( nextGreaterElement(s, "",123,list));
System.out.println(kthFactor(12, 7));

}
public static  int kthFactor(int n, int k) {
        List<Integer>list= new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if (n%i==0) {
                list.add(i);
                if (i!=(n/i)) {
                     list.add(n/i); 
                }
              
            }
        }
        Collections.sort(list);
        if (list.size()<k || k<=0) {
            return -1;
        }
         return list.get(k-1);
}
public static  int kthFactorOpt(int n, int k) {
          int fact =1;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                    if (i==k) {
                     return fact;   
                    }
                    fact++;
                
                }
              
            }
              return -1;
        }
        

public static int  nextGreaterElement(String n, String s, int ans,ArrayList<Integer> list) {
 
    if (n.isEmpty()) {
        int sol = Integer.parseInt(s);
        if (sol > ans ) {
            list.add(sol);
            return 0;
        }
        return -1;
    }

      
    for (int i = 0; i < n.length(); i++) {
       nextGreaterElement(n.substring(0,i)+n.substring(i+1), s+n.charAt(i), ans,list);
    }
    if (list.isEmpty()) {
        return -1;
    }
    Collections.sort(list);
    return list.get(0);
 
   
}

public static List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<Math.pow(2, n);i++){
            list.add(grayC(i));
        }
  return list;
    }

private static void Binary(int n) {
    if (n==0) {
        System.out.print(0);
        return;
    }
    int t=n;
    n=n>>1;
    Binary(n);
    System.out.print(t&1);
    
}

private static int  countDigit(int n) {
    int ans =1;
    ans +=(int) (Math.log(n)/Math.log(2));
    return ans;
}
private static int grayC(int g) {
    return g^(g>>1);
  }
}