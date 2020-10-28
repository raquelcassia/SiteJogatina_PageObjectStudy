package testsPages;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import jogatinaPages.PageAlterandoImagem;
import jogatinaPages.PageLogin;
import utils.WebDriverUtils;

public class TesteAlterandoImagem {
	
	private static PageAlterandoImagem pageAlterandoImagem;
	private static PageLogin login;
	
	
	@Before
	public void precondicao() {
		WebDriverUtils.Iniciar();
		
		
		pageAlterandoImagem = new PageAlterandoImagem();
		login = new PageLogin();
		
	}
	
	@Test
	public void opcaoAlterarImagem() throws Throwable {
		
		login.LoginCompleto("raquel.teste@teste.com","senhafacil");
		
		Thread.sleep(3000);
		WebDriverUtils.AbrindoMenuSlide();
		
		Thread.sleep(3000);
		pageAlterandoImagem.botaoMenuAlterarImagem();
		Thread.sleep(3000);
		WebDriverUtils.alterarFrame();
		pageAlterandoImagem.selecionarAvatar("/html/body/form/div[1]/div/ul/li[16]/label/img");
		Thread.sleep(3000);
		pageAlterandoImagem.botaoConfirmarAlterarAvatar();
		Thread.sleep(3000);
		WebDriverUtils.capturarTexto();
		Thread.sleep(3000);
		WebDriverUtils.voltarFrame();
		Thread.sleep(1000);
		WebDriverUtils.fecharPopUp();
		Thread.sleep(3000);

		
		String avatarMenu = "https://s3.amazonaws.com/static.jogatina.com/images/avatar/avatar_peq124.jpg";
		
		
		assertEquals(avatarMenu, pageAlterandoImagem.obterMenuAvatar());
	}
	
	@After
	public void finish() throws Throwable {
		WebDriverUtils.QuitChrome();
	}

}
