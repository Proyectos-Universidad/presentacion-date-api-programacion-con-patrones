package ac.cr.ucenfotec.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;





public class Ejemplos {
	
	public static void obtenerFechaEspecifica() {
		//Obtener una fecha en especifico
		Date operacionNeptuno = new GregorianCalendar(1944, Calendar.JUNE, 6).getTime(); 
	}
	
	public static void obtenerParteEspecificaDeFecha() {
		//Obtener partes especificas de la fecha
		//Por alguna razon Enero es 0 en lugar de 1
		int mes = new GregorianCalendar().get(Calendar.MONTH);
		int annio = new GregorianCalendar().get(Calendar.YEAR);
	}
	
	public static void sumarYRestarFechas() {
		//Sumar y restar tiempo
		GregorianCalendar calendar1 = new GregorianCalendar();
		calendar1.add(Calendar.HOUR_OF_DAY, -12);
		Date haceDoceHoras = calendar1.getTime();
		
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.add(Calendar.HOUR_OF_DAY, 2);
		Date dentroDeDosHoras = calendar2.getTime();
	}
	
	public static void modificarParteDeFecha() {
		//Modificar partes especificas de la fecha
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(Calendar.MONTH, Calendar.DECEMBER);
		Date mismoDiaEnDiciembre = calendar.getTime();
	}
	
	public static void truncar() {
		//Truncar(Deshacerse de partes menos significativas de la fecha)
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date truncado = calendar.getTime();
	}
	
	public static void conversionDeZonaHoraria() {
		//Conversion de zona horaria
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeZone(TimeZone.getTimeZone("CET"));
		Date centralEastern = calendar.getTime();
	}
	
	public static void tiempoEntreDosFechas() {
		//Obtener el tiempo transcurrido entre dos fechas
		GregorianCalendar calendar = new GregorianCalendar();
		Date ahorita = new Date();
		calendar.add(Calendar.HOUR, 1);
		Date unaHoraDespues = calendar.getTime();
		long tiempoEntre = unaHoraDespues.getTime() - ahorita.getTime();
	}
	
	public static void formatoYLecturaDeFechas() {
		//Formato y lectura de fechas
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date ahorita = new Date();
		String fechaConFormato = formato.format(ahorita);
		
		try {
			Date fechaLeida = formato.parse(fechaConFormato);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void cantidadDeDiasEnUnMes() {
		//Cantidad de dias en un mes
		Calendar calendar = new GregorianCalendar(1990, Calendar.FEBRUARY, 20);
		int diasEnMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
}