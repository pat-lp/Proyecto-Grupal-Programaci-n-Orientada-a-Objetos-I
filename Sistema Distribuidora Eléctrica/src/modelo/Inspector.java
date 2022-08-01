package modelo;

import java.util.ArrayList;
import java.util.List;

public class Inspector {

	private int idInspector;
	private List<Zona> lstZonas = new ArrayList<Zona>();
	private PersonaFisica personaFisica;

	public Inspector(int idInspector, PersonaFisica personaFisica) {
		super();
		this.idInspector = idInspector;
		this.lstZonas = new ArrayList<Zona>();
		this.personaFisica = personaFisica;
	}

	public int getIdInspector() {
		return idInspector;
	}

	public void setIdInspector(int idInspector) {
		this.idInspector = idInspector;
	}

	public List<Zona> getLstZonas() {
		return lstZonas;
	}

	public PersonaFisica getPersonaFisica() {
		return personaFisica;
	}

	public void setPersonaFisica(PersonaFisica personaFisica) {
		this.personaFisica = personaFisica;
	}

	@Override
	public String toString() {
		return "Inspector [idInspector=" + idInspector  + ", Zona " + zonasDelInspector() + " personaFisica=" + 
				personaFisica.getNombre()+" "+ personaFisica.getApellido()+ "]";
	}

	/*		
	 ******************************************************************
	1-ZONAS DEL INSPECTOR,
	2-AGREGAR ZONA A INSPECTOR,
	3-TRAER ZONA POR ID.
	 ******************************************************************	*/		
	//1-ZONAS DEL INSPECTOR,
	public String zonasDelInspector(){
		String retorno = " ";		
		for(Zona z: lstZonas){		
			retorno = retorno +" id: " +z.getIdZona() +" y nombre: "+z.getZona()+" -->" ;
		}	
		return retorno;	
	}

	//2-AGREGAR ZONA A INSPECTOR,
	public boolean agregarZonaAInspector(Zona zona)throws Exception {	
		zona.getLstInspector().add(this);	
		return lstZonas.add(zona);
	}

	//3-TRAER ZONA POR ID,
	public Zona traerZona(int idZona){
		int i=0;
		Zona zonaEncontrada=null;

		while (i<lstZonas.size() && zonaEncontrada==null) {
			if(lstZonas.get(i).getIdZona()==idZona) {		 
				zonaEncontrada=lstZonas.get(i);		 
			}	 
			i++;	 
		}
		return zonaEncontrada;
	}


}
