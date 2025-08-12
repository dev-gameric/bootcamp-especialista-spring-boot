# Módulo 02 - Spring e Injeção de Dependências

---

## 📖 Sumário

- [Objetivos do Módulo](#-objetivos-do-módulo)
- [Conteúdo Programático](#-conteúdo-programático)
- [Pré-requisitos](#-pré-requisitos)
- [Ambiente de Desenvolvimento](#-ambiente-de-desenvolvimento)
- [Descrição Detalhada das Aulas](#-descrição-detalhada-das-aulas)
- [Exemplos de Código](#-exemplos-de-código)
- [Conceitos-Chave](#-conceitos-chave)
- [Referências](#-referências)
- [Observações Pessoais](#-observações-pessoais)
- [Status do Módulo](#-status-do-módulo)

---

## 🎯 Objetivos do Módulo

- Este módulo é introdutório ao Spring Boot e ao conceito de Injeção de Dependências. Aprenderemos os fundamentos teóricos e também aplicaremos na prática como usar o framework Spring Boot e realizar a injeção de dependências utilizando Java moderno.

---

## 📝 Conteúdo Programático

| Aula | Título da Aula                           | Descrição Breve                              |
|------|------------------------------------------|----------------------------------------------|
| 2.1  | Por que aprender e usar Spring           | Contexto e vantagens do Spring               |
| 2.2  | Conhecendo o ecossistema Spring          | Módulos mais usados e como se integram       |
| 2.3  | Spring vs Jakarta EE                     | Comparativo entre os dois frameworks         |
| 2.4  | Conhecendo o Spring Boot                 | Objetivos e benefícios do Spring Boot        |
| 2.5  | Criando um projeto com Spring Initializr | Geração de projeto e estrutura base          |
| 2.6  | Conhecendo Maven e pom.xml               | Gerenciamento de dependências no projeto     |
| 2.7  | Criando um controller com Spring MVC     | Criação de endpoints REST                    |
| 2.8  | DevTools e reinicialização automática    | Melhoria na experiência de desenvolvimento   |
| 2.9  | O que é Injeção de Dependências          | Conceito e importância de DI                 |
| 2.10 | IoC Container do Spring                  | Funcionamento interno do contêiner           |
| 2.11 | Definindo beans com @Component           | Criação automática de beans                  |
| 2.12 | Injetando dependências                   | Formas de injeção no Spring                  |
| 2.13 | @Configuration e @Bean                   | Definindo beans manualmente                  |
| 2.14 | Pontos de injeção e @Autowired           | Campo, setter e construtor                   |
| 2.15 | Dependência opcional com @Autowired      | Evitando erros com dependência ausente       |
| 2.16 | Ambiguidade e injeção de lista de beans  | Injetando múltiplos beans                    |
| 2.17 | Desambiguação com @Primary               | Definindo bean padrão                        |
| 2.18 | Desambiguação com @Qualifier             | Especificando qual bean injetar              |
| 2.19 | Anotações customizadas                   | Criando qualifiers próprios                  |
| 2.20 | Spring Profiles                          | Comportamentos diferentes por ambiente       |
| 2.21 | Ciclo de vida dos beans                  | Métodos de inicialização e destruição        |
| 2.22 | Eventos customizados no Spring           | Criando e escutando eventos                  |
| 2.23 | Configurando com application.properties  | Centralizando configurações                  |
| 2.24 | Substituindo propriedades externamente   | Linha de comando e variáveis de ambiente     |
| 2.25 | Propriedades customizadas com @Value     | Injetando valores do arquivo de propriedades |
| 2.26 | @ConfigurationProperties                 | Mapeando configurações em classes            |
| 2.27 | Arquivos por perfil                      | application-dev.properties, etc.             |
| 2.28 | Ativando profiles externamente           | Argumentos e variáveis para ativar profiles  |

---

## 🔧 Pré-requisitos

- Java 17 ou superior
- IntelliJ IDEA ou outro IDE
- Conhecimento básico de Java e orientação a objetos
- JDK configurado

---

## 💻 Ambiente de Desenvolvimento

- IntelliJ IDEA 2023.1
- JDK 17
- Maven 3.8.6
- Spring Boot 3.5.4

---

## 📚 Descrição Detalhada das Aulas

### Aula 2.1 - Por que aprender e usar Spring

> Aborda as principais motivações para utilizar o Spring no desenvolvimento Java. É explicado como o framework se tornou uma escolha padrão na indústria por oferecer soluções integradas, produtividade elevada e uma grande comunidade. São destacadas as vantagens como desacoplamento, injeção de dependência e suporte a microsserviços.

---

### Aula 2.2 - Conhecendo o ecossistema Spring

> Apresenta o ecossistema Spring, incluindo os módulos mais usados: Spring Core, Spring Boot, Spring MVC, Spring Data, Spring Security e Spring Cloud. A aula mostra como esses módulos se integram para cobrir praticamente todo o ciclo de desenvolvimento de aplicações modernas.

---

### Aula 2.3 - Spring vs Jakarta EE (Java EE)

> Compara o Spring Framework com a especificação Jakarta EE, explicando as diferenças conceituais e práticas. A aula discute temas como facilidade de uso, curva de aprendizado, padronização e flexibilidade, além de abordar a popularidade do Spring no mercado atual.

---

### Aula 2.4 - Conhecendo o Spring Boot

> Introdução ao Spring Boot, explicando como ele simplifica a configuração de projetos Spring tradicionais. São abordados conceitos como "convenção sobre configuração", starters, auto-configuração e embutimento de servidor web.

---

### Aula 2.5 - Criando um projeto Spring Boot com Spring Initializr

> Demonstra como gerar rapidamente um projeto Spring Boot utilizando o Spring Initializr. A aula explora a escolha das dependências, estrutura básica do projeto gerado e integração com a IDE.

---

### Aula 2.6 - Conhecendo o Maven e o pom.xml de um projeto Spring Boot

> Explica o papel do Maven no gerenciamento de dependências e na automação de builds. A aula detalha o `pom.xml` de um projeto Spring Boot, mostrando os principais elementos: dependências, plugins e configurações básicas.

---

### Aula 2.7 - Criando um controller com Spring MVC

> Implementação prática de um controller REST usando Spring MVC. São abordados conceitos como anotação `@RestController`, mapeamento de rotas com `@GetMapping` e retorno de dados em JSON.

---

### Aula 2.8 - Restart mais rápido da aplicação com DevTools

> Introdução ao Spring Boot DevTools, explicando como ele melhora a experiência de desenvolvimento com reinicialização automática da aplicação, cache desabilitado e live reload.

---

### Aula 2.9 - O que é injeção de dependências

> Aula teórica sobre o conceito de Injeção de Dependência (DI) e sua importância na arquitetura de software orientada a objetos. Aborda os benefícios da inversão de controle para testabilidade, manutenção e desacoplamento de código.

---

### Aula 2.10 - Conhecendo o IoC Container do Spring

> Explica como o contêiner IoC do Spring funciona na prática. A aula mostra como ele cria, gerencia e injeta objetos (beans), sendo o núcleo da funcionalidade do framework.

---

### Aula 2.11 - Definindo beans com @Component

> Demonstra como registrar componentes no Spring usando a anotação `@Component`. A aula explora o uso de variações como `@Service`, `@Repository` e `@Controller`.

---

### Aula 2.12 - Injetando dependências (beans Spring)

> Mostra como realizar a injeção de dependência entre componentes anotados. São demonstradas injeções via campo, construtor e métodos setter.

---

### Aula 2.13 - Usando @Configuration e @Bean para definir beans

> Aula sobre a criação manual de beans usando classes de configuração com `@Configuration` e métodos anotados com `@Bean`. Útil para instanciar objetos de bibliotecas externas ou que não podem ser anotados diretamente.

---

### Aula 2.14 - Conhecendo os pontos de injeção e a anotação @Autowired

> Explica os três principais pontos de injeção de dependência no Spring: por campo, por método setter e por construtor. Mostra boas práticas e como o Spring lida com cada um deles.

---

### Aula 2.15 - Dependência opcional com @Autowired

> Demonstra como tornar uma dependência opcional ao usar `@Autowired(required = false)`, evitando erros quando um bean não está presente.

---

### Aula 2.16 - Ambiguidade de beans e injeção de lista de beans

> Mostra o problema da ambiguidade quando múltiplos beans do mesmo tipo existem e como injetar todos de uma vez usando `List<T>` ou `Map<String, T>`.

---

### Aula 2.17 - Desambiguação de beans com @Primary

> Ensina a resolver conflitos de injeção marcando um bean como principal com `@Primary`, usado quando há múltiplas implementações do mesmo tipo.

---

### Aula 2.18 - Desambiguação de beans com @Qualifier

> Aula prática sobre o uso de `@Qualifier` para indicar explicitamente qual bean deve ser injetado quando houver mais de uma opção.

---

### Aula 2.19 - Desambiguação de beans com anotação customizada

> Ensina como criar anotações personalizadas baseadas em `@Qualifier` para melhorar a legibilidade e a organização da injeção de dependências.

---

### Aula 2.20 - Mudando o comportamento da aplicação com Spring Profiles

> Apresenta o conceito de **Spring Profiles**, que permite alterar o comportamento da aplicação com base no ambiente (desenvolvimento, produção, etc.).

---

### Aula 2.21 - Criando métodos de callback do ciclo de vida dos beans

> Explica como definir métodos que são automaticamente executados na inicialização ou destruição de um bean, usando `@PostConstruct` e `@PreDestroy`.

---

### Aula 2.22 - Publicando e consumindo eventos customizados

> Demonstra como criar eventos personalizados no Spring e como publicá-los e escutá-los utilizando a infraestrutura de eventos do framework.

---

### Aula 2.23 - Configurando projetos Spring Boot com o application.properties

> Explica como o arquivo `application.properties` é usado para definir configurações da aplicação, como porta do servidor, mensagens, logs e mais.

---

### Aula 2.24 - Substituindo propriedades via linha de comando e variáveis de ambiente

> Ensina como sobrescrever configurações do Spring Boot com argumentos de linha de comando ou variáveis de ambiente, útil para ambientes como produção ou nuvem.

---

### Aula 2.25 - Criando e acessando propriedades customizadas com @Value

> Aula prática de como criar chaves personalizadas no `application.properties` e acessá-las nos componentes usando `@Value`.

---

### Aula 2.26 - Acessando propriedades com @ConfigurationProperties

> Explica como mapear grupos de propriedades diretamente para objetos Java com `@ConfigurationProperties`, melhorando a organização da configuração.

---

### Aula 2.27 - Alterando a configuração do projeto dependendo do ambiente (com Spring Profiles)

> Demonstra como criar arquivos `application-dev.properties`, `application-prod.properties`, etc., para alterar configurações automaticamente conforme o perfil ativo.

---

### Aula 2.28 - Ativando o Spring Profile por linha de comando e variável de ambiente

> Finaliza explicando como ativar um profile específico via argumento `--spring.profiles.active` ou através de variáveis de ambiente, adaptando a aplicação ao ambiente de execução.

---

## 💻 Exemplos de Código

| Aula | Caminho                                                                                                                                                                                                         | Descrição do Exemplo                        |
|------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------|
| 2.7  | [aula_2_7_meu_primeiro_controller](https://github.com/dev-gameric/bootcamp-especialista-spring-boot/tree/exemplos-aula/algafood-api/src/main/java/com/algaworks/aulas/modulo2/aula_2_7_meu_primeiro_controller) | Exemplo básico de controller com Spring MVC |
| 2.9  | aulas/modulo-02/2.09-injecao-dependencia                                                                                                                                                                        | Demonstração de injeção de dependência      |

---

## 🧠 Conceitos-Chave

- Inversão de Controle (IoC)
- Injeção de Dependência (DI)
- Beans do Spring e Ciclo de Vida
- Perfis do Spring
- Configuração com `application.properties`

---

## 📖 Referências

- [Documentação oficial Spring Framework](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans)
- [Guia Spring Boot](https://spring.io/guides/gs/spring-boot/)
- [AlgaWorks - Curso Especialista Spring Boot](https://www.algaworks.com.br/curso-especialista-spring-boot)

---

## 📝 Observações Pessoais

- Comentários, dúvidas ou pontos de melhoria que anotei durante o estudo.
- Pontos importantes para revisar antes das provas e avaliações do curso.

---

## 📊 Status do Módulo

| Tarefa                           | Status       | Observações |
|----------------------------------|--------------|-------------|
| Documentação do módulo           | ✔ Concluído  |             |
| Exemplos implementados           | ✔ Concluído  |             |
| Revisão dos conceitos-chave      | Em andamento |             |
| Revisão final para provas/testes | Pendente     |             |

---

## ▶️ Rodando o Projeto

**Para executar os exemplos do módulo:**

```bash
cd exemplos-aula/modulo-02
./mvnw spring-boot:run
