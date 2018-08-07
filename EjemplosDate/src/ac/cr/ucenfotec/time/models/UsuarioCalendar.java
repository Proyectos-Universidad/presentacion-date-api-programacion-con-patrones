package ac.cr.ucenfotec.time.models;

import java.util.Calendar;

public class UsuarioCalendar {
	private String nombre;
	private String apellido;
	private Calendar nacimiento;
	
	
	
	public UsuarioCalendar(String nombre, String apellido, Calendar nacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public Calendar getNacimiento() {
		return nacimiento;
	}
	
}
