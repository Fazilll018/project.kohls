package project.kohls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\WebDriver\\Driver Ext\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kohls.com/product/prd-2247719/apt-9-solid-tee-men.jsp?color=Black&prdPV=2");
		
String value2 = driver.findElement(By.xpath("//div[@class='main-price']")).getText();
System.out.println(value2);

	
	}

}
