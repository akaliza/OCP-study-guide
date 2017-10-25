import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;
import java.util.stream.*;

public class QT {
	public static final String VERSION = "001"; 
	
	public static void q1() throws IOException {
		Path path  = Paths.get("/user/.././root","../kodiacbear.txt");  //PATHS
		Path path2 = Paths.get("/lion");
		Path path3 = path.normalize().relativize(path2);   //path instead of String
		System.out.println(path);  // \\user\\..\\.\\root\\..\\kodiacbear.txt
		System.out.println(path.normalize()); // \\kodiacbear.txt
		System.out.println(path3); //..\\lion
	}
	
	public static void q3() throws IOException{
		Path path = Paths.get("C:\\animal_new\\cat.txt");
		BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
		BasicFileAttributeView view    = Files.getFileAttributeView(path,BasicFileAttributeView.class);
		
		if(attributes.size() > 0 && attributes.creationTime().toMillis()>0) {
		//	attributes.setTimes(null,null,null); //error; setTimes is a BasicFileAttributes method;  
			view.setTimes(null,null,null);
		}
	}	
	
	public static void q4(){
		Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
		System.out.println(path.subpath(1,3).getName(1)); 
	}
	
	public static void q6() throws IOException{
		Path path = Paths.get("/animals");
		boolean myBoolean = Files.walk(path)
			.filter((p,a) -> a.isDirectory() && !path.equals(p)) // w1 we need a Predictate, not a BiPredicate,
			.findFirst().isPresent(); // w2
		System.out.println(myBoolean ? "No Sub-directory": "Has Sub-directory");
		
		Stream<Path> stream = Files.find(path, 10,
			(p,a) -> a.isDirectory() && !path.equals(p) );
		System.out.println(stream);
		
	} 
	
	public static void q8() throws IOException{
		Path path1 = Paths.get("/pets/../cat.txt");
		Path path2 = Paths.get("./dog.txt");
		System.out.println(path1.resolve(path2)); // pets|..|cat.txt|.|dog.txt 
		System.out.println(path2.resolve(path1)); // pets|..|cat.txt 
	} 
	
	public static void q13() throws IOException{
		Path path = Paths.get("/monkeys");
		Files.find(path, 0, (p,a) -> a.isSymbolicLink()).map(p -> p.toString()) // y1
			.collect(Collectors.toList()) // y2
			.stream() // y3
			.filter(x -> x.toString().endsWith(".txt")) // y4
			.forEach(System.out::println);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void q18() throws IOException{
		Path path1 = Paths.get("/lizard/./").resolve(Paths.get("walking.txt"));
		Path path2 = new File("/lizard/././actions/../walking.txt").toPath();
		System.out.print(Files.isSameFile(path1,path2));
		System.out.print(" "+path1.equals(path2));
		System.out.print(" "+path1.normalize().equals(path2.normalize()));
	} 
	
	public static void main(String[] args) throws IOException {
		q13(); 
		
	}
}