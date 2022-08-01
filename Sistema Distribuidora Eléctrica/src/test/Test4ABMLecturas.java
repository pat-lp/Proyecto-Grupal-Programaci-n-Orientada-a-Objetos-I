package test;

import java.time.LocalDate;
import java.time.LocalTime;
import modelo.LecturaMedidor;
import modelo.Medidor;
import modelo.PersonaFisica;
import modelo.SistemaDistribuidora;
import modelo.Tarifa;
import modelo.Zona;
import modelo.LecturaAlta;
import modelo.LecturaBaja;

public class Test4ABMLecturas {

	public static void main(String[] args) {

		SistemaDistribuidora sistema = new SistemaDistribuidora();
		
		/* ******************************ZONAS************************************ */
		try {
			sistema.agregarZona(new Zona(1,"Zona: R1"));
			sistema.agregarZona(new Zona(2,"Zona: R2"));
			sistema.agregarZona(new Zona(3,"Zona: R3"));
			sistema.agregarZona(new Zona(4,"Zona: R4"));

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		/* ******************************TARIFAS************************************ */

		Tarifa t1 = new Tarifa("Tarifa alta");
		Tarifa t2 = new Tarifa("Tarifa baja");

		try{
			sistema.agregarTarifa(t1);
			sistema.agregarTarifa(t2);
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		/* ******************************CLIENTES************************************ */

		try {
			sistema.agregarPersonaFisica("Medrano 100",1111111L,"Roberto", "Benitez");	
			sistema.agregarPersonaFisica("Medrano 200",2222222L,"Silvio", "Portela");
			sistema.agregarPersonaFisica("Medrano 300",3333333L,"Andrés", "Rodriguez");
			sistema.agregarPersonaJuridica("Moreno 100",11111111111L,"Ikea S.A");
			sistema.agregarPersonaJuridica("Moreno 200",11111111112L,"Canon S.A");
			sistema.agregarPersonaJuridica("Moreno 300",11111111113L,"Pepsi S.A");
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		/* ******************************INSPECTOR************************************ */
		try {
			sistema.agregarInspector(new PersonaFisica("Juncal 100",3333333L,"Javier", "Ruiz Inspector"));
			sistema.agregarInspector(new PersonaFisica("Juncal 200",3333334L,"Miguel", "Diaz Inspector"));
			sistema.agregarInspector(new PersonaFisica("Juncal 300",3333335L,"Andres", "Garrido Inspector"));	
			
			sistema.traerInspector(1).agregarZonaAInspector(sistema.traerZona(1));
			sistema.traerInspector(2).agregarZonaAInspector(sistema.traerZona(2));
			sistema.traerInspector(3).agregarZonaAInspector(sistema.traerZona(1));

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}


		/* ******************************MEDIDOR************************************ */

		try {
			sistema.agregarMedidor(new Medidor(500000L, sistema.traerPersona(1),"Vieytes 1220", sistema.traerZona(1), sistema.traerTarifaPorServicio("Tarifa baja")));
			sistema.agregarMedidor(new Medidor(500001L, sistema.traerPersona(2),"Vieytes 1221",sistema.traerZona(2), sistema.traerTarifaPorServicio("Tarifa baja")));	
			sistema.agregarMedidor(new Medidor(500002L, sistema.traerPersona(3),"Vieytes 1222",sistema.traerZona(1), sistema.traerTarifaPorServicio("Tarifa baja")));	
			sistema.agregarMedidor(new Medidor(500003L, sistema.traerPersona(4),"Vieytes 1223", sistema.traerZona(4), sistema.traerTarifaPorServicio("Tarifa alta")));	
			sistema.agregarMedidor(new Medidor(500004L, sistema.traerPersona(5),"Vieytes 1224", sistema.traerZona(1), sistema.traerTarifaPorServicio("Tarifa alta")));	
			sistema.agregarMedidor(new Medidor(500005L, sistema.traerPersona(6),"Vieytes 1224", sistema.traerZona(2), sistema.traerTarifaPorServicio("Tarifa alta")));	

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		
		/* *****************************LECTURA ALTA************************************ */

		try {
			sistema.agregarLecturaMedidor(new LecturaAlta(1,LocalDate.of(2019,3,1), LocalTime.of(12, 30, 45),sistema.traerInspector(1),sistema.traerMedidor(500003L),200,32,5));	
			sistema.agregarLecturaMedidor(new LecturaAlta(2,LocalDate.of(2019,3,2), LocalTime.of(13, 30, 45),sistema.traerInspector(1),sistema.traerMedidor(500004L),240,32,5));	
			sistema.agregarLecturaMedidor(new LecturaAlta(3,LocalDate.of(2019,3,3), LocalTime.of(14, 30, 45),sistema.traerInspector(2),sistema.traerMedidor(500005L),180,20,5));	

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		/* *****************************LECTURA BAJA************************************ */

		try {
			sistema.agregarLecturaMedidor(new LecturaBaja(4,LocalDate.of(2019,3,1), LocalTime.of(12, 30, 45),sistema.traerInspector(1),sistema.traerMedidor(500000l),200));	
			sistema.agregarLecturaMedidor(new LecturaBaja(5,LocalDate.of(2019,3,2), LocalTime.of(13, 30, 45),sistema.traerInspector(2),sistema.traerMedidor(500001L),240));	
			sistema.agregarLecturaMedidor(new LecturaBaja(6,LocalDate.of(2019,3,3), LocalTime.of(14, 30, 45),sistema.traerInspector(3),sistema.traerMedidor(500002L),180));	
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n***********************************************************************");
		System.out.println("*******************AGREGAR LECTURA ALTA CON EXCEPCION******************");
		try {
			sistema.agregarLecturaMedidor(new LecturaAlta(1,LocalDate.of(2019,3,1), LocalTime.of(12, 30, 45),sistema.traerInspector(1),sistema.traerMedidor(500003L),200,32,5));	
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}
		
		System.out.println("\n***********************************************************************");
		System.out.println("*******************AGREGAR LECTURA BAJA CON EXCEPCION******************");
		try {
			sistema.agregarLecturaMedidor(new LecturaBaja(4,LocalDate.of(2019,3,1), LocalTime.of(12, 30, 45),sistema.traerInspector(1),sistema.traerMedidor(500000l),200));	
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}
		
		System.out.println("\n*********************************************************************");
		System.out.println("********************ELIMINAR LECTURA CON EXCEPCION*******************");
		try {
			System.out.println("Eliminar LECTURA MEDIDOR: "+sistema.eliminarLecturaMedidor(8));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*********************************************************************");
		System.out.println("********************ELIMINAR LECTURA SIN EXCEPCION*******************");
		try {
			System.out.println("Eliminar lectura medidor: "+sistema.eliminarLecturaMedidor(1));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}


		System.out.println("\n*********************************************************");
		System.out.println("********************MODIFICAR LECTURA********************");

		try {
			System.out.println("\nModificar Lectura Medidor Baja: "+sistema.modificarLecturaBaja(5,LocalDate.of(2019,3,2),  LocalTime.of(13, 30, 45),sistema.traerInspector(2),sistema.traerMedidor(500001l), 132));
			System.out.println("\nModificar Lectura Medidor Alta con Excepción");
			System.out.println("\nModificar Lectura Medidor Alta: "+sistema.modificarLecturaAlta(1, LocalDate.of(2019,3,2),  LocalTime.of(13, 30, 45), sistema.traerInspector(2), sistema.traerMedidor(500004l), 240,32,5));

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());

			
			System.out.println("\n******************************************************************************");
			System.out.println("**********************IMPRIMIR LECTURAS BAJA DEMANDA**************************");
			for(LecturaMedidor l: sistema.getLstLecturaMedidor()) {
				if(l instanceof LecturaBaja){
					System.out.println(((LecturaBaja) l).toString());
				}	
			}

			System.out.println("\n******************************************************************************");
			System.out.println("**********************IMPRIMIR LECTURAS ALTA DEMANDA**************************");
			for(LecturaMedidor a: sistema.getLstLecturaMedidor()) {
				if(a instanceof LecturaAlta){
					System.out.println(((LecturaAlta) a).toString());
				}
			}
		}


	}
}

