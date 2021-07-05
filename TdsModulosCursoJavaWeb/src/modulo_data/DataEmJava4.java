package modulo_data;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataEmJava4 {

	public static void main(String[] args) throws ParseException {
		/* Faixa de tempo com chronoUnit. Quantos dias existem entre uma faixa de data
		 * calcular quantos dias se passaram entre a data passad e a atual */
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-07-01"),LocalDate.now());
		
		System.out.println("Possui "+dias+" dias entre a faixa de data.");
	}

}
