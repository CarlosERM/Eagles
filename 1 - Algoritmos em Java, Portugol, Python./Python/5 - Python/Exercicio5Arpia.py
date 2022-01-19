
preco_alcool = 0.0
preco_gasolina = 0.0

preco_alcool = input("PRECO DO ALCOOL: ")
preco_gasolina = input("PRECO DA GASOLINA: ")

if(float(preco_alcool) < 0.7 * float(preco_gasolina)):
    print("O Alcool compensa mais que a gasolina")
else:
    print("A Gasolina compensa mais que o Alcool")