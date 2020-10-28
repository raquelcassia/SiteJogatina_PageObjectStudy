package testsPages;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jogatinaPages.PageAlterandoPerfil;
import jogatinaPages.PageAlterandoPerfil.OpcoesSexo;
import jogatinaPages.PageLogin;
import utils.WebDriverUtils;

public class TesteAlterandoPerfil {
	
	
	private static PageAlterandoPerfil pageAlterandoPerfil;
	private static PageLogin login;
	
	String dadoCidade = "Rio de Janeiro";
	String dadoEstado = "RJ";
	String dadoPais = "Brasil";
	
	String dadoDia = "11";
	String dadoMes = "07";
	String dadoAno = "1994";

	OpcoesSexo dadoSexo = OpcoesSexo.FEMININO;
			
	@Before
	public void precondicao() {
		WebDriverUtils.Iniciar();
		pageAlterandoPerfil = new PageAlterandoPerfil();
		login = new PageLogin();

	}
	
	@Test
	public void validarCidade() throws Throwable {
		

		login.LoginCompleto("raquel.teste@teste.com","senhafacil");
		
		Thread.sleep(3000);
		WebDriverUtils.AbrindoMenuSlide();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.BotaoMenuAlterarPerfil();
		
		Thread.sleep(3000);
		WebDriverUtils.alterarFrame();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoCidade(dadoCidade);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoEstado(dadoEstado);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoPais(dadoPais);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.RadionButtonSexo(dadoSexo);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.SelecionarDia("11");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarMes("7");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarAno("1994");
		
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoConfirmarAlterarPerfil();
		Thread.sleep(3000);
		WebDriverUtils.capturarTexto();
		Thread.sleep(3000);

		WebDriverUtils.voltarFrame();
		Thread.sleep(1000);
		WebDriverUtils.fecharPopUp();
		Thread.sleep(3000);
		
		
		WebDriverUtils.AbrindoMenuSlide();
		Thread.sleep(6000);
		pageAlterandoPerfil.botaoMenuVerMeuPerfil();
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoPerfilEditarInformacoes();
		
		Assert.assertEquals(dadoCidade, pageAlterandoPerfil.obterCidade());
		
		
	}
	
	@Test
	public void validarEstado() throws Throwable {
			

		login.LoginCompleto("raquel.teste@teste.com","senhafacil");
		
		Thread.sleep(3000);
		WebDriverUtils.AbrindoMenuSlide();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.BotaoMenuAlterarPerfil();
		
		Thread.sleep(3000);
		WebDriverUtils.alterarFrame();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoCidade(dadoCidade);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoEstado(dadoEstado);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoPais(dadoPais);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.RadionButtonSexo(dadoSexo);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.SelecionarDia("11");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarMes("7");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarAno("1994");
		
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoConfirmarAlterarPerfil();
		Thread.sleep(3000);
		WebDriverUtils.capturarTexto();
		Thread.sleep(3000);

		WebDriverUtils.voltarFrame();
		Thread.sleep(1000);
		WebDriverUtils.fecharPopUp();
		Thread.sleep(3000);
		
		
		WebDriverUtils.AbrindoMenuSlide();
		Thread.sleep(6000);
		pageAlterandoPerfil.botaoMenuVerMeuPerfil();
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoPerfilEditarInformacoes();
		

		Assert.assertEquals(dadoEstado, pageAlterandoPerfil.obterEstado());
		
	}
	
