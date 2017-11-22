class base1 {
   //protected int var;
}
interface base2 {
   int var = 30; // #1
}
class Test1 extends base1 implements base2 { // #2
   public static void main(String args[]) { 
      System.out.println("var:" + var); // #3
   }
}
