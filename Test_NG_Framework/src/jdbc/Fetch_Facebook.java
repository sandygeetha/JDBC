package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fetch_Facebook 
{
	public static void main(String[] args) throws InterruptedException, SQLException 
	{
//		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.facebook.com");
//		Thread.sleep(2000);
//		WebElement username = driver.findElement(By.name("email"));
//		WebElement password = driver.findElement(By.id("pass"));
//		username.sendKeys(stmt2);
//		password.sendKeys(stmt1);
		
		String url = "jdbc:mysql://localhost:3306/Owners";
		String usn = "root";
		String pwd = "root";
			Connection connect = DriverManager.getConnection(url, usn, pwd);
			Statement statment = connect.createStatement();
			ResultSet query = statment.executeQuery("select * from Userss");
			query.next();
			String stmt1 = query.getString("number");
			System.out.println(stmt1);
			
			query.next();
			String stmt2 = query.getString("name");
			System.out.println(stmt2);
			connect.close();
			
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Test_NG_Framework\\Software1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			WebElement username = driver.findElement(By.name("email"));
			WebElement password = driver.findElement(By.id("pass"));
		    
			username.sendKeys(stmt2);
			password.sendKeys(stmt1);
			
			Thread.sleep(10);
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    driver.quit();
			
		}
	}


