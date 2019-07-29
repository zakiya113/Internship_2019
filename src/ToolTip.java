import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTip {

@Test
public void testTooltip() {

 
 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
    
 driver.manage().window().maximize();
 driver.get("https://www.seleniumhq.org/");
 
 String tooltip=driver.findElement(By.xpath("//li[@id='menu_documentation']//a[contains(text(),'Documentation')]")).getAttribute("title");
 System.out.println("Tooltip is= " +tooltip);
 
 Assert.assertEquals(tooltip ,"Technical references and guides");
 
}

}
