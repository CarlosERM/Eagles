# Questão 4 - O usuário vai informar um valor e devera ser retornado o seu fatorial

#---------------------------------------------------------------------------------#
# Modo 1 - Biblioteca Math

from math import factorial

valor = int(input('Digite o valor que quer calcular o fatorial: '))

print('\nModo 1 (biblioteca): O valor de {}! é {}\n'.format(valor,factorial(valor)))

#---------------------------------------------------------------------------------#
# Modo 2 - Algoritmo iterativo

def fatorialIterativo(numero):
    
    count = 1
    res = 1

    while count <= numero:
        res *= count
        count += 1

    return res

print('\nModo 2 (iterativo): O valor de {}! é {}\n'.format(valor,fatorialIterativo(valor)))

#---------------------------------------------------------------------------------#
# Modo 3 - Algoritmo recursivo

def fatorialRecursivo(numero):
    if numero == 0:
        return 0
    if numero == 1:
        return 1
    if numero > 1:
        return fatorialRecursivo(numero-1) * numero

print('\nModo 3 (recursivo): O valor de {}! é {}\n'.format(valor,fatorialRecursivo(valor)))
