# 01 - Os fundamentos do Java 

Antes de mergulharmos nos tópicos, é importante entender o que é Java. Pense em Java como um conjunto de regras e ferramentas para construir programas. A grande sacada de Java é que ele foi projetado com a filosofia **"Write Once, Run Anywhere"** (Escreva uma vez, execute em qualquer lugar). Isso significa que você pode escrever seu código em uma máquina (Windows, por exemplo) e ele pode ser executado em outra (Linux, macOS, etc.) sem precisar de modificações. Isso é possível graças à **JVM** (Java Virtual Machine), uma "máquina virtual" que traduz seu código para a linguagem do sistema operacional.

## Padrões de Desenvolvimento e Conceitos
Padrões de desenvolvimento e conceitos são como as melhores práticas e a base para você estruturar seu código de forma organizada e eficiente. O principal conceito em Java é a **Programação Orientada a Objetos (POO)**.

Imagine que você quer modelar um carro. Em vez de descrevê-lo como uma lista de características (cor, marca, velocidade), a POO te permite criar um "molde" ou **classe** chamado ``Carro``. Esse molde pode ter **atributos** (cor, marca, velocidade máxima) e **métodos** (acelerar, frear, ligar).

A partir desse molde, você pode criar **objetos** específicos: ``meuCarro``, que é um ``Carro`` vermelho da marca ``Toyota``, e ``seuCarro``, que é um ``Carro`` preto da marca ``Ford``.

Os quatro pilares da POO são:
- **Abstração**: Foco no essencial. Por exemplo, quando você dirige um carro, não precisa saber como o motor funciona, apenas como usar o volante, o acelerador e o freio. A abstração esconde a complexidade e mostra apenas o que é relevante.
- **Encapsulamento**: Proteger e agrupar dados. Voltando ao Carro, o encapsulamento garantiria que a velocidadeMaxima não pudesse ser alterada para um valor negativo, por exemplo. Isso mantém a consistência e segurança dos dados.
- **Herança**: Reuso de código. Se você tem a classe ``Carro``, pode criar uma classe ``CarroEletrico`` que "herda" todas as características e comportamentos de ``Carro``, e ainda adicionar os seus próprios (como ``capacidadeBateria``).
- **Polimorfismo**: Múltiplas formas. O polimorfismo permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum. Por exemplo, a classe ``Carro`` e a classe ``Moto`` podem ter um método chamado ligarMotor(), mas cada um o executa de forma diferente.

## Keywords e Tipos Primitivos
**Keywords (Palavras-chave)**
Keywords são palavras reservadas que têm um significado especial para o compilador do Java e não podem ser usadas para nomear variáveis, classes, etc. É como se elas já tivessem um propósito fixo. Exemplos incluem ``public``, ``class``, ``void``, ``static``, ``if``, ``else``, e ``for``.

**Tipos Primitivos**
Tipos primitivos são os blocos de construção mais básicos para dados. Pense neles como gavetas de tamanhos fixos para guardar informações. Em Java, os tipos primitivos são:
- **byte, short, int, long**: Usados para armazenar números inteiros (sem casas decimais). Eles se diferenciam pelo tamanho da "gaveta" que ocupam na memória. O ``int`` é o mais comum.
- **float, double**: Usados para armazenar números de ponto flutuante (com casas decimais). O **double** tem maior precisão e é mais usado.
- **char**: Usado para armazenar um único caractere (letra, número, símbolo), como ``'a'`` ou ``'$'``.
- **boolean**: Usado para armazenar valores lógicos, que só podem ser ``true`` ou ``false``. Essencial para tomada de decisões no seu código.

## Operadores
Operadores são símbolos que realizam uma ação em uma ou mais variáveis ou valores.

**Operadores de Atribuição**
Usados para dar um valor a uma variável.

- ``=`` : **Atribuição simples**. Ex: ``int idade = 25;``
- ``+=``, ``-=``, ``*=``, ``/=``, ``%=``: **Atribuição composta**. Uma forma mais curta de escrever. Ex: ``x += 5``; é o mesmo que ``x = x + 5``;`

**Operadores Aritméticos**
Os "matemáticos" do Java.

- ``+`` (Adição)
- ``-`` (Subtração)
- ``*`` (Multiplicação)
- ``/`` (Divisão)
- ``%`` (Módulo, que retorna o resto da divisão).

**Operadores Lógicos**
Usados para combinar expressões lógicas e retornar ``true`` ou ``false``.

- ``&&`` (AND lógico): Retorna ``true`` se **ambas** as condições forem verdadeiras. Ex: ``(idade > 18) && (temCNH == true)``
- ``||`` (OR lógico): Retorna ``true`` se **pelo menos uma** das condições for verdadeira. Ex: ``(clima == "sol") || (clima == "nublado")``
- ``!`` (NOT lógico): Inverte o valor lógico. Ex: ``!true`` é ``false``.

## Operadores Bitwise (Bit-a-Bit)
Estes operam diretamente nos bits (0s e 1s) de um número. São menos comuns no dia a dia, mas muito úteis em computação de baixo nível ou para otimizações específicas.
- ``&`` (AND Bitwise)
- ``|`` (OR Bitwise)
- ``^`` (XOR Bitwise)
- ``~`` (NOT Bitwise)
- ``<<`` (Shift Left)
- ``>>`` (Shift Right)

Por exemplo, ``5 & 3`` (onde ``5`` é ``0101`` e ``3`` é ``0011`` em binário) resultaria em ``0001``, que é ``1`` em decimal. Eles comparam cada bit individualmente.

---

# Exercícios
1 - Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

2 - Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
  - fórmula: área=lado X lado

3 - Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
  - fórmula: área=base X altura

4 - Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas