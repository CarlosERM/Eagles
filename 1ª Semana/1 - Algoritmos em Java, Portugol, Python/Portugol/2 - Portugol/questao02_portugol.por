programa {
	funcao inicio() {
		/*Declaração de variáveis*/
		real valor, maior = 0.0, menor = 0.0
		inteiro contador = 1

		/*Input de valores e checando o maior e menor*/
		faca{
		    faca{
		    	   escreva("Digite o ", contador,"° valor: ")
		        leia(valor)
		        se (valor < -1){
		        	escreva("Valor negativo não aceito, digite um valor válido\n")
		        }
		    }enquanto(valor < -1)
		    
		    se(valor == -1){
		        pare
		    } senao se(contador == 1){
		        maior = valor
		        menor = valor
		    } senao se(valor > maior){
		        maior = valor
		    } senao se(valor < menor){
		        menor = valor
		    } 
		    contador++
		    
		} enquanto(valor != -1)

		/*Printando os resultados*/
		se (contador == 1){
			escreva("Nenhum valor válido digitado.")
		}senao{
			escreva("O maior valor foi: ", maior,", e o menor valor foi: ", menor,".")			
		}

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */