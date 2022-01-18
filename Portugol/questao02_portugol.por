programa {
	funcao inicio() {
		/*Declaração de variáveis*/
		inteiro valor, maior = 0, menor = 0, contador = 1

		/*Input de valores e checando o maior e menor*/
		faca{
		    escreva("Digite o ", contador,"ş valor: ")
		    leia(valor)
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
		escreva("O maior valor foi: ", maior,", e o menor valor foi: ", menor,".")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */