package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCode 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		WebDriver driver2=new FirefoxDriver();
		Thread.sleep(2000);
		WebDriver driver3=new EdgeDriver();
				
		
	}

}
