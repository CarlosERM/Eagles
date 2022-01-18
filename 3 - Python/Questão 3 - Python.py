# Questão 3 - O usuário vai informar um valor e o programa vai retornar se este numero é primo

# Input
valor = int(input('Digite um valor: '))

# Contagem do número de divisíveis
contador = 0

print('\n{} é divisível pelos seguintes algarismos:'.format(valor),end='')

# Divisão do valor de entrada por todos algarismos anteriores a ele
for c in range(1, valor+1):

    if valor%c == 0:
        print('[{}] '.format(c),end='')
        contador += 1
    
    else:
        print('{} '.format(c),end='')

# Condição que imprime na tela se o número é primo ou não
if contador > 2:
    print('\n\nComo o valor é divisível por {} algarismos, ele não é primo'.format(contador))

else:
    print('\n\nComo o valor é divisível por apenas {} algarismos, ele é primo'.format(contador))   