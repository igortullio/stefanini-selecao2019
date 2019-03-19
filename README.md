# Stefanini - Selecao 2019

## Objetivo do desafio:

Criar um microsserviço utilizando arquitetura REST em qualquer linguagem de programação e utilizando qualquer banco de dados

### Requisitos
- Criar um modelo de dados para a representação das seguintes entidades Pessoa e Endereço;
- Utilizar um banco de dados SQL embutido(SQLite por exemplo) ou NoSQL (MongoDB por exemplo); 
- Criar uma API REST para lidar com obtenção, criação e exclusão de Pessoas e seus endereços;
- Criar testes unitários;
- Publicar no seu github o fonte da implementação e enviar o link do mesmo por e-mail.

### Desejável
- Ter especificação da API testável, com o swagger por exemplo;
- Ter testes funcionais para a API;

## Como foi realizado:
- Os modelos de dados estão localizados em: `/src/main/model`
- Utilizado o banco MongoDB. Foi disponibilizado um docker-composer em: `/src/main/docker`
- Teste estão localizados em: `/src/test`
