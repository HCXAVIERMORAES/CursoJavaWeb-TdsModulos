package cursojava.classes;

import java.util.Arrays;

public class Disciplina {
	/*Regra de negocio: cada disciplina terá 4 notas o ano inteiro*/
	//transformando notas em um array
	private Double[] nota = new Double[4];
	private String disciplina;

	// get set
		

	public String getDisciplina() {
		return disciplina;
	}

	public Double[] getNota() {
		return nota;
	}

	public void setNota(Double[] nota) {
		this.nota = nota;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	// equal e hashcode
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}

	//to String
	@Override
	public String toString() {
		return "Disciplina [\nnota: " + Arrays.toString(nota) + ", disciplina: " + disciplina + "]";
	}
	
	//metodo que retorna a média das notas para arrumar a classe Aluno
	public Double getMediaNotas() {
		Double somaTotal = 0.0;
		for (int i = 0; i < nota.length; i++) {
			somaTotal+= nota[i];
		}		
		return somaTotal / nota.length; //ou 4 que seria o tamanho do array
	}
	

	

}
