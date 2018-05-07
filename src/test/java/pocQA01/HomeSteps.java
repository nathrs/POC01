package pocQA01;

import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps {
	
	@Test (priority = 1)
	@Given ("Acessei a tela de financiamento de imovel")
	public void webCasasHome() {
		HomePage homePage = new HomePage();
		homePage.webCasasHome(); 

	}
	@Test (priority = 2)
	@And("Informei os dados obrigatorios")
	public void informaDados()  {
		HomePage homePage = new HomePage();
		homePage.informaDados();

	}
	@Test (priority = 3	)
	@When("Clico em proximo")
	public void proximaPagina() {
		HomePage homePage = new HomePage();
		homePage.proximaPagina();
	}
	@Test (priority = 4	)
	@Then("Sou direcionado para a pagina Dados da Proposta")
	public void paginaDadosProposta() {
		HomePage homePage = new HomePage();
		homePage.paginaDadosProposta();

	}

}
