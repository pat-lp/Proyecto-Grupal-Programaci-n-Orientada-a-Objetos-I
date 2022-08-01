package modelo;

import java.util.ArrayList;
import java.util.List;

public class Zona {
	
	private int idZona;
	private String zona;
	private List<Inspector> lstInspector;
	
	public Zona(int idZona, String zona) {
		super();
		this.idZona = idZona;
		this.zona = zona;
		this.lstInspector = new ArrayList<Inspector>();
	}
	public int getIdZona() {
		return idZona;
	}
	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
		
	public List<Inspector> getLstInspector() {
		return lstInspector;
	}
	@Override
	public String toString() {
		return "\nZona [idZona=" + idZona + ", zona=" + zona + ", " + lstInspector + "]";
	}
	
	/*		
	 ******************************************************************
	1-AGREGAR INSPECTOR A ZONA,
	2-TRAER INSPECTOR POR ID.
	 ******************************************************************	*/		
	//1-AGREGAR INSPECTOR A ZONA
	public boolean agregarInspectorAZona(Inspector inspector)throws Exception {
		Inspector existeInspector=traerInspector(inspector.getIdInspector());
		if(existeInspector!=null) {
			throw new Exception ("Inspector ya existe");
		}		
		inspector.getLstZonas().add(this);	
		return lstInspector.add(inspector);
	}
	
	//2-TRAER INSPECTOR POR ID
	public Inspector traerInspector(int idInspector) {
		int i=0;
		Inspector inspectorEncontrado=null;

		while(i<lstInspector.size()&& inspectorEncontrado==null) {
			if(lstInspector.get(i).getIdInspector()==idInspector){
				inspectorEncontrado=lstInspector.get(i);
			}
			i++;
		}
		return inspectorEncontrado;
	}	
		

}
