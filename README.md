Olá meu nome é Hélio dos Santos Mendonça

Estou começando a todo vapor na programação e tentando aprender com meus erros e me adaptar aos cenários que vou enfrentar. Abaixo você encontra a documentação dos meus projetos deste repositório:


# alprog-lista-02-java

--Leitura de um número--

--Descrição--

O programa solicita um número ao usuário e exibe esse mesmo número na tela

--Fluxograma--

flowchart TD
A[Início] --> B[Solicitar número]
B --> C[Ler número]
C --> D[Exibir número informado]
D --> E[Fim]

--Operações Matemática básica--

--Descrição--

O programa solicita dois números e realiza:
-soma
-subtração
-multiplicação
Exibindo todos os resultados no final

--Fluxograma--

flowchart TD
A[Início] --> B[Solicitar primeiro número]
B --> C[Ler primeiro número]
C --> D[Solicitar segundo número]
D --> E[Ler segundo número]
E --> F[Calcular soma]
F --> G[Calcular subtração]
G --> H[Calcular multiplicação]
H --> I[Exibir resultados]
I --> J[Fim]

--Média bimestral--

--Descrição--

O programa solicita quatro notas bimestrais, calcula a 
média aritmética e exibe o resultado

--Fluxograma--

flowchart TD
A[Início] --> B[Solicitar primeiro número]
B --> C[Ler primeiro número]
C --> D[Solicitar segundo número]
D --> E[Ler segundo número]
E --> F[Calcular soma]
F --> G[Calcular subtração]
G --> H[Calcular multiplicação]
H --> I[Exibir resultados]
I --> J[Fim]

--Valor de Combustível--

--Descrição--

O programa solicita o preço do litro da gasolina e
a quantidade de litros comprados, calculando o valor 
total a ser pago.

--Fluxograma--

flowchart TD
A[Início] --> B[Solicitar preço do litro]
B --> C[Ler preço]
C --> D[Solicitar quantidade de litros]
D --> E[Ler litros]
E --> F[Calcular total = preço * litros]
F --> G[Exibir total]
G --> H[Fim]

--Cálculo de viagem internacional--

--Descrição--

O programa solicita o valor da viagem e a quantidade de pessoas para três destinos 
(Alemanha, Portugal e Itália). Em seguida, calcula o custo total da viagem considerando
todos os participantes.

--Fluxograma--

flowchart TD
A[Início] --> B[Solicitar preço Alemanha]
B --> C[Ler preço Alemanha]
C --> D[Solicitar pessoas Alemanha]
D --> E[Ler pessoas Alemanha]

E --> F[Solicitar preço Portugal]
F --> G[Ler preço Portugal]
G --> H[Solicitar pessoas Portugal]
H --> I[Ler pessoas Portugal]

I --> J[Solicitar preço Itália]
J --> K[Ler preço Itália]
K --> L[Solicitar pessoas Itália]
L --> M[Ler pessoas Itália]

M --> N[Calcular total geral]
N --> O[Exibir total da viagem]
O --> P[Fim]
