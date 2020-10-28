package jogatinaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.WebDriverUtils;

public class PageAlterandoPerfil {
	
	
	public enum OpcoesSexo{
		MASCULINO, FEMININO;	
	}
	
	public void AlterandoPerfil() {
	}
	
	public void AlterandoPerfil(WebDriver driver) {
		WebDriverUtils.driver = driver;
	}
	
	public void BotaoMenuAlterarPerfil() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[6]/ul/li[8]/a")).click();
	}
	
	public void CampoCidade(String cidade) {
		WebDriverUtils.driver.findElement(By.id("campo-new-city")).clear();
		WebDriverUtils.driver.findElement(By.id("campo-new-city")).sendKeys(cidade);
	}
	
	public void CampoEstado(String estado) {
		WebDriverUtils.driver.findElement(By.id("campo-new-state")).clear();
		WebDriverUtils.driver.findElement(By.id("campo-new-state")).sendKeys("estado");
	}
	
	public void CampoPais(String pais) throws Throwable {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/select")).click();
		Select select = new Select(WebDriverUtils.driver.findElement(By.id("country")));
		Thread.sleep(1000);
		select.selectByVisibleText(pais);
	}
	
	public static void RadionButtonSexo(OpcoesSexo opcao) {
		switch (opcao){
        case FEMININO:
        	WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[4]/input[2]")).click();
            break;
        case MASCULINO:
        	WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[4]/input[1]")).click();
            break;
		}
    
	}
	
	public static String  ObterOpcaoSexo(OpcoesSexo opcao) {
	        	return WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[7]/div[2]/label[4]")).getText();
	     
	}
	
	
	public void RadioButtonMasc() {
    	WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[4]/input[2]")).click();

	}
	
	public void RadioButtonFem() {
    	WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[4]/input[1]")).click();

	}
	
	public void SelecionarDia(String dia) throws Throwable {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[5]/select[1]")).click();
		Select select = new Select(WebDriverUtils.driver.findElement(By.id("birthday")));
		Thread.sleep(1000);
		select.selectByVisibleText(dia);
	}
	
	public void SelecionarMes(String mes) throws Throwable {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[5]/select[2]")).click();
		Select select = new Select(WebDriverUtils.driver.findElement(By.id("birthmonth")));
		Thread.sleep(1000);
		select.selectByVisibleText("Julho");
	}
	
	public void SelecionarAno(String ano) throws Throwable {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[5]/select[3]")).click();
		Select select = new Select(WebDriverUtils.driver.findElement(By.id("birthyear")));
		Thread.sleep(1000);
		select.selectByVisibleText("1994");
	}
	
	public void botaoConfirmarAlterarPerfil() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[6]/input")).click();
	}
	
	
	public void botaoMenuVerMeuPerfil() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[6]/ul/li[4]")).click();
	}
	
	public void botaoPerfilEditarInformacoes() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div[2]/p/a")).click();
	}
	
	public String obterCidade() {
		String text = WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[7]/div[2]/label[1]")).getText();
		return text;
	}
	
	public String obterEstado() {
		String text = WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[7]/div[2]/label[2]")).getText();
		return text;
	}
	
	public String obterPais() {
		String text = WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[7]/div[2]/label[3]")).getText();
		return text;
	}
	
	
	public String obterNiver() {
		String text = WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[7]/div[2]/label[5]")).getText();
		return text;
	}
}
