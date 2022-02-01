# Questão 4 - O usuário vai informar um valor e devera ser retornado o seu fatorial

#---------------------------------------------------------------------------------#
# Modo 1 - Biblioteca Math

from math import factorial

numeroNegativoFloat = True

while numeroNegativoFloat == True:
    
    valor = input('Digite um número positivo e inteiro que se quer calcular o fatorial: ')

    try:
        valor = int(valor)
        if valor < 0:
            numeroNegativoFloat = True
        else:
            numeroNegativoFloat = False
    
    except ValueError:
        numeroNegativoFloat = True

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
        return 1
    if numero == 1:
        return 1
    if numero > 1:
        return fatorialRecursivo(numero-1) * numero

print('\nModo 3 (recursivo): O valor de {}! é {}\n'.format(valor,fatorialRecursivo(valor)))
