# Estudos Spring

Projeto básico executável com Spring Boot 3 e Java 17.

## Requisitos

- JDK 17 ou superior
- Maven 3.6.3 ou superior

## Executar

Na raiz do projeto, inicie a aplicação com:

```bash
mvn spring-boot:run
```

Acesse [http://localhost:8080/](http://localhost:8080/). A resposta será:

```json
{"mensagem":"Projeto Spring Boot em execução!"}
```

## Gerar e executar o JAR

```bash
mvn clean package
java -jar target/estudos-spring-0.0.1-SNAPSHOT.jar
```

## Testes

```bash
mvn test
```
