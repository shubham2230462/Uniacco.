package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uniacco {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//C://selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://unicreds.com/contact-us");
		driver.findElement(By.id("fullname")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//input[@id=\"fullname\"]//following::input[1]")).sendKeys("aaaaa@aa.aa");
		driver.findElement(By.id("phone")).sendKeys("123456");
		driver.findElement(By.id("message")).sendKeys("fsdfsdsfsd");
		driver.findElement(By.id("contactButton")).click();
		String txt=  driver.findElement(By.id("formMessage")).getText();
		String expectedmsg= "Message sent successfully!";
		System.out.println(txt);
		if(txt.contentEquals(expectedmsg))
		{
			System.out.println("Form has been submitted successfully");
		}
		else
		{
			System.out.println("Form has not been submitted");
		}
	}

}
