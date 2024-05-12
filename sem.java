public class sem {
   private String i;
    sem(String i){
       this.i=i;
       
    }
   public String get(){
return i;
    }

  
    public static void main(String[] args) {
     sem ob= new sem("hello");
      System.out.println(ob.i);
    }
}
