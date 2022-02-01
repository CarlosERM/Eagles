programa{
	/*Uso de biblioteca para arredondamento*/
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){

		/*Declaração de variáveis*/
		real etanol, gasolina, calculo = 0.0, arredondado

		/*Input de valores e conversão*/
		escreva("Digite o valor do álcool: ")
		leia(etanol)
		se (etanol < 0){
			etanol *= -1
			escreva("Vou interpretar que você disse ", etanol, "\n")
		}
		
		escreva("Digite o valor da gasolina: ")
		leia(gasolina)
		se (gasolina < 0){
			gasolina *= -1
			escreva("Vou interpretar que você disse ", gasolina, "\n")
		}
		
		calculo = etanol / gasolina
		
		/*Arredondando*/
		arredondado = mat.arredondar(calculo*100, 1)
		
		/*Verificando e imprimindo resultados*/
		escreva("\nCompensa abastecer com ")
		se( calculo > 0.7){
			escreva("gasolina")
		}senao{
			escreva("etanol")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 821; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */