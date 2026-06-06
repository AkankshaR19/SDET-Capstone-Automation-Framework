package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GuiElementsPage;

public class GuiElementsTest extends BaseTest {

    @Test
    public void verifyTextFieldsAndSelections() throws InterruptedException {

        driver.get("https://testautomationpractice.blogspot.com");

        GuiElementsPage page = new GuiElementsPage(driver);

        // Text Fields
        page.enterName("Test User");
        page.enterEmail("testuser@gmail.com");
        page.enterPhone("9876543210");
        page.enterAddress("Demo Address");

        // Radio Button
        page.selectMaleGender();

        // Checkboxes
        page.selectSunday();
        page.selectMonday();
        page.selectFriday();
        
     // Dropdowns
        page.selectCountry();
        page.selectColor();
        page.selectAnimal();
        
     // Date Pickers
        page.enterDatePicker1();
        page.enterDatePicker2();
        page.selectDateRange();
        page.submitDateRange();
       
     // File Upload   
        String filePath = System.getProperty("user.dir")
                + "\\src\\test\\resources\\testdata\\sample.txt";

        page.uploadSingleFile(filePath);

        page.clickUploadButton();
        System.out.println(page.getUploadStatus());
        
        String file1 = System.getProperty("user.dir")
                + "\\src\\test\\resources\\testdata\\sample1.txt";

        String file2 = System.getProperty("user.dir")
                + "\\src\\test\\resources\\testdata\\sample2.txt";

        page.uploadMultipleFiles(file1, file2);

        page.clickUploadMultipleFiles();

        System.out.println(page.getMultipleFilesStatus());

        Thread.sleep(5000);
    }
}