

public class exceeptions extends Exception {
        exceeptions(String msg){
            super(msg);
        }
    public static void main(String[] args) {
        checks c=new checks(-9, 600);
        try {
            c.displayi();
        } catch (exceeptions e) {
            // TODO Auto-generated catch block
           System.out.println(e.getMessage());
        }
        try {
            c.displayex();
        } catch (exceeptions e) {
            // TODO Auto-generated catch block
           System.out.println(e);
        }
        finally{
            System.out.println("Quit");
        }
    }
}

 class checks {
    int imark,exmark;
    checks(int imark,int exmark){
        this.imark=imark;
        this.exmark=exmark;
    }
    void displayi()throws exceeptions{
            if (imark>30 ||imark<0) {
                throw new exceeptions("invalid internal marks");
            }else System.out.println("Internal marks : "+imark);
    }
    void displayex()throws exceeptions{
        if (exmark>70 ||exmark<0) {
            throw new exceeptions("invalid external marks");
        }else System.out.println("external marks : "+exmark);
}
}
/*Write a program for user defined exception that checks the internal & external marks. 
If the internal marks is greater than 30 or less than  0 that raises the exception the 
invalid internal marks , if the external marks is greater than 70 or less than  0 it  
raises the exception & display the message the external marks is exceed. Create the above
 exception & use it in your program. */
