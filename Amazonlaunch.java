import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlaunch {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone",Keys.ENTER);

	}

}
