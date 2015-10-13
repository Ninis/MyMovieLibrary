import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.

import com.niskanen.service.LibraryServiceImpl;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class LibrarySeleniumTest {

	private Selenium selenium;
	
	@Before
	public void setup() throws Exception{
		selenium = new DefaultSelenium("localhost", 4444, "chrome", "http://localhost:8080/MovieLibrary/");
		selenium.start();
	}
		
	@Test
	public void getLibraryCheck() {
		
	}
	
	public static void main(String[] args){
		WebDriver driver = new RemoteWebDriver(DesiredCapabilities.chrome());
		
		driver.get("http://localhost:8080/MovieLibrary/library");
		
		driver.quit();
	}
	
	@After
	public void teardown() throws Exception{
		selenium.stop();
	}

}
