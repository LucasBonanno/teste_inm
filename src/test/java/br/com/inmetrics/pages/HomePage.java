package br.com.inmetrics.pages;

import org.openqa.selenium.By;

public class HomePage {

	public final By listaFuncionarios = By.id("tabela");
	public final By pesquisar = By.xpath("//div[@id='tabela_filter']//input");
	public final By btnFuncionarios = By
			.xpath("//div[@id='navbarSupportedContent']//a[contains(text(), 'Funcionários')]");
	public final By btnNovoFuncionario = By
			.xpath("//div[@id='navbarSupportedContent']//a[contains(text(), 'Novo Funcionário')]");
	public final By btnSair = By.xpath("//div[@id='navbarSupportedContent']//a[contains(text(), 'Sair')]");
	public final By btnExcluir = By.id("delete-btn");
	public final By btnEditar = By.xpath("//span[contains(@class, 'pencil')]");
	public final By nomeFuncionarioForm = By.id("inputNome");
	public final By cargoFuncionarioForm = By.id("inputCargo");
	public final By cpfFuncionarioForm = By.id("cpf");
	public final By salarioFuncionarioForm = By.id("dinheiro");
	public final By sexoFuncionarioForm = By.id("slctSexo");
	public final By cltFuncionarioForm = By.id("clt");
	public final By pjFuncionarioForm = By.id("pj");
	public final By admissaoFuncionarioForm = By.id("inputAdmissao");
	public final By btnEnviarFuncionarioForm = By.xpath("//input[@type='submit']");
	public final By btnCancelarFuncionarioForm = By.id("//input[@value='Cancelar']");
	public final By mensagemAlert = By.xpath("//div[contains(@class, 'alert')]");
	public final By nomeFuncionarioLista = By.xpath("//table/tbody/tr/td[1]");
}
