Contexto:

Uma loja deseja desenvolver um sistema de caixa capaz de registrar várias compras 
realizadas por um cliente. O sistema deverá solicitar a quantidade de produtos e, 
para cada produto, informar nome, quantidade e preço unitário.

O programa deverá calcular:

Subtotal de cada produto;
Total da compra;
Desconto de acordo com o valor total;
Valor final a pagar.

Como os dados são informados pelo usuário, podem ocorrer erros durante a execução. O sistema deverá utilizar try-catch-finally para evitar que uma entrada inválida encerre o programa de maneira inesperada.

Objetivo

Desenvolver um programa em Java que utilize tratamento de exceções para controlar erros durante o processamento de uma venda, utilizando try, catch e finally, juntamente com estruturas de decisão e repetição.

Regras do sistema

O programa deverá:

Solicitar a quantidade de produtos da compra.
Para cada produto, solicitar:
Nome;
Quantidade;
Preço unitário.

Calcular o subtotal:
subtotal = quantidade × preço

Somar os subtotais para obter o total da compra.
Aplicar desconto conforme o valor:

Valor da compra                    Desconto
Até R$ 500,00                       Sem desconto
R$ 500,01 a R$ 1.000,00    5%
Acima de R$ 1.000,00         10%

Exibir:
Total bruto;
Percentual de desconto;
Valor do desconto;
Total final.
Tratamento de erros

O sistema deverá utilizar try-catch para tratar pelo menos três situações:

1. Entrada de texto no lugar de número
Exemplo
Informe a quantidade: cincoErro: a quantidade deve ser informada como número.

2. Quantidade ou preço inválido
Informe a quantidade: -2
Erro: a quantidade deve ser maior que zero.

3. Preço inválido
Informe o preço: -50
Erro: o preço deve ser maior que zero.

Uso do finally
O bloco finally deverá ser utilizado para apresentar uma mensagem indicando que o processamento da venda foi encerrado:
Processamento da venda finalizado.
