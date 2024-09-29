# Factory Pattern Demo

Este projeto demonstra o uso do Padrão de Projeto Factory em Java. Ele cria objetos de diferentes formas (Círculo e Quadrado) sem expor a lógica de criação ao cliente.

## Estrutura do Projeto

- `com.example.interfaces`
  - `Shape`: Interface que define o método `draw()`.
- `com.example.shapes`
  - `Circle`: Implementa a interface `Shape` e desenha um círculo.
  - `Square`: Implementa a interface `Shape` e desenha um quadrado.
  - `ShapeFactory`: Fábrica que cria objetos `Shape` com base no tipo fornecido.
- `application`
  - `FactoryPatternDemo`: Classe principal que demonstra o uso da fábrica para criar e desenhar formas.

## Como Executar

1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd seu-repositorio
    ```
3. Compile o projeto:
    ```sh
    javac -d bin src/com/example/interfaces/Shape.java src/com/example/shapes/Circle.java src/com/example/shapes/Square.java src/com/example/shapes/ShapeFactory.java src/application/FactoryPatternDemo.java
    ```
4. Execute o projeto:
    ```sh
    java -cp bin application.FactoryPatternDemo
    ```

## Exemplo de Saída

```plaintext
Drawing a Circle
Drawing a Square
