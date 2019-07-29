import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
public static void main(String[] args)  throws InterruptedException {		
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
		   
driver.get("http://demo.guru99.com/test/upload/");
driver.manage().window().maximize();


WebElement upload=driver.findElement(By.xpath(".//*[@id='uploadfile_0']"));
upload.sendKeys("E:\\r2.jpg");
		
driver.findElement(By.xpath(".//*[@id='terms']")).click();
driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
		
		

	}
	}
	
