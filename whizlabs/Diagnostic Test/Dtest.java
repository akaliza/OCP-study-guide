import java.util.*;
class Dog implements Comparable<Dog>{
	private String name;
	private int age;
	private String owner;
	
	Dog(String n,String o,int a){
		name=n;
		owner=o; 
		age=a; 
	}
	
	public String toString(){
		return name;
	}
	
	public int compareTo(Dog d){
		return owner.compareTo(d.owner); 
	}
	
}

public class Dtest{
	public static void main(String[] args){
			ArrayList<Dog> doglist = new ArrayList<>(); 
			doglist.add(new Dog("Lazy","John",3));
			doglist.add(new Dog("White","Henry",2));
			doglist.add(new Dog("Blaky","Bert",5));
			doglist.add(new Dog("Tazan","Jack",1));
			Collections.sort(doglist);
			System.out.print(doglist); //[Blaky, White, Tazan, Lazy]
	}
}
