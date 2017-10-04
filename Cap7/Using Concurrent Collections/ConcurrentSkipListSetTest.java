import java.util.concurrent.ConcurrentSkipListSet;
public class ConcurrentSkipListSetTest {
    ConcurrentSkipListSet<String> csls= new ConcurrentSkipListSet<String>();
    
	class AddThread implements Runnable {
        @Override
        public void run() {
            //adds specified element in the set
            csls.add("A");
            csls.add("B");

            // returns the first element
            String s1 = csls.first();

            System.out.println(s1);
            //returns the last element.
            String s2 = csls.last();

            System.out.println(s2);
        }
    }
    class SubThread implements Runnable {
        @Override
        public void run() {
           // removes the specified element from the set.
           csls.remove("A");
        }
    }
    public static void main(String... args) {
    	ConcurrentSkipListSetTest ob = new ConcurrentSkipListSetTest();
        new Thread(ob.new AddThread()).start();
        new Thread(ob.new SubThread()).start();
    }
}