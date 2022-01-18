programa{
	funcao inicio(){

		/*Declarando variáveis*/
		real valor, resultado = 1.0, recebeValor = 0.0 

		/*Input do valor*/
		escreva("Digite um valor para ser calculado seu fatorial: ")
		leia(valor)

		/*Salvando valor antes de entrar na verificação*/
		recebeValor = valor

		/*Verificando e fazendo o fatorial*/
		se (valor < 1){
			escreva("Valor 0 ou negativo!")
		}senao{
			enquanto(valor >= 1){
				resultado *= valor
				valor--
			}
			escreva("O fatorial de ", recebeValor, " é ", resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */