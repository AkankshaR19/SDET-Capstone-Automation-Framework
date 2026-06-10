package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuiDatePickerPage {

    WebDriver driver;

    public GuiDatePickerPage(WebDriver driver) {
        this.driver = driver;
    }

    By datePicker1 = By.id("datepicker");
    By datePicker2 = By.id("txtDate");
    By selectedDate = By.xpath("//a[text()='15']");

    By startDate = By.id("start-date");
    By endDate = By.id("end-date");

    By submitDateRange = By.xpath("//button[text()='Submit']");

    public void enterDatePicker1() {
        driver.findElement(datePicker1).sendKeys("06/06/2026");
    }

    public void enterDatePicker2() {
        driver.findElement(datePicker2).click();
        driver.findElement(selectedDate).click();
    }

    public void selectDateRange() {
        driver.findElement(startDate).sendKeys("06-06-2026");
        driver.findElement(endDate).sendKeys("10-06-2026");
    }

    public void submitDateRange() {
        driver.findElement(submitDateRange).click();
    }
}