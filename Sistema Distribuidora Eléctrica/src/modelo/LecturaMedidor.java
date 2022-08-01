package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class LecturaMedidor {

	protected int idLecturaMedidor;
	protected LocalDate fecha;
	protected LocalTime hora;
	protected Inspector inspector;
	protected Medidor medidor;
	
	
	public LecturaMedidor() {
		super();
	}

	public LecturaMedidor(int idLecturaMedidor, LocalDate fecha, LocalTime hora, Inspector inspector, Medidor medidor) {
		super();
		this.idLecturaMedidor = idLecturaMedidor;
		this.fecha = fecha;
		this.hora = hora;
		this.inspector = inspector;
		this.medidor = medidor;
	}

	
	public int getIdLecturaMedidor() {
		return idLecturaMedidor;
	}

	public void setIdLecturaMedidor(int idLecturaMedidor) {
		this.idLecturaMedidor = idLecturaMedidor;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Inspector getInspector() {
		return inspector;
	}

	public void setInspector(Inspector inspector) {
		this.inspector = inspector;
	}

	public Medidor getMedidor() {
		return medidor;
	}

	public void setMedidor(Medidor medidor) {
		this.medidor = medidor;
	}


	@Override
	public String toString() {
		return "Lectura [idLecturaMedidor=" + idLecturaMedidor + ", fecha=" + fecha + ", hora=" + hora
				+ ", inspector=" + inspector + ", medidor=" + medidor + "]";
	}


	
	
	
	
	

	
}
