package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/*	Año 2019	
 ******************************************************************
GRUPO NRO 7:
BENITEZ HAUGG, GRISELDA,
PALLARES, MARIA LAURA,
PALMIERI, PATRICIA.
 ******************************************************************	*/	

public class SistemaDistribuidora {

	private List<Persona> lstCliente;
	private List<Inspector> lstInspector;
	private List<Medidor> lstMedidor;
	private List<LecturaMedidor> lstLecturaMedidor;
	private List<Tarifa> lstTarifa;
	private List<Zona> lstZona;
	private List<Factura> lstFactura;




	public SistemaDistribuidora() {
		super();
		this.lstCliente = new ArrayList<Persona>();
		this.lstInspector = new ArrayList<Inspector>();
		this.lstMedidor = new ArrayList<Medidor>();
		this.lstLecturaMedidor = new ArrayList<LecturaMedidor>();
		this.lstTarifa = new ArrayList<Tarifa>();
		this.lstZona = new ArrayList<Zona>();
		this.lstFactura = new ArrayList<Factura>();
	}


	public List<Persona> getLstCliente() {
		return lstCliente;
	}

	public List<Inspector> getLstInspector() {
		return lstInspector;
	}

	public List<Medidor> getLstMedidor() {
		return lstMedidor;
	}

	public List<LecturaMedidor> getLstLecturaMedidor() {
		return lstLecturaMedidor;
	}

	public List<Tarifa> getLstTarifa() {
		return lstTarifa;
	}

	public List<Zona> getLstZona() {
		return lstZona;
	}


	public List<Factura> getLstFactura() {
		return lstFactura;
	}



	public void setLstCliente(List<Persona> lstCliente) {
		this.lstCliente = lstCliente;
	}


	public void setLstInspector(List<Inspector> lstInspector) {
		this.lstInspector = lstInspector;
	}


	public void setLstMedidor(List<Medidor> lstMedidor) {
		this.lstMedidor = lstMedidor;
	}


	public void setLstLecturaMedidor(List<LecturaMedidor> lstLecturaMedidor) {
		this.lstLecturaMedidor = lstLecturaMedidor;
	}


	public void setLstTarifa(List<Tarifa> lstTarifa) {
		this.lstTarifa = lstTarifa;
	}


	public void setLstZona(List<Zona> lstZona) {
		this.lstZona = lstZona;
	}


	public void setLstFactura(List<Factura> lstFactura) {
		this.lstFactura = lstFactura;
	}


	@Override
	public String toString() {
		return "SistemaDistribuidora [lstCliente=" + lstCliente + ", lstInspector=" + lstInspector + ", lstMedidor="
				+ lstMedidor + ", lstLecturaMedidor=" + lstLecturaMedidor + ", lstTarifa=" + lstTarifa + ", lstZona="
				+ lstZona + "]";
	}


