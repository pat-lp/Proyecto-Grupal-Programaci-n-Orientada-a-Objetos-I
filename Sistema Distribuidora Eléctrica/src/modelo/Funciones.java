package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Funciones {

	/*
	 ******************************************************************
	         LISTA METODOS---ULTIMA ACTUALIZACION 16/05/2019
	 ******************************************************************

	01-AÑO BISIESTO(int anio): boolean,
	02-FECHA VALIDA(LocalDate fecha) : boolean,
	03-TRAER FECHA CORTA(LocalDate fecha) : String, //“dd/mm/aaaa”
	04-TRAER HORA CORTA(LocalTime hora) : String, // “hh:mm”
	05-DIA HABIL(LocalDate fecha) : boolean,
	06-TRAER DIA DE LA SEMANA(LocalDate fecha) : String,
	07-TRAER MES EN LETRAS(LocalDate fecha) : String,
	08-TRAER FECHA LARGA(LocalDate fecha) : String,
	09-TRAER CANTIDAD DE DIAS DE UN MES(int anio, int mes): int,
	10-APROXIMAR DOS DECIMALES(double valor): double,
	11-ES NUMERO?(char c): boolean,
	12-ES LETRA?(char c): boolean,
	13-ES CADENA DE NUMERO?(String cadena): boolean,
	14-ES CADENA DE LETRAS?(String cadena): boolean,
	15-CONVERTIR A DOUBLE (int n): double,
	16-CLONAR FECHA(LocalDate fecha): LocalDate,
	17-CLONAR HORA(LocalTime hora): LocalTime.

	/* ***************METODOS********************* */

	//1-AÑO BISIESTO
	/*Serán bisiestos los años divisibles por 4, exceptuando los que son divisibles por 100 y no
	divisibles por 400. Ejemplos: son bisiestos 1996, 2004, 2000, 1600; No son bisiestos 1700,
	1800, 1900, 2100*/
	public static boolean esBisiesto(int anio){		
		boolean esBisiesto=false;		
		if ((anio%4==0 && anio%100!=0) || anio%400==0) {	
			esBisiesto=true;	
		}
		return esBisiesto;	
	}
	
	

	//02-FECHA VALIDA
	//El mes es entero entre 1 y 12. En el caso de ser bisiesto es válido el día 29/02
	public static boolean esFechaValida(LocalDate fecha){		
		boolean fechaValida=false;
		int i=0, mes1=0;
		boolean bisiesto=esBisiesto(fecha.getYear());
		int arrayDiasMes[]={31,28,31,30,31,30,31,31,30,31,30,31};

		while(i<arrayDiasMes.length && !fechaValida){

			mes1=fecha.getMonthValue()-1;
			if(mes1==i && fecha.getDayOfMonth() <= arrayDiasMes[i]){
				fechaValida=true;
			}else if(mes1==1 && bisiesto && fecha.getDayOfMonth()<=29){
				fechaValida=true;
			}
			i++;
			mes1=0;
		}
		return fechaValida;
	}//fin 5

	//03-FECHA CORTA
	//Retorna “dd/mm/aaaa”-- LONGITUD 10
	public static String traerFechaCorta(LocalDate fecha){
		String dia1="";
		String mes1="";
		int mes= fecha.getMonthValue();
		int dia= fecha.getDayOfMonth();

		if(dia<10){//AGREGO EL CERO PARA QUE LA FECHA TENGA LONGITUD 10
			dia1="0"+dia;
		}else{
			dia1=String.valueOf(dia);
		}

		if(mes<10){
			mes1="0"+mes;
		}else{
			mes1=String.valueOf(mes);
		}

		return dia1+"/"+mes1+"/"+fecha.getYear();
	}


	//04-TRAER HORA CORTA
	//Retorna “hh:mm”
	public static String traerHoraCorta(LocalTime hora){
		int hs=hora.getHour();
		int minutos=hora.getMinute();
		String minutos1="";
		String hs1="";

		if(hs<10){
			hs1="0"+hs;
		}else{
			hs1=String.valueOf(hs);
		}
		if(minutos<10){
			minutos1="0"+minutos;
		}else{
			minutos1=String.valueOf(minutos);
		}
		return hs1+":"+minutos1;
	}

	//05-DIA HABIL: SE CONSIDERA DIA HABIL DE LUNES A VIERNES
	//1=DOMINGO,2=LUNES, 3=MARTES,4=MIERCOLES,5=JUEVES,6=VIERNES,7=SABADO 
	public static boolean esDiaHabil(LocalDate fecha){
		boolean diaHabil=true;
		String dia=traerDiaDeLaSemana(fecha);
		String diaNoHabil[]= {"Sábado","Domingo"};
		if((dia.equalsIgnoreCase(diaNoHabil[0]))|| (dia.equalsIgnoreCase(diaNoHabil[1]))){ 
			diaHabil=false;
		}
		return diaHabil;
	}

	//06-TRAER DIA DE LA SEMANA 
	public static String traerDiaDeLaSemana(LocalDate fecha){
		String diasEnIngles[]= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};	
		String diaSemana;
		String dia=String.valueOf(fecha.getDayOfWeek());
		if(dia.equalsIgnoreCase(diasEnIngles[0])){
			diaSemana="Domingo";	
		}else if(dia.equalsIgnoreCase(diasEnIngles[1]) ){
			diaSemana="Lunes";
		}else if(dia.equalsIgnoreCase(diasEnIngles[2]) ) {
			diaSemana="Martes";
		}else if(dia.equalsIgnoreCase(diasEnIngles[3]) ) {
			diaSemana="Miércoles";
		}else if(dia.equalsIgnoreCase(diasEnIngles[4]) ) {
			diaSemana="Jueves";	
		}else if(dia.equalsIgnoreCase(diasEnIngles[5]) ) {
			diaSemana="Viernes";
		}else {
			diaSemana="Sábado";
		}
		return diaSemana;	
	}

	//07-TRAER MES EN LETRAS
	/*La función .getMonthValue devuelve int de 1 a 12. Se coloca -1 para que 
	coincida con el array.*/
	public static String traerMesEnLetras(LocalDate fecha){
		String mesEnLetras[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		return mesEnLetras[(fecha.getMonthValue())-1];//0=enero
	}

	//08-TRAER FECHA LARGA
	//Ejemplo: “Sábado 20 de Agosto del 2016”
	public static String traerFechaLarga(LocalDate fecha){
		return traerDiaDeLaSemana(fecha)+" "+fecha.getDayOfMonth()+" de "+traerMesEnLetras(fecha)+" del "+fecha.getYear();
	}

	//09-CANTIDAD DE DIAS DE UN MES
	public static int traerCantDiasDeUnMes (int anio, int mes){
		int cantDiasMes=0, i=0, mes1=0;
		boolean encontrado=false;
		boolean bisiesto=esBisiesto(anio);
		int arrayDiasMes[]={31,28,31,30,31,30,31,31,30,31,30,31};

		while(i<arrayDiasMes.length && !encontrado){

			mes1=mes-1;
			if(mes1==i){
				cantDiasMes=arrayDiasMes[i];
			}else if(mes1==1 && bisiesto){
				cantDiasMes=29;
			}else{encontrado=false;}
			i++;
			mes1=0;
		}
		return cantDiasMes;//
	}

	//10-APROXIMAR DOS DECIMALES
	public static double aproximar2Decimal (double valor){
		//Si el tercer decimal es mayor o igual 5, suma 1 al segundo decimal
		double aproximado= valor * Math.pow(10, 2); 
		/*SE MULTIPLICA EL VALOR POR 10^2 (CANTIDAD DE DECIMALES QUE SE DESEAN OBTENER)
			PARA OBTENER LA PARTE ENTERA DEL DECIMAL QUE INTERESA REDONDEAR*/
		aproximado=Math.round(aproximado);//CON MATH.ROUND SE REDONDEA EL VALOR ENTERO ANTERIOR
		aproximado= aproximado/Math.pow(10, 2);//SE VUELVE A PASAR A DECIMAL LO QUE SE HABIA TRANSFORMADO EN ENTERO PARA REDONDEAR
		return aproximado;	
	}

	//11-NUMERO?
	public static boolean esNumero(char c){
		String diccionario="0123456789";
		boolean numero=false;
		int i=0;

		//while hasta que finalice o que lo encontro
		while(i<diccionario.length() && !numero){
			numero=(diccionario.charAt(i)==c);
			i++;
		}
		return numero;
	}

	//12-LETRA?
	public static boolean esLetra(char c){
		String diccionarioLetras="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int i=0;
		boolean esLetra=false;

		while(i<diccionarioLetras.length() && !esLetra){
			esLetra=(diccionarioLetras.charAt(i)==c);
			i++;
		}
		return esLetra;
	}

	//13-CADENA DE NROS?
	public static boolean esCadenaNros(String cadena){
		boolean cadenaNro=false;
		int i=0;

		while(i<cadena.length() && !cadenaNro){
			/*EL METODO ESNUMERO TIENE COMO PARAMETRO UN CHAR POR LO CUAL SE CONVIERTE
				CADENA A CHAR CON LA FUNCION "charAt" */
			cadenaNro= esNumero(cadena.charAt(i));
			i++;
		}
		return cadenaNro;
	}

	//14-CADENA DE LETRAS?
	public static boolean esCadenaLetras(String cadena){
		boolean cadenaLetras=false;
		int i=0;

		while(i<cadena.length() && !cadenaLetras){
			/*EL METODO ESNUMERO TIENE COMO PARAMETRO UN CHAR POR LO CUAL SE CONVIERTE
				CADENA A CHAR CON LA FUNCION "charAt" */
			cadenaLetras= esLetra(cadena.charAt(i));
			i++;
		}
		return cadenaLetras;
	}

	//15-CONVERTIR A DOUBLE
	public static double convertirADouble ( int n ){
		return (( double) n);
		}
	
	
//	16-CLONAR FECHA
	public static LocalDate clonarFecha(LocalDate fecha) {	
		return LocalDate.of(fecha.getYear(), fecha.getMonth(), fecha.getDayOfMonth());
	}
	
	
//	17-CLONAR HORA
	public static LocalTime clonarHora(LocalTime hora) {
		return LocalTime.of(hora.getHour(), hora.getMinute());
	}

}//FIN