	@Test
	public void validarPais() throws Throwable {
		
		
		login.LoginCompleto("raquel.teste@teste.com","senhafacil");
		
		Thread.sleep(3000);
		WebDriverUtils.AbrindoMenuSlide();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.BotaoMenuAlterarPerfil();
		
		Thread.sleep(3000);
		WebDriverUtils.alterarFrame();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoCidade(dadoCidade);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoEstado(dadoEstado);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoPais(dadoPais);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.RadionButtonSexo(dadoSexo);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.SelecionarDia("11");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarMes("7");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarAno("1994");
		
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoConfirmarAlterarPerfil();
		Thread.sleep(3000);
		WebDriverUtils.capturarTexto();
		Thread.sleep(3000);
		WebDriverUtils.voltarFrame();
		Thread.sleep(1000);
		WebDriverUtils.fecharPopUp();
		Thread.sleep(3000);
		
		
		WebDriverUtils.AbrindoMenuSlide();
		Thread.sleep(6000);
		pageAlterandoPerfil.botaoMenuVerMeuPerfil();
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoPerfilEditarInformacoes();
		

		Assert.assertEquals(dadoPais, pageAlterandoPerfil.obterPais());
		
	}
	
	@Test
	public void validarDataNascimento() throws Throwable {
		
		login.LoginCompleto("raquel.teste@teste.com","senhafacil");
		
		Thread.sleep(3000);
		WebDriverUtils.AbrindoMenuSlide();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.BotaoMenuAlterarPerfil();
		
		Thread.sleep(3000);
		WebDriverUtils.alterarFrame();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoCidade(dadoCidade);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoEstado(dadoEstado);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoPais(dadoPais);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.RadionButtonSexo(dadoSexo);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.SelecionarDia("11");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarMes("7");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarAno("1994");
		
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoConfirmarAlterarPerfil();
		Thread.sleep(3000);
		WebDriverUtils.capturarTexto();
		Thread.sleep(3000);
		WebDriverUtils.voltarFrame();
		Thread.sleep(1000);
		WebDriverUtils.fecharPopUp();
		Thread.sleep(3000);
		
		
		WebDriverUtils.AbrindoMenuSlide();
		Thread.sleep(6000);
		pageAlterandoPerfil.botaoMenuVerMeuPerfil();
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoPerfilEditarInformacoes();
		
		Assert.assertEquals(dadoDia + "/" + dadoMes + "/" + dadoAno, pageAlterandoPerfil.obterNiver());
	
	}
	
	@Test
	public void validarRadionButtonSexo() throws Throwable {
		
		login.LoginCompleto("raquel.teste@teste.com","senhafacil");
		
		Thread.sleep(3000);
		WebDriverUtils.AbrindoMenuSlide();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.BotaoMenuAlterarPerfil();
		
		Thread.sleep(3000);
		WebDriverUtils.alterarFrame();
		
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoCidade(dadoCidade);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoEstado(dadoEstado);
		Thread.sleep(3000);
		pageAlterandoPerfil.CampoPais(dadoPais);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.RadionButtonSexo(dadoSexo);
		
		Thread.sleep(3000);
		pageAlterandoPerfil.SelecionarDia("11");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarMes("7");
		Thread.sleep(1000);
		pageAlterandoPerfil.SelecionarAno("1994");
		
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoConfirmarAlterarPerfil();
		Thread.sleep(3000);
		WebDriverUtils.capturarTexto();
		Thread.sleep(3000);
		WebDriverUtils.voltarFrame();
		Thread.sleep(1000);
		WebDriverUtils.fecharPopUp();
		Thread.sleep(3000);
		
		
		WebDriverUtils.AbrindoMenuSlide();
		Thread.sleep(6000);
		pageAlterandoPerfil.botaoMenuVerMeuPerfil();
		Thread.sleep(3000);
		pageAlterandoPerfil.botaoPerfilEditarInformacoes();
		
		switch (dadoSexo){
	        case FEMININO:
	        	Assert.assertEquals("Feminino", pageAlterandoPerfil.ObterOpcaoSexo(dadoSexo)); 
	        	break;
	        case MASCULINO:
	        	Assert.assertEquals("Mesculino", pageAlterandoPerfil.ObterOpcaoSexo(dadoSexo)); 
	            break;
	
	    }
		
	
	}
	
	
	@After
	public void finish() throws Throwable {
		WebDriverUtils.QuitChrome();
	}

}