	/*
	 ******************************************************************
	         LISTA METODOS
	 ******************************************************************
1-CLIENTE:
1.1-AGREGAR CLIENTE BAJA DEMANDA:
+agregarPersonaFisica(String domicilio, long dni, String nombre, String apellido): boolean.
1.2-AGREGAR CLIENTE GRAN DEMANDA:
+agregarPersonaJuridica(String domicilio, long cuit, String razonSocial): boolean.
1.3-ELIMINAR CLIENTE POR ID:
+eliminarCliente(int idPersona): boolean.
1.4-MODIFICAR CLIENTE BAJA DEMANDA:
+modificarPersonaFisica(int idPersona, String domicilio, long dni, String nombre, String apellido): boolean.
1.5-MODIFICAR CLIENTE GRAN DEMANDA:
modificarPersonaJuridica(int idPersona, String domicilio, long cuit, String razonSocial): boolean.
1.6-TRAER PERSONA FISICA POR DNI:
+traerPersonaFisica(long dni): PersonaFisica.
1.7-TRAER PERSONA JURIDICA POR CUIT:
+traerPersonaJuridica(long cuit): PersonaJuridica.
1.8-TRAER PERSONA POR ID:
+traerPersona(int idPersona): Persona.
------------------------------------
2-ZONA:
2.1-AGREGAR ZONA:
+agregarZona(Zona zona): boolean.
2.2-ELIMINAR ZONA:
+eliminarZona(int idZona):boolean.
2.3-MODIFICAR ZONA:
+modificarZona(int idZona, String zona): boolean.
2.4-TRAER ZONA POR ID:
+traerZona(int idZona): Zona.
2.5-TRAER ZONA POR ZONA:
+traerZona(Zona zona): Zona.
------------------------------------
3-MEDIDOR:
3.1-AGREGAR MEDIDOR:
+agregarMedidor (Medidor medidor): boolean.
3.2-ELIMINAR MEDIDOR:
+eliminarMedidor(long nroSerie): boolean.
3.3-MODIFICAR MEDIDOR:
+modificarMedidor(long nroSerie, Persona cliente, String domicilioMedidor, Zona zona, Tarifa tarifa): boolean.
3.4-TRAER MEDIDOR POR NRO DE SERIE:
+traerMedidor (long nroSerie): Medidor.
------------------------------------
4-LECTURA MEDIDOR:
4.1-AGREGAR LECTURA MEDIDOR:
+agregarLecturaMedidor(LecturaMedidor lecturaMedidor): boolean.
4.2-AGREGAR LECTURA MEDIDOR ALTA:
+agregarLecturaMedidor(LecturaAlta lecturaAlta): boolean.
4.3-AGREGAR LECTURA MEDIDOR BAJA
+agregarLecturaMedidor(LecturaBaja lecturaBaja): boolean.
4.4-ELIMINAR LECURA MEDIDOR POR ID:
+eliminarLecturaMedidor(int idLecturaMedidor): boolean.
4.5-MODIFICAR LECTURA MEDIDOR ALTA:
+modificarLecturaAlta(int idLecturaMedidor, LocalDate fecha, LocalTime hora, Inspector inspector, Medidor medidor, int consumoHsPico, int consumoHsValle, int consumoHsResto): boolean.
4.6-MODIFICAR LECTURA MEDIDOR BAJA:
+modificarLecturaBaja(int idLecturaMedidor, LocalDate fecha, LocalTime hora, Inspector inspector, Medidor medidor, int consumo): boolean.
4.7-TRAER LECTURA MEDIDOR POR ID:
+traerLectura(int idLecturaMedidor): LecturaMedidor.
4.8-TRAER LECTURA ALTA POR ID:
+traerLecturaAlta(int idLecturaMedidor): LecturaAlta.
4.9-TRAER LECTURA BAJA POR ID:
+traerLecturaBaja(int idLecturaMedidor): LecturaBaja.	
-----------------------------------
5-INSPECTOR:
5.1-AGREGAR INSPECTOR:
+agregarInspector(PersonaFisica personaFisica): boolean.
5.2-TRAER INSPECTOR POR ID:
+traerInspector(int idInspector): Inspector.
5.3-TRAER POR PERSONA FISICA:
+traerInspector(PersonaFisica personaFisica): Inspector. 
-----------------------------------
6-TARIFA:
6.1-AGREGAR TARIFA:
+agregarTarifa(Tarifa tarifa): boolean.
6.2-AGREGAR TARIFA ALTA:
+agregarTarifa(TarifaAlta tarifa): boolean.
6.3-AGREGAR TARIFA BAJA:
+agregarTarifa(TarifaBaja tarifa): boolean.
6.4-TRAER TARIFA POR ID:
+traerTarifaPorId(int idTarifaBuscada): Tarifa.
6.5-TRAER TARIFA POR SERVICIO:
+traerTarifaPorServicio(String s): Tarifa.
6.6-TRAER LISTA DE TARIFA ALTA:
+traerTarifasAltas(): List<TarifaAlta>.
6.7-TRAER LISTA DE TARIFA BAJA:
+traerTarifasBajas(): List<TarifaBaja>.
6.8-TRAER TARIFA ALTA POR SERVICIO:
+traerTarifaAltaPorServicio(String servicio): TarifaAlta.
6.9-TRAER TARIFA BAJA POR SERVICIO:
+traerTarifaBajaPorServicio(String servicio): TarifaBaja. 
6.9-TRAER TARIFA ALTA POR TENSION CONTRATADA:
+traerTarifaAltaPorTension(String tension): TarifaAlta.
-----------------------------------
7-CALCULAR PRECIOS SEGUN CONSUMO O POTENCIA CONTRATADA SEGUN CORRESPONDA:
7.1-CALCULAR TOTAL POR CONSUMO(TARIFA BAJA)
+calcularTotalPorConsumo(int consumoKW): float.
7.2-TRAER LECTURA BAJA DEMANDA POR MEDIDOR
+traerLecturasBajas(Medidor m): List<LecturaBaja>
7.3-TRAER LECURA ALTA POR MEDIDOR
+traerLecturasAltas(Medidor m): List<LecturaAlta>.
7.4-TRAER LECTURA POR NROSERIE MEDIDOR
+traerLectura(long nroSerie): LecturaMedidor.
7.5-CALCULAR TOTAL POR CONSUMO(TARIFA BAJA): RETORNA STRING.
+calcularServicioPorConsumo(int consumoKW): String.
7.6-TRAER MEDIDOR POR NRO CLIENTE
+traerMedidorPorCliente(int nroCliente): Medidor.
7.7-TRAER LA LISTA DE LECTURAS DE UN MEDIDOR EN LA FECHA INDICADA
+traerLecturasPorMedidorYFecha(int nroMedidor, LocalDate fecha): List<LecturaMedidor>.
7.7-METODO SOBRECARGADO
traerLecturasPorMedidorYFecha(int mes, int anio, Medidor m): List<LecturaMedidor>.
7.8-RETORNA EL MAXIMO ID DE LA LECTURA MEDIDOR
+maximaLectura(): int.
7.9-TRAER TARIFA BAJA POR CONSUMO
+traerTarifaBajaPorConsumo(int consumoKW): TarifaBaja.
7.10-RETORNA EL MAXIMO ID DE LA LECTURA MEDIDOR
+maximaLectura(): int.
7.11-TRAER PERSONA NOMBRE O RAZON SOCIAL
+traerPersonaNombre(int idPersona): String.
7.12-CALCULAR CONSUMO KW POR CLIENTE BAJA DEMANDA
+calcularConsumoKWBaja(int mes, int anio, Medidor m): int.	
7.12-METODO SOBRECARGADO
+calcularConsumoKWBaja(int mes, int anio, Medidor m): int.	
7.13-CALCULAR CONSUMO KW POR CLIENTE GRAN DEMANDA
+calcularConsumoKwAlta(int mes, int anio, Medidor m): LecturaAlta.	
7.13-METODO SOBRECARGADO DE CONSUMO KW
+calcularConsumoKwAltaString(LocalDate fecha, Medidor m): String.
7.14-CALCULAR PRECIO TOTAL A PAGAR TARIFA ALTA
+calcularTotalTarifaAlta(LocalDate fecha, Medidor m): float
-------------------------------------------------------------------------
8-GENERAR FACTURA:
8.1-FACTURA GRAN Y BAJA DEMANDA
+generarFactura(int mes, int anio, Medidor m): Factura
-------------------------------------------------------------------------
9-REPORTE CONSUMO ENTRE FECHAS DE UN CLIENTE:
9.1-REPORTE CONSUMO GRAN DEMANDA DEVUELVE LECTURA ALTA
+consumoKwhEntreFechasAlta(LocalDate f1, LocalDate f2, Persona cliente): LecturaAlta.
9.1-METODO SOBRECARGADO- CONSUMO GRAN DEMANDA DEVUELVE STRING
+consumoKwhEntreFechasAltaString(LocalDate f1, LocalDate f2, Persona cliente): String.
9.2-REPORTE CONSUMO BAJA DEMANDA--NO CONTEMPLA LECTURAS DEL ANIO 2018	
+calcularTotalKwhEntreFechasBaja(LocalDate f1, LocalDate f2, Persona cliente): int.		


/* *******************************CASOS DE USO**************************************************** */

	/*		
	 ******************************************************************
 	1-CLIENTES
	 ******************************************************************	*/
	//	1.1-AGREGAR CLIENTE BAJA DEMANDA
	public boolean agregarPersonaFisica(String domicilio, long dni, String nombre, String apellido)throws Exception {
		Persona existePersona=traerPersonaFisica(dni);
		if(existePersona!=null) {
			throw new Exception ("El cliente Baja Demanda con dni"+dni+", ya existe");
		}
		else{
			int idProximo=1;
			if(!lstCliente.isEmpty()) {
				idProximo=lstCliente.get(lstCliente.size()-1).getIdPersona()+1;	
				lstCliente.add(new PersonaFisica(idProximo,domicilio, dni,  nombre, apellido));
			} else {
				lstCliente.add(new PersonaFisica(idProximo,domicilio, dni,  nombre, apellido));}
		}
		return true;
	}

