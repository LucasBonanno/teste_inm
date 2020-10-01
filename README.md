# Teste Inmetrics [![](https://media.glassdoor.com/sqll/365875/inmetrics-squarelogo-1567180901159.png)](https://inmetrics.com.br/)

# Lucas Bonani Casanova [![](https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRaRbUJI5GN9XykXeVqDOT9uZhqAcxYLxjO7w&usqp=CAU)](https://www.linkedin.com/in/lucas-bonanno-casanova-automation-qa/)

### Desafio - Website
• Acessar o site: http://www.inmrobo.tk/accounts/login/
Features a serem automatizada:
1. Cadastrar usuário
2. Login
3. Funcionário (Cadastrar / Editar / excluir)


### Estrutura
É um Projeto Maven baseada na técnica de desenvolvimento BDD (Behavior Driven Development). Desenvolvido em Java e Gherkin com framework Selenium e as ferramentas JUnit e Cucumber. 

### Instalação
Clonar o projeto do repositório para ter acesso. Executar o comando no terminal ou na IDE:
```sh
$ git clone https://github.com/LucasBonanno/teste_inm.git
```
**Observações:**
 - É necessário ter o plugin do Cucumber intalado na IDE
 - É necessário ter o WebDriver do browser instalado no PATH do Sistema Operacional

### Execução dos Casos de Testes
A **RunCucumberTest.class** foi estruturada para ser o disparador. 
Para executar basta alimentar a opção "tags" da anotação @CucumberOptions da classe executora.
Exemplo:
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "br.com.inmetrics.teste",
        **tags = {"@DesafioWeb"},** 
		plugin = {"pretty", "html:evidences/report-html", "json:evidences/report.json"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = true
		)

A classe executora está em: **/src/test/java/br/com/inmetrics/teste/runner/RunCucumberTest.java**

Os Casos de Testes estão em:
**/src/test/resources/features**

Para selecionar o browser que será utilizado para execução dos Casos de Testes é necessário alterar o enum Browser da Propriedades.class em: 
**/src/test/java/br/com/inmetrics/core/Propriedades.java**
Exemplo:
- Utilizando o browser Chrome
  public static Browser browser = Browser.CHROME;
**Observações:**
- O Projeto está parametrizado para utilizar os browsers Chrome ou FireFox somente.

  
O report das evidências podem ser verificadas em: 
**/evidences**

### Plugins e Drivers

| Plugin | Link |
| ------ | ------ |
| Cucumber Eclipse | https://marketplace.eclipse.org/content/cucumber-eclipse-plugin |
| Cucumber Intellij | https://plugins.jetbrains.com/plugin/7212-cucumber-for-java|
| Chrome Drive | https://chromedriver.chromium.org/getting-started |
| FireFox Drive | https://github.com/mozilla/geckodriver/releases |
