package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class LecturaBaja extends LecturaMedidor {
	
	private int consumo;

	public LecturaBaja() {
		super();
	}

	public LecturaBaja(int idLecturaMedidor, LocalDate fecha, LocalTime hora, Inspector inspector, Medidor medidor,
			int consumo) {
		super(idLecturaMedidor, fecha, hora, inspector, medidor);
		this.consumo = consumo;
	}
	
	public LecturaBaja(LocalDate fecha, LocalTime hora, Inspector inspector, Medidor medidor,
			int consumo) {
		super(-9, fecha, hora, inspector, medidor);
		this.consumo = consumo;
	}
	
	
	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "LecturaBaja "+super.toString()+" [consumo=" + consumo + "]";
	}

	
	
	

}
