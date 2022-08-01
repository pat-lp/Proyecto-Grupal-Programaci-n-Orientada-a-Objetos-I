package test;


import modelo.Medidor;
import modelo.SistemaDistribuidora;
import modelo.Tarifa;
import modelo.Zona;

public class Test3ABMMedidores {

	public static void main(String[] args) {

		SistemaDistribuidora sistema = new SistemaDistribuidora();

		/* ******************************TARIFA************************************ */
		Tarifa t1 = new Tarifa("Tarifa alta");
		Tarifa t2 = new Tarifa("Tarifa baja");

		try{
			sistema.agregarTarifa(t1);
			sistema.agregarTarifa(t2);
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		/* ******************************AGREGAR CLIENTES************************************ */
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

		/* ******************************AGREGAR ZONAS************************************ */
		Zona zona1=new Zona(1,"Zona: R1");
		Zona zona2=new Zona(2,"Zona: R2");
		Zona zona3=new Zona(3,"Zona: R3");
		Zona zona4=new Zona(4,"Zona: R4");
		Zona zona5=new Zona(5,"Zona: R5");
		Zona zona6=new Zona(6,"Zona: R6");
		Zona zona7=new Zona(7,"Zona: R7");
		Zona zona8=new Zona(8,"Zona: R8");
		Zona zona9=new Zona(9,"Zona: R9");
	
		try {

			sistema.agregarZona(zona1);	
			sistema.agregarZona(zona2);
			sistema.agregarZona(zona3);	
			sistema.agregarZona(zona4);		
			sistema.agregarZona(zona5);		
			sistema.agregarZona(zona6);	
			sistema.agregarZona(zona7);	
			sistema.agregarZona(zona8);	
			sistema.agregarZona(zona9);
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		/* ******************************AGREGAR MEDIDOR************************************ */

		try {
			sistema.agregarMedidor(new Medidor(500000L, sistema.traerPersona(1), "Florida 100", sistema.traerZona(1), sistema.traerTarifaPorServicio("Tarifa baja")));
			sistema.agregarMedidor(new Medidor(500001L, sistema.traerPersona(2), "Florida 200", sistema.traerZona(1), sistema.traerTarifaPorServicio("Tarifa baja")));	
			sistema.agregarMedidor(new Medidor(500002L, sistema.traerPersona(3), "Florida 300", sistema.traerZona(1), sistema.traerTarifaPorServicio("Tarifa baja")));	
			sistema.agregarMedidor(new Medidor(500003L, sistema.traerPersona(4), "Florida 400", sistema.traerZona(2), sistema.traerTarifaPorServicio("Tarifa alta")));	
			sistema.agregarMedidor(new Medidor(500004L, sistema.traerPersona(5), "Florida 500", sistema.traerZona(2), sistema.traerTarifaPorServicio("Tarifa alta")));	
			sistema.agregarMedidor(new Medidor(500005L, sistema.traerPersona(6), "Florida 600", sistema.traerZona(2), sistema.traerTarifaPorServicio("Tarifa alta")));

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n********************************************************************");
		System.out.println("********************AGREGAR MEDIDOR CON EXCEPCION*******************");
		try {
			sistema.agregarMedidor(new Medidor(500000L, sistema.traerPersona(1), "29 de Septiembre 1200", sistema.traerZona(1), sistema.traerTarifaPorServicio("Servicio1TarifaBaja")));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*********************************************************************");
		System.out.println("********************ELIMINAR MEDIDOR SIN EXCEPCION*******************");
		try {
			System.out.println("Eliminar medidor: "+sistema.eliminarMedidor(500005L));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*********************************************************************");
		System.out.println("********************ELIMINAR MEDIDOR CON EXCEPCION*******************");
		try {
			System.out.println("Eliminar medidor: "+sistema.eliminarMedidor(5555555L));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n**********************************************************************");
		System.out.println("********************MODIFICAR MEDIDOR SIN EXCEPCION*******************");
		try {
			System.out.println("Modifica medidor: "+sistema.modificarMedidor(500000L, sistema.traerPersona(1), "9 de Julio 400", sistema.traerZona(1), sistema.traerTarifaPorServicio("Tarifa baja")));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*********************************************************************");
		System.out.println("********************ELIMINAR MEDIDOR CON EXCEPCION*******************");	
		try {
			System.out.println("Modifica medidor: "+sistema.modificarMedidor(5555555L, sistema.traerPersona(1), "9 de Julio 400", sistema.traerZona(1), sistema.traerTarifaPorServicio("Servicio1TarifaBaja")));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n******************************************************************");
		System.out.println("**********************IMPRIMIR MEDIDORES**************************");
		System.out.println(sistema.getLstMedidor());

	


	}

}
