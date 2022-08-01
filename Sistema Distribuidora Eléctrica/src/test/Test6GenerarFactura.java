package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.DetalleAlta;
import modelo.DetalleBaja;
import modelo.LecturaAlta;
import modelo.LecturaBaja;
import modelo.Medidor;
import modelo.PersonaFisica;
import modelo.SistemaDistribuidora;
import modelo.TarifaAlta;
import modelo.TarifaBaja;
import modelo.Zona;

public class Test6GenerarFactura {

	public static void main(String[] args) {


		SistemaDistribuidora s=new SistemaDistribuidora();

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
			s.agregarInspector(new PersonaFisica("Juncal 400",3333336L,"Julio", "Serrano Inspector"));		

			s.traerZona(1).agregarInspectorAZona(s.traerInspector(1));
			s.traerZona(1).agregarInspectorAZona(s.traerInspector(2));
			s.traerZona(1).agregarInspectorAZona(s.traerInspector(3));
			s.traerZona(2).agregarInspectorAZona(s.traerInspector(1));
			s.traerZona(2).agregarInspectorAZona(s.traerInspector(2));
			s.traerZona(2).agregarInspectorAZona(s.traerInspector(4));
			s.traerZona(3).agregarInspectorAZona(s.traerInspector(1));
			s.traerZona(4).agregarInspectorAZona(s.traerInspector(3));
			s.traerZona(4).agregarInspectorAZona(s.traerInspector(4));
		}catch(Exception e) {
			System.out.println("Exception :"+e.getMessage());
		}	

		/* ******************************MEDIDOR BAJA************************************ */
		try {
			s.agregarMedidor(new Medidor(800000L, s.traerPersona(1),"Vieytes 1222",s.traerZona(1), s.traerTarifaBajaPorServicio("T1-R2")));
			s.agregarMedidor(new Medidor(800001L, s.traerPersona(2),"Vieytes 1223", s.traerZona(2), s.traerTarifaBajaPorServicio("T1-R3")));	
		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());

		}	

		/* ******************************MEDIDOR ALTA************************************ */
		try {			
			s.agregarMedidor(new Medidor(500000L, s.traerPersona(3),"Vieytes 1220", s.traerZona(1), s.traerTarifaAltaPorServicio("TA-BT1")));
			s.agregarMedidor(new Medidor(500001L, s.traerPersona(4),"Vieytes 1220", s.traerZona(1), s.traerTarifaAltaPorServicio("TA-BT2")));

		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());
		}

		/* ******************************LECTURAS************************************ */
		try {
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,9,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),121,20,5));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,11,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),283,22,12));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,1,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),407,28,15));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,3,2), LocalTime.of(12, 40),s.traerInspector(2),s.traerMedidor(500000L),649,31,17));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,5,3), LocalTime.of(12, 50),s.traerInspector(1),s.traerMedidor(500000L),810,34,29));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,7,4), LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500000L),1052,47,43));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,9,1), LocalTime.of(12, 32),s.traerInspector(1),s.traerMedidor(500000L),1275,59,71));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,11,2), LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500000L),1484,66,90));

		
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,9,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),82,132,5));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,11,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),91,202,9));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,1,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),109,232,15));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,3,1),  LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500001L),315,431,32));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,5,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),628,630,54));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,7,1),  LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500001L),807,825,79));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,9,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),1014,1077,96));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,11,1),  LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500001L),1210,1239,103));			

			
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,9,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),63));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,11,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),181));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,1,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),390));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,3,2), LocalTime.of(12, 40),s.traerInspector(2),s.traerMedidor(800000L),599));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,5,3), LocalTime.of(12, 50),s.traerInspector(3),s.traerMedidor(800000L),715));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,7,4), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),978));
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,9,1), LocalTime.of(12, 35),s.traerInspector(1),s.traerMedidor(800000L),1122));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,11,2), LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(800000L),1347));	

			
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,11,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),84));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,1,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),355));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,3,2), LocalTime.of(12, 40),s.traerInspector(2),s.traerMedidor(800001L),697));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,5,2), LocalTime.of(12, 50),s.traerInspector(3),s.traerMedidor(800001L),1088));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,7,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),1310));
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,9,2), LocalTime.of(12, 50),s.traerInspector(1),s.traerMedidor(800001L),1611));
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,11,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),1922));			
		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());			
		}	

		
		/* ******************************FACTURA************************************ */

		System.out.println("*******************************************************************");
		System.out.println("**********************CLIENTE BAJA DEMANDA*************************");
		System.out.println("*******************************************************************\n");

		System.out.println(s.generarFactura(4, 2019, s.traerMedidor(800000L)));//"T1-R2: 151-325"
		System.out.println("\n\n");
		System.out.println(s.generarFactura(4, 2019, s.traerMedidor(800001L)));//"T1-R3: 326-400"
		System.out.println("\n\n");

		System.out.println("*******************************************************************");
		System.out.println("**********************CLIENTE GRAN DEMANDA*************************");
		System.out.println("*******************************************************************\n");

		System.out.println(s.generarFactura(9, 2019, s.traerMedidor(500000L)));//"TA-BT1","BT<300kW"
		System.out.println("\n\n");
		System.out.println(s.generarFactura(9, 2019, s.traerMedidor(500001L)));//"TA-BT2","BT>300kW"

	}

}
