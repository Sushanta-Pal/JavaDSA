import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println(" Enter the Number");
        // int n = sc.nextInt();
        // sc.close();
         Tribonacci ob= new Tribonacci();
        // System.out.println(ob.tribonacci(n));
        System.out.println(ob.myAtoi("   28"));
    }
    public int tribonacci(int n) {
        int t1=0;
        int t2=1;
        int t3=1;
        if (n==0) {
            return 0;
        }
        if (n<3) {
            return 1;
        }
        int ans=0;
        for(int i=3;i<=n;i++){
                ans=t1+t2+t3;
                t1=t2;
                t2=t3;
                t3=ans;
        }
        return ans;
    }

    public int myAtoi(String s) {
        s=s.trim();
       if (s.length()==0) {
        return 0;
       }
        int max=Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;
        int i=0;
        int sign =1;
        if (s.charAt(i)=='-') {
            sign=-1;
            i++;
        }
        else if (s.charAt(i)=='+') {
            i++;
        }

        StringBuilder ans=new StringBuilder();
        while (i<s.length() && s.charAt(i)-'0'<=9 && s.charAt(i)-'0'>=0) {
            ans.append(s.charAt(i));
            if (Double.parseDouble(ans.toString())>max ) {
               return sign==1?max:min;
            }
            i++;
        }
        if (ans.length()==0) {
            return 0;
        }
        return sign*Integer.parseInt(ans.toString());

      

    }
}