	//	1.2-AGREGAR CLIENTE GRAN DEMANDA
	public boolean agregarPersonaJuridica(String domicilio, long cuit, String razonSocial)throws Exception {
		Persona existePersona=traerPersonaJuridica(cuit);

		if(existePersona!=null) {
			throw new Exception ("El cliente Gran Demanda con cuit:"+cuit+" ya existe");
		}else {
			int idProximo=1;
			if(!lstCliente.isEmpty()) {
				idProximo=lstCliente.get(lstCliente.size()-1).getIdPersona()+1;
				lstCliente.add(new PersonaJuridica(idProximo, domicilio, cuit, razonSocial));
			} else {
				lstCliente.add(new PersonaJuridica(idProximo, domicilio, cuit, razonSocial));
			}
		}
		return true;
	}

	//	1.3-ELIMINAR CLIENTE POR ID 		
	public boolean eliminarCliente(int idPersona)throws Exception {
		Persona existePersona=traerPersona(idPersona);

		if(existePersona==null) 
			throw new Exception ("El cliente con id: "+idPersona+" ,NO existe para eliminar");
		return lstCliente.remove(existePersona);
	}	

	//	1.4-MODIFICAR CLIENTE BAJA DEMANDA
	public boolean modificarPersonaFisica(int idPersona, String domicilio, long dni, String nombre, String apellido)throws Exception {
		PersonaFisica existePersona=traerPersonaFisica(dni);

		if(existePersona==null) 
			throw new Exception ("El cliente Baja Demanda dni "+dni+" NO existe");
		existePersona.setDomicilio(domicilio);
		existePersona.setDni(dni);
		existePersona.setNombre(nombre);
		existePersona.setApellido(apellido);
		return true;
	}

	//	1.5-MODIFICAR CLIENTE GRAN DEMANDA
	public boolean modificarPersonaJuridica(int idPersona, String domicilio, long cuit, String razonSocial)throws Exception {
		PersonaJuridica existePersona=traerPersonaJuridica(cuit);

		if(existePersona==null) 
			throw new Exception ("El cliente Gran Demanda cuit: "+cuit+" NO existe");	
		existePersona.setCuit(cuit);
		existePersona.setDomicilio(domicilio);
		existePersona.setRazonSocial(razonSocial);
		return true;
	}

	//	1.6-TRAER PERSONA FISICA POR DNI
	public PersonaFisica traerPersonaFisica(long dni){
		int i=0;
		PersonaFisica personaEncontrada=null;

		while (i<lstCliente.size() && personaEncontrada==null) {
			Persona persona = lstCliente.get(i);
			if(persona instanceof PersonaFisica) {	
				PersonaFisica personaFisica = (PersonaFisica)  persona ;
				if(personaFisica.getDni()==dni) {
					personaEncontrada= personaFisica;	
				}		
			}
			i++;
		}
		return personaEncontrada;
	}

	//	1.7-TRAER PERSONA JURIDICA POR CUIT	
	public PersonaJuridica traerPersonaJuridica(long cuit){
		int i=0;
		PersonaJuridica personaEncontrada=null;

		while (i<lstCliente.size() && personaEncontrada==null) {
			Persona persona = lstCliente.get(i);
			if(persona instanceof PersonaJuridica) {	
				PersonaJuridica personaJuridica = (PersonaJuridica)  persona ;
				if(personaJuridica.getCuit()==cuit) {
					personaEncontrada= personaJuridica;
				}	 
			}
			i++;
		}
		return personaEncontrada;
	}

	//	1.8-TRAER PERSONA POR ID
	public Persona traerPersona(int idPersona){
		int i=0;
		Persona personaEncontrada=null;

		while (i<lstCliente.size() && personaEncontrada==null) {
			if(lstCliente.get(i).getIdPersona()==idPersona) {		 
				personaEncontrada=lstCliente.get(i);		 
			}	 
			i++;	 
		}
		return personaEncontrada;
	}

	/*		
	 ******************************************************************
 	2-ZONAS
	 ******************************************************************	*/	
	//	2.1-AGREGAR ZONA
	public boolean agregarZona(Zona zona)throws Exception {
		Zona existeZona=traerZona(zona.getIdZona());
		if(existeZona!=null) {
			throw new Exception ("Zona "+zona.getIdZona()+" ya existe");
		}	
		return lstZona.add(zona);
	}

	//	2.2-ELIMINAR ZONA
	public boolean eliminarZona(int idZona) throws Exception{
		Zona existeZona=traerZona(idZona);		
		if(existeZona==null)			
			throw new Exception ("La zona id: "+idZona+", no existe para eliminar");	
		return lstZona.remove(existeZona);
	}

	//	2.3-MODIFICAR ZONA
	public boolean modificarZona(int idZona, String zona) throws Exception{
		Zona existeZona=traerZona(idZona);
		if(existeZona==null)throw new Exception ("La zona "+idZona+" no se puede modificar, no existe en la lista");
		existeZona.setZona(zona);
		return true;
	}

	//2.4-TRAER ZONA POR ID ZONA	
	public Zona traerZona(int idZona){
		int i=0;
		Zona zonaEncontrada=null;

		while (i<lstZona.size() && zonaEncontrada==null) {
			if(lstZona.get(i).getIdZona()==idZona) {		 
				zonaEncontrada=lstZona.get(i);		 
			}	 
			i++;	 
		}
		return zonaEncontrada;
	}


	//2.5-TRAER ZONA POR ZONA
	public Zona traerZona(Zona zona){
		Zona zonaEncontrada=traerZona(zona.getIdZona());
		return zonaEncontrada;
	}

	/*		
	 ******************************************************************
	3-MEDIDOR
	 ******************************************************************	*/	
	//	3.1-AGREGAR MEDIDOR	
	public boolean agregarMedidor (Medidor medidor) throws Exception {
		Medidor existeMedidor=traerMedidor(medidor.getNroSerie());

		if(existeMedidor!=null) {
			throw new Exception ("Medidor nroSerie: "+medidor.getNroSerie()+" ,ya existe");
		}	
		return lstMedidor.add(medidor);
	}


	//	3.2-ELIMINAR MEDIDOR
	public boolean eliminarMedidor(long nroSerie) throws Exception{
		Medidor existeMedidor=traerMedidor(nroSerie);		
		if(existeMedidor==null)			
			throw new Exception ("El medidor cuyo nroSerie es: "+nroSerie+" ,no existe");	
		return lstMedidor.remove(existeMedidor);
	}

