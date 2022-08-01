package modelo;

public class ItemFactura {

	private int idItemFactura;
	private String detalleConcepto;
	private String unidad;
	private double cantidad;
	private double precio;

	
	public ItemFactura(int idItemFactura, String detalleConcepto, String unidad, double cantidad, double precio) {
		super();
		this.idItemFactura = idItemFactura;
		this.detalleConcepto = detalleConcepto;
		this.unidad = unidad;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public int getIdItemFactura() {
		return idItemFactura;
	}

	public void setIdItemFactura(int idItemFactura) {
		this.idItemFactura = idItemFactura;
	}
	
	public String getDetalleConcepto() {
		return detalleConcepto;
	}
	public void setDetalleConcepto(String detalleConcepto) {
		this.detalleConcepto = detalleConcepto;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "ItemFactura [idItemFactura=" + idItemFactura + ", detalleConcepto=" + detalleConcepto + ", unidad="
				+ unidad + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemFactura other = (ItemFactura) obj;
		if (detalleConcepto == null) {
			if (other.detalleConcepto != null)
				return false;
		} else if (!detalleConcepto.equals(other.detalleConcepto))
			return false;
		if (unidad == null) {
			if (other.unidad != null)
				return false;
		} else if (!unidad.equals(other.unidad))
			return false;
		return true;
	}


	
	 //METODO CALCULAR SUBTOTAL.- 
	public float calcularSubtotal() { 
		float subtotal=0; 
		subtotal=(float) (cantidad*precio); 
	 return subtotal;
	 }
	 
	




}
