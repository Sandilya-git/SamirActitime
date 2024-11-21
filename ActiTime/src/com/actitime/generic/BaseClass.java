package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileLib f=new FileLib();
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) throws IOException {
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
			}
		else if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.getPropertyData("url");
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws IOException {
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		LoginPage l=new LoginPage(driver);
		l.login(un,pwd);

	}
	@AfterMethod
	public void logout() throws InterruptedException {
		HomePage h=new HomePage(driver);
		Thread.sleep(2000);
		h.setLogout();
	}
	@AfterTest
	public void closeBrowser() {
	driver.quit();
	}

}
