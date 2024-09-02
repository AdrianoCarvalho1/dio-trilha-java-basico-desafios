## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Desafio Diagramação de um Componente iPhone

### Diagrama UML
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class FuncionalidadesMultiFuncional {
        + tocar()
        + pausar()
        + selecionarMusica(musica: String)
        + exibirPagina(url: String)   
        + adicionarNovaAba()   
        + atualizarPagina()    
        + ligar(numero: int)    
        + atender()      
        + iniciarCorreioVoz()
    }

    class iPhone {
        Inherits: FuncionalidadesMultiFuncional
    }

    iphone --> FuncionalidadesMultiFuncional
    FuncionalidadesMultiFuncional --> ReprodutorMusical
    FuncionalidadesMultiFuncional --> AparelhoTelefonico
    FuncionalidadesMultiFuncional --> NavegadorInternet
```

FuncionalidadesMultiFuncional implementa todas as interfaces (AparelhoTelefonico, NavegadorInternet, e ReprodutorMusical).
Iphone estende FuncionalidadesMultiFuncional, herdando suas funcionalidades.