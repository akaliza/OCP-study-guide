import java.awt.event.ActionEvent;

public class TestClass
{
    public TestClass(int i)  {    }
    public void m1()
    {
        TestClass al = new TestClass(10)
                       {
                            public void actionPerformed(ActionEvent e)
                            {
                            }
                      };
    }
}

/*
This illustrates :
-Inner class can extend the outer class.
-Anonymous inner class can be created for classes. (Not just for interfaces). They implicitly extend the class.(Here, TestClass)
-Anonymous inner class can have initialization parameter. (If the class they extend has a corresponding constructor).
*/