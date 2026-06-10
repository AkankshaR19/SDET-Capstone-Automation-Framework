package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.WaitUtils;
public class GuiActionPage {

    WebDriver driver;

    public GuiActionPage(WebDriver driver) {
        this.driver = driver;
    }   
        By field1 = By.id("field1");
        By field2 = By.id("field2");
        By copyTextBtn = By.xpath("//button[text()='Copy Text']");
        
        By dragElement = By.id("draggable");
        By dropElement = By.id("droppable");
        
        By slider =
                By.xpath("//span[contains(@class,'ui-slider-handle')]");
        
        By pointMeBtn =
                By.xpath("//button[text()='Point Me']");
        
        By comboBox = By.id("comboBox");
        
        
        
        public void performDoubleClick() {

            Actions action = new Actions(driver);

            WebElement button =
                    driver.findElement(copyTextBtn);

            action.doubleClick(button).perform();
        }
        
        public void performDragAndDrop() {

            Actions action = new Actions(driver);

            WebElement source =
                    driver.findElement(dragElement);

            WebElement target =
                    driver.findElement(dropElement);

            action.dragAndDrop(source, target)
                  .perform();
        }
        
        public void moveSlider() {

            WebElement sliderElement =
                    driver.findElement(slider);

            WaitUtils.scrollToElement(
                    driver,
                    sliderElement);

            Actions action =
                    new Actions(driver);

            action.dragAndDropBy(
                    sliderElement,
                    80,
                    0)
                  .perform();
        }
        
        public void performMouseHover() {

            WebElement hoverElement =
                    driver.findElement(pointMeBtn);

            WaitUtils.scrollToElement(
                    driver,
                    hoverElement);

            Actions action =
                    new Actions(driver);

            action.moveToElement(hoverElement)
                  .perform();
        }
        
        public void selectScrollingDropdown() {

            driver.findElement(comboBox)
                  .click();
            

            driver.findElement(comboBox)
                  .sendKeys("Item 5");

            System.out.println("Scrolling Dropdown Item Selected");
        }
    
}