package br.com.inmetrics.teste.steps;

import br.com.inmetrics.actions.LoginAction;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginStep {

	private LoginAction login = new LoginAction();

	/********* @Dado ************/

	@Dado("que tenha carregado o portal")
	public void queTenhaCarregadoOPortal() {
		login.confirmarTelaLoginCarregadaComSucesso();
	}

	@Dado("tenha logado no sistema com {string} e {string}")
	public void tenhaLogadoNoSistemaComE(String usuario, String senha) {
		login.logar(usuario, senha);
	}

	/********* @Quando ************/

	@Quando("efetuar a requisicao de cadastro com usuario {string} e senha {string}")
	public void efetuarARequisicaoDeCadastroComUsuarioESenha(String usuario, String senha) {
		login.preenchercadastro(usuario, senha);
	}

	/********* @Entao ************/

	@Entao("sera possivel logar sistema com usuario {string} e senha {string} cadastrado")
	public void seraPossivelLogarSistemaComUsuarioESenhaCadastrado(String usuario, String senha) {
		login.preenchercadastro(usuario, senha);
	}
}