	//	3.3-MODIFICAR MEDIDOR	
	public boolean modificarMedidor(long nroSerie, Persona cliente, String domicilioMedidor, Zona zona, Tarifa tarifa) throws Exception{
		Medidor existeMedidor=traerMedidor(nroSerie);

		if(existeMedidor==null)throw new Exception ("El medidor cuyo nroSerie es: "+nroSerie+" ,no existe en la Lista");
		existeMedidor.setNroSerie(nroSerie);
		existeMedidor.setCliente(cliente);
		existeMedidor.setDomicilioMedidor(domicilioMedidor);;
		existeMedidor.setZona(zona);
		existeMedidor.setTarifa(tarifa);
		return true;
	}

	//	3.4-TRAER MEDIDOR POR NRO DE SERIE
	public Medidor traerMedidor (long nroSerie) {
		int i=0;
		Medidor medidorEncontrado=null;

		while(i<lstMedidor.size()&& medidorEncontrado==null) {
			if(lstMedidor.get(i).getNroSerie()==nroSerie){
				medidorEncontrado=lstMedidor.get(i);
			}
			i++;
		}
		return medidorEncontrado;
	}	

	/*		
	 ******************************************************************
	4-LECTURA DE MEDIDOR
	 ******************************************************************	*/		
	//	4.1-AGREGAR LECTURA MEDIDOR
	public boolean agregarLecturaMedidor(LecturaMedidor lecturaMedidor)throws Exception {
		LecturaMedidor existeLectura=traerLectura(lecturaMedidor.getIdLecturaMedidor());
		if(existeLectura!=null) {
			throw new Exception ("No puedo agregar la lectura"+lecturaMedidor.getIdLecturaMedidor()+" ya existe");
		}
		return lstLecturaMedidor.add(lecturaMedidor);
	}

	//4.2-AGREGAR LECTURA MEDIDOR ALTA 
	public boolean agregarLecturaMedidor(LecturaAlta lecturaAlta)throws Exception {
		LecturaMedidor existeLectura=traerLectura(lecturaAlta.getIdLecturaMedidor());
		if(existeLectura!=null) {
			throw new Exception ("La lectura Alta Demanda id: "+lecturaAlta.getIdLecturaMedidor()+" ya existe");
		}
		return lstLecturaMedidor.add(lecturaAlta);
	}

	//4.3-AGREGAR LECTURA MEDIDOR BAJA 
	public boolean agregarLecturaMedidor(LecturaBaja lecturaBaja)throws Exception {
		LecturaMedidor existeLectura=traerLectura(lecturaBaja.getIdLecturaMedidor());
		if(existeLectura!=null) {
			throw new Exception ("La lectura Baja Demanda id: "+lecturaBaja.getIdLecturaMedidor()+" ya existe");
		}
		return lstLecturaMedidor.add(lecturaBaja);
	}

	//	4.4-ELIMINAR LECTURA POR ID 		
	public boolean eliminarLecturaMedidor(int idLecturaMedidor)throws Exception {
		LecturaMedidor existeLectura=traerLectura(idLecturaMedidor);
		if(existeLectura==null) 
			throw new Exception ("La lectura con id: "+idLecturaMedidor+" ,NO existe para eliminar");
		return lstLecturaMedidor.remove(existeLectura);
	}	

	//	4.5-MODIFICAR LECTURA ALTA
	public boolean modificarLecturaAlta(int idLecturaMedidor, LocalDate fecha, LocalTime hora, Inspector inspector, Medidor medidor, int consumoHsPico, int consumoHsValle, int consumoHsResto) 
			throws Exception {
		LecturaAlta existeLectura=traerLecturaAlta(idLecturaMedidor);

		if(existeLectura==null) 
			throw new Exception ("La lectura Alta Demanda NO existe");
		existeLectura.setFecha(fecha);
		existeLectura.setHora(hora);
		existeLectura.setInspector(inspector);
		existeLectura.setMedidor(medidor);
		existeLectura.setConsumoHsPico(consumoHsPico);
		existeLectura.setConsumoHsResto(consumoHsResto);
		existeLectura.setConsumoHsValle(consumoHsValle);
		return true;
	}

	//4.6-MODIFICAR LECTURA BAJA
	public boolean modificarLecturaBaja(int idLecturaMedidor, LocalDate fecha, LocalTime hora, Inspector inspector, Medidor medidor, int consumo )throws Exception  { 
		LecturaBaja existeLectura=traerLecturaBaja(idLecturaMedidor);

		if(existeLectura==null) 
			throw new Exception ("La lectura Alta Demanda NO existe");	
		existeLectura.setFecha(fecha);
		existeLectura.setHora(hora);
		existeLectura.setInspector(inspector);
		existeLectura.setMedidor(medidor);
		existeLectura.setConsumo(consumo);
		return true;
	}


	//4.7-TRAER LECTURA MEDIDOR POR ID
	public LecturaMedidor traerLectura(int idLecturaMedidor){
		int i=0;
		LecturaMedidor lecturaEncontrada=null;
		while (i<lstLecturaMedidor.size() && lecturaEncontrada==null) {
			if(lstLecturaMedidor.get(i).getIdLecturaMedidor()==idLecturaMedidor) {		 
				lecturaEncontrada=lstLecturaMedidor.get(i);		 
			}	 
			i++;	 
		}
		return lecturaEncontrada;
	}

	//4.8-TRAER LECTURA ALTA POR ID	
	public LecturaAlta traerLecturaAlta(int idLecturaMedidor) {
		int i=0;
		boolean encontrada=false;
		LecturaAlta lecturaEncontrada=null;

		while (i<lstLecturaMedidor.size() && !encontrada) {
			LecturaMedidor lecturaMedidor = lstLecturaMedidor.get(i);
			if(lecturaMedidor instanceof LecturaAlta) {	
				LecturaAlta lecturaAlta = (LecturaAlta)  lecturaMedidor ;
				if(lecturaMedidor.getIdLecturaMedidor()==idLecturaMedidor) {
					lecturaEncontrada= lecturaAlta;
					encontrada=true;	
				}	 
			}
			i++;
		}
		return lecturaEncontrada;
	}

	//4.9-TRAER LECTURA BAJA POR ID	
	public LecturaBaja traerLecturaBaja(int idLecturaMedidor) {
		int i=0;
		LecturaBaja lecturaEncontrada=null;

		while (i<lstLecturaMedidor.size() && lecturaEncontrada==null) {
			LecturaMedidor lecturaMedidor = lstLecturaMedidor.get(i);
			if(lecturaMedidor instanceof LecturaBaja) {	
				LecturaBaja lecturabaja = (LecturaBaja)  lecturaMedidor ;
				if(lecturaMedidor.getIdLecturaMedidor()==idLecturaMedidor) {
					lecturaEncontrada= lecturabaja;
				}	 
			}
			i++;
		}
		return lecturaEncontrada;
	}

