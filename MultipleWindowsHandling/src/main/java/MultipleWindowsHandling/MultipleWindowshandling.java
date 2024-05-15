package MultipleWindowsHandling;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowshandling {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	         
	        //SINGLE WINDOW
	     // Get the ID of the current window and store it in a variable
	        String ParentWindowHandel = driver.getWindowHandle();
	        // Print the ID and title of the parent window
	        System.out.println(ParentWindowHandel + driver.getTitle());
	        // Click on an element with ID "newWindowBtn" to open a new window or tab
	        driver.findElement(By.id("newWindowsBtn")).click();
	        // Get all the IDs of the currently open windows or tabs and store them in set
	        Set<String> windowHandles = driver.getWindowHandles();
	        // Loop through each handle in the set
	        for(String windowHandle : windowHandles) {
	            driver.switchTo().window(windowHandle);
	            // Print each handle and its corresponding title in the console
	            System.out.println(windowHandle + driver.getTitle());
	            
	            // Close the current window
	            driver.close();
	        }

	        }

	       }
	



