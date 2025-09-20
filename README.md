# Projeto Backend Completo com Spring Boot

Este projeto é um backend completo, desenvolvido do zero utilizando o framework **Spring Boot** para a criação de uma aplicação prática. Ele demonstra a integração e o uso de dois bancos de dados distintos, **MySQL** (relacional) e **MongoDB** (NoSQL), através da **JPA (Java Persistence API)**.

---

### 🚀 Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot 3.x**
* **Spring Data JPA**
* **MySQL**
* **MongoDB**
* **Maven**
* **RESTful APIs**

---

### ✨ Funcionalidades

* Criação de APIs REST para operações CRUD (Create, Read, Update, Delete).
* Configuração e conexão com banco de dados MySQL para persistência de dados relacionais.
* Configuração e conexão com banco de dados MongoDB para persistência de dados não relacionais.
* Gerenciamento de entidades e modelos de domínio para ambas as bases de dados.

---

### 📂 Estrutura do Projeto

A estrutura segue o padrão de projetos Spring Boot, com as seguintes pastas principais:

* `src/main/java`: Contém todo o código-fonte Java, incluindo controladores, serviços, modelos e repositórios.
* `src/main/resources`: Armazena arquivos de configuração, como `application.properties` ou `application.yml`, e scripts de banco de dados.
* `pom.xml`: O arquivo de configuração do Maven que gerencia todas as dependências do projeto.

---

### ⚙️ Pré-requisitos

Antes de executar a aplicação, certifique-se de ter instalado:

* **JDK** (Java Development Kit) 17 ou superior.
* **Maven** 3.x ou superior.
* **MySQL** e **MongoDB** (locais ou através de containers Docker).

---

### 🖥️ Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/PauloAMDCorreia/Pmanage-SpringBoot.git](https://github.com/PauloAMDCorreia/Pmanage-SpringBoot.git)
    cd Pmanage-SpringBoot
    ```

2.  **Configure os bancos de dados:**
    No arquivo `src/main/resources/application.properties`, configure as credenciais e as URLs de conexão para o MySQL e o MongoDB.

    ```properties
    # Configuração MySQL
    spring.datasource.url=jdbc:mysql://localhost:3306/seubancodedados
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update

    # Configuração MongoDB
    spring.data.mongodb.uri=mongodb://localhost:27017/seubancodedados
    ```

3.  **Execute a aplicação:**
    Você pode rodar o projeto diretamente da sua IDE (IntelliJ, VS Code, etc.) ou via linha de comando.

    **Via linha de comando:**
    ```bash
    mvn spring-boot:run
    ```

    Após a inicialização, o backend estará rodando no endereço `http://localhost:8080`.

---

### 📚 Exemplos de Endpoints da API

A seguir estão alguns exemplos de como os endpoints podem ser estruturados para interagir com os bancos de dados.

* **MySQL** (Exemplo para uma entidade `Produto`):
    * `GET /api/mysql/produtos` - Lista todos os produtos.
    * `POST /api/mysql/produtos` - Cria um novo produto.

* **MongoDB** (Exemplo para uma entidade `Usuario`):
    * `GET /api/mongodb/usuarios` - Lista todos os usuários.
    * `POST /api/mongodb/usuarios` - Cria um novo usuário.
    * `PUT /api/mongodb/usuarios/{id}` - Atualiza um usuário pelo ID.

---

### 🤝 Contribuições

Contribuições são bem-vindas! Se você tiver sugestões de melhoria ou encontrar algum problema, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

---

### 📄 Licença

Este projeto é distribuído sob a Licença MIT.
