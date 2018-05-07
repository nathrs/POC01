package pocQA01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class HomePage extends HomeElementMap  {
	
@Before
	
		

	public void webCasasHome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nathalia.r.santos\\Documents\\Automacao\\drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.webcasas.com.br/webcasas/?headerandfooter/=&utm_source=portal&utm_medium=botao-contratar&utm_campaign=credito-imobiliario#/dados-pessoais");	
}


	public void informaDados() {


		WebElement informaNome = driver.findElement(By.id("nome"));
		informaNome.click();
		informaNome.sendKeys("NATHALIA RIBEIRO");
		
		
		WebElement numeroCPF = driver.findElement(By.id("cpf"));
		numeroCPF.click();
		numeroCPF.sendKeys("944.525.660-30");
		
		data.sendKeys("01/01/1990");
		email.sendKeys("teste@teste.com.br");
		telefone.sendKeys("11999987688");
		rendaMensalBruta.sendKeys("90000");
		
	}

	public void proximaPagina() {
		btnSubmitPreAnalise.click();
		
	}

	public void paginaDadosProposta() {
		// TODO Auto-generated method stub
		
	}


}
