import java.io.IOException;
import java.nio.file.*;

public class QT {
	public static final String VERSION = "001"; 
	
	public static void q1(){
		Path path2 = Paths.get("/lion");
		Path path  = Paths.get("/user/.././root","../kodiacbear.txt"); // changes Path.get for Paths.get
		path.normalize().relativize(path2);  //change for a variable of Path type;
		System.out.println(path); // |user|..|.|root|..|kodiacbear.txt
		Path path3 = path.normalize().relativize(path2);
		System.out.println(path3); //..lion
	}
	
	
	
	public static void main(String[] args) throws IOException {
		q1(); 
		
	}
}