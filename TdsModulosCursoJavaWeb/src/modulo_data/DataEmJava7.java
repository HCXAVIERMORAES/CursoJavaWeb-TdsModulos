package modulo_data;

import java.time.Duration;
import java.time.Instant;

public class DataEmJava7 {

	public static void main(String[] args) throws InterruptedException {
		//trabalhara com tempo
		Instant inicio = Instant.now();
		Thread.sleep(2000); //pode ser um processo com tempo qualquer que n�o conh
		Instant fim = Instant.now();
		
		
		Duration duracao = Duration.between(inicio, fim);//intervalo
		
		System.out.println("dura��o em nanosegundos "+ duracao.toNanos());
		
		System.out.println("dura��o em minutos "+ duracao.toMinutes());
		
		System.out.println("dura��o em Horas"+ duracao.toHours());
		
		System.out.println("dura��o milicesegundos "+ duracao.toMillis());
		
		System.out.println("dura��o em dias "+ duracao.toDays());
		
		
	
	}
}
