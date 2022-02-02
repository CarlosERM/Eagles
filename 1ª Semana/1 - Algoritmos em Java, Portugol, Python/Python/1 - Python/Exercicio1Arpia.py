numero = int(input("digite o primeiro numero:"))
maior = numero
menor = numero
numero = -1

for i in range(4):
    while (numero < 0):
        numero = int(input("digite o próximo numero: "))
    
    if(numero > maior):
        maior = numero
        
    if(numero < menor):
        menor = numero
    
    numero = -1
           
print("O maior numero é: ")
print(maior)
print("O menor numero é: ")
print(menor)