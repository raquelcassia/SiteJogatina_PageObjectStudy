package jogatinaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utils.WebDriverUtils;

public class PageRealizandoCadastro {
	

	
	public PageRealizandoCadastro() {
		
	}
	
	public PageRealizandoCadastro(WebDriver driver) {
		WebDriverUtils.driver = driver;
	}

	public void botaoCadastrar() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[3]/div/div/a")).click();
	}
	
	public void preencherEmail(String email) {
		WebDriverUtils.driver.findElement(By.id("emailIn")).sendKeys(email);
		
	}
	
	public void preencherSenha(String senha) {
		WebDriverUtils.driver.findElement(By.id("password-field")).sendKeys(senha);
	}
	
	public void botaoCriarConta() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/form/div/fieldset[3]/input")).click();
	}
	
	public String obterEmailLogin() {
		String Email = WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[6]/ul/li[1]/div[2]")).getText();
		return Email;
	}
}
	

	
	 