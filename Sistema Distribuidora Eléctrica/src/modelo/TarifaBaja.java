package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.DetalleBaja;

public class TarifaBaja extends Tarifa {
	
	private List<DetalleBaja> lstDetalle;
	
	public TarifaBaja(String servicio) {
		super(servicio);
		this.lstDetalle = new ArrayList<DetalleBaja>();
	}
	
	public TarifaBaja(String servicio, List<DetalleBaja> d) {
		super(servicio);
		this.lstDetalle = d;
	}
	
	public TarifaBaja(Tarifa t) {
		super(t.getServicio());
		this.lstDetalle = new ArrayList<DetalleBaja>();
	}
	
	public List<DetalleBaja> getLstDetalle() {
		return lstDetalle;
	}

	public String toString() {
		return "TarifaBaja  "+super.toString()+ detalles();
	}


	/*		
	 ******************************************************************
	1-STRING PARA IMPRIMIR DETALLES EN toString,
	2-AGREGAR DETALLE BAJA,
	3-CALCULAR PRECIO TOTAL POR TARIFA BAJA.
	 ******************************************************************	*/	
	//1-STRING PARA IMPRIMIR DETALLES EN toString,
	public String detalles() {
		String retorno = "\n";		
		for (DetalleBaja d: lstDetalle) {
			retorno = retorno + d.toString() +"\n";
		}
		return retorno;}
	
	
	//2-AGREGAR DETALLE BAJA
	public void agregarDetalle(DetalleBaja detalle) {		
		lstDetalle.add(detalle);
	}
	
	
	//3-CALCULAR PRECIO TOTAL POR TARIFA BAJA
	public float calcularTotalTarifa(int consumoKW){	
		float resultado=0;	
		for (DetalleBaja d: lstDetalle){	
			if((consumoKW>= d.getDesde())&&(consumoKW< d.getHasta())){
				
				if(d.getDetalleConcepto().contains("Cargo Fijo")){
					resultado = (float) (resultado + d.getValor());
				}
				
				if(d.getDetalleConcepto().contains("Cargo Variable")){
					resultado = (float) (resultado + d.getValor()*consumoKW);
				}			
			}		
		}	
		return resultado;
	}
	
	
	

}
