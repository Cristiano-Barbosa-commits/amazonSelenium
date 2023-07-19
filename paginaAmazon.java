import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testeDoSiteAmazon {
	private static final String URL_AMAZON = "http://www.amazon.com.br";
	private WebDriver browser;


	@BeforeAll
	public static void beforeAll() {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	}

	@BeforeEach
	public void beforeEach() {
	this.browser = new ChromeDriver();
	}
	@AfterEach
	public void afterEach() {
		this.browser.quit();
	}
}

	@Test
	public void navegarAteprodutos() {
		browser.navigate().to(URL_AMAZON);

		browser.findElement(By.id("twotabsearchtextbox")).sendKeys("Playstation 5");
		browser.findElement(By.id("nav-search-submit-button")).click();

		String buscaProduto = browser.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(.,'Console PlayStation 5')]")).getText();
		Assert.assertEquals("Playstation 5", buscaProduto);
		Assert.assertFalse(browser.getCurrentUrl().equals(URL_AMAZON));
	}
