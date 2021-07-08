package modulo_data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEmJava6 {

	public static void main(String[] args) {
		// Nova API de data apartir do java 8
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual nova API: "+dataAtual);
		System.out.println("Data atual nova API, no padrão Br: "+
		dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("*****************************************");
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual, nova API: "+horaAtual);
		System.out.println("Hora atual nova API, no padrão Br: "+
				horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println("*****************************************");
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println("Data e hora atual, nova API: "+dataHoraAtual);
		
		//formatando para nosso padrão		
		System.out.println("Data e hora atual, nova API, no padrão Br: "+
		dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("*****************************************");
		
		//dia, mês, ano
		System.out.println("Dia da semana: "+dataAtual.getDayOfWeek().ordinal());
		System.out.println("Nome do Dia da semana: "+dataAtual.getDayOfWeek().name());
		System.out.println("Dia do mês: "+dataAtual.getDayOfMonth());
		System.out.println("Dias do ano: "+dataAtual.getDayOfYear());
		System.out.println("Mês: "+dataAtual.getMonth());
		System.out.println("Ano: "+dataAtual.getYear());
		
		

	}

}
