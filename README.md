# Árvore Binária de Busca Aumentada

## Descrição
Este projeto implementa uma Árvore Binária de Busca (ABB) aumentada em Java, uma estrutura de dados que suporta as operações listadas abaixo. O relatório do projeto está no respositório e tem nome "ABB__EDB2.pdf".

## Funcionalidades
- `Node search(int value)`: Retorna o nó que possui o valor procurado, ou nulo se não for encontrado.
- `boolean insert(int value)`: Método para inserir um determinado valor na árvore. Retorna verdadeiro se a inserção for bem sucedida, e falso caso contrário. 
- `boolean remove(int value)`: Método para remover um determinado valor na árvore. Retorna verdadeiro se a remoção for bem sucedida, e falso caso contrário. 
- `int nthElement(int n)`: Retorna o n-ésimo elemento da ABB.
- `int position(int x)`: Retorna a posição do elemento x.
- `int median()`: Retorna a mediana dos elementos da ABB.
- `double average(int x)`: Calcula a média aritmética dos nós em que x é a raiz da árvore.
- `boolean itsFull()`: Verifica se a ABB é uma árvore binária cheia.
- `boolean itsComplete()`: Verifica se a ABB é uma árvore binária completa.
- `String pre_ordem()`: Retorna a sequência de visitação em pré-ordem da ABB.
- `void printTree(int s)`: Imprime a árvore em diferentes formatos (diagrama de barras ou parênteses aninhados).

# Como usar

## Instalando o java
 Inicialmente, é preciso ter o Java. Para isso, utilize os seguintes comandos:

```
sudo apt update
sudo apt install default-jdk
```

## Compilação e Execução

Na pasta raiz do projeto, utilize o seguinte comando:

```
javac -d . src/projeto_edb2/Main.java src/projeto_edb2/BST.java src/projeto_edb2/Node.java
```

Posteriormente, utilize:

```
java projeto_edb2.Main <caminho para o arquivo de descrição da árvore> <caminho para o arquivo dos métodos>
```

Por exemplo, para os arquivos de teste, o comando para a execução seria:

```
java projeto_edb2.Main src/projeto_edb2/arquivo1.txt src/projeto_edb2/arquivo2.txt
```





