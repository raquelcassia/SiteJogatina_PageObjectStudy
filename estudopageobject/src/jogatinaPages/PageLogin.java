package jogatinaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WebDriverUtils;

public class PageLogin {
	
	

	public PageLogin() {
		
	}

	public void botaoEntrar() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a")).click();
		
	}
	
	public void inserirEmail(String email) {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/div[1]/input")).sendKeys(email);;
	}
	
	public void inserirSenha(String senha) {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/div[3]/input")).sendKeys(senha);
		
	}
	
	public void botaoConfirmarLogin() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/input")).click();
	}
	
	public void LoginCompleto(String email, String senha) {
		botaoEntrar();
		inserirEmail(email);
		inserirSenha(senha);
		botaoConfirmarLogin();
		
	}
}
