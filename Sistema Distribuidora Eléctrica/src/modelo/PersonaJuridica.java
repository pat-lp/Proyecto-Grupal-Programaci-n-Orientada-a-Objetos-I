package modelo;


public class PersonaJuridica extends Persona {

	private long cuit;
	private String razonSocial;


	public PersonaJuridica(int idPersona, String domicilio, long cuit, String razonSocial) {
		super(idPersona, domicilio);
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}

	public long getCuit() {
		return cuit;
	}

	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	@Override
	public String toString() {
		return "\nPersonaJuridica"+super.toString()+" [cuit=" + cuit + ", razonSocial=" + razonSocial + "]";
	}

	
}






