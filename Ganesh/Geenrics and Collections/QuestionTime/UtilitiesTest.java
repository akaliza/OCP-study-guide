import java.util.*;
import java.util.stream.*; 

class UtilitiesTest {
   public static void main(String []args) {
      /*
	  List<int> intList = new ArrayList<>();
      intList.add(10);
      intList.add(20);
      System.out.println("The list is: " + intList);
	  */
	  /*
	  List<Integer> intList = new LinkedList<>();
	  List<Double> dblList  = new LinkedList<>();
	  System.out.println("First type: " + intList.getClass());
	  System.out.println("Second type:" + dblList.getClass());
	  */
	  
	  /*"abracadabra".chars().distinct().peek(ch -> System.out.printf("%c ", ch)).sorted();	*/ 
	  
	  IntStream.rangeClosed(1, 1).forEach(System.out::println);
	  
  }
}