package test;

import modelo.SistemaDistribuidora;

public class Test1ABMClientes {

	public static void main(String[] args) {


		SistemaDistribuidora sistema = new SistemaDistribuidora();


		/* ******************************CLIENTES************************************ */
	 
		System.out.println("\n*****************************************************************");
		System.out.println("**********************AGREGAR CLIENTE****************************");
		System.out.println("************************BAJA DEMANDA****************************");
	
		try {
			sistema.agregarPersonaFisica("Medrano 100",1111111L,"Roberto", "Benitez");	
			sistema.agregarPersonaFisica("Medrano 200",2222222L,"Silvio", "Portela");
			sistema.agregarPersonaFisica("Medrano 300",3333333L,"Andrés", "Rodriguez");
			sistema.agregarPersonaFisica("Medrano 400",4444444L,"Rodrigo", "Martinez");	
			sistema.agregarPersonaFisica("Medrano 500",5555555L,"Martín", "Lopez");
			sistema.agregarPersonaFisica("Medrano 600",6666666L,"José", "Garcia");
			sistema.agregarPersonaFisica("Medrano 700",7777777L,"Marcela", "Sanchez");	
			sistema.agregarPersonaFisica("Medrano 800",8888888L,"Roxana", "Navarro");
			sistema.agregarPersonaFisica("Medrano 900",9999999L,"Romina", "Ruiz");
			sistema.agregarPersonaFisica("Medrano 1000",9999999L,"Leandro", "Serrano");

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*****************************************************************");
		System.out.println("**********************ELIMINAR CLIENTE***************************");
	
		try {
			System.out.println("Eliminar cliente: "+sistema.eliminarCliente(3));
			System.out.println("Eliminar cliente: "+sistema.eliminarCliente(7));
			System.out.println("Eliminar cliente: "+sistema.eliminarCliente(10));
			System.out.println("Eliminar cliente: "+sistema.eliminarCliente(52));
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}


		System.out.println("\n*****************************************************************");
		System.out.println("**********************AGREGAR CLIENTE****************************");
		System.out.println("************************GRAN DEMANDA****************************");
		try {
			sistema.agregarPersonaJuridica("Moreno 100",11111111111L,"Ikea S.A");
			sistema.agregarPersonaJuridica("Moreno 200",11111111112L,"Canon S.A");
			sistema.agregarPersonaJuridica("Moreno 300",11111111113L,"Pepsi S.A");
			sistema.agregarPersonaJuridica("Moreno 400",11111111114L,"Coca-Cola S.A");
			sistema.agregarPersonaJuridica("Moreno 500",11111111115L,"Reebok S.R.L");
			sistema.agregarPersonaJuridica("Moreno 600",11111111116L,"Lego S.A");
			sistema.agregarPersonaJuridica("Moreno 700",11111111117L,"Adidas S.A");
			sistema.agregarPersonaJuridica("Moreno 800",11111111118L,"Sony S.A");
			sistema.agregarPersonaJuridica("Moreno 900",11111111119L,"Alcatel S.A");
			sistema.agregarPersonaJuridica("Moreno 1000",11111111119L,"Movistar S.A");

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}
		
		System.out.println("\n*****************************************************************");
		System.out.println("**********************MODIFICAR CLIENTE***************************");
		
		try {				
			System.out.println("Modificar cliente:"+sistema.modificarPersonaFisica(2, "Acevedo 345",2222222L,"Julio", "Jimenez"));		
			System.out.println("Modificar cliente:"+sistema.modificarPersonaJuridica(16, "Acevedo 346", 11111111118L, "Personal S.A"));	
			System.out.println("Modificar cliente:"+sistema.modificarPersonaJuridica(19,"Acevedo 347", 11111111116L, "Tarjeta Naranja S.R.L"));	

		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}

		System.out.println("\n*****************************************************************");
		System.out.println("**********************IMPRIMIR CLIENTES***************************");
		System.out.println(sistema.getLstCliente());
		
	}

}

