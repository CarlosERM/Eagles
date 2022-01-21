lista = []
numero = int(input('\nDigite um valor: '))
maior = numero
menor = numero
lista.append(numero)
while int(numero) != -1:
    numero = int(input('Digite um valor: '))
    lista.append(numero)
lista.pop()    

print("\nO maior número é {}".format(max(lista)))

print("O menor número é {}".format(min(lista)))