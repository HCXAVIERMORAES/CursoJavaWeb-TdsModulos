package modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		//Trabalhando com datas
		
		//classe Calendar
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: "+ date.getTime());
		System.out.println("Calender em milisegundos: "+ calendar.getTimeInMillis());
		
		System.out.println("Dia do mes: "+ date.getDate());
		System.out.println("Calender dia do mês: "+ calendar.get(calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: "+ date.getDay());//0= domingo, 1=segunda ... ate 6=sabado
		System.out.println("Calender dia da semana: "+ (calendar.get(calendar.DAY_OF_WEEK)- 1));
		
		System.out.println("Hora do dia "+ date.getHours());
		System.out.println("Calender hora do dia: "+ calendar.get(calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da hora: "+ date.getMinutes());
		System.out.println("Calender minuta da hora: "+ calendar.get(calendar.MINUTE));
		
		System.out.println("Segundos: "+ date.getSeconds());
		System.out.println("Calender segundos: "+ calendar.get(calendar.SECOND));
		System.out.println("Ano: "+ (date.getYear() + 1900));//tem como base o ano de 1900. Retorna resultado da
		// do ano vigente - 1900
		System.out.println("Calender anos: "+ calendar.get(calendar.YEAR));
		//---------------SIMPLE DATE FORMAT----------------------------------
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");//M sempre maiusculo
		System.out.println("data atual em formato padrão e String: " + simpleDateFormat.format(date));
		System.out.println("Calendar data atual em formato padrão e String: " + 
		simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");//.SS centesimos de segundos
		System.out.println("Data em formato para Banco de Dados: "+ simpleDateFormat.format(date));
		System.out.println("Data em formato para Banco de Dados: "+ 
		simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		//deve colocar uma exceção para ser uzado o parse
		System.out.println("Convertendo para objeto do tipo Date: "+ simpleDateFormat.parse("14-01-1978"));
				
	}

}
