import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Duration;

public class ZoneBra_Irel {
	public static void main(String args[]){
		ZoneId dublinZone = ZoneId.of("Europe/Dublin");
		ZonedDateTime dateTimeInDublin = ZonedDateTime.of(LocalDateTime.of(2017, Month.NOVEMBER, 12, 6, 0), dublinZone);
		
		ZoneId saoPauloZone = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime sameDateTimeInSaoPaulo = dateTimeInDublin.withZoneSameInstant(saoPauloZone);
		
		Duration timeDifference = Duration.between(
			dateTimeInDublin.toLocalTime(),
			sameDateTimeInSaoPaulo.toLocalTime());
		
		System.out.printf("Time difference between %s and %s zones is %d hours",
			dublinZone, saoPauloZone, timeDifference.toHours());
	
	}
}