public class A {
   public static void main(String[] args) {
    C b=new C(10);
    C b1=new C(100);
    System.out.println(b1.a);
    System.out.println(b.a);
    b.call("Hello");
    b1.call("Hi");
   int []a=new int[5];

   } 
}

 class  C{
    int a;
    C(int j){
this.a=j;
    }
    void call(String s){
        System.out.println(s);
    }
}