	/*
	 ******************************************************************
     5-INSPECTOR
	 ******************************************************************	*/	
	//5.1-AGREGAR INSPECTOR
	public boolean agregarInspector(PersonaFisica personaFisica)throws Exception {
		Inspector existeInspector=traerInspector(personaFisica);

		if(existeInspector!=null) {
			throw new Exception ("Inspector"+personaFisica.getDni()+", ya existe");
		}
		int idProximo=1;
		if(!lstInspector.isEmpty())
			idProximo=lstInspector.get(lstInspector.size()-1).getIdInspector()+1;
		return lstInspector.add(new Inspector(idProximo,personaFisica));
	}

	//5.2-TRAER POR ID
	public Inspector traerInspector(int idInspector) {
		int i=0;
		Inspector encontrado=null;

		while(i<lstInspector.size()&& encontrado==null) {
			if(lstInspector.get(i).getIdInspector()==idInspector){			
				encontrado=lstInspector.get(i);
			}
			i++;
		}
		return encontrado;
	}	

	//5.3-TRAER POR PERSONA FISICA
	public Inspector traerInspector(PersonaFisica personaFisica) {
		int i=0;
		Inspector inspectorEncontrado=null;
		while(i<lstInspector.size()&& inspectorEncontrado==null) {	
			if(lstInspector.get(i).getPersonaFisica().getDni()==personaFisica.getDni()) {			
				inspectorEncontrado=lstInspector.get(i);
			}
			i++;
		}
		return inspectorEncontrado;
	}	

	/*		
	 ******************************************************************
	6-TARIFA
	 ******************************************************************	*/	
	//6.1-AGREGAR TARIFA //Padre
	public boolean agregarTarifa(Tarifa tarifa)throws Exception {
		Tarifa existeTarifa=traerTarifaPorServicio(tarifa.getServicio());
		if(existeTarifa!=null) {
			throw new Exception ("La tarifa ya existe");
		}	
		return lstTarifa.add(new Tarifa(tarifa.getServicio()));
	}

	//6.2-AGREGAR TARIFA //Sobrecarga de metodo, hija alta
	public boolean agregarTarifa(TarifaAlta tarifa)throws Exception {
		Tarifa existeTarifa=traerTarifaPorServicio(tarifa.getServicio());
		if(existeTarifa!=null) {
			throw new Exception ("Tarifa Alta ya existe");
		}	
		return lstTarifa.add(new TarifaAlta(tarifa.getServicio(), tarifa.getTensionContratada(),tarifa.getLstDetalle()));
	}

	//6.3-AGREGAR TARIFA 
	public boolean agregarTarifa(TarifaBaja tarifa)throws Exception {
		Tarifa existeTarifa=traerTarifaPorServicio(tarifa.getServicio());
		if(existeTarifa!=null) {
			throw new Exception ("Tarifa Baja ya existe");
		}
		return lstTarifa.add(new TarifaBaja(tarifa.getServicio(),tarifa.getLstDetalle()));
	}

	
	//6.5-TRAER POR SERVICIO
	public Tarifa traerTarifaPorServicio(String s) {
		int i=0;
		boolean encontrada=false;
		Tarifa t=null;
		while(i<lstTarifa.size()&& !encontrada) {
			if(lstTarifa.get(i).getServicio().equals(s)){			
				encontrada=true;			
				t=lstTarifa.get(i);
			}
			i++;
		}
		return t;
	}

	//6.6-TRAER LISTA DE TARIFA ALTA
	public List<TarifaAlta>traerTarifasAltas(){
		List<TarifaAlta> lista = new ArrayList<TarifaAlta>();
		for(Tarifa t: lstTarifa){
			if(t instanceof TarifaAlta){
				lista.add((TarifaAlta) t);
			}
		}
		return lista;
	}

	//6.7-TRAER LISTA DE TARIFA BAJA
	public List<TarifaBaja>traerTarifasBajas(){
		List<TarifaBaja> lista = new ArrayList<TarifaBaja>();
		for(Tarifa t: lstTarifa){
			if(t instanceof TarifaBaja){
				lista.add((TarifaBaja) t);
			}
		}
		return lista;
	}

	//6.8-TRAER TARIFA ALTA POR SERVICIO
	public TarifaAlta traerTarifaAltaPorServicio(String servicio){
		TarifaAlta retorno = null;
		for(Tarifa t: lstTarifa){
			if(t instanceof TarifaAlta){
				if(t.getServicio().equals(servicio)){
					retorno = (TarifaAlta) t;
				}
			}
		}
		return retorno;
	}

	//6.9-TRAER TARIFA BAJA POR SERVICIO
	public TarifaBaja traerTarifaBajaPorServicio(String servicio){
		TarifaBaja retorno = null;
		for(Tarifa t: lstTarifa){
			if(t instanceof TarifaBaja){
				if(t.getServicio().equals(servicio)){
					retorno = (TarifaBaja) t;
				}
			}
		}
		return retorno;
	}

	//6.9-TRAER TARIFA ALTA POR TENSION CONTRATADA
	public TarifaAlta traerTarifaAltaPorTension(String tension) {
		TarifaAlta tt = null;
		for (Tarifa t: lstTarifa) {
			if(t instanceof TarifaAlta) {
				TarifaAlta ttt = (TarifaAlta) t;
				if(ttt.getTensionContratada().contains(tension)) {
					tt = ttt;
				}
			}
		}
		return tt;	
	}

	/*		
	 ******************************************************************
	CASO DE USO 7 - CALCULAR PRECIO DEL CONSUMO POR TIPO DE CLIENTE
	 ******************************************************************	*/		

	//7.1-CALCULAR TOTAL POR CONSUMO(TARIFA BAJA)
	public float calcularTotalPorConsumo(LecturaBaja lecturaBaja){
		return calcularTotalPorConsumo(lecturaBaja.getConsumo());
	}

	//7.1-METODO SOBRECARGADO
	public float calcularTotalPorConsumo(int consumoKW){
		float retorno = 0;
		for(TarifaBaja tB: traerTarifasBajas()){
			float resultado = tB.calcularTotalTarifa(consumoKW);
			if (resultado!=0){
				retorno = resultado;
			}
		}	
		return retorno;
	}

	//7.2- TRAER LECTURA BAJA POR MEDIDOR
	public List<LecturaBaja> traerLecturasBajas(Medidor m){
		List<LecturaBaja> lista= new ArrayList<LecturaBaja>();
		for(LecturaMedidor l: lstLecturaMedidor) {
			if(l instanceof LecturaBaja) {
				if(l.getMedidor().getNroSerie()==m.getNroSerie()) {
					lista.add((LecturaBaja) l);
				}			
			}
		}
		return lista;
	}

