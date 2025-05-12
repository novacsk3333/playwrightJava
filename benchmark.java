package pwproj;

import com.microsoft.playwright.*;
import java.nio.file.Paths;
public class benchmark {
    public static String waitForElement(String xpath) {
        return "Hello, " + xpath + "!";
    }
    public static int launchBrowser(String site, String xpath) {
    	 try (Playwright playwright = Playwright.create()) {
    		   Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
               Page page = browser.newPage();
               // test site https://www.google.com"
               page.navigate(site);
               long startTime = System.nanoTime();
               //"xpath=//input[@aria-label=\"Google Search\"]") test xpath
               page.locator(xpath);
               long endTime = System.nanoTime();
               long duration = (endTime - startTime);
               System.out.println("Execution time: " + duration + " nanoseconds");
               System.out.println("Page title: " + page.title());
               return (int) duration;
               
    	    }
    }
}
