package br.com.inmetrics.actions;

import br.com.inmetrics.core.BaseAction;
import br.com.inmetrics.pages.HomePage;
import br.com.inmetrics.pages.LoginPage;

public class LoginAction extends BaseAction {

	private LoginPage loginPage = new LoginPage();
	private HomePage homePage = new HomePage();

	public void confirmarTelaLoginCarregadaComSucesso() {
		verificarElementosCarregadoNaPage(loginPage.usuario, loginPage.senha, loginPage.btnEntre,
				loginPage.cadastreseNavBar, loginPage.cadastreseForm);
		assertiva(loginPage.tituloForm, "web.login.expected");
	}

	public void logar(String usuario, String senha) {
		dsl.escrever(loginPage.usuario, usuario);
		dsl.escrever(loginPage.senha, senha);
		dsl.clicarBotao(loginPage.btnEntre);
		extracted();
	}

	public void extracted() {
		verificarElementosCarregadoNaPage(homePage.btnFuncionarios, homePage.btnNovoFuncionario, homePage.btnSair,
				homePage.pesquisar, homePage.listaFuncionarios);
	}

	public void preenchercadastro(String usuario, String senha) {
		dsl.clicarBotao(loginPage.cadastreseForm);
		dsl.escrever(loginPage.usuario, usuario);
		dsl.escrever(loginPage.senha, senha);
		dsl.escrever(loginPage.confirmeSenha, senha);
		dsl.clicarBotao(loginPage.btnEntre);
		confirmarTelaLoginCarregadaComSucesso();
	}

}
