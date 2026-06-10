package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ParaBankRegistrationPage;
import pages.ParaBankLoginPage;
import pages.ParaBankHomePage;

public class ParaBankRegistrationTest
        extends BaseTest {

    @Test
    public void verifyRegistrationAndLogin() throws InterruptedException {

        driver.get(
            "https://parabank.parasoft.com/parabank/register.htm");

        ParaBankRegistrationPage registerPage =
                new ParaBankRegistrationPage(driver);

        ParaBankHomePage homePage =
                new ParaBankHomePage(driver);

        ParaBankLoginPage loginPage =
                new ParaBankLoginPage(driver);

        String username =
                registerPage.registerUser();
        
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(8000);

        System.out.println(
                "Registration Successful");

        homePage.logout();

        loginPage.login(
                username,
                "Password123");

        Assert.assertTrue(
                driver.getPageSource()
                      .contains("Accounts Overview"));

        System.out.println(
                "Login Successful");
    }
}