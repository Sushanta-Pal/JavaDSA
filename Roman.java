public class Roman {
    public static void main(String[] args) {
        System.out.println(new Roman().intToRoman(1000));
    }
    private String RomanLetter(int num,String s){
        if (num==0) {
            return s;
        }
        if (num<4) {
            s=s+"I";
            return RomanLetter(num-1, s);

        }else if (num<5) {
            s=s+"IV";
            return RomanLetter(num-4, s);
        }
        else if (num<9) {
            s=s+"V";
            return RomanLetter(num-5, s);
        }
        else if (num<10) {
            s=s+"IX";
            return RomanLetter(num-9, s);
        }
        else if (num<40) {
            s=s+"X";
            return RomanLetter(num-10, s);
        }else if (num<50) {
            s=s+"XL";
            return RomanLetter(num-40, s);
        }else if (num<90) {
            s=s+"L";
            return RomanLetter(num-50, s);
        }else if (num<100) {
            s=s+"XC";
            return RomanLetter(num-90, s);
        }else if (num<400) {
            s=s+"C";
            return RomanLetter(num-100, s);
        }else if (num<500) {
            s=s+"CD";
            return RomanLetter(num-400, s);
        }
        else if (num<900) {
            s=s+"D";
            return RomanLetter(num-500, s);
        }else if (num<1000) {
            s=s+"CM";
            return RomanLetter(num-900, s);
        }
        else 
            {
                 s=s+"M";
                 return RomanLetter(num-1000, s);
        }
    }
    public String intToRoman(int num) {
        String ans="";
        int c=1;
        int nd=(int) (Math.log(num)/Math.log(10));
            for(int i=0;i<=nd+1;i++){
                    ans=RomanLetter((num%10)*c, "")+ans;
                    num/=10;
                    c*=10;
            }
            return ans;
    }
}
