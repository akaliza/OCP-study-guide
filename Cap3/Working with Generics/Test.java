public class Test{
	List<?> list1 = new ArrayList<A>();
	List<? extends A> list2 = new ArrayList<A>();
	List<? super A> list3 = new ArrayList<A>();
	List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
	List<? super B> list5 = new ArrayList<A>();
	List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE
}