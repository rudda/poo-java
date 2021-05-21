package poo;

/*
 * Implemente uma classe para calcular o volume de uma esfera.
 *  Para isso, crie um método para receber o valor do raio da esfera (double)
 *  e chame o método calcularVolumeEsfera (private) para realizar o cálculo,
 *  baseando-se na fórmula abaixo: volume = (4.0/3.0) * PI * raio2.   
 *  */


	/**
	 * Questão 2:
	 * 
	 * dados dois numeros A e B. 
	 * O problema consiste em sabe se a esta contido em B por exemplo
	 * 
	 * A = 101010101010110117777711111
	 * B = 1177
	 * retorno True
	 * 
	 *
	 */
public class Problemas {
	
	public boolean questao2( int a, int b) {
		// converter para String ....
		String aa = String.valueOf(a);
		String bb = String.valueOf(b);
		int c;
		// Por que Rudda?
		//Porque esse problema ja é resolvido com metodos de string.
		
		// como eu sei disso ?
		// eu li no livro JAVA 7 .
		
		// BEGIN LOGIC
		return aa.indexOf(bb) >= 0;
		// END
	}
	
	// contar e acumular - conceito base
	public int contarUm(int []vetor) {
		// ideia é contar quantos 1 existe no vetor 
		// dado o vetor: [1,1,1,1,1,0,0,0,0,0,1] 
		// qual seria a resposta ? 6 ??
		
		// qual o tamanho do vetor ? 10
		// e se fosse um vetor diferente tipo... [0,1]
		// qual seria o tamanho vetor ? 2 
		
		// o tamanho do vetor é estatico ou variavel ?? ele é o mesmo
		// variavel
		
		// for( <inicio>; <condição_parada>; <incremento>)
		// como eu sei o tamnaho do vetor Rudda ?
		int tamanho_vetor = vetor.length;
		// lenght é tamanho do vetor.
		
		
		// Como eu conto ?
		int contador = 0;
		for(int i=0; i < tamanho_vetor; i++  ) {
			System.out.println("hey>> " + vetor[i]);
			// pra contar, voce precisa saber o que voce vai contar ..
			
			// como eu digo pro java contar 1 ?
			// qual a condição pra contar 1 ???
			if( vetor[i] == 1 ) {
				contador += 1;
			}
		}
		
		return contador;
	}
	
	
	// contar e acumular - conceito base
		public int acumular(int []vetor) {
			
			int tamanho_vetor = vetor.length;
			
			int acumulador = 0;
			// acumulador (+=) 
			for(int i=0; i < tamanho_vetor; i++  ) {
				acumulador += vetor[i];
			}
			
			return acumulador;
		}
		
		public void apontar(int []vector) {
			int i=0;
			int j= 0;
			// pecorrer do inicio ao fim
			for(  i= 0; i< vector.length; i ++) {
				// toda vez que a gente passar por 1 elemento do inicio entao
				for( j= (vector.length -1); j >= 0; j--) {
					// passamos por todos os elementos do vetor do fim ao inicio
					System.out.println(vector[i]+ " |-| " +vector[j]);
				}
			}
		}

}
