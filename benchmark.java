package pwproj;

import com.microsoft.playwright.*;
import java.nio.file.Paths;
public class benchmark {
    public static String waitForElement(String xpath) {
        return "Hello, " + xpath + "!";
    }
    public static void launchBrowser() {
    	 try (Playwright playwright = Playwright.create()) {
    		   Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
               Page page = browser.newPage();
               page.navigate("https://www.google.com");
               System.out.println("Page title: " + page.title());
    	    }
    }
    
}
