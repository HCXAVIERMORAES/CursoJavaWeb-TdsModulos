package modulo_data;

import java.time.LocalDate;
import java.time.Period;

public class DataEmJava8 {

	public static void main(String[] args) {
		// Faixa de tempo com objeto periodo
		//LocalDate dataAntiga = LocalDate.of(2020, 2,7);//recebe ano, mês e dia ccomo apaarameetro
		//LocalDate dataNova = LocalDate.of(2021,7 , 4);
		
		//passando a data emm forma de String
		LocalDate dataAntiga = LocalDate.parse("2019-10-05");//muito usado para BD
		LocalDate dataNova = LocalDate.parse("2021-10-15");
		
		
		String result = dataAntiga.isAfter(dataNova) ? "- sim" : "- Não";
		String resultNova = dataAntiga.isBefore(dataNova) ? " - Sim" : " - Não";
		//comparando datas
		System.out.println("Data antiga é maior que data nova? "+ dataAntiga.isAfter(dataNova)+result);
		System.out.println("Data antiga é anterior a nova? "+ dataAntiga.isBefore(dataNova)+resultNova);
		System.out.println("As Data são iguais? "+ dataAntiga.isEqual(dataNova));
		
		//periodos de tempo
		Period periodo  =  Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias? "+ periodo.getDays());
		System.out.println("Quantos meses? "+ periodo.getMonths());
		System.out.println("Quantos anos? "+ periodo.getYears());
		System.out.println("O periodo é: "+ periodo.getYears()+" anos,"+periodo.getMonths()+" meses e "+
		periodo.getDays()+" dias");
		System.out.println("O  total de meses: "+ periodo.toTotalMonths());
		

	}

}
