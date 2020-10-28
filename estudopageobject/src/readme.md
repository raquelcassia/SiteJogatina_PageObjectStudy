	 
	 public void abrirMenu() throws Throwable {
		 Thread.sleep(2000);
		// try{
			 WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul[1]/li[1]/a"));
			//action.moveToElement(element).build().perform();
				System.out.println("conseguiu abrir menu");

		// }
		// catch(WebDriverException e){
			//	System.out.println(e + "\n erro no menu");
		// }
	 }
	
	public void botaoMenuAlterarImagem() {
		driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[6]/ul/li[9]/a"));
	}
	
	public void alterarFrame() {
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[2]/div[2]/div[1]/iframe")));
	}
	
	public void voltarFrame() {
		driver.switchTo().defaultContent();
	}
	
	public void selecionarAvatar(String avatar) {
		driver.findElement(By.xpath(avatar)).click();
	}
	
	public void botaoAlterarAvatar() {
		driver.findElement(By.xpath("/html/body/form/div[2]/div/div[2]/input")).click();
	}
	
	public void fecharPpopUp() {
		driver.findElement(By.id("cboxClose")).click();
	}
	
	 public void hoverLogin() throws Throwable {
		 Thread.sleep(2000);
		// try{
			 WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a"));
			action.moveToElement(element).build().perform();
				//System.out.println("conseguiu abrir menu");

		// }
		// catch(WebDriverException e){
			//	System.out.println(e + "\n erro no menu");
		}
	
	public void menuAlterarImagem(String avatar) throws Throwable {
		abrirMenu();
		/**botaoMenuAlterarImagem();
		alterarFrame();
		selecionarAvatar(avatar);
		botaoAlterarAvatar();
		voltarFrame();
		fecharPpopUp();**/
	}
	
	public TelaCadastro(WebDriver driver, Actions action) {
		this.driver = driver;
		this.action = action;
	}