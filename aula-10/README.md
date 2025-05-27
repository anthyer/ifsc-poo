```mermaid
classDiagram
    direction LR

    class Retangulo{
        -altura: int
        -largura: int
        +Retangulo(int a, int l)
        +getArea() int
    }
```
```mermaid
classDiagram
    direction LR
    Carro "1" o-- "1" Motor
    Roda "3..4" --o "1" Carro

    class Carro{
        -marca: String
        -propulsor: Motor
        +Carro()
        +Acelerar(v: int) void
    }
    
    class Motor {
        -hp: int
        -giroAtual: int
        -cilindros: int
        +Motor()
        +Acelerar(v: int) void
    }
    
    class Roda {
        -diametro: double
        -material: String
        -calibragem: double
        +Roda()
    }
```
```mermaid
classDiagram
    direction LR
    Livro *-- Capitulo
    
    class Livro {
        
    }
    
    class Capitulo {
        
    }
```

```mermaid
classDiagram
    direction LR
    Jogador ..> Dado
    
    class Jogador {
        
    }
    
    class Dado {
        
    }
```

```mermaid
classDiagram
    direction LR
    Aviao "1" *-- "1..8" Motor
    
    class Aviao {
        -maxTripulantes: int
        -maxPassageiros: int
        -pesoMaximo: double
        -maxCombustivel: double
        -motor: Motor[8]
        +Aviao()        
    }
    
    class Motor {
        -consumo: double
        -tipo: String
        -estado: boolean
        +Motor()
        +LigaDesliga()
    }
```

