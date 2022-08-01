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

public class Test7ReporteConsumoEntreFechas {

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
		}catch(Exception e) {
			System.out.println("Exception :"+e.getMessage());
		}

		/* ******************************INSPECTOR************************************ */
		try {
			s.agregarInspector(new PersonaFisica("Juncal 100",3333333L,"Javier", "Ruiz Inspector"));
			s.agregarInspector(new PersonaFisica("Juncal 200",3333334L,"Miguel", "Diaz Inspector"));
	
		s.traerZona(1).agregarInspectorAZona(s.traerInspector(1));
		s.traerZona(2).agregarInspectorAZona(s.traerInspector(2));	
		}catch(Exception e) {
			System.out.println("Exception :"+e.getMessage());
		}
	
		/* ******************************CLIENTE ALTA DEMANDA************************************ */
		try {			
			s.agregarMedidor(new Medidor(500000L, s.traerPersona(3),"Vieytes 1220", s.traerZona(1), s.traerTarifaAltaPorServicio("TA-BT1")));
			s.agregarMedidor(new Medidor(500001L, s.traerPersona(4),"Vieytes 1221",s.traerZona(2), s.traerTarifaAltaPorServicio("TA-MT1")));

		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());
		}
		
		/* ******************************CLIENTE BAJA DEMANDA************************************ */
		try {
			s.agregarMedidor(new Medidor(800000L, s.traerPersona(1),"Vieytes 1222",s.traerZona(3), s.traerTarifaBajaPorServicio("T1-R2")));
			s.agregarMedidor(new Medidor(800001L, s.traerPersona(2),"Vieytes 1223", s.traerZona(4), s.traerTarifaBajaPorServicio("T1-R2")));	
		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());
			
		}	
		
		/* ******************************LECTURAS************************************ */
		try {
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,5,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),95,16,4));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,7,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),100,18,5));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,9,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),120,20,5));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,11,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),180,22,12));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,1,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500000L),200,32,15));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,3,2), LocalTime.of(12, 40),s.traerInspector(2),s.traerMedidor(500000L),311,67,17));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,5,3), LocalTime.of(12, 50),s.traerInspector(1),s.traerMedidor(500000L),408,63,29));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,7,4), LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500000L),572,71,43));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,9,1), LocalTime.of(12, 32),s.traerInspector(1),s.traerMedidor(500000L),619,84,72));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,11,2), LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500000L),716,100,90));
	
		
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,9,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),80,102,5));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2018,11,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),211,251,18));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,1,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),403,332,15));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,3,1),  LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500001L),612,431,32));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,5,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),828,680,54));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,7,1),  LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500001L),1001,895,79));
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,9,1),  LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(500001L),1214,1077,96));	
			s.agregarLecturaMedidor(new LecturaAlta(s.maximaLectura(),LocalDate.of(2019,11,1),  LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(500001L),1419,1239,103));			
			
			
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,7,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),59));
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,9,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),61));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,11,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),182));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,1,1), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),203));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,3,2), LocalTime.of(12, 40),s.traerInspector(2),s.traerMedidor(800000L),344));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,5,3), LocalTime.of(12, 50),s.traerInspector(3),s.traerMedidor(800000L),415));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,7,4), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800000L),576));
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,9,1), LocalTime.of(12, 35),s.traerInspector(1),s.traerMedidor(800000L),627));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,11,2), LocalTime.of(12, 30),s.traerInspector(2),s.traerMedidor(800000L),748));	
			
			
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,7,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),71));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,9,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),85));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2018,11,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),100));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,1,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),181));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,3,2), LocalTime.of(12, 40),s.traerInspector(2),s.traerMedidor(800001L),243));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,5,2), LocalTime.of(12, 50),s.traerInspector(3),s.traerMedidor(800001L),386));	
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,7,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),414));
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,9,2), LocalTime.of(12, 50),s.traerInspector(1),s.traerMedidor(800001L),615));
			s.agregarLecturaMedidor(new LecturaBaja(s.maximaLectura(),LocalDate.of(2019,11,2), LocalTime.of(12, 30),s.traerInspector(1),s.traerMedidor(800001L),729));			
		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());			
		}	
		/* ******************************REPORTE************************************ */

		/*Aclaración:
		 * Se tiene en cuenta que el medidor registra el consumo desde su instalación hasta el momento de la 
		 * lectura, por lo cual el valor de la lectura jamás puede ser menor que la lectura anterior.
		 * fecha2 es posterior a fecha1
		 */
		
		System.out.println("CONSUMO DE UN CLIENTE ENTRE FECHAS\n");	
		System.out.println("------------------------------------------------------");
		//NRO DE MEDIDOR: 800000L
		System.out.println("KW cliente Baja Demanda: "+s.traerPersonaNombre(1));
		System.out.println("Consumidos entre las fechas : " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,3,1)) + "]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,5,1))+"]"+" --> kw="+s.consumoKwhEntreFechasBaja(LocalDate.of(2019,3,1), LocalDate.of(2019,5,1), s.traerPersona(1)));
		System.out.println("Consumidos entre las fechas : " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,3,1)) + "]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,6,1))+"]"+" --> kw="+s.consumoKwhEntreFechasBaja(LocalDate.of(2019,3,1), LocalDate.of(2019,6,1), s.traerPersona(1)));
		System.out.println("Consumidos entre las fechas : " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,3,1)) + "]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,8,1))+"]"+" --> kw="+s.consumoKwhEntreFechasBaja(LocalDate.of(2019,3,1), LocalDate.of(2019,8,1), s.traerPersona(1)));
		
		//NRO DE MEDIDOR: 800001L
		System.out.println("\nKW Cliente Baja Demanda: "+s.traerPersonaNombre(2));
		System.out.println("Consumidos entre las fechas : " +"[" +Funciones.traerFechaCorta(LocalDate.of(2018,10,1))+"]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,5,1)) +"]"+" --> kw="+s.consumoKwhEntreFechasBaja(LocalDate.of(2018,10,1), LocalDate.of(2019,5,1),s.traerPersona(2)));	
		System.out.println("Consumidos entre las fechas : " +"[" +Funciones.traerFechaCorta(LocalDate.of(2019,3,1))+"]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,6,1)) +"]"+" --> kw="+s.consumoKwhEntreFechasBaja(LocalDate.of(2019,3,1), LocalDate.of(2019,6,1),s.traerPersona(2)));	
		System.out.println("Consumidos entre las fechas : " +"[" +Funciones.traerFechaCorta(LocalDate.of(2019,4,1))+"]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,8,1)) +"]"+" --> kw="+s.consumoKwhEntreFechasBaja(LocalDate.of(2019,4,1), LocalDate.of(2019,8,1),s.traerPersona(2)));	

		//NRO DE MEDIDOR: 500000L
		System.out.println("\nKW Cliente Gran Demanda: "+s.traerPersonaNombre(3));
		System.out.println("Consumidos entre las fechas : " +"[" +Funciones.traerFechaCorta(LocalDate.of(2018,12,1)) +"]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,3,1)) +"]"+" --> "+s.consumoKwhEntreFechasAltaString(LocalDate.of(2018,12,1), LocalDate.of(2019,3,1), s.traerPersona(3)));
		System.out.println("Consumidos entre las fechas : " +"[" +Funciones.traerFechaCorta(LocalDate.of(2019,1,2)) +"]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,6,1)) +"]"+" --> "+s.consumoKwhEntreFechasAltaString(LocalDate.of(2019,1,1), LocalDate.of(2019,6,1), s.traerPersona(3)));

		//NRO DE MEDIDOR: 500001L
		System.out.println("\nKW Cliente Gran Demanda: "+s.traerPersonaNombre(4));
		System.out.println("Consumidos entre las fechas : " +"[" +Funciones.traerFechaCorta(LocalDate.of(2019,1,1)) +"]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,3,1)) +"]"+" --> "+s.consumoKwhEntreFechasAltaString(LocalDate.of(2019,1,1), LocalDate.of(2019,3,1), s.traerPersona(4)));
		System.out.println("Consumidos entre las fechas : " +"[" +Funciones.traerFechaCorta(LocalDate.of(2019,2,1)) +"]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,5,1)) +"]"+" --> "+s.consumoKwhEntreFechasAltaString(LocalDate.of(2019,2,1), LocalDate.of(2019,5,1), s.traerPersona(4)));
		System.out.println("Consumidos entre las fechas : " +"[" +Funciones.traerFechaCorta(LocalDate.of(2019,3,1)) +"]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,6,1)) +"]"+" --> "+s.consumoKwhEntreFechasAltaString(LocalDate.of(2019,3,1), LocalDate.of(2019,6,1), s.traerPersona(4)));

		//DEVUELVE LA CLASE LecturaAlta con el seteo de los valores del consumo
		System.out.println("Consumidos entre las fechas : " +"[" +Funciones.traerFechaCorta(LocalDate.of(2019,3,1)) +"]"+" Y " +"["+Funciones.traerFechaCorta(LocalDate.of(2019,6,1)) +"]"+" --> "+s.consumoKwhEntreFechasAlta(LocalDate.of(2019,2,1), LocalDate.of(2019,6,1), s.traerPersona(4)));

		
		


	}//Cierra el main

}//Cierra la clase
