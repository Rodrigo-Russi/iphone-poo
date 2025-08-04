# Desafio POO - iPhone

Projeto da Trilha Java Básico da DIO.

## Funcionalidades

- Reprodutor musical  
- Aparelho telefônico  
- Navegador de internet

## Como executar

Compile com:

```bash
javac *.java
Execute com:

bash
Copiar
Editar
java Main
Estrutura
css
Copiar
Editar
AparelhoTelefonico.java  
NavegadorInternet.java  
ReprodutorMusical.java  
iPhone.java  
Main.java  
README.md
Diagrama UML
mermaid
Copiar
Editar
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
    class iPhone {}
    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
Autor
Rodrigo Russi
