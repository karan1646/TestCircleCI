//package test.test;
//
//import java.sql.Driver;
//import java.util.ArrayList;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine;
//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//
//public class AppTest   extends TestCase
//{
//	public static void main(String args[]) throws InterruptedException
//	{
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://business.twitter.com/start-advertising");
//		Thread.sleep(5000);
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//li/button[text()='Decline']")).click();
//		
//		driver.findElement(By.linkText("Create an ad")).click();
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		for(int i=0;i<tabs2.size();i++)
//			System.out.println(tabs2.get(i));
//		driver.switchTo().window(tabs2.get(1));
//		Thread.sleep(4000);
//		driver.get("https://business.twitter.com/start-advertising");
//		
//	}
//	
//}
package test.test;

/**
 * Hello world!
 *
 */
public class AppTest 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
