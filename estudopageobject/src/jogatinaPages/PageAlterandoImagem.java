package jogatinaPages;

import org.openqa.selenium.By;

import utils.WebDriverUtils;

public class PageAlterandoImagem {
	
	
	public PageAlterandoImagem() {
	}
	
	
	public void botaoMenuAlterarImagem() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[6]/ul/li[9]/a")).click();
	}


	public void selecionarAvatar(String avatar) {
		WebDriverUtils.driver.findElement(By.xpath(avatar)).click();
	}

	public void botaoConfirmarAlterarAvatar() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/form/div[2]/div/div[2]/input")).click();
	}


	
	public String obterMenuAvatar() {
		String imagemSelecionada = WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[6]/a/img")).getAttribute("src");
		return imagemSelecionada;
	} 


}
