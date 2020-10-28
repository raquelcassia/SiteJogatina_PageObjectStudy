package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtils {
	
	private static WebDriverUtils webdriverutils = new WebDriverUtils(); 
	public static WebDriver driver;
	public static Actions action;
	
	public void WebDriverUtils(){
	}
	
	public static WebDriverUtils getInstance() {
		return webdriverutils;
	}

	public static void IniciandoChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(WebDriverUtils.driver);

	}
	
	public static void IniciandoDriver() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		driver.get("https://www.jogatina.com/");
		driver.manage().window().maximize();
	}
	
	public static void Iniciar() {
		IniciandoChrome();
		IniciandoDriver();
	}
	
	public static void AbrindoMenuSlide() {
		WebElement element = WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[6]"));
		action.moveToElement(element).build().perform();
	}
	
	public static void alterarFrame() {
		driver.switchTo().frame(WebDriverUtils.driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[2]/div[2]/div[1]/iframe")));
	}

	public static void voltarFrame() {
		driver.switchTo().defaultContent();
	}
	
	public static void fecharPopUp() {
		driver.findElement(By.id("cboxClose")).click();
	}
	
	public static void QuitChrome() {
		driver.quit();
	}
	
	public static void capturarTexto() {
		System.out.println("Texto: " + WebDriverUtils.driver.findElement(By.xpath("/html/body/div[2]")).getText());
	}
	
	
}
