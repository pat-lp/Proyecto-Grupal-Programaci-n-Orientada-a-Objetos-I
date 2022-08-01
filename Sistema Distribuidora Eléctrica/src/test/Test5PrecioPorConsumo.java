package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.DetalleAlta;
import modelo.DetalleBaja;
import modelo.Funciones;
import modelo.LecturaAlta;
import modelo.LecturaBaja;
import modelo.Medidor;
import modelo.PersonaFisica;
import modelo.SistemaDistribuidora;
import modelo.TarifaAlta;
import modelo.TarifaBaja;
import modelo.Zona;

public class Test5PrecioPorConsumo {

	public static void main(String[] args) throws Exception {

		SistemaDistribuidora s = new SistemaDistribuidora();
	
		/* ******************************CLIENTES************************************ */
		try {
			s.agregarPersonaFisica("Medrano 100",1111111L,"Roberto", "Benitez");	
			s.agregarPersonaFisica("Medrano 200",2222222L,"Silvio", "Portela");
				
			s.agregarPersonaJuridica("Moreno 100",11111111111L,"Ikea S.A");
			s.agregarPersonaJuridica("Moreno 200",11111111112L,"Canon S.A");
					
		} catch (Exception e) {			
			System.out.println("Exception :"+e.getMessage());
		}	
		
		/* ******************************TARIFAS************************************ */

		try {
			/* ******************************TARIFA BAJA************************************ */
			s.agregarTarifa(new TarifaBaja("T1-R1"));
			s.traerTarifaBajaPorServicio("T1-R1").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",0,150,32.82));
			s.traerTarifaBajaPorServicio("T1-R1").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",0,150,2.653));
		
			s.agregarTarifa(new TarifaBaja("T1-R2"));
			s.traerTarifaBajaPorServicio("T1-R2").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",151,325,56.11));
			s.traerTarifaBajaPorServicio("T1-R2").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",151,325,2.651));
		
			s.agregarTarifa(new TarifaBaja("T1-R3"));
			s.traerTarifaBajaPorServicio("T1-R3").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",326,400,91.73));
			s.traerTarifaBajaPorServicio("T1-R3").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",326,400,2.705));
			
			s.agregarTarifa(new TarifaBaja("T1-R4"));
			s.traerTarifaBajaPorServicio("T1-R4").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",401,450,107.34));
			s.traerTarifaBajaPorServicio("T1-R4").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",401,450,2.785));
		

			s.agregarTarifa(new TarifaBaja("T1-R5"));
			s.traerTarifaBajaPorServicio("T1-R5").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",451,500,161.66));
			s.traerTarifaBajaPorServicio("T1-R5").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",451,500,2.864));

			s.agregarTarifa(new TarifaBaja("T1-R6"));
			s.traerTarifaBajaPorServicio("T1-R6").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",501,600,316.00));
			s.traerTarifaBajaPorServicio("T1-R6").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",501,600,2.918));

			s.agregarTarifa(new TarifaBaja("T1-R7"));
			s.traerTarifaBajaPorServicio("T1-R7").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",601,700,850.24));
			s.traerTarifaBajaPorServicio("T1-R7").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",601,700,3.309));

			s.agregarTarifa(new TarifaBaja("T1-R8"));
			s.traerTarifaBajaPorServicio("T1-R8").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",701,1400,1203.64));
			s.traerTarifaBajaPorServicio("T1-R8").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",701,1400,3.411));

			s.agregarTarifa(new TarifaBaja("T1-R9"));
			s.traerTarifaBajaPorServicio("T1-R9").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",1401,10000,1442.88));
			s.traerTarifaBajaPorServicio("T1-R9").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",1401,-1,3.437));
			
			/* ******************************TARIFA ALTA DEMANDA <300kW*********************************** */
			s.agregarTarifa(new TarifaAlta("TA-BT1","BT<300kW")); 
			s.traerTarifaAltaPorServicio("TA-BT1").agregarDetalle(new DetalleAlta("Cargo Fijo", "$/mes", 300, false, 3226.41));
			s.traerTarifaAltaPorServicio("TA-BT1").agregarDetalle(new DetalleAlta("Cargo Variable Pico", "$/kWh", 300, false, 2.260));
			s.traerTarifaAltaPorServicio("TA-BT1").agregarDetalle(new DetalleAlta("Cargo Variable Resto", "$/kWh", 300, false, 2.160));
			s.traerTarifaAltaPorServicio("TA-BT1").agregarDetalle(new DetalleAlta("Cargo Variable Valle", "$/kWh", 300, false, 2.061));

			s.agregarTarifa(new TarifaAlta("TA-MT1","MT<300kW"));
			s.traerTarifaAltaPorServicio("TA-MT1").agregarDetalle(new DetalleAlta("Cargo Fijo", "$/mes", 300, false, 3226.09));
			s.traerTarifaAltaPorServicio("TA-MT1").agregarDetalle(new DetalleAlta("Cargo Variable Pico", "$/kWh", 300, false, 2.148));
			s.traerTarifaAltaPorServicio("TA-MT1").agregarDetalle(new DetalleAlta("Cargo Variable Resto", "$/kWh", 300, false, 2.053));
			s.traerTarifaAltaPorServicio("TA-MT1").agregarDetalle(new DetalleAlta("Cargo Variable Valle", "$/kWh", 300, false, 1.959));

			
			s.agregarTarifa(new TarifaAlta("TA-AT1","AT<300kW"));
			s.traerTarifaAltaPorServicio("TA-AT1").agregarDetalle(new DetalleAlta("Cargo Fijo", "$/mes", 300, false, 3224.11));
			s.traerTarifaAltaPorServicio("TA-AT1").agregarDetalle(new DetalleAlta("Cargo Variable Pico", "$/kWh", 300, false, 2.060));
			s.traerTarifaAltaPorServicio("TA-AT1").agregarDetalle(new DetalleAlta("Cargo Variable Resto", "$/kWh", 300, false, 1.969));
			s.traerTarifaAltaPorServicio("TA-AT1").agregarDetalle(new DetalleAlta("Cargo Variable Valle", "$/kWh", 300, false, 1.879));

			/* ******************************TARIFA ALTA DEMANDA >300kW*********************************** */
			s.agregarTarifa(new TarifaAlta("TA-BT2","BT>300kW"));
			s.traerTarifaAltaPorServicio("TA-BT2").agregarDetalle(new DetalleAlta("Cargo Fijo", "$/mes", -1, false, 3226.41));
			s.traerTarifaAltaPorServicio("TA-BT2").agregarDetalle(new DetalleAlta("Cargo Variable Pico", "$/kWh", -1, false, 3.281));
			s.traerTarifaAltaPorServicio("TA-BT2").agregarDetalle(new DetalleAlta("Cargo Variable Resto", "$/kWh", -1, false, 3.138));
			s.traerTarifaAltaPorServicio("TA-BT2").agregarDetalle(new DetalleAlta("Cargo Variable Valle", "$/kWh", -1, false, 2.990));

			s.agregarTarifa(new TarifaAlta("TA-MT2","MT>300kW"));
			s.traerTarifaAltaPorServicio("TA-MT2").agregarDetalle(new DetalleAlta("Cargo Fijo", "$/mes", -1, false, 3226.09));
			s.traerTarifaAltaPorServicio("TA-MT2").agregarDetalle(new DetalleAlta("Cargo Variable Pico", "$/kWh", -1, false, 3.123));
			s.traerTarifaAltaPorServicio("TA-MT2").agregarDetalle(new DetalleAlta("Cargo Variable Resto", "$/kWh", -1, false, 2.983));
			s.traerTarifaAltaPorServicio("TA-MT2").agregarDetalle(new DetalleAlta("Cargo Variable Valle", "$/kWh", -1, false, 2.841));

			s.agregarTarifa(new TarifaAlta("TA-AT2","AT>300kW"));
			s.traerTarifaAltaPorServicio("TA-AT2").agregarDetalle(new DetalleAlta("Cargo Fijo", "$/mes", -1, false, 3224.11));
			s.traerTarifaAltaPorServicio("TA-AT2").agregarDetalle(new DetalleAlta("Cargo Variable Pico", "$/kWh", -1, false, 2.995));
			s.traerTarifaAltaPorServicio("TA-AT2").agregarDetalle(new DetalleAlta("Cargo Variable Resto", "$/kWh", -1, false, 2.860));
			s.traerTarifaAltaPorServicio("TA-AT2").agregarDetalle(new DetalleAlta("Cargo Variable Valle", "$/kWh", -1, false, 2.725));
		} catch (Exception e) {		
			System.out.println("Exception :"+e.getMessage());
		}

		/* ******************************ZONA************************************ */
		try {
		s.agregarZona(new Zona(1,"Zona: R1"));
		s.agregarZona(new Zona(2,"Zona: R2"));
		s.agregarZona(new Zona(3,"Zona: R3"));
		s.agregarZona(new Zona(4,"Zona: R4"));
		}catch(Exception e) {
			System.out.println("Exception :"+e.getMessage());
		}

		/* ******************************INSPECTOR************************************ */
		try {
			s.agregarInspector(new PersonaFisica("Juncal 100",3333333L,"Javier", "Ruiz Inspector"));
			s.agregarInspector(new PersonaFisica("Juncal 200",3333334L,"Miguel", "Diaz Inspector"));
			s.agregarInspector(new PersonaFisica("Juncal 300",3333335L,"Andres", "Garrido Inspector"));	

		s.traerZona(1).agregarInspectorAZona(s.traerInspector(1));
		s.traerZona(2).agregarInspectorAZona(s.traerInspector(2));
		s.traerZona(3).agregarInspectorAZona(s.traerInspector(3));
		}catch(Exception e) {
			System.out.println("Exception :"+e.getMessage());
		}

		/* ******************************MEDIDOR ALTA DEMANDA************************************ */
		try {		
			s.agregarMedidor(new Medidor(500000L, s.traerPersona(3),"Vieytes 1220", s.traerZona(1), s.traerTarifaAltaPorServicio("TA-BT1")));
			s.agregarMedidor(new Medidor(500001L, s.traerPersona(4),"Vieytes 1220", s.traerZona(1), s.traerTarifaAltaPorServicio("TA-MT2")));	
		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());
		}
		
