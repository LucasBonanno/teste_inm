# language: pt

@DesafioWeb
Funcionalidade: Desafio WEB - Cadastrar Usuário

Contexto:
Dado que tenha carregado o portal

@CadastrarUsuario
Esquema do Cenário: Deve cadastrar usuario com sucesso  
Quando efetuar a requisicao de cadastro com usuario "<usuario>" e senha "<senha>"
Entao sera possivel logar sistema com usuario "<usuario>" e senha "<senha>" cadastrado

Exemplos:

| usuario           | senha | 
| Desafio Inm Lucas | T3st3 |
