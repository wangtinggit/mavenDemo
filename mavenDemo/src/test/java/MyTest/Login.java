package MyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\driver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("http://127.0.0.1:8086/discuz/");
		System.out.println("打开网址：http://127.0.0.1:8086/discuz/");
		WebElement username = chrome.findElement(By.id("ls_username"));
		System.out.println("找到元素："+username);
		username.sendKeys("admin");
		System.out.println("输入内容：admin");
		WebElement password = chrome.findElement(By.id("ls_password"));
		System.out.println("找到元素："+password);
		password.sendKeys("password");
		System.out.println("输入内容：password");
		WebElement submit = chrome.findElement(By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button"));
		System.out.println("找到元素："+submit);
		submit.click();
		System.out.println("点击元素"+submit);
		
		
	}

}
