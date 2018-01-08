package Array_s;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Arrays_helper{
	private String palavra;
	
			// Get SET
	public String getPalavra() {
		return palavra;
	}
	
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	// metodos lokos 
	public void pesquisa(String[] array, String coisa_pesquisada) {
		// for each 
		for (String string : array) {
			Boolean contem = string.contains(coisa_pesquisada);
			if (contem) {
				System.out.println("existe");		
			} else {
				System.out.println("não existe");
			}
		}
	}

	public String[] stringsToArray(String valor ,int tamanho ,String pontuacao) {
		// setando alguns valores de string
		String frase = valor;
		// criando uma array nova
		String array1[] = new String[tamanho];
		// verificando se a pontuaçõ é a mesma para a transformação
		 array1 =frase.split(pontuacao);
		 //retorna uma array
		return array1;
		
	}
	
	public int Permutacao(String palavra) {
		
		int num_letra = palavra.length();
		// fatorial 
		num_letra =1;
		for (int i = 1; i <= palavra.length(); i++) {
			num_letra = num_letra *i;
		}
		
		try {
			int p =  palavra.indexOf(num_letra);
			Integer t = fatorial(String.valueOf(p));
			if (palavra.equals(p)) {
				return num_letra/ t;
			}else{
				return num_letra/ t;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	private Integer fatorial( String num) {
		int num_letra = num.length();
		num_letra =1;
		for (int i = 1; i <= num.length(); i++) {
			num_letra = num_letra *i;
		}
		return num_letra;
		
	}
}