	//7.3-TRAER LECURA ALTA POR MEDIDOR
	public List<LecturaAlta> traerLecturasAltas(Medidor m){
		List<LecturaAlta> lista= new ArrayList<LecturaAlta>();

		for(LecturaMedidor l: lstLecturaMedidor) {
			if(l instanceof LecturaAlta) {
				if(l.getMedidor().getNroSerie()==m.getNroSerie()) {
					lista.add((LecturaAlta) l);
				}			
			}
		}
		return lista;
	}

	//7.4-TRAER LECTURA POR NROSERIE MEDIDOR
	public LecturaMedidor traerLectura(long nroSerie){
		int i=0;
		LecturaMedidor lecturaEncontrada=null;
		while (i<lstLecturaMedidor.size() && lecturaEncontrada==null) {
			if(lstLecturaMedidor.get(i).getMedidor().getNroSerie()==nroSerie) {		 
				lecturaEncontrada=lstLecturaMedidor.get(i);		 
			}	 
			i++;	 
		}
		return lecturaEncontrada;
	}

	//7.5-CALCULAR TOTAL POR CONSUMO(TARIFA BAJA)-RETORNA STRING
	public String calcularServicioPorConsumo(LecturaBaja lecturaBaja){	
		return calcularServicioPorConsumo(lecturaBaja.getConsumo());
	}

	//7.5-METODO SOBRECARGADO
	public String calcularServicioPorConsumo(int consumoKW){
		String retorno = "";
		for(TarifaBaja tB: traerTarifasBajas()){
			float resultado = tB.calcularTotalTarifa(consumoKW);
			if (resultado!=0){
				retorno = tB.servicio;
			}
		}	
		return retorno;
	}

	

	//7.6-TRAER MEDIDOR POR NRO CLIENTE
	public Medidor traerMedidorPorCliente(int nroCliente) {
		int i=0;
		boolean encontrada=false;
		Medidor t=null;

		while(i<lstMedidor.size()&& !encontrada) {
			if(lstMedidor.get(i).getCliente().getIdPersona()==nroCliente){
				encontrada=true;
				t=lstMedidor.get(i);
			}
			i++;
		}
		return t;
	}

	//7.7-TRAER LA LISTA DE LECTURAS DE UN MEDIDOR EN LA FECHA INDICADA	
	public List<LecturaMedidor> traerLecturasPorMedidorYFecha(LocalDate fecha, Medidor m){
		return traerLecturasPorMedidorYFecha(fecha.getMonthValue(),fecha.getYear(), m);
	}

	
	//7.7-METODO SOBRECARGADO
	public List<LecturaMedidor> traerLecturasPorMedidorYFecha(int mes, int anio, Medidor m){
		List<LecturaMedidor> lecturasDelBimestre =  new ArrayList<LecturaMedidor>();
		for(LecturaMedidor l: lstLecturaMedidor) {
			if(l.getMedidor().getNroSerie()==m.getNroSerie()) {
				
				//SI MES=1 Y MES=2 LA LECTURA ANTERIOR ES DE NOVIEMBRE DEL AÑO ANTERIOR
				if(mes==2 || mes==1) {
					if(((l.getFecha().getMonthValue())==1) &&(l.getFecha().getYear()==(anio))) {
						lecturasDelBimestre.add(l);
					}

					if(((l.getFecha().getMonthValue())==11) &&(l.getFecha().getYear()==(anio-1))) {
						lecturasDelBimestre.add(l);
					}

				}//FIN MES=1 Y MES=2

				//SI LOS MESES SON DISTINTO A MES=1 Y MES=2
				if(mes!=2 || mes!=1) {	
					
					//MES IMPAR-DIFERENCIA DE LAS DOS LECTURAS DE MESES IMPARES
					if((mes)%2==1) {
						if((l.getFecha().getMonthValue())==(mes) &&(l.getFecha().getYear()==anio)) {
							lecturasDelBimestre.add(l);
						}

						if(((l.getFecha().getMonthValue()==(mes)-2))&&(l.getFecha().getYear()==anio)) {
							lecturasDelBimestre.add(l);
						}
					}//Cierro impar


					//MES PAR-TRAIGO LAS DOS LECTURAS ANTERIORES DE LOS MESES IMPARES
					if(mes%2==0) {
						if(((l.getFecha().getMonthValue()==(mes)-1))&&(l.getFecha().getYear()==anio)) {
							lecturasDelBimestre.add(l);
						}

						if(mes%2==0) {
							if(((l.getFecha().getMonthValue()==(mes)-3))&&(l.getFecha().getYear()==anio)) {
								lecturasDelBimestre.add(l);
							}
						}
					}//CIERRO PAR
				}//CIERRO MES!=1 Y MES!=2
			}
		}//CIERRO FOR
		return lecturasDelBimestre;
	}


	//7.8-RETORNA EL MAXIMO ID DE LA LECTURA MEDIDOR
	public int maximaLectura() {
		int retorno = 0; 
		for (LecturaMedidor m: lstLecturaMedidor) {
			if(retorno<m.idLecturaMedidor) {
				retorno = m.idLecturaMedidor;
			}
		}
		return retorno +1;
	}

	//7.9-TRAER TARIFA BAJA POR CONSUMO
	public TarifaBaja traerTarifaBajaPorConsumo(LecturaBaja lectura){
		return traerTarifaBajaPorConsumo(lectura.getConsumo());
	}
	//7.9-METODO SOBRECARGADO
	public TarifaBaja traerTarifaBajaPorConsumo(int consumoKW)	{
		TarifaBaja t = null;
		for (Tarifa tarifa: lstTarifa) {
			if(tarifa instanceof TarifaBaja) {
				for (DetalleBaja d: ((TarifaBaja) tarifa).getLstDetalle()){	
					if((consumoKW>= d.getDesde())&&(consumoKW< d.getHasta())){
						t = (TarifaBaja) tarifa;
					}		
				}	
			}
		}
		return t;
	}



	/*	CALCULOS DEL CONSUMO:
	PARA CLIENTES BAJA DEMANDA: 
	Con esta lectura y la anterior efectuada, se calcula el consumo del período.
	consumo=lectura anterior-lectura actual.
	consumo=lectura medidor lectura del periodo correspondiente//si no hay periodo anterior
	total a cobrar= cargo fijo+(cargo variable*consumo)*/

	//7.10-TRAER PERSONA NOMBRE O RAZON SOCIAL
	public String traerPersonaNombre(int idPersona){	
		String nombre="";
		for(Persona p: lstCliente) {
			if(p.getIdPersona()==idPersona) {
				if(p instanceof PersonaJuridica) {
					nombre =  ((PersonaJuridica) p).getRazonSocial(); 
				}else{
				nombre=((PersonaFisica) p).getNombre()+" "+((PersonaFisica) p).getApellido();			}		
			}	
		}
		return nombre;
	}

