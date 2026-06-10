package pages;

import org.openqa.selenium.By;
import utilities.WaitUtils;
import org.openqa.selenium.WebDriver;

public class GuiSearchPage {

    WebDriver driver;

    public GuiSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By wikipediaSearchBox =
            By.id("Wikipedia1_wikipedia-search-input");

    By wikipediaSearchButton =
            By.className("wikipedia-search-button");
    
    By firstWikipediaResult =
            By.xpath("(//div[@class='wikipedia-search-results']//a)[1]");

    public void searchWikipedia(String text) {

        WaitUtils.scrollToElement(
                driver,
                driver.findElement(wikipediaSearchBox));

        driver.findElement(wikipediaSearchBox)
              .sendKeys(text);

        driver.findElement(wikipediaSearchButton)
              .click();
    }
    
    public void openFirstWikipediaResult() throws InterruptedException {

        String parentWindow = driver.getWindowHandle();

        driver.findElement(firstWikipediaResult).click();

        for (String window : driver.getWindowHandles()) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);

                System.out.println("Wikipedia Title : "
                        + driver.getTitle());

                Thread.sleep(3000);

                driver.close();

                break;
            }
        }

        driver.switchTo().window(parentWindow);

        System.out.println("Returned to Automation Page");
    }
}