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
		System.out.println("Data atual nova API, no padr�o Br: "+
		dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("*****************************************");
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual, nova API: "+horaAtual);
		System.out.println("Hora atual nova API, no padr�o Br: "+
				horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println("*****************************************");
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println("Data e hora atual, nova API: "+dataHoraAtual);
		
		//formatando para nosso padr�o		
		System.out.println("Data e hora atual, nova API, no padr�o Br: "+
		dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("*****************************************");
		
		//dia, m�s, ano
		System.out.println("Dia da semana: "+dataAtual.getDayOfWeek().ordinal());
		System.out.println("Nome do Dia da semana: "+dataAtual.getDayOfWeek().name());
		System.out.println("Dia do m�s: "+dataAtual.getDayOfMonth());
		System.out.println("Dias do ano: "+dataAtual.getDayOfYear());
		System.out.println("M�s: "+dataAtual.getMonth());
		System.out.println("Ano: "+dataAtual.getYear());
		
		

	}

}
