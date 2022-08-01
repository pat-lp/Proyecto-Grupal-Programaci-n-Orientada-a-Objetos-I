package test;

import modelo.DetalleAlta;
import modelo.DetalleBaja;
import modelo.SistemaDistribuidora;
import modelo.Tarifa;
import modelo.TarifaAlta;
import modelo.TarifaBaja;

public class Test3Tarifa {

	public static void main(String[] args) throws Exception {

		SistemaDistribuidora s = new SistemaDistribuidora();

		/* ******************************AGREGAR TARIFAS*********************************** */

		try {
			/* ******************************TARIFA BAJA DEMANDA************************************ */

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

			/* ******************************TARIFA GRAN DEMANDA <300kW************************************ */

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

			/* ******************************TARIFA GRAN DEMANDA >300kW************************************ */

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


		System.out.println("\n********************************************************************");
		System.out.println("******************AGREGAR TARIFA BAJA CON EXCEPCION*****************");
		try {
			s.agregarTarifa(new TarifaBaja("T1-R1"));
			s.traerTarifaBajaPorServicio("T1-R1").agregarDetalle(new DetalleBaja("Cargo Fijo", "$/mes",0,150,32.82));
			s.traerTarifaBajaPorServicio("T1-R1").agregarDetalle(new DetalleBaja("Cargo Variable", "$/kWh",0,150,2.653));
		} catch (Exception e) {	
			System.out.println("Exception :"+e.getMessage());
		}

		System.out.println("\n********************************************************************");
		System.out.println("******************AGREGAR TARIFA ALTA CON EXCEPCION*****************");
		try {
			s.agregarTarifa(new TarifaAlta("TA-BT1","BT<300kW")); 
			s.traerTarifaAltaPorServicio("TA-BT1").agregarDetalle(new DetalleAlta("Cargo Fijo", "$/mes", 300, false, 3226.41));
			s.traerTarifaAltaPorServicio("TA-BT1").agregarDetalle(new DetalleAlta("Cargo Variable Pico", "$/kWh", 300, false, 2.260));
			s.traerTarifaAltaPorServicio("TA-BT1").agregarDetalle(new DetalleAlta("Cargo Variable Resto", "$/kWh", 300, false, 2.160));
			s.traerTarifaAltaPorServicio("TA-BT1").agregarDetalle(new DetalleAlta("Cargo Variable Valle", "$/kWh", 300, false, 2.061));
		} catch (Exception e) {	
			System.out.println("Exception :"+e.getMessage());
		}


		System.out.println("\n******************************************************************");
		System.out.println("***********************IMPRIMIR TARIFAS***************************");
		for (Tarifa t: s.getLstTarifa()){
			if(t instanceof TarifaAlta){
				System.out.println(((TarifaAlta) t).toString());
			}
			if(t instanceof TarifaBaja){
				System.out.println(((TarifaBaja) t).toString());
			}
		}

		

	}


}
