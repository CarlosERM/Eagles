

numero = int(input("digite o primeiro numero:"))
maior = numero
menor = numero

for i in range(4):
    
    numero = int(input("digite o próximo numero: "))
    
    if(numero > maior):
        maior = numero
        
    if(numero < menor):
        menor = numero
           
print("O maior numero é: ")
print(maior)
print("O menor numero é: ")
print(menor)