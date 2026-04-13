# 🚀 API de Usuários - Spring Boot

API REST desenvolvida com Java e Spring Boot para gerenciamento de usuários.

## 🛠 Tecnologias
- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## 📌 Funcionalidades
- Criar usuário
- Listar usuários
- Buscar por ID
- Atualizar usuário
- Deletar usuário

## 🔗 Endpoints

### POST /usuarios
Cria um novo usuário

### GET /usuarios
Lista todos os usuários

### GET /usuarios/{id}
Busca usuário por ID

### PUT /usuarios/{id}
Atualiza usuário

### DELETE /usuarios/{id}
Remove usuário

## ▶️ Como rodar

```bash
./mvnw spring-boot:run