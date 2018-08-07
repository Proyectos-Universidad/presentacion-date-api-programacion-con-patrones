package ac.cr.ucenfotec.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.ZonedDateTime;

public class Ejemplos {
	
	public static void obtenerFechaEspecifica() {
		//Obtener una fecha en especifico
		LocalDate operacionNeptuno = LocalDate.of(1944, Month.JUNE, 6);
	}
	
	public static void obtenerParteEspecificaDeFecha() {
		//Obtener partes especificas de la fecha
		
		Month mes = LocalDateTime.now().getMonth();
		int annio = LocalDateTime.now().getYear();
	}
	
	public static void sumarYRestarFechas() {
		//Sumar y restar tiempo
		LocalDateTime haceDoceHoras = LocalDateTime.now().minusHours(12);
		
		
		LocalDateTime dentroDeDosHoras = LocalDateTime.now().plusHours(2);
		
		
		
	}
	
	public static void modificarParteDeFecha() {
		//Modificar partes especificas de la fecha
		LocalDateTime mismoDiaEnDiciembre = LocalDateTime.now().withMonth(Month.DECEMBER.getValue());
		
	
	}
	
	public static void truncar() {
		//Truncar(Deshacerse de partes menos significativas de la fecha)
		LocalTime truncado = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
	
	
	
	
	}
	
	public static void conversionDeZonaHoraria() {
		//Conversion de zona horaria
		ZonedDateTime centralEastern = LocalDateTime.now().atZone(ZoneId.of("CET"));
	
	
	}
	
	public static void tiempoEntreDosFechas() {
		//Obtener el tiempo transcurrido entre dos fechas
		LocalDateTime ahorita = LocalDateTime.now();
		LocalDateTime unaHoraDespues = LocalDateTime.now().plusHours(1);
		Duration tiempoEntre = Duration.between(ahorita, unaHoraDespues);
	
	
	}
	
	public static void formatoYLecturaDeFechas() {
		//Formato y lectura de fechas
		LocalDate ahorita = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String fechaConFormato = ahorita.format(formato);
		LocalDate fechaLeida = LocalDate.parse(fechaConFormato, formato);
	
	
	
	
	
	}
	
	public static void cantidadDeDiasEnUnMes() {
		//Cantidad de dias en un mes
		int diasEnMes = YearMonth.of(1990, 2).lengthOfMonth();
	
	}
}