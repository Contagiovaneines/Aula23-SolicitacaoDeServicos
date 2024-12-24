# Aplicação de Gerenciamento de Clientes

Este projeto é uma aplicação desenvolvida com Spring Boot e Thymeleaf, permitindo a gestão de clientes. A aplicação suporta as operações CRUD (Create, Read, Update, Delete), e utiliza o MySQL para armazenamento de dados.

## Funcionalidades

- **Listar Clientes:** Exibe uma lista com todos os clientes cadastrados.
- **Visualizar Detalhes:** Exibe as informações detalhadas de um cliente específico.
- **Criar Cliente:** Permite adicionar um novo cliente.
- **Editar Cliente:** Permite editar as informações de um cliente existente.
- **Excluir Cliente:** Permite excluir um cliente da base de dados.

## Tecnologias Utilizadas

- **Spring Boot:** Framework Java para criação da aplicação web.
- **Thymeleaf:** Template engine para renderização das páginas HTML.
- **MySQL:** Banco de dados utilizado para persistência das informações.
- **JPA (Java Persistence API):** Para interação com o banco de dados.

## Estrutura do Projeto

- **Model:** Define a estrutura dos dados da aplicação (Cliente, Servico).
- **Controller:** Gerencia as requisições HTTP e interage com os serviços.
- **Service:** Contém a lógica de negócio da aplicação.
- **Repository:** Interface que interage com o banco de dados utilizando JPA.

## Como Rodar a Aplicação

1. Clone o repositório:
    ```
    git clone https://github.com/seu-usuario/repositorio.git
    ```

2. Configure as credenciais do MySQL no arquivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/sua_base_de_dados
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    ```

3. Execute a aplicação:
    ```
    ./mvnw spring-boot:run
    ```

4. Acesse a aplicação em [http://localhost:8080/clientes](http://localhost:8080/clientes).

## Contribuições

Sinta-se à vontade para contribuir com o projeto. Se encontrar algum bug ou tiver sugestões de melhorias, abra uma issue ou envie um pull request!

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
