package fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;


public class FormasdeFormato {

	public static void main(String[] args) {
		LocalDate hoy=LocalDate.now();
		LocalDate d10=hoy.with(TemporalAdjusters.lastDayOfMonth());
		LocalDate d12=hoy.with(ChronoField.DAY_OF_MONTH,10);
		LocalDate d20=hoy.withDayOfMonth(20);
		LocalDate d21=hoy.withDayOfMonth(364);
		
	}

}
