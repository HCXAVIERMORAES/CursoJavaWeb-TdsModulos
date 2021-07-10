package modulo_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava9 {

	public static void main(String[] args) {
		// Data, dias, meses, anos  parcelas com Localdate
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Somando 5 dias a  data base: "+(dataBase= dataBase.plusDays(5)));//retorna a data já somado
//para se ter uma seguencia a data deve ser novamente atribuida a data base
		System.out.println("Somando 5 semanas "+(dataBase= dataBase.plusWeeks(5)));
		System.out.println("Somando 5 meses: "+(dataBase= dataBase.plusMonths(2)));
		System.out.println("Somando 5 anos: "+(dataBase= dataBase.plusYears(5)));
		
		//subtraindo dias, semanas etc
		System.out.println("Subtraindo 5 dias a  data base: "+(dataBase= dataBase.minusDays(5)));
		System.out.println("Subtraindo 5 semanas "+(dataBase= dataBase.minusWeeks(5)));
		System.out.println("Subtraindo 2 meses: "+(dataBase= dataBase.minusMonths(2)));
		System.out.println("Subtraindo 5 anos: "+(dataBase= dataBase.minusYears(5)));
		
		//simulando 12 parcelas
		for(int mes = 1; mes <= 12; mes ++) {
			dataBase = dataBase.plusMonths(1);//somando 1 mes
			System.out.println("Data vencimento boleto: "+
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" do mês: "+ mes);//passando para br	
		}

		
	}

}