	//7.11-CALCULAR TOTAL KW CONSUMIDOS EN UN PERIODO
	public int calcularConsumoKWBaja(LocalDate fecha, Medidor m) {
		return calcularConsumoKWBaja(fecha.getMonthValue(),fecha.getYear(),m);
	}


	//7.12-METODO SOBRECARGADO
	/*
	 * LOS MESES A TENER EN CUENTA PARA EL CAMBIO DE AÑO EN LAS LECTURAS SON EL
	 * MES=1 Y EL MES=2, YA QUE LA LECTURA IMPAR ANTERIOR SERIA DEL MES=11 Y DEL AÑO 2018, EN
	 * ESTE CASO.
	 */
	public int calcularConsumoKWBaja(int mes, int anio, Medidor m) {
		int kW=0, ultimoConsumo=0, consumoAnterior=0;

		for(int i=0; i<traerLecturasPorMedidorYFecha(mes, anio,m).size();i++){	

			LecturaBaja lB = (LecturaBaja) traerLecturasPorMedidorYFecha(mes,anio,m).get(0);
			consumoAnterior=lB.getConsumo();

			LecturaBaja lB2 = (LecturaBaja) traerLecturasPorMedidorYFecha(mes,anio,m).get(1);
			ultimoConsumo=lB2.getConsumo();

		}
		kW=ultimoConsumo-consumoAnterior;	
		return kW;
	}


	//7.13-RETORNA LOS TRES CONSUMOS DE LECTURA ALTA POR FECHA Y MEDIDOR
	public LecturaAlta calcularConsumoKwAlta(LocalDate fecha, Medidor m){	
		return calcularConsumoKwAlta(fecha.getMonthValue(),fecha.getYear(),m);
	}


	//7.13-METODO SOBRECARGADO
	public LecturaAlta calcularConsumoKwAlta(int mes, int anio, Medidor m){	
		LecturaAlta lectura= new LecturaAlta();
		int anteriorPico=0, ultimoPico=0, anteriorValle=0, ultimoValle=0, anteriorResto=0, ultimoResto=0;

		for(LecturaAlta l: traerLecturasAltas(m)) {		

			if(mes==2 || mes==1) {
				if(((l.getFecha().getMonthValue())==1) &&(l.getFecha().getYear()==(anio))) {
					ultimoPico=l.getConsumoHsPico();
					ultimoValle=l.getConsumoHsValle();
					ultimoResto=l.getConsumoHsResto();	
				}

				if(((l.getFecha().getMonthValue())==11) &&(l.getFecha().getYear()==(anio-1))) {
					anteriorPico=l.getConsumoHsPico();
					anteriorValle=l.getConsumoHsValle();
					anteriorResto=l.getConsumoHsResto();
				}
			}//FIN MES=1 Y MES=2


			if(mes!=1 || mes!=2) {	
				//MES IMPAR
				if((mes)%2==1) {
					if((l.getFecha().getMonthValue())==(mes) &&(l.getFecha().getYear()==anio)) {
						ultimoPico=l.getConsumoHsPico();
						ultimoValle=l.getConsumoHsValle();
						ultimoResto=l.getConsumoHsResto();			
					}
				}

				if((mes)%2==1) {
					if(((l.getFecha().getMonthValue()==(mes)-2))&&(l.getFecha().getYear()==anio)) {
						anteriorPico=l.getConsumoHsPico();
						anteriorValle=l.getConsumoHsValle();
						anteriorResto=l.getConsumoHsResto();			
					}
				}

				//MES PAR
				if(mes%2==0) {
					if(((l.getFecha().getMonthValue()==(mes)-1))&&(l.getFecha().getYear()==anio)) {
						ultimoPico=l.getConsumoHsPico();
						ultimoValle=l.getConsumoHsValle();
						ultimoResto=l.getConsumoHsResto();
					}
				}
				if(mes%2==0) {
					if(((l.getFecha().getMonthValue()==(mes)-3))&&(l.getFecha().getYear()==anio)) {
						anteriorPico=l.getConsumoHsPico();
						anteriorValle=l.getConsumoHsValle();
						anteriorResto=l.getConsumoHsResto();
					}	
				}	
			}//FIN MES!=1 Y MES!=2	
		}//FIN FOR
		lectura.setConsumoHsPico(ultimoPico-anteriorPico);
		lectura.setConsumoHsResto(ultimoResto-anteriorResto);
		lectura.setConsumoHsValle(ultimoValle-anteriorValle);
		return lectura;
	}

	//7.13-METODO SOBRECARGADO DE CONSUMO KW
	public String calcularConsumoKwAltaString(LocalDate fecha, Medidor m){
		String consumoKw="";
		LecturaAlta l=calcularConsumoKwAlta(fecha,  m);
		consumoKw="Total kWh= "+String.valueOf(l.getConsumoHsPico()+l.getConsumoHsResto()+l.getConsumoHsValle())+"-->Consumo Kw Pico: "+String.valueOf(l.getConsumoHsPico())+"-->Consumo Kw Valle: "+String.valueOf(l.getConsumoHsValle())+"-->Consumo Kw Resto: "+String.valueOf(l.getConsumoHsResto());
		return consumoKw;
	}

	//7.14-CALCULAR PRECIO TOTAL A PAGAR TARIFA ALTA
	public float calcularTotalTarifaAlta(LocalDate fecha, Medidor m){		
		float total=0, cFijo=0, cVariablePico=0, cVariableResto=0,cVariableValle=0;
		LecturaAlta lA=calcularConsumoKwAlta(fecha,m);
		Tarifa tarifa=traerTarifaPorServicio(m.getTarifa().getServicio());

		for(TarifaAlta t: traerTarifasAltas()) {
			if(tarifa instanceof TarifaAlta) {

				for (DetalleAlta d: t.getLstDetalle()){

					if(d.getDetalleConcepto().contentEquals("Cargo Fijo")){
						cFijo =  (float) d.getValor();
					}

					if(d.getDetalleConcepto().contentEquals("Cargo Variable Pico")){
						cVariablePico = (float) ( d.getValor()*lA.getConsumoHsPico());
					}

					if(d.getDetalleConcepto().contentEquals("Cargo Variable Resto")){
						cVariableResto = (float) ( d.getValor()*lA.getConsumoHsResto());
					}

					if(d.getDetalleConcepto().contentEquals("Cargo Variable Valle")){
						cVariableValle = (float) (d.getValor()*lA.getConsumoHsValle());
					}	
				}	
			}
		}
		total=cFijo+cVariablePico+cVariableResto+cVariableValle;
		return total;
	}

