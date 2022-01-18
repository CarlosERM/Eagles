programa{
	/*Uso de biblioteca para arredondamento*/
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){

		/*Declaração de variáveis*/
		real etanol, gasolina, calculo = 0.0, arredondado

		/*Input de valores e conversão*/
		escreva("Digite o valor do álcool: ")
		leia(etanol)

		escreva("Digite o valor da gasolina: ")
		leia(gasolina)
		calculo = etanol / gasolina
		
		/*Arredondando*/
		arredondado = mat.arredondar(calculo*100, 1)

		/*Verificando e imprimindo resultados*/
		se( calculo > 0.7){
			escreva("\nCom ", arredondado, "% de diferença compensa abastecer com gasolina")
		}senao{
			escreva("\nCom ", arredondado, "% de diferença compensa abastecer com etanol")
		}
	}
}

/*
	7.00
	
*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */