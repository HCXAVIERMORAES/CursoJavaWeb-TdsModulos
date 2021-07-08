package modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava5 {

	public static void main(String[] args) throws ParseException {
		//Gerando parcelas mensais e suas datas
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("10/04/2021");//instancia a data da compra
		
		Calendar calendar = Calendar.getInstance(); //instanciando o calendario
		calendar.setTime(dataInicial);
		
		//gerando as parcelas
		for(int parcela = 1; parcela <= 12; parcela ++) {
			calendar.add(Calendar.MONTH, 1); //adicionado 1 mês
			
			System.out.println("Parcela número:"+ parcela + " vencimento em: "+new SimpleDateFormat("dd/MM/yyyy").
					format(calendar.getTime()));
		}
		

	}

}
