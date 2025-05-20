
# 💱 Conversor de Moedas em Java

Este é um projeto simples de conversor de moedas utilizando a API pública do [ExchangeRate-API](https://www.exchangerate-api.com/). A aplicação é feita em Java e permite ao usuário converter valores entre diferentes moedas com base na taxa de câmbio atual.

## 📦 Estrutura do Projeto

```
br.com.sfranca.conversormoeda
│
├── ClienteApi.java         # Faz a chamada HTTP à API de câmbio e processa a resposta.
├── ConfiguracaoJava.java   # Lê a chave da API a partir do arquivo config.properties.
├── ConversorMoeda.java     # Contém a lógica de conversão de moedas.
├── LeitorConsole.java      # Lê dados inseridos pelo usuário no console.
├── Moeda.java              # Classe de modelo que representa uma conversão.
└── Principal.java          # Classe principal que orquestra a execução da aplicação.
```

## ⚙️ Pré-requisitos

- JDK 8 ou superior
- [Gson](https://github.com/google/gson) (para parsing JSON)
- Conexão com a internet
- Uma conta gratuita no [ExchangeRate-API](https://www.exchangerate-api.com/) para obter sua chave de API

## 📥 Instalação

1. Clone o repositório ou baixe os arquivos do projeto.
2. Crie um arquivo chamado `config.properties` na raiz do projeto com o seguinte conteúdo:

```properties
API_KEY=sua_chave_aqui
```

3. Adicione a biblioteca Gson ao seu projeto. Se estiver usando Maven, adicione a dependência abaixo no `pom.xml`:

```xml
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.10.1</version>
</dependency>
```

Se estiver usando sem Maven, baixe o `.jar` do Gson e adicione ao classpath.

## ▶️ Como Executar

Compile e execute a classe `Principal`:

```bash
javac br/com/sfranca/conversormoeda/*.java
java br.com.sfranca.conversormoeda.Principal
```

Siga as instruções no console para inserir:
- A moeda de origem (ex: USD)
- A moeda de destino (ex: BRL)
- O valor a ser convertido

Exemplo de saída:

```
Conversor de Moedas
Digite a moeda de origem (ex: USD): usd
Digite a moeda de destino (ex: BRL): brl
Digite o valor a ser convertido: 100
100.00 USD = 505.00 BRL
```

## 📌 Observações

- O sistema só funcionará corretamente se a chave da API for válida e houver conexão com a internet.
- O valor retornado será 0.0 caso ocorra algum erro na comunicação com a API.

## 🛠️ Futuras Melhorias

- Interface gráfica (GUI) com JavaFX ou Swing
- Suporte à exibição de histórico de conversões
- Validação mais robusta das entradas do usuário
- Testes automatizados

---

Desenvolvido por **Sara França**
