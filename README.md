# estudos-java
# ☕ Meus Estudos de Java 

Bem-vindo(a) ao meu repositório de aprendizado! Este espaço foi criado para organizar e documentar todos os pequenos projetos, exercícios e experimentos práticos que desenvolvo enquanto estudo a linguagem Java.

---

## 📂 Portfólio de Projetos

Aqui está o índice de tudo o que você vai encontrar neste repositório:

### 1. 🧮 [Calculadora de IMC](./src/CalculadoraIMC.java)
*   **Propósito:** Uma interface gráfica simples para calcular o Índice de Massa Corporal (IMC) a partir do peso e da altura informados pelo usuário.
*   **O que aprendi:** Manipulação de entradas de texto (`TextField`), tratamento de números (`Double.parseDouble`), eventos de clique de botões (`setOnAction`) e formatação de texto em Java.

### 2. 🎥 [Player de Vídeo - Copa do Mundo 2026](./src/ExemploVideo.java)
*   **Propósito:** Um mini aplicativo que abre e renderiza um vídeo/short do YouTube utilizando componentes nativos do JavaFX.
*   **O que aprendi:** Como utilizar o `WebView` e `WebEngine` para carregar páginas web dentro do Java desktop, e como contornar barreiras de inicialização modular (usando a classe `Launcher`).

### 3.  🔳 [Exemplo de GridPane](./src/ExemploGridPane.java)
*   **Propósito:** Um projeto focado em entender e dominar o layout de grade (GridPane) do JavaFX.
*   **O que aprendi:** Alinhamento de elementos em colunas e linhas, espaçamentos internos/externos (`Padding` e `Gap`) e organização visual.

### 4. 🕰️ [Relógio Digital com Alerta de Hidratação](./src/RelogioDigital.java)
*  **Propósito:** Um relógio de mesa digital, além de mostrar as horas em tempo real, exibe um alerta interativo a cada 30 minutos lembrando o usuário de beber água.
*   **O que aprendi:** Criação de loops de animação com `Timeline` e `KeyFrame` no JavaFX, manipulação de data e hora com `LocalDateTime`, formatação temporal com `DateTimeFormatter`, uso de expressões lambda, estilização `CSS` aplicada a componentes gráficos (`.setStyle()`) e exibição de diálogos de alerta (`Alert`).

### 5. 🔐 [Gerador de Senhas Seguras](./src/GeradorDeSenhasSeguras.java)
*   **Propósito:** Um utilitário de console que gera senhas altamente seguras e aleatórias, com base no comprimento desejado pelo usuário, utilizando uma lista de caracteres especiais, números e letras (maiúsculas e minúsculas).
*   **O que aprendi:** Utilização da classe `SecureRandom` para geração de dados criptograficamente seguros, manipulação dinâmica de strings com `StringBuilder`, captura de entradas do teclado via console com `Scanner` e aplicação de boas práticas de nomenclatura em Java (como o uso de constantes em `UPPER_CASE`).

---

## 🛠️ Tecnologias e Versões Utilizadas

*   **Java JDK:** Versão 26
*   **JavaFX SDK:** Versão 22.0.1
*   **IDE:** IntelliJ IDEA 2026

---

## 🚀 Como Executar os Projetos

Como este repositório possui múltiplos projetos independentes, para rodar qualquer um deles no seu computador:

1. Importe o projeto desejado (ou a pasta inteira) para a sua IDE (recomendo o IntelliJ IDEA).
2. Configure o caminho do seu **JavaFX SDK** nas bibliotecas do projeto.
3. Para evitar problemas de inicialização modular (erros de boot layer com JDK mais recente), **sempre execute o projeto a partir da classe `Launcher.java`** de cada pasta correspondente.
