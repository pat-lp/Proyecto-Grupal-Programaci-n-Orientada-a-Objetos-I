package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {

	private int nroFactura;
	private LocalDate fecha;
	private int nroCliente;
	private String cliente;
	private String domicilio;
	private long nroMedidor;
	private String observaciones;
	private List<ItemFactura> lstItemFactura;
	private SistemaDistribuidora sistemaDistribuidora;

	public Factura() {
	}

	public Factura(int nroFactura, LocalDate fecha, int nroCliente, String cliente, String domicilio, long nroMedidor,
			String observaciones,SistemaDistribuidora sistemaDistribuidora) {
		super();
		this.nroFactura = nroFactura;
		this.fecha = fecha;
		this.nroCliente = nroCliente;
		this.cliente = cliente;
		this.domicilio = domicilio;
		this.nroMedidor = nroMedidor;
		this.observaciones = observaciones;
		this.lstItemFactura = new ArrayList<ItemFactura>();
		this.sistemaDistribuidora = sistemaDistribuidora;
	}


	public int getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(int nroFactura) {
		this.nroFactura = nroFactura;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public List<ItemFactura> getLstItemFactura() {
		return lstItemFactura;
	}

	public void setLstItemFactura(List<ItemFactura> lstItemFactura) {
		this.lstItemFactura = lstItemFactura;
	}

	public SistemaDistribuidora getSistemaDistribuidora() {
		return sistemaDistribuidora;
	}

	public void setSistemaDistribuidora(SistemaDistribuidora sistemaDistribuidora) {
		this.sistemaDistribuidora = sistemaDistribuidora;
	}

	public long getNroMedidor() {
		return nroMedidor;
	}

	public void setNroMedidor(long nroMedidor) {
		this.nroMedidor = nroMedidor;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "\t\t\tFACTURA\n"
				+ "---------------------------------------------------------------------------\n"
				+ "Fecha= " + Funciones.traerFechaCorta(fecha) 
				+ "\nNroCliente= " + nroCliente 
				+ "\nCliente= " + cliente  + "\t\tDomicilio= " + domicilio 
				+ "\nNroMedidor= " + nroMedidor
				+ "\n-------------------------------------------------------------------------\n"
				+"Primer Vto= "+Funciones.traerFechaCorta(calcular1erVto())+"\t\t||\t"
				+"Segundo Vto= "+Funciones.traerFechaCorta(calcular2doVto())
				+ "\n-------------------------------------------------------------------------\n"
				+"Observaciones(Tipo de Tarifa): "+observaciones
				+ "\n-------------------------------------------------------------------------\n"
				+ "ItemFactura " 
				+ "\n-------------------------------------------------------------------------\n"
				+itemFactura()//STRING PARA IMPRIMIR LOS ITEMS EN EL TEST
				+ "\n-------------------------------------------------------------------------\n"
				+"TOTAL MENSUAL= "+Funciones.aproximar2Decimal(calcularTotal());
	}

	/*
	 ******************************************************************
	 * 1-CALCULAR 1er VTO.
	 * 2-CALCULAR 2do VTO.
	 * 3-CALCULAR TOTAL DE LA FACTURA.
	 * 4-IMPRIMIR LOS ITEMS EN FORMA DE STRING.
	 ****************************************************************** */
	//1-CALCULAR 1ER VTO
	public LocalDate calcular1erVto() {	
		return Funciones.clonarFecha(fecha).plusDays(10);
	}

	//2-CALCULAR 2DO VTO
	public LocalDate calcular2doVto() {
		return calcular1erVto().plusDays(10);
	}

	//CALCULAR TOTAL POR ITEM
	/*EL TOTAL ES IGUAL A CARGO FIJO+ (CARGO VARIABLE * CONSUMO), POR ESO NECESITO OBTENER EL 
	CARGO FIJO Y SUMAR EL VARIABLE POR EL CONSUMO SEGUN TIPO DE CLIENTE, 
	PERO EN ESTE CASO NO SE SEPARA EL CARGO VARIABLE POR GRAN DEMANDA O BAJA DEMANDA,
	EN EL CASO DE NO TENER ESE CARGO POR NO CORRESPONDER AL TIPO DE CLIENTE ESTE SE SUMA EN CERO.*/

	public float calcularTotal() {
		float total=0, cFijo=0, cVariable=0, cVariablePico=0, cVariableResto=0, cVariableValle=0;

		for(int i=0;i<lstItemFactura.size();i++) 	{	   	 
			if(lstItemFactura.get(i).getDetalleConcepto().contains("Cargo Fijo")) {
				cFijo=(float) lstItemFactura.get(i).getPrecio();//AMBOS CLIENTES TIENEN CARGO FIJO
			}
			if(lstItemFactura.get(i).getDetalleConcepto().contains("Cargo Variable")) {
				cVariable=(float) lstItemFactura.get(i).calcularSubtotal();
			}else {
				cVariable=0;//EN EL CASO DE GRAN DEMANDA RETORNA CERO
			}

			if(lstItemFactura.get(i).getDetalleConcepto().contains("Cargo Variable Pico")) {
				cVariablePico=(float) lstItemFactura.get(i).calcularSubtotal();
			}else {
				cVariablePico=0;//EN EL CASO DE BAJA DEMANDA RETORNA CERO
			}

			if(lstItemFactura.get(i).getDetalleConcepto().contains("Cargo Variable Resto")) {
				cVariableResto=(float) lstItemFactura.get(i).calcularSubtotal();
			}else {
				cVariableResto=0;//EN EL CASO DE BAJA DEMANDA RETORNA CERO
			}

			if(lstItemFactura.get(i).getDetalleConcepto().contains("Cargo Variable Valle")) {
				cVariableValle=(float) lstItemFactura.get(i).calcularSubtotal();
			}else {
				cVariableValle=0;//EN EL CASO DE BAJA DEMANDA RETORNA CERO
			}
		}
		total=cFijo+cVariable+cVariableValle+cVariableResto+cVariablePico;
		return total/2;	    
	}


	public String itemFactura(){
		String retorno = "";		
		for(ItemFactura i: lstItemFactura){		
			retorno = retorno+i.getIdItemFactura() + " " + i.getDetalleConcepto()+ "\t "
					+ i.getUnidad() + "\tCantidad= " + i.getCantidad()+" kWh"+"\tPrecio= $" + i.getPrecio() + "\n";		
		}	
		return retorno;	
	}




}
