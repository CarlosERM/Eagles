

lista = []
numero = input('digite um valor: ')
maior = numero
menor = numero
lista.append(numero)
while int(numero) != -1:
    numero = input('digite um valor: ')
    lista.append(numero)
lista.pop()    

print(max(lista))
print(min(lista))
    