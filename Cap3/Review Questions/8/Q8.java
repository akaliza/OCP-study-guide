import java.util.*;

public class Q8{
	public static void main(String...args){
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		System.out.println(tree.ceiling("On")); //One   
		
		System.out.println(tree.lower("On"));  //ONE   
		System.out.println(tree.floor("On"));  //ONE   
		System.out.println(tree.higher("On")); //One   
	}
}


/*
ONE 4
on  3
One 2
one 1

lower 		<  on = ONE
floor		<= on = ONE 
ceiling 	>= on = One
higher		>  on = One

*/