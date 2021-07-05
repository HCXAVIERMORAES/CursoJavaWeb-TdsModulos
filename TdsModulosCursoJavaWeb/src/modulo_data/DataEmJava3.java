package modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataEmJava3 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws ParseException {
		//Calculo dia ano mes com calendar
		Calendar calendar = Calendar.getInstance();//pega a data atual
		
		//simular que data vem do Banco Dados
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));//definindo uma data qualquer
		System.out.println("data passada  "+ calendar.getTime());
				
		calendar.add(calendar.DAY_OF_MONTH, 40);//data mais 40 dias
		System.out.println("Somando 40 ao dia do mês: "+new SimpleDateFormat("dd-MM-yyyy").
				format(calendar.getTime()));//formatando
		
		calendar.add(calendar.DAY_OF_MONTH, -5);
		System.out.println("Subtraindo 5 ao dia do mês: "+new SimpleDateFormat("dd-MM-yyyy").
				format(calendar.getTime()));
		
		calendar.add(calendar.DAY_OF_WEEK, 10); //dia da semana somado a 5
		System.out.println("Somando 10 ao dia da semana: "+new SimpleDateFormat("dd-MM-yyyy").
				format(calendar.getTime()));
		
		calendar.add(calendar.DAY_OF_WEEK_IN_MONTH, 10); //dia da semana somado a 5
		System.out.println("Somando 10 ao dia da semana do mês: "+new SimpleDateFormat("dd-MM-yyyy").
				format(calendar.getTime()));
		
		calendar.add(calendar.MONTH, 1); //dia da semana somado a 5
		System.out.println("Somando 1 mes: "+new SimpleDateFormat("dd-MM-yyyy").
				format(calendar.getTime()));
		
		calendar.add(calendar.YEAR, 1); //dia da semana somado a 5
		System.out.println("Somando 1 Ano: "+new SimpleDateFormat("dd-MM-yyyy").
				format(calendar.getTime()));
		
	}

}
