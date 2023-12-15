package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPageTest {

	@Test
public  void LoginTest()
{
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
}
}