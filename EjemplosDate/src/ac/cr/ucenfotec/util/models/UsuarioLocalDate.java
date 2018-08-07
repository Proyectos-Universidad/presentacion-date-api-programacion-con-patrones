package ac.cr.ucenfotec.util.models;

import java.time.LocalDate;

public class UsuarioLocalDate {
	private String nombre;
	private String apellido;
	private LocalDate nacimiento;
	
	
	
	public UsuarioLocalDate(String nombre, String apellido, LocalDate nacimiento) {
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
	public LocalDate getNacimiento() {
		return nacimiento;
	}	
}