		/* ******************************MEDIDOR BAJA DEMANDA*********************************** */
		try {
			s.agregarMedidor(new Medidor(800000L, s.traerPersona(1),"Vieytes 1222",s.traerZona(3), s.traerTarifaBajaPorServicio("T1-R2")));
			s.agregarMedidor(new Medidor(800001L, s.traerPersona(2),"Vieytes 1223", s.traerZona(4), s.traerTarifaBajaPorServicio("T1-R4")));		
		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());			
		}	
		
		/* ******************************AGREGAR LECTURA ALTA************************************ */
		try {
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,9,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),116,62,9));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,11,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),152,97,14));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,1,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),200,132,20));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,3,2), LocalTime.of(13, 30),s.traerInspector(2),s.traerMedidor(500000L),245,222,26));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,5,3), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),455,332,31));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,1,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),100,132,5));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,3,2), LocalTime.of(13, 30),s.traerInspector(2),s.traerMedidor(500001L),311,333,26));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,5,3), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),524,571,41));	
		
			/* ******************************AGREGAR LECTURA BAJA************************************ */
		
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,7,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),51));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,9,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),103));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,11,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),152));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,1,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),200));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,3,2), LocalTime.of(13, 30),s.traerInspector(2),s.traerMedidor(800000L),240));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,5,3), LocalTime.of(13, 30),s.traerInspector(3),s.traerMedidor(800000L),280));				
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,1,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),200));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,3,3), LocalTime.of(13, 30),s.traerInspector(2),s.traerMedidor(800001L),540));			
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,5,3), LocalTime.of(13, 30),s.traerInspector(2),s.traerMedidor(800001L),580));			

		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());	
		}	

		/* ******************************PRECIO************************************ */

		
		System.out.println("\n*******************************************************");
		System.out.println("*******************PRECIO POR CONSUMO******************");
		
		//MEDIDOR BAJA-->MES=2--> CAMBIO DE AÑO EN LA LECTURA IMPAR ANTERIOR
		System.out.println("CLIENTE BAJA DEMANDA Nro. 1, NRO MEDIDOR: 800000-->Mes=2, con lectura anterior 2018");
		System.out.println("------------------------------------------------------");
		System.out.println("Medidor Nro= "+s.traerMedidorPorCliente(1).getNroSerie());
		System.out.println("Fecha: "+Funciones.traerFechaCorta(LocalDate.of(2019, 2, 10)));
		System.out.println("Consumo: "  +s.calcularConsumoKWBaja(LocalDate.of(2019, 2, 10),s.traerMedidor(800000L))+"kWh"); 
		System.out.println("Tarifa: "+s.traerTarifaBajaPorConsumo(s.calcularConsumoKWBaja(LocalDate.of(2019, 2, 10),s.traerMedidor(800000L))));
		System.out.println("------------------------------------------------------");
		System.out.println("Total a Pagar Bimestral: $"+Funciones.aproximar2Decimal(s.calcularTotalPorConsumo(s.calcularConsumoKWBaja(LocalDate.of(2019, 2, 10),s.traerMedidor(800000L)))));
		
		System.out.println("\n\n");
		
		//MEDIDOR BAJA-->MES=1--> CAMBIO DE AÑO EN LA LECTURA IMPAR ANTERIOR
		System.out.println("CLIENTE BAJA DEMANDA Nro. 1, NRO MEDIDOR: 800000-->Mes=1, con lectura anterior 2018");
		System.out.println("------------------------------------------------------");
		System.out.println("Medidor Nro= "+s.traerMedidorPorCliente(1).getNroSerie());
		System.out.println("Fecha: "+Funciones.traerFechaCorta(LocalDate.of(2019,1 , 10)));
		System.out.println("Consumo: "  +s.calcularConsumoKWBaja(LocalDate.of(2019,1 , 10),s.traerMedidor(800000L))+"kWh"); 
		System.out.println("Tarifa: "+s.traerTarifaBajaPorConsumo(s.calcularConsumoKWBaja(LocalDate.of(2019, 1, 10),s.traerMedidor(800000L))));
		System.out.println("------------------------------------------------------");
		System.out.println("Total a Pagar Bimestral: $"+Funciones.aproximar2Decimal(s.calcularTotalPorConsumo(s.calcularConsumoKWBaja(LocalDate.of(2019, 1, 10),s.traerMedidor(800000L)))));
		
		System.out.println("\n\n");
		
		System.out.println("CLIENTE BAJA DEMANDA Nro. 1, NRO MEDIDOR: 800000");
		System.out.println("------------------------------------------------------");
		System.out.println("Medidor Nro= "+s.traerMedidorPorCliente(1).getNroSerie());
		System.out.println("Fecha: "+Funciones.traerFechaCorta(LocalDate.of(2019, 4, 10)));
		System.out.println("Consumo: "  +s.calcularConsumoKWBaja(LocalDate.of(2019, 4, 10),s.traerMedidor(800000L))+"kWh"); 
		System.out.println("Tarifa: "+s.traerTarifaBajaPorConsumo(s.calcularConsumoKWBaja(LocalDate.of(2019, 4, 10),s.traerMedidor(800000L))));
		System.out.println("------------------------------------------------------");
		System.out.println("Total a Pagar Bimestral: $"+Funciones.aproximar2Decimal(s.calcularTotalPorConsumo(s.calcularConsumoKWBaja(LocalDate.of(2019, 4, 10),s.traerMedidor(800000L)))));
		
		System.out.println("\n\n");
		
		System.out.println("CLIENTE BAJA DEMANDA Nro. 2, NRO MEDIDOR: 800001\n");
		System.out.println("------------------------------------------------------");
		System.out.println("Medidor Nro= "+s.traerMedidorPorCliente(2).getNroSerie());
		System.out.println("Fecha: "+Funciones.traerFechaCorta(LocalDate.of(2019, 3, 10)));
		System.out.println("Consumo: "  +s.calcularConsumoKWBaja(LocalDate.of(2019, 3, 10),s.traerMedidor(800001L))+"kWh"); 
		System.out.println("Tarifa: "+s.traerTarifaBajaPorConsumo(s.calcularConsumoKWBaja(LocalDate.of(2019, 3, 10),s.traerMedidor(800001L))));
		System.out.println("------------------------------------------------------");
		System.out.println("Total a Pagar Bimestral: $"+Funciones.aproximar2Decimal(s.calcularTotalPorConsumo(s.calcularConsumoKWBaja(LocalDate.of(2019, 3, 10),s.traerMedidor(800001L)))));
		
		System.out.println("\n\n");
		//******************************GRAN DEMANDA**********************************//
		//MEDIDOR ALTA
		System.out.println("CLIENTE GRAN DEMANDA Nro. 1, NRO. MEDIDOR: 500000-->Mes=2, con lectura anterior 2018");
		System.out.println("------------------------------------------------------");
		System.out.println("Medidor Nro= "+s.traerMedidorPorCliente(3).getNroSerie());
		System.out.println("Fecha: "+Funciones.traerFechaCorta(LocalDate.of(2019, 2, 10)));
		System.out.println("Consumo: "  +s.calcularConsumoKwAltaString(LocalDate.of(2019, 2, 10),s.traerMedidorPorCliente(3))); 
		System.out.println("Tarifa: "+s.traerTarifaAltaPorServicio(s.traerMedidor(500000L).getTarifa().getServicio()));
		System.out.println("------------------------------------------------------");
		System.out.println("Total a Pagar Bimestral: $"+Funciones.aproximar2Decimal(s.calcularTotalTarifaAlta(LocalDate.of(2019, 2, 10), s.traerMedidorPorCliente(3))));
		
		System.out.println("\n\n");
		
		System.out.println("CLIENTE GRAN DEMANDA Nro. 1, NRO. MEDIDOR: 500000-->Mes=1, con lectura anterior 2018");
		System.out.println("------------------------------------------------------");
		System.out.println("Medidor Nro= "+s.traerMedidorPorCliente(3).getNroSerie());
		System.out.println("Fecha: "+Funciones.traerFechaCorta(LocalDate.of(2019, 1, 10)));
		System.out.println("Consumo: "  +s.calcularConsumoKwAltaString(LocalDate.of(2019, 1, 10),s.traerMedidorPorCliente(3))); 
		System.out.println("Tarifa: "+s.traerTarifaAltaPorServicio(s.traerMedidor(500000L).getTarifa().getServicio()));
		System.out.println("------------------------------------------------------");
		System.out.println("Total a Pagar Bimestral: $"+Funciones.aproximar2Decimal(s.calcularTotalTarifaAlta(LocalDate.of(2019, 1, 10), s.traerMedidorPorCliente(3))));
		
		System.out.println("\n\n");
		
		System.out.println("CLIENTE GRAN DEMANDA Nro. 2, NRO MEDIDOR: 500001");
		System.out.println("------------------------------------------------------");
		System.out.println("Medidor Nro= "+s.traerMedidorPorCliente(4).getNroSerie());
		System.out.println("Fecha: "+Funciones.traerFechaCorta(LocalDate.of(2019, 4, 10)));
		System.out.println("Consumo: "+s.calcularConsumoKwAltaString(LocalDate.of(2019, 4, 10), s.traerMedidorPorCliente(4)));
		System.out.println("Tarifa: "+s.traerTarifaAltaPorServicio(s.traerMedidor(500001L).getTarifa().getServicio()));
		System.out.println("------------------------------------------------------");
		System.out.println("Total a Pagar Bimestral: $"+Funciones.aproximar2Decimal(s.calcularTotalTarifaAlta(LocalDate.of(2019, 4, 10), s.traerMedidorPorCliente(4))));
		
		//DEVUELVE LA CLASE LecturaAlta con el seteo de los valores del consumo
		System.out.println("Consumo: "+s.calcularConsumoKwAlta(4,2019, s.traerMedidorPorCliente(4))); 

		
	}

}
