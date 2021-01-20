package GridTest.GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

public class GridTestCls {

	public static void main(String[] args) throws MalformedURLException {
		// 1) Desiret Capabilities tanimlama
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		
		//2)  Chrome Opsions
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		// 3) Hup adresi verecegiz
		String hupUrl = "http://192.168.0.26:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hupUrl), options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