	/*		
	 ******************************************************************
	8-GENERAR FACTURA
	 ******************************************************************	*/		
	
	//8.1-FACTURA GRAN Y BAJA DEMANDA
	public Factura generarFactura(int mes, int anio, Medidor m) {
		Factura factura=new Factura();	
		LocalDate fecha=LocalDate.of(anio, mes, 10);
		factura.setFecha(fecha);
		factura.setDomicilio(m.getCliente().getDomicilio() );
		factura.setNroMedidor((int) m.getNroSerie());
		factura.setNroCliente(m.getCliente().getIdPersona());
		factura.setCliente(traerPersonaNombre(m.getCliente().getIdPersona()));
		factura.setObservaciones(m.getTarifa().getServicio());
		factura.setLstItemFactura(new ArrayList<ItemFactura>());//CON ESTE SET SE PUEDEN CARGAR LOS ITEMS A FACTURA

		if(m.getCliente() instanceof PersonaFisica) {
		//CONSUMO DEL CLIENTE BAJA DEMANDA--> KW		
		int consumoTotalKW=calcularConsumoKWBaja(mes,anio,m);

		//CARGO FIJO Y VARIABLE POR EL CONSUMO DE KW
		TarifaBaja t=traerTarifaBajaPorConsumo(consumoTotalKW);
		double cargoFijo=t.getLstDetalle().get(0).getValor();
		double cargoVariable=t.getLstDetalle().get(1).getValor();

		//AGREGADO DE ITEMS A LA FACTURA	
		factura.getLstItemFactura().add(new ItemFactura(1,"Cargo Fijo    ", "$/mes",consumoTotalKW,cargoFijo));
		factura.getLstItemFactura().add(new ItemFactura(2,"Cargo Variable", "$/kWh",consumoTotalKW,cargoVariable));

		}else {	 //////////////CLIENTE GRAN DEMANDA/////////////////////////

			//CONSUMO DEL CLIENTE GRAN DEMANDA-->KW
			LecturaAlta l=calcularConsumoKwAlta(mes, anio, m);
			int consumoKWPico=l.getConsumoHsPico();
			int consumoKWValle=l.getConsumoHsValle();
			int consumoKWResto=l.getConsumoHsResto();
			int consumoTotalKW=consumoKWPico+consumoKWValle+consumoKWResto;

			//CARGO FIJO Y CARGOS VARIABLES POR TENSION CONTRATADA Y SI KW>300 O 300<KW
			TarifaAlta t=traerTarifaAltaPorServicio(m.getTarifa().getServicio());
			double cFijo=t.getLstDetalle().get(0).getValor();
			double cVariablePico=t.getLstDetalle().get(1).getValor();
			double cVariableResto=t.getLstDetalle().get(2).getValor();
			double cVariableValle=t.getLstDetalle().get(3).getValor();
			
			//AGREGADO DE ITEMS A LA FACTURA 
			factura.getLstItemFactura().add(new ItemFactura(1,"Cargo Fijo         ", "$/mes",consumoTotalKW,cFijo));//TOTAL KW CONSUMIDOS
			factura.getLstItemFactura().add(new ItemFactura(2,"Cargo Variable Pico", "$/kWh",consumoKWPico,cVariablePico));//TOTAL KW PICO
			factura.getLstItemFactura().add(new ItemFactura(3,"Cargo Variable Resto", "$/kWh",consumoKWResto,cVariableResto));//TOTAL KW RESTO
			factura.getLstItemFactura().add(new ItemFactura(4,"Cargo Variable Valle", "$/kWh",consumoKWValle,cVariableValle));//TOTAL KW VALLE
		}
		return factura;	
}

	/*		
	 ******************************************************************
	9-REPORTE CONSUMO ENTRE FECHAS DE UN CLIENTE
	 ******************************************************************	*/	
	//9.1-REPORTE CONSUMO GRAN DEMANDA DEVUELVE LECTURA ALTA
	public LecturaAlta consumoKwhEntreFechasAlta(LocalDate f1, LocalDate f2, Persona cliente) {
		LecturaAlta lAlta= new LecturaAlta();
		Medidor m=traerMedidorPorCliente(cliente.getIdPersona());
		//Fecha1
		LecturaAlta l1=calcularConsumoKwAlta(f1.getMonthValue(), f1.getYear(), m);

		//Fecha2
		LecturaAlta l2=calcularConsumoKwAlta(f2.getMonthValue(), f2.getYear(), m);
		lAlta.setConsumoHsPico(l1.getConsumoHsPico()+l2.getConsumoHsPico());
		lAlta.setConsumoHsResto(l1.getConsumoHsResto()+l2.getConsumoHsResto());
		lAlta.setConsumoHsValle(l1.getConsumoHsValle()+l2.getConsumoHsValle());
		return lAlta;
	}

	//9.1-METODO SOBRECARGADO- CONSUMO GRAN DEMANDA DEVUELVE STRING
	public String consumoKwhEntreFechasAltaString(LocalDate f1, LocalDate f2, Persona cliente) {
		String resta="";
		LecturaAlta lAlta=consumoKwhEntreFechasAlta(f1,f2,cliente);
		resta="Consumo Total kWh= "+String.valueOf(lAlta.getConsumoHsPico()+lAlta.getConsumoHsValle()+lAlta.getConsumoHsResto())+"-->Consumo Pico: "+String.valueOf(lAlta.getConsumoHsPico())+"kW"+"--> Consumo Valle: "+String.valueOf(lAlta.getConsumoHsValle())+"kW"+"--> Consumo Resto: "+String.valueOf(lAlta.getConsumoHsResto())+"kW";
		return resta;
	}


	//9.2-REPORTE CONSUMO BAJA DEMANDA--NO CONTEMPLA LECTURAS DEL ANIO 2018	
	public int consumoKwhEntreFechasBaja(LocalDate f1, LocalDate f2, Persona cliente) {
		Medidor m=traerMedidorPorCliente(cliente.getIdPersona());
		int consumoF1=calcularConsumoKWBaja(f1.getMonthValue(), f1.getYear(),m);
		int consumoF2=calcularConsumoKWBaja(f2.getMonthValue(), f2.getYear(),m);
		int consumoKwh=consumoF2+consumoF1;				
		return consumoKwh;	
	}


	/*		
	 ******************************************************************
						FIN SISTEMA DISTRIBUIDORA
	 ******************************************************************	*/	




}//cierra el sistema


