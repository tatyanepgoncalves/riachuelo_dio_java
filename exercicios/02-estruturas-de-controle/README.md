# Estruturas de Controles

## ``if``, ``else if``, ``else``: Tomando Decisões
Imagine que você está na rua e precisa decidir o que fazer. Se estiver sol, você vai para a praia. Se não estiver sol, mas estiver nublado, você vai para o parque. Caso contrário (se estiver chovendo), você fica em casa.

É exatamente assim que o ``if``, ``else if``, ``else`` funciona. Ele avalia uma condição e, se ela for verdadeira, executa um bloco de código. Se não for, ele avalia a próxima condição, e assim por diante. O ``else`` é o "plano B" para quando nenhuma das condições anteriores for verdadeira.

**EXEMPLO**

````java
int temperatura = 25;

if (temperatura > 30) {
    System.out.println("Está muito calor! Vá para a praia.");
} else if (temperatura > 20) {
    System.out.println("Está agradável. Ótimo para um passeio.");
} else {
    System.out.println("Está frio. Leve um casaco.");
}
````

Neste exemplo, a temperatura é 25, então a primeira condição (``temperatura > 30``) é falsa. A segunda (``temperatura > 20``) é verdadeira, então o programa executa o código que diz para ir passear.

---

## while e do-while: Repetindo Ações
Imagine que você precisa encher um copo com água. Você vai continuar despejando água enquanto o copo não estiver cheio. A estrutura ``while`` funciona assim: ela repete um bloco de código enquanto uma condição for verdadeira. A condição é verificada no início do loop.

**Exemplo com ``while``:**
````java
int contador = 0;

while (contador < 5) {
    System.out.println("O contador está em: " + contador);
    contador = contador + 1; // Ou contador++;
}
````

Este código vai imprimir a mensagem cinco vezes, pois a condição ``contador < 5`` é verdadeira a cada vez que o loop começa, até que o contador chegue a 5.

O ``do-while`` é muito parecido, mas tem uma diferença crucial: ele **executa o bloco de código pelo menos uma vez** antes de verificar a condição. A verificação é feita no final.

**Exemplo com ``do-while``:**

````java
int numero = 10;

do {
    System.out.println("O número é: " + numero);
    numero++;
} while (numero < 5);
````

Neste caso, mesmo que a condição (``numero < 5``) seja falsa desde o início, a mensagem "O número é: 10" será impressa uma vez antes do programa sair do loop.

---
## ``switch``: Escolhendo Entre Múltiplas Opções
O ``switch`` é uma alternativa mais limpa e organizada para uma longa cadeia de ``if-else if-else`` quando você está comparando uma única variável com vários valores fixos. Imagine que você está pedindo uma pizza e precisa escolher o sabor. Se o sabor for "calabresa", o preço é X. Se for "quatro queijos", é Y. E assim por diante.

**EXEMPLO**

````java
char nota = 'B';

switch (nota) {
    case 'A':
        System.out.println("Excelente!");
        break; // O 'break' é fundamental para sair do switch
    case 'B':
        System.out.println("Muito bom!");
        break;
    case 'C':
        System.out.println("Bom.");
        break;
    default:
        System.out.println("Nota inválida.");
}
````

Aqui, o programa procura o valor da variável ``nota ('B')`` e executa o bloco de código correspondente. O break é crucial para que o programa não continue executando as próximas opções. O ``default`` é opcional e funciona como um ``else``, sendo executado se nenhuma das opções corresponder.

---
## ``for``: Repetindo Ações por um Número Específico de Vezes
O ``for`` é perfeito para quando você sabe exatamente quantas vezes precisa repetir algo. É como uma lista de tarefas: "Faça isso 10 vezes." Ele é mais compacto do que o ``while``, pois combina a inicialização, a condição e a atualização da variável de controle em uma única linha.

**A estrutura do ``for`` é: ``for (inicialização; condição; atualização)``**
  - **Inicialização**: Ação que acontece uma única vez no início (Ex: ``int i = 0;``).
  - **Condição**: Ação que é verificada a cada repetição (Ex: ``i < 10;``).
  - **Atualização**: Ação que acontece após cada repetição (Ex: ``i++;``).

**EXEMPLO**
````java
for (int i = 0; i < 5; i++) {
    System.out.println("O número é: " + i);
}
````

Este loop vai imprimir a mensagem cinco vezes, com os números de 0 a 4. É a maneira mais comum de criar loops contados.

---

## Exercícios
1 - Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

2 - Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

  - Se for menor ou igual a 18,5 "Abaixo do peso";
  - se for entre 18,6 e 24,9 "Peso ideal";
  - Se for entre 25,0 e 29,9 "Levemente acima do peso";
  - Se for entre 30,0 e 34,9 "Obesidade Grau I";
  - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
  - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
  
3 - Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
 
4 - Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados.