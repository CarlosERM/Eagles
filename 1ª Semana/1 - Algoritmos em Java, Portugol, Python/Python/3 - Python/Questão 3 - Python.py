# Questão 3 - O usuário vai informar um valor e o programa vai retornar se este numero é primo

numeroInteiro = False

# Verifica se é um número válido, se não pede novamente
while (numeroInteiro == False):
    
    valor = input('Digite um valor válido (número natural) ')

    try:
        valor = int(valor)
        numeroInteiro = True

    except ValueError:
         numeroInteiro = False

# Contagem do número de divisíveis
contador = 0

print('\n{} é divisível pelos seguintes algarismos:'.format(valor),end='')

# Se o número for negativo, o loop de divisões iniciará do valor de entrada até -1
if valor < 0:
    inicioLoop = valor
    fimLoop = 0

# Se o número for positivo, o loop de divisões iniciará de 1 até o valor de entrada
else:
    inicioLoop = 1
    fimLoop = valor+1

# Divisão do valor de entrada por todos algarismos anteriores a ele
for c in range(inicioLoop, fimLoop, 1):

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
