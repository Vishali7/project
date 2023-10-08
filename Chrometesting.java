package Seleniumpg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	 class Chrometesting {
		public static void main(String[] args) throws InterruptedException{
					 
	         System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			 WebDriver d=new ChromeDriver();
			 //Website to launch
			   d.get("https://www.amazon.in/");
			 
			 //getTitle() to obtain page title
			   System.out.println("Page title is: " + d.getTitle());
			 
			   Thread.sleep(6000);
			   d.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
			   d.findElement(By.id("nav-search-submit-button")).click();
			 
			 //String url = "https://www.floweraura.com/flowers/";
			 //d.get(url);
			 //get current url and print
			 //String strurl = d.getCurrentUrl();
			 //System.out.println("Current url is: " + strurl);			 
}
	}
