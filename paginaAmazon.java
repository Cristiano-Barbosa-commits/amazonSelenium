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
	private produtoPage paginaDeProdutos;


	@BeforeAll
	public static void beforeAll() {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	}

	@BeforeEach
	public void beforeEach() {
	this.produtoPage = new produtoPage();
	}
	@AfterEach
	public void afterEach() {
		this.pagina.fechar();
	}
}

	@Test
	public void navegarAteprodutos() {
		paginaDeProduto.buscarProduto("Playstation 5");
		paginaDeProduto.clicarEmBuscar();


		String buscaProduto = browser.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(.,'Console PlayStation 5')]")).getText();
		Assert.assertEquals("Playstation 5", buscaProduto);
		Assert.assertFalse(browser.getCurrentUrl().equals(URL_AMAZON));
	}
