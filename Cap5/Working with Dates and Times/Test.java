import java.util.*;
import java.util.stream.*;
import java.time.*;

public class Test {
	public static void main(String... args){
		System.out.println(ZonedDateTime.now());
		
		ZoneId.getAvailableZoneIds()
			.stream()
			.filter(z -> z.contains("US") || z.contains("America"))
			.sorted()
			.forEach(System.out::println);

	}
}