import java.util.*;
import java.util.stream.*;
import java.time.*;

public class Test {
	public static void main(String... args){
		
		Instant now = Instant.now();

		ZoneId.getAvailableZoneIds()
			.stream()
			.filter(z -> z.contains("US") || z.contains("America"))
			.sorted()
			.forEach(System.out::println);
		
		Instant later = Instant.now();
		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis());

	}
}