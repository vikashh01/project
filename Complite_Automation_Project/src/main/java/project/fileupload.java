package project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\AKASH KUMAR BHARTI\\Downloads\\VikashKumarBharti Resume.pdf");
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        
        Thread.sleep(2000);
	   driver.get("https://the-internet.herokuapp.com/download");
		
		driver.findElement(By.xpath("//a[normalize-space()='resume.pdf']")).click();
		


	}

}

