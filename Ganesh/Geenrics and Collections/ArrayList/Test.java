import java.util.*; 

public class Test{
	public static void main(String... args){
		ArrayList<String> languageList = new ArrayList<>();
		languageList.add("C");
		languageList.add("C++");
		languageList.add("Java");
		
		for(String language : languageList) {
			System.out.println(language);
		}
		
		System.out.println();
		
		for(Iterator<String> languageIter = languageList.iterator(); languageIter.hasNext();) {
			String language = languageIter.next();
			System.out.println(language);
		}
		
	}
	
}