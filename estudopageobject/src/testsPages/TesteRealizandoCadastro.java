package testsPages;

import org.junit.Assert;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jogatinaPages.PageRealizandoCadastro;
import utils.WebDriverUtils;

public class TesteRealizandoCadastro {
	
	private static PageRealizandoCadastro pageRealizandoCadastro;
	private static PageRealizandoCadastro telaHomeLogada;
	private static WebDriver driver; 
	private static Actions action;
	
	@Before
	public void precondicao() {
		WebDriverUtils.Iniciar();

		pageRealizandoCadastro = new PageRealizandoCadastro();
		telaHomeLogada = new PageRealizandoCadastro();
	}
	
	
	@Test
	public void testeCadastro()  throws Throwable {
		String DadoInseridoEmail = "raquel.teste@teste.com";
		String DadoInseridoSenha = "senhafacil";
		
		pageRealizandoCadastro.botaoCadastrar();
		pageRealizandoCadastro.preencherEmail(DadoInseridoEmail);
		pageRealizandoCadastro.preencherSenha(DadoInseridoSenha);
		pageRealizandoCadastro.botaoCriarConta();
		
		Thread.sleep(6000);
		
		WebDriverUtils.AbrindoMenuSlide();

		Thread.sleep(2000);
		
		
	
		Assert.assertEquals(DadoInseridoEmail, telaHomeLogada.obterEmailLogin());
	}
	
	
	@After
	public void finish() throws Throwable {
		WebDriverUtils.QuitChrome();
	}


}
