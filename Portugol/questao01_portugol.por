programa{
	funcao inicio(){
		
		/*Declaração de variáveis*/
		inteiro valores[5]
		inteiro maior = 0

		/*Input dos valores e verificando o maior*/
		para(inteiro cont=0; cont<5; cont++){
			escreva("Escreva o ", cont+1, "° valor: ")
			leia(valores[cont])
			se(valores[cont] > maior){
				maior = valores[cont]
			}
			limpa()
		}
		
		/*Printando os resultados*/
		escreva("Valores digitados: ")
		para(inteiro cont=0; cont<5; cont++){
			escreva("[",valores[cont],"]")
		}
		escreva("\nO maior valor digitado foi: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */