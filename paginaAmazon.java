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
	private static final String URL_LOGIN = "http://www.amazon.com.br";
	private WebDriver browser;


	@BeforeAll
	public static void beforeAll() {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	}

	@BeforeEach
	public void beforeEach() {
	this.browser = new ChromeDriver();
	}

}
