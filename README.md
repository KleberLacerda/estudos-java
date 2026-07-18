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

### 5. 🔐 [Gerador de Senhas Seguras](./src/GeradorSenhaGUI.java)
*   **Propósito:** Um utilitário de console que gera senhas altamente seguras e aleatórias, com base no comprimento desejado pelo usuário, utilizando uma lista de caracteres especiais, números e letras (maiúsculas e minúsculas).
*   **O que aprendi:** Utilização da classe `SecureRandom` para geração de dados criptograficamente seguros, manipulação dinâmica de strings com `StringBuilder`, captura de entradas do teclado via console com `Scanner` e aplicação de boas práticas de nomenclatura em Java (como o uso de constantes em `UPPER_CASE`).

### 6. 🎯 [Jogo da Forca](./src/JogoDaForca.java)
*   **Propósito:** O clássico jogo da forca rodando diretamente no terminal, onde o sistema sorteia aleatoriamente uma palavra de um banco de dados, oculta as letras com traços (`_`) e gerencia as tentativas e erros do jogador.
*   **O que aprendi:** Manipulação de listas dinâmicas com `ArrayList`, sorteio de índices aleatórios com a classe `Random`, leitura e isolamento de caracteres específicos com `scanner.next().charAt(0)` e loops aninhados (`while` e `for`) para validação letra por letra.

### 7. 🛒 [Aplicativo de Lista de Compras](./src/ListaDeCompras.java)
*   **Propósito:** Uma aplicação visual completa para mercados e feiras, onde o usuário adiciona itens em uma lista interativa exibida na tela e, ao final, consegue salvar a lista diretamente em um arquivo de texto no computador.
*   **O que aprendi:** Sincronização de dados entre `ArrayList` comuns e `ObservableList` do JavaFX para atualização de componentes `ListView` (listas visuais). Manipulação de arquivos do sistema (I/O) usando as classes `File` e `PrintWriter`, e tratamento rigoroso de exceções com blocos `try/catch`.

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
