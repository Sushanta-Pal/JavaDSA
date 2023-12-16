public class AddBinary {
   
    public static void main(String[] args) {
        //System.out.println(addBinary("1010", "01"));
        String a ="1010";
        System.out.println(a.charAt(1)-'1');
       

    }
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
    
        while (i >= 0 || j >= 0 || carry == 1) 
        {
          if(i >= 0)
            carry += a.charAt(i--) - '0';
          if(j >= 0)                                    //carry = i+carry  //carry =j+carry
           carry += b.charAt(j--) - '0';
          sb.append(carry % 2);
          carry /= 2;
        }
        return sb.reverse().toString();
      }
    }

