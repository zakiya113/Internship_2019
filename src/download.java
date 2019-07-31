import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class download {
public static void main(String[] args)  throws InterruptedException {		
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
	 
		 driver.get("http://the-internet.herokuapp.com/download"); 
		      driver.findElement(By.xpath(" //a[contains(text(),'some-file.txt')]")).click();
		 Thread.sleep(2000);
}
}