package exampleMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
 


public class Sample {
	@Test
	public void exmple() {
		System.out.println("SuccessFully launched the maven");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

}
