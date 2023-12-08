package sistemadetestes.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest{
	
	protected static WebDriver driver;
	//private static final String URL_BASE = "https://www.google.com";
	private static final String URL_LOGIN = "http://127.0.0.1:5500/login.html";
	private static final String URL_CRIAR = "http://127.0.0.1:5500/produtos.html?teste=123";
	private static final String PATH_DRIVE = "src/test/resources/chromedriver.exe";
	
	@BeforeClass
	public static void iniciar() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL_LOGIN);
		driver.get(URL_CRIAR);
	}
	
	@AfterClass
	public static void finalizar() {
		driver.quit();
	}
	
}