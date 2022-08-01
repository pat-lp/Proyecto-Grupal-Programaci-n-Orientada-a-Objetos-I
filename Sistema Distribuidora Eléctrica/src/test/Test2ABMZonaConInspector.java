package test;

import modelo.PersonaFisica;
import modelo.SistemaDistribuidora;
import modelo.Zona;

public class Test2ABMZonaConInspector {

	public static void main(String[] args) {

		SistemaDistribuidora sistema = new SistemaDistribuidora();


		/* ******************************AGREGAR INSPECTOR************************************ */
		try {
			sistema.agregarInspector(new PersonaFisica("Juncal 100",3333333L,"Javier", "Ruiz Inspector"));
			sistema.agregarInspector(new PersonaFisica("Juncal 200",3333334L,"Miguel", "Diaz Inspector"));
			sistema.agregarInspector(new PersonaFisica("Juncal 300",3333335L,"Andres", "Garrido Inspector"));	
			sistema.agregarInspector(new PersonaFisica("Juncal 400",3333336L,"Fernando", "Ortega Inspector"));
			sistema.agregarInspector(new PersonaFisica("Juncal 500",3333337L,"Ramon", "Torres Inspector"));
			sistema.agregarInspector(new PersonaFisica("Juncal 600",3333338L,"Francisco", "Alarcon Inspector"));
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
			sistema.traerZona(zona1).agregarInspectorAZona(sistema.traerInspector(1));
			sistema.traerZona(zona1).agregarInspectorAZona(sistema.traerInspector(2));

			sistema.agregarZona(zona2);
			sistema.traerZona(zona2).agregarInspectorAZona(sistema.traerInspector(4));
			sistema.traerZona(zona2).agregarInspectorAZona(sistema.traerInspector(2));

			sistema.agregarZona(zona3);
			sistema.traerZona(zona3).agregarInspectorAZona(sistema.traerInspector(5));
			sistema.traerZona(zona3).agregarInspectorAZona(sistema.traerInspector(6));

			sistema.agregarZona(zona4);	
			sistema.traerZona(zona4).agregarInspectorAZona(sistema.traerInspector(2));

			sistema.agregarZona(zona5);		
			sistema.traerZona(zona5).agregarInspectorAZona(sistema.traerInspector(6));

			sistema.agregarZona(zona6);	
			sistema.traerZona(zona6).agregarInspectorAZona(sistema.traerInspector(4));

			sistema.agregarZona(zona7);	
			sistema.traerZona(zona7).agregarInspectorAZona(sistema.traerInspector(3));

			sistema.agregarZona(zona8);	
			sistema.traerZona(zona8).agregarInspectorAZona(sistema.traerInspector(4));

			sistema.agregarZona(zona9);
			sistema.traerZona(zona9).agregarInspectorAZona(sistema.traerInspector(4));
			sistema.traerZona(zona9).agregarInspectorAZona(sistema.traerInspector(3));

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}


		System.out.println("\n*****************************************************************");
		System.out.println("********************AGREGAR ZONA CON EXCEPCION*******************");
		try {
			sistema.agregarZona(zona2);
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*****************************************************************");
		System.out.println("******************ELIMINAR ZONA SIN EXCEPCION********************");

		try {
			System.out.println("Eliminar zona: "+sistema.eliminarZona(2));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*****************************************************************");
		System.out.println("******************ELIMINAR ZONA CON EXCEPCION********************");
		try {
			System.out.println("Eliminar zona: "+sistema.eliminarZona(31));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*****************************************************************");
		System.out.println("******************MODIFICAR ZONA SIN EXCEPCION*******************");
		try {
			System.out.println("Modifico zona: "+sistema.modificarZona(1, "ZONA 1 MODIFICADA"));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*****************************************************************");
		System.out.println("*******************MODIFICAR ZONA CON EXCEPCION******************");
		try {
			System.out.println("Modifico zona: "+sistema.modificarZona(11, "ZONA INEXISTENTE"));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n**************************************************************");
		System.out.println("**********************IMPRIMIR ZONAS**************************");
		for(Zona z: sistema.getLstZona()) {
			System.out.println(z.toString());
		}

	}

}



