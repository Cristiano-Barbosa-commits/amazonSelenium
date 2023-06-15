import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeDoSiteAmazon {

	@Test
	public void amazonTest() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("https://amazon.com.br");
	}

}
