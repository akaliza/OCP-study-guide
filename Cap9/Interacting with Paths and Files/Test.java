import java.nio.file.*;
import java.io.*;
public class Test {
	public static void printPathInformation(Path path) {
		System.out.println("Path is Absolute? " + path.isAbsolute());
		System.out.println("Absolute Path: " + path.toAbsolutePath());
	}
	
	public static void subpath(Path path){
		
		System.out.println("Path is: "+path);
		System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,3));
		System.out.println("Subpath from 1 to 3 is: "+path.subpath(1,3));
		System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2));
	}
	
	public static void relativize(){
		/*
		The relativize() method requires that both paths be absolute or both relative, and
		it will throw an IllegalArgumentException if a relative path value is mixed with an
		absolute path value.
		On Windows-based systems, it also requires that if absolute paths are used, then both
		paths must have the same root directory or drive letter
		*/
		
		
		
		Path path1 = Paths.get("fish.txt");
		Path path2 = Paths.get("birds.txt");
		Path path3 = Paths.get("E:\\habitat");
		Path path4 = Paths.get("E:\\sanctuary\\raven");

		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
		System.out.println(path3.relativize(path4));
		System.out.println(path4.relativize(path3));
	}
	
	public static void resolve(){
		final Path path1 = Paths.get("/cats/../panther");
		final Path path2 = Paths.get("food");
		System.out.println(path1.resolve(path2));
		
		final Path path3 = Paths.get("/turkey/food");
		final Path path4 = Paths.get("/tiger/cage");
		System.out.println(path3.resolve(path4));
	}
	
	
	public static void normalize(){
		Path path3 = Paths.get("E:\\data");
		Path path4 = Paths.get("E:\\user\\home");
		Path relativePath = path3.relativize(path4);
		System.out.println(path3.resolve(relativePath)); // "E:|data|..|user|home"
		System.out.println(path3.resolve(relativePath).normalize()); // "E:|user|home"
	}
	
	public static void realPath() throws IOException{
		System.out.println(Paths.get(".").toRealPath());
	}
	
	public static void getName() throws IOException{
		Path path = Paths.get("/land/hippo/harry.happy");
		System.out.println("The Path Name is: " + path);
		for(int i=0; i < path.getNameCount(); i++) {
			System.out.println(" Element "+i+" is: "+path.getName(i));
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		//printPathInformation(Paths.get("/test.txt"));
		//Path path = Paths.get("/mammal/carnivore/raccoon.image");
		//subpath(path);
		//relativize();
		//resolve();
		//normalize();
		//realPath();
		getName();
	}
}