import java.util.*; 
import java.util.stream.*; 

class T1{
	@Override
	public String toString(){
		return "t1,";
	}
}
class T2 extends T1{
	@Override
	public String toString(){
		return "t2,";
	}
} 
class T3 extends T2{
	@Override
	public String toString(){
		return "t3,";
	}
}
class T4 extends T3{
	@Override
	public String toString(){
		return "t4";
	}
}

public class LowerBoundedExamples{
	
	public static void main(String[] args){
		List<? super T2>list = new ArrayList<T1>();
		//list.add(new T1());
		list.add(new T2());
		list.add(new T3());
		list.add(new T4());
		list.forEach(System.out::print);
	}
	
	
}