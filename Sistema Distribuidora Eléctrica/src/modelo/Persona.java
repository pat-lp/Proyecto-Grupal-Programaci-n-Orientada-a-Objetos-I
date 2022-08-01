package modelo;

public class Persona {

	protected int idPersona;
	protected String domicilio;

	public Persona(int idPersona, String domicilio) {
		super();
		this.idPersona = idPersona;
		this.domicilio = domicilio;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "  [idPersona=" + idPersona + ", domicilio=" + domicilio + "]";
	}


	
	
	
}
