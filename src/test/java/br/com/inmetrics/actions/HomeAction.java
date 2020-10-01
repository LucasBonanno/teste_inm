package br.com.inmetrics.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;

import br.com.inmetrics.core.BaseAction;
import br.com.inmetrics.pages.HomePage;

public class HomeAction extends BaseAction {

	private HomePage homePage = new HomePage();

	private LinkedList<String> dadosFuncionario = new LinkedList<String>();

	private String[] obtervaloresLinha = null;

	public void cadastrarFuncionario(String nome, String cargo, String cpf, String salario, String sexo,
			String admissao) {
		try {
			reservarDadosFuncionario(nome, cargo, cpf, sexo, admissao);
			dsl.clicarBotao(homePage.btnNovoFuncionario);
			dsl.isVisible(homePage.nomeFuncionarioForm);
			dsl.escrever(homePage.nomeFuncionarioForm, nome);
			dsl.escrever(homePage.cargoFuncionarioForm, cargo);
			dsl.escrever(homePage.cpfFuncionarioForm, cpf);
			dsl.clicarBotao(homePage.salarioFuncionarioForm);
			if (dsl.isAlertPresent()) {
				Assert.fail(dsl.alertaObterTexto() + "CPF utilizado: " + cpf);
			}
			dsl.escrever(homePage.salarioFuncionarioForm, salario);
			dsl.selecionarCombo(homePage.sexoFuncionarioForm, sexo);
			dsl.clicarBotao(homePage.cltFuncionarioForm);
			dsl.escrever(homePage.admissaoFuncionarioForm, admissao);
			dsl.clicarBotao(homePage.btnEnviarFuncionarioForm);
			assertiva(homePage.mensagemAlert, "web.message.cadastro.expected");
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	private void reservarDadosFuncionario(String nome, String cargo, String cpf, String sexo, String admissao) {
		dadosFuncionario.add(nome);
		dadosFuncionario.add(cpf);
		dadosFuncionario.add(sexo);
		dadosFuncionario.add(cargo);
		dadosFuncionario.add(admissao);

	}

	public void verificarFuncionarioNaLista() {
		try {
			LoginAction loginAction = new LoginAction();
			loginAction.extracted();
			String string = dadosFuncionario.get(1);
			dsl.escrever(homePage.pesquisar, string);
			obtervaloresLinha = dsl.obtervaloresLinha(homePage.listaFuncionarios, 1);
			List<String> retornoLista = new ArrayList<String>(Arrays.asList(obtervaloresLinha));
			Assert.assertEquals(dadosFuncionario, retornoLista);
		} catch (Exception e) {
			throw new RuntimeException("Não foi possível encontrar funcionário cadastrado." + e);
		}
	}

	public void editarFuncionario() {
		obtervaloresLinha = dsl.obtervaloresLinha(homePage.listaFuncionarios, 1);
		obtervaloresLinha[0] = obtervaloresLinha[0] + " Alterado por Automação";
		dsl.clicarBotao(homePage.btnEditar);
		dsl.isVisible(homePage.nomeFuncionarioForm);
		dsl.escrever(homePage.nomeFuncionarioForm, obtervaloresLinha[0]);
		dsl.clicarBotao(homePage.btnEnviarFuncionarioForm);
	}

	public void validarFuncionarioEditado() {
		assertiva(homePage.mensagemAlert, "web.message.atual.expected");
		dsl.escrever(homePage.pesquisar, obtervaloresLinha[0]);
		String nome = dsl.obterTexto(homePage.nomeFuncionarioLista);
		Assert.assertEquals(obtervaloresLinha[0].toString(), nome);
	}

	public void excluirFuncionario() {
		editarFuncionario();
		validarFuncionarioEditado();
		dsl.clicarBotao(homePage.btnExcluir);
	}

	public void verificarFuncionarioExcluido() {
		assertiva(homePage.mensagemAlert, "web.message.excluir.expected");
		dsl.escrever(homePage.pesquisar, obtervaloresLinha[0]);
		assertiva(homePage.nomeFuncionarioLista, "web.message.empty.expected");
	}

}
