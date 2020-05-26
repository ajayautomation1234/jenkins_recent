package jenkins_practice.jenkins_practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

	@Test
	public void log()
	{
		

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay AM\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
		
	}

}
