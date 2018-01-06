import java.util.Set;
import java.util.HashSet;

public class Whiz33{
	public static void main(String[] args){
		Set<Element> list = new HashSet<>();
		list.add(new Element("Pba",21));
		list.add(new Element("Cd",21));
		list.add(new Element("Znhg",21));
		list.add(new Element("Sn",21));
		System.out.println(list); //Pba,Cd,Znhg
	}
	

	static class Element{
		String name; 
		int age;
	
		Element(String s,int a){
			name = s;
			age = a;
		}
	
		public boolean equals(Object o){
			return age == ((Element)o).age;
		}
	
		public int hashCode(){
			return name.length();
		}
	
		public String toString(){
			return name; 
		}
	}		
}

