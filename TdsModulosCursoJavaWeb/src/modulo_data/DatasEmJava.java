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
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencBoleto = simpleDateFormat.parse("12/07/2021");
		Date dataAtual = simpleDateFormat.parse("11/07/2021");
		
		//Se a data 1 é maior que a data 2
		if(dataVencBoleto.after(dataAtual)) {// posterior ou maior ou depois da data atual
			System.out.println("Boleto não vencido");
		} else {
			System.out.println("Boleto vencido -UGENTE");
		}
	
	//Se a data 1 é maior que a data 2
			if(dataVencBoleto.before(dataAtual)) {// se a data 1 é menor ou igual a data 2
				System.out.println("Boleto vencido -UGENTE");
			} else {
				System.out.println("Boleto não vencido");
			}
		}

}
