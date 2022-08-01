package modelo;

public class DetalleAlta {

	private String detalleConcepto;
	private String unidad;
	private int limite;
	private boolean superaLimite;
	private double valor;


	public DetalleAlta(String detalleConcepto, String unidad, int limite, boolean superaLimite, double valor) {
		super();
		this.detalleConcepto = detalleConcepto;
		this.unidad = unidad;
		this.limite = limite;
		this.superaLimite = superaLimite;
		this.valor = valor;
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


	public int getLimite() {
		return limite;
	}


	public void setLimite(int limite) {
		this.limite = limite;
	}


	public boolean isSuperaLimite() {
		return superaLimite;
	}


	public void setSuperaLimite(boolean superaLimite) {
		this.superaLimite = superaLimite;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "DetalleAlta [detalleConcepto=" + detalleConcepto + ", unidad=" + unidad + ", limite=" + limite
				+ ", superaLimite=" + superaLimite + ", valor=" + valor + "]";
	}



}
