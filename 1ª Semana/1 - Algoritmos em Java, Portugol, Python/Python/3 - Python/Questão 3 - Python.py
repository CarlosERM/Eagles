# Questão 3 - O usuário vai informar um valor e o programa vai retornar se este numero é primo

numeroInteiroPositivo= False

# Verifica se é um número válido, se não pede novamente
while (numeroInteiroPositivo == False):
    
    valor = input('Digite um valor válido (número natural) ')

    try:
        valor = int(valor)
        if valor <= 0:
            numeroInteiroPositivo = False
        else:
            numeroInteiroPositivo = True

    except ValueError:
         numeroInteiroPositivo = False

# Contagem do número de divisíveis
contador = 0

print('\n{} é divisível pelos seguintes algarismos:'.format(valor),end='')

# Divisão do valor de entrada por todos algarismos anteriores a ele
for c in range(1, valor + 1):

    if valor%c == 0:
        print('[{}] '.format(c),end='')
        contador += 1
    
    else:
        print('{} '.format(c),end='')

# Condição que imprime na tela se o número é primo ou não
if contador > 2:
    print('\n\nComo o valor é divisível por {} algarismos, ele não é primo'.format(contador))

elif contador == 1:
    print('\n\nComo o valor é divisível por apenas {} algarismo, ele não é primo'.format(contador))

else:
    print('\n\nComo o valor é divisível por apenas {} algarismos, ele é primo'.format(contador))   
