package modelo;

import modelo.Persona;
import modelo.Zona;


public class Medidor {

	private long nroSerie;	
	private Persona cliente;	
	private String domicilioMedidor;	
	private Zona zona;	
	private Tarifa tarifa;

	public Medidor() {}

	public Medidor(long nroSerie, Persona cliente, String domicilioMedidor, Zona zona, Tarifa tarifa) throws Exception {
		super();
		this.nroSerie = nroSerie;
		this.cliente = cliente;
		this.domicilioMedidor = domicilioMedidor;
		this.zona = zona;
		this.tarifa = tarifa;	
	}

	public Medidor(long nroSerie, Persona cliente, String domicilioMedidor, Zona zona, TarifaBaja tarifaBaja) {
		super();
		this.nroSerie = nroSerie;
		this.cliente = cliente;
		this.domicilioMedidor = domicilioMedidor;
		this.zona = zona;
		this.tarifa = tarifaBaja;	
	}


	public Medidor(long nroSerie, Persona cliente, String domicilioMedidor, Zona zona, TarifaAlta tarifaAlta) {
		super();
		this.nroSerie = nroSerie;
		this.cliente = cliente;
		this.domicilioMedidor = domicilioMedidor;
		this.zona = zona;
		this.tarifa = tarifaAlta;	
	}


	public long getNroSerie() {
		return nroSerie;
	}

	public void setNroSerie(long nroSerie) {
		this.nroSerie = nroSerie;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public String getDomicilioMedidor() {
		return domicilioMedidor;
	}

	public void setDomicilioMedidor(String domicilioMedidor) {
		this.domicilioMedidor = domicilioMedidor;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public Tarifa getTarifa() {
		return tarifa;
	}


	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}


	@Override
	public String toString() {
		return "\nMedidor [nroSerie=" + nroSerie + ", domicilioMedidor=" + domicilioMedidor
				+ ", zona=" + zona.getZona() + ", " + tarifa+ " ]";
	}

	

}

