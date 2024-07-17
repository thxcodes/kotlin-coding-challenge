# kotlin-coding-challenge

# Reorganizar Nomes

Este projeto em Kotlin foi desenvolvido como um exemplo de live coding para uma entrevista de emprego. Ele reorganiza uma lista de nomes do formato "Primeiro Nome Sobrenome" para "Sobrenome, Primeiro Nome" e ordena a lista alfabeticamente.

## Estrutura do Projeto

```
reorganizar-nomes/
│
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   ├── Main.kt
│   │   │   ├── ReorganizarNomes.kt
│   └── resources/
│   └── test/
│       ├── kotlin/
│       │   ├── ReorganizarNomesTest.kt
│       └── resources/
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## Descrição dos Arquivos

- **Main.kt**: Ponto de entrada do aplicativo que executa a função principal.
- **ReorganizarNomes.kt**: Contém a lógica para reorganizar e ordenar os nomes.
- **ReorganizarNomesTest.kt**: Contém os testes unitários para a classe `ReorganizarNomes`.

## Como Executar

### Via IntelliJ IDEA

1. **Abrir o Projeto:**
   - Abra o IntelliJ IDEA.
   - Selecione `Open` e navegue até o diretório onde o projeto está localizado. Selecione a pasta `reorganizar-nomes`.

2. **Configurar o Gradle:**
   - Certifique-se de que o Gradle está configurado corretamente. No IntelliJ, vá até `File > Settings > Build, Execution, Deployment > Build Tools > Gradle`.
   - Garanta que a opção `Use default Gradle wrapper (recommended)` esteja selecionada.

3. **Executar o Projeto:**
   - Abra o arquivo `Main.kt`.
   - Clique no ícone de "run" (um triângulo verde) próximo à declaração da função `main`.

### Via Linha de Comando

1. **Executar o Projeto:**
   - Navegue até o diretório do projeto.
   - Execute o comando:
     ```sh
     ./gradlew run
     ```

## Como Rodar os Testes

### Via IntelliJ IDEA

1. **Abrir o Arquivo de Teste:**
   - Navegue até `src/test/kotlin/ReorganizarNomesTest.kt` e abra o arquivo.

2. **Executar os Testes:**
   - Clique no ícone de "run" próximo à declaração da classe `ReorganizarNomesTest` para rodar todos os testes.

### Via Linha de Comando

1. **Executar os Testes:**
   - Navegue até o diretório do projeto.
   - Execute o comando:
     ```sh
     ./gradlew test
     ```

## Dependências

- Kotlin 1.6.10
- JUnit 5 para testes

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
