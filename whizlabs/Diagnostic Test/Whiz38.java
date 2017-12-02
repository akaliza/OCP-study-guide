import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Whiz38{
	public static void main(String[] args){
		try{
		//public static List<String> readAllLines(Path path) throws IOException	
		List<String> stream = Files.readAllLines(Paths.get("input.txt"));
		stream.stream().skip(1).forEach(System.out::print);
		}catch(IOException io){}
		
	}
}
