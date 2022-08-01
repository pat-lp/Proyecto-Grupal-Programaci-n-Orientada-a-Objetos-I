package modelo;

public class PersonaFisica  extends Persona {

	private long dni;	
	private String nombre;	
	private String apellido;

	public PersonaFisica(int idPersona, String domicilio, long dni, String nombre, String apellido) {
		super(idPersona, domicilio);
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public PersonaFisica(String domicilio, long dni, String nombre, String apellido) {
		super(0, domicilio);
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "\nPersonaFisica"+super.toString()+" [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	


}







