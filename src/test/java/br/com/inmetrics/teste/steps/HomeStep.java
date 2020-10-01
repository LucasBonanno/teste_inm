package br.com.inmetrics.teste.steps;

import br.com.inmetrics.actions.HomeAction;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class HomeStep {

	private HomeAction homeAction = new HomeAction();

	/********* @Quando ************/

	@Quando("efetuar a requisicao de editar funcionario")
	public void efetuarARequisicaoDeEditarFuncionario() {
		homeAction.editarFuncionario();
	}

	@Quando("efetuar a requisicao de cadastro de funcionario com os dados {string} {string} {string} {string} {string} {string}")
	public void efetuaARequisicaoDeCadastroDeFuncionario(String nome, String cargo, String cpf, String salario,
			String sexo, String admissao) {
		homeAction.cadastrarFuncionario(nome, cargo, cpf, salario, sexo, admissao);
	}

	@Quando("efetuar a requisicao de excluir funcionario")
	public void efetuarARequisicaoDeExcluirFuncionario() {
		homeAction.excluirFuncionario();
	}

	/********* @Entao ************/

	@Entao("sera possivel verificar funcionario excluido")
	public void seraPossivelVerificarFuncionarioExcluido() {
		homeAction.verificarFuncionarioExcluido();
	}

	@Entao("sera possivel verificar funcionario editado")
	public void seraPossivelVerificarFuncionarioEditado() {
		homeAction.validarFuncionarioEditado();
	}

	@Entao("sera possivel verificar funcionario cadastrado")
	public void seraPossivelVerificarFuncionarioCadastrado() {
		homeAction.verificarFuncionarioNaLista();
	}

}
