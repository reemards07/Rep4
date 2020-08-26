package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static Properties prop;
	public TestBase() {
		prop=new Properties();
		try {
			FileInputStream fin=new FileInputStream(System.getProperty("user.dir")+"//src//config//config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialize() {
		String browser=prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Project\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, unit)
		 */
	}

}
