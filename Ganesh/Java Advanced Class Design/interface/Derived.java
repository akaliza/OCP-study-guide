abstract class Base {
    abstract void foo();
}

interface Inter {
     default /*abstract*/ void foo() {
         System.out.println("foo!");
     }
}

public class Derived /*extends Base*/ implements Inter {

}