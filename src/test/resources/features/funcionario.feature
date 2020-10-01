# language: pt

@DesafioWeb
Funcionalidade: Desafio WEB - Funcionário ( Cadastrar/ Editar / Excluir )

Contexto:
Dado que tenha carregado o portal

@CadastrarFuncionario
Esquema do Cenário: Deve cadastrar funcionario com sucesso
E tenha logado no sistema com "<usuario>" e "<senha>"
Quando efetuar a requisicao de cadastro de funcionario com os dados "<nome>" "<cargo>" "<cpf>" "<salario>" "<sexo>" "<admissao>"
Entao sera possivel verificar funcionario cadastrado

Exemplos:

| usuario                 | senha | nome  | cargo | cpf            | salario  | sexo      | admissao   |
| Lucas Bonanno Teste Web | T3st3 | Lucas | Dev   | 407.617.880-77 | 1.000,00 | Masculino | 10/08/2018 |

@EditarFuncionario
Esquema do Cenário: Deve editar funcionario com sucesso
E tenha logado no sistema com "<usuario>" e "<senha>"
Quando efetuar a requisicao de editar funcionario
Entao sera possivel verificar funcionario editado

Exemplos:

| usuario                 | senha | 
| Lucas Bonanno Teste Web | T3st3 |

@ExcluirFuncionario
Esquema do Cenário: Deve excluir funcionario com sucesso
E tenha logado no sistema com "<usuario>" e "<senha>"
Quando efetuar a requisicao de excluir funcionario
Entao sera possivel verificar funcionario excluido

Exemplos:

| usuario                 | senha | 
| Lucas Bonanno Teste Web | T3st3 |