package br.com.inmetrics.pages;

import org.openqa.selenium.By;

public class LoginPage {

	public final By senha = By.name("pass");
	public final By confirmeSenha = By.name("confirmpass");
	public final By usuario = By.name("username");
	public final By btnEntre = By.xpath("//button[@class='login100-form-btn']");
	public final By cadastreseNavBar = By
			.xpath("//div[@id='navbarSupportedContent']//a[contains(text(), 'Cadastre-se')]");
	public final By cadastreseForm = By.xpath("//form//a[contains(text(), 'Cadastre-se')]");
	public final By tituloForm = By.xpath("//span[contains(@class,'login100-form-title')]");
	public final By menssagemLogin = By.className("container-message");

}
