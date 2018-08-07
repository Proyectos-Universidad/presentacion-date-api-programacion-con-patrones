package ac.cr.ucenfotec.ejemplo.mutabilidad;

import ac.cr.ucenfotec.time.models.UsuarioCalendar;
import ac.cr.ucenfotec.util.models.UsuarioLocalDate;
//Bueno
import java.time.LocalDate;
import java.time.Month;
//Bueno
import java.time.Period;
//No bueno
import java.util.Calendar;
import java.util.GregorianCalendar;
//No bueno

public class Bar {
	
	private static int MIN_EDAD = 18;
	private static UsuarioCalendar menorCalendar = new UsuarioCalendar("Gracie","Lou",new GregorianCalendar(2006, Calendar.OCTOBER, 3));
	private static UsuarioLocalDate menorLocalDate = new UsuarioLocalDate("Bobby","Ray",LocalDate.of(2008, Month.DECEMBER, 15)); 
	
	public static void intentarEntrarABar() {
		//Se calculan las edades de los menores
		int edadDate = calcularEdadDate(menorCalendar);
		int edadLocalDate = calcularEdadLocalDate(menorLocalDate);
		
		//Se revisa si tienen la edad minima requerida para entrar al bar.
		if(edadDate < MIN_EDAD) {
			System.out.println(menorCalendar.getNombre() + " " + menorCalendar.getApellido() + " no se le ha permitido entrar al bar.");
		}else {
			System.out.println(menorCalendar.getNombre() + " " + menorCalendar.getApellido() + " se le ha permitido entrar al bar");
		}
		
		if(edadLocalDate < MIN_EDAD) {
			System.out.println(menorLocalDate.getNombre() + " " + menorLocalDate.getApellido() + " no se le ha permitido entrar al bar.");
		}else {
			System.out.println(menorLocalDate.getNombre() + " " + menorLocalDate.getApellido() + "se le ha permitido entrar al bar");
		}
		
	}

	public static void intentarModificarEdades() {
		System.out.println("Intentando modificar edades de los menores");
		
		//Como Calendar es mutable, se puede modificar la edad obtenida por medio de un getter
		menorCalendar.getNacimiento().setTime(new GregorianCalendar(1990, Calendar.OCTOBER, 3).getTime());
		
		//LocalDate no es mutable,el metodo plusYears retorna un nuevo objeto de tipo LocalDate, 
		//sin tener efecto alguno en el objeto LocalDate dentro de menorLocalDate
		menorLocalDate.getNacimiento().plusYears(18);
	}
	
	public static int calcularEdadDate(UsuarioCalendar usuario) {
	        Calendar nacimiento = usuario.getNacimiento();
	        Calendar hoy = Calendar.getInstance();

	        int edad = hoy.get(Calendar.YEAR)
	                - nacimiento.get(Calendar.YEAR);

	        if (hoy.get(Calendar.MONTH) < nacimiento.get(Calendar.MONTH)) {
	            edad--;
	        } else {
	            if (hoy.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH)
	                    && hoy.get(Calendar.DAY_OF_MONTH) < nacimiento
	                            .get(Calendar.DAY_OF_MONTH)) {
	                edad--;
	            }

	        }
	        
	        System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " Tiene " + edad + " años");
	        return edad;
	 }
	
    public static int calcularEdadLocalDate(UsuarioLocalDate usuario) {
    		
    	LocalDate hoy = LocalDate.now();
    	int edad;
    	
        if ((usuario.getNacimiento() != null) && (hoy != null)) {
            edad = Period.between(usuario.getNacimiento(), hoy).getYears();
        } else {
            edad = 0;
        }
        
        System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " Tiene " + edad + " años");
        return edad;

    }
}