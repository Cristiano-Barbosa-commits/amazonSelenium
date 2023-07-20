import org.openqa.selenium.chrome.ChromeDriver;

pubic class produtoPage {
  
  private static final String URL_AMAZON = "http://www.amazon.com.br";
	private WebDriver browser;

  public produtosPage () {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	this.browser = new ChromeDriver();
  this.browser.navigate().to(URL_AMAZON);

  public void navegarAteProdutos () {
    browser.navigate().to(URL_AMAZON);
		browser.findElement(By.id("twotabsearchtextbox")).sendKeys("Playstation 5");
  }

  public void clicarEmBuscar () {
    browser.findElement(By.id("nav-search-submit-button")).click();

  }
  public void fechar()
    this.bowser.quit();
	}
