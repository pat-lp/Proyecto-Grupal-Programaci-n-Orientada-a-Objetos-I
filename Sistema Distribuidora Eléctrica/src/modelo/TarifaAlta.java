package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.DetalleAlta;

public class TarifaAlta extends Tarifa {

	private String tensionContratada;
	private List<DetalleAlta> lstDetalle;

	public TarifaAlta(String servicio, String tensionContratada) {
		super(servicio);
		this.tensionContratada = tensionContratada;
		this.lstDetalle = new ArrayList<DetalleAlta>();
	}

	public TarifaAlta(String servicio, String tensionContratada, List<DetalleAlta> d) {
		super(servicio);
		this.tensionContratada = tensionContratada;
		this.lstDetalle = d;
	}

	public TarifaAlta(Tarifa t, String tensionContratada) {
		super(t.getServicio());
		this.tensionContratada = tensionContratada;
		this.lstDetalle = new ArrayList<DetalleAlta>();
	}

	public String getTensionContratada() {
		return tensionContratada;
	}

	public void setTensionContratada(String tensionContratada) {
		this.tensionContratada = tensionContratada;
	}

	public List<DetalleAlta> getLstDetalle() {
		return lstDetalle;
	}

	@Override
	public String toString() {
		return "TarifaAlta  "+super.toString()+ "[tensionContratada=" + tensionContratada + "]" + detalles();
	}


	/*		
	 ******************************************************************
	1-STRING PARA IMPRIMIR DETALLES EN toString.
	2-AGREGAR DETALLE ALTA.
	 ******************************************************************	*/		
	//1-STRING PARA IMPRIMIR DETALLES EN toString,
	public String detalles() {
		String retorno = "\n";	
		for (DetalleAlta d: lstDetalle) {
			retorno = retorno + d.toString() +"\n";
		}	
		return retorno;
	}

	//2-AGREGAR DETALLE ALTA,
	public void agregarDetalle(DetalleAlta detalle) {	
		lstDetalle.add(detalle);
	}

	
		
		
		
		
		

		
	}





