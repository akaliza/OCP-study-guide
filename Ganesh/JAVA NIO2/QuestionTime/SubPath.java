import java.nio.file.*;
class SubPath {
	public static void main(String []args) {
		Path aPath = Paths.get("D:\\OCPJP\\programs\\..\\NIO2\\src\\.\\SubPath.java");
		aPath = aPath.normalize(); //d:\OCPJP\NIO2\src\subPath.java
		System.out.println(aPath);
		System.out.println(aPath.subpath(2, 3)); //src
	}
}