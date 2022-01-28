programa {
	funcao inicio() {
		/*Declarando variáveis*/
		inteiro valor, numero = 1, divisor = 0

		/*Input de valores*/
		escreva("Digite um valor: ")
		leia(valor)

		/*Verificando se é primo ou não e printando*/
		se(valor > 0){
		    enquanto(numero <= valor){
		        se(valor % numero == 0){
		            divisor++
		        }
		        numero++
		    }
		    se(divisor == 2){
		        escreva("O número digitado é primo.")
		    } senao{
		        escreva("O número digitado não é primo.")
		    }
		    
		} senao{
		    escreva("Esse número é 0 ou negativo.")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */