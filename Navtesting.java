package Seleniumpg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navtesting {
		public static void main(String[] args) throws InterruptedException{
					 
	         System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 System.out.println("Loading URL one by one ........");
				driver.get("https://www.jaguar.in/index.html");
				System.out.println("Current title is : " + driver.getTitle());
				driver.get("http://google.com");
				System.out.println("Current title is : " + driver.getTitle());
				driver.get("http://flipkart.com");
				System.out.println("Current title is : " + driver.getTitle());
				System.out.println("Going back....");
				driver.navigate().back();
				System.out.println("Current title is : " + driver.getTitle());
				driver.navigate().back();
				System.out.println("Current title is : " + driver.getTitle());
				System.out.println("Going forward......");
				driver.navigate().forward();
				System.out.println("Current title is : " + driver.getTitle());
				driver.navigate().forward();
				System.out.println("Current title is : " + driver.getTitle());
     }
}
