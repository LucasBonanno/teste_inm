package br.com.inmetrics.core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;

public class BaseAction {

	protected DSL dsl;

	public BaseAction() {
		dsl = new DSL();
	}

	public void verificarElementosCarregadoNaPage(By... elements) {
		try {
			for (By element : elements) {
				dsl.isVisible(element);
			}
		} catch (NotFoundException e) {
			throw new NotFoundException("Tela parcialmente carregada ou não carregada totalmente.", e);
		}
	}

	public void assertiva(By locator, String keyProperty) {
		String texto = dsl.obterTexto(locator).replaceAll("\\s+", " ");
		Assert.assertEquals(PropertyReader.getProperty(keyProperty), texto);
	}
}
