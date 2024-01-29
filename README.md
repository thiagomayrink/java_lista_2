# Lista de exercicios 2

[Spring Boot](http://projects.spring.io/spring-boot/) App.

## Requisitos

Para fazer o build e execução da aplicação serão necessários:

- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Maven 4](https://maven.apache.org)
- [Postgress](https://www.postgresqltutorial.com)

## Setup inicial
Com o postgress configurado, criar usuário, senha e uma database.
Preencher as variáveis de ambiente conforme descrito no arquivo [.env.example](https://github.com/thiagomayrink/java_lista_2/blob/main/.env.example)
Renomear o arquivo **.env.example** para **.env**

## Executando a aplicação local

Existem várias formas de executar um app Spring Boot localmente. Uma delas é através do [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) executando o comando:

```shell
mvn spring-boot:run
```

## Rotas
As rotas podem ser importadas para o thunder client atráves das collections localizadas na pasta: [.api-collections](https://github.com/thiagomayrink/java_lista_1/tree/main/.api-collections) localizada na raíz do projeto.
