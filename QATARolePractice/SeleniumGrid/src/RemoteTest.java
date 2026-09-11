import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;

public class RemoteTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        //options.setPlatformName(Platform.WINDOWS.name());
		options.setPlatformName(Platform.MAC.name());

        // Selenium 4 Hub URL without /wd/hub
        WebDriver wb = new RemoteWebDriver(new URL("http://localhost:4444"), options);

        // Your test logic
        wb.get("https://www.google.com");
        System.out.println("Page Title: " + wb.getTitle());

        //wb.quit();
		
	}

}
