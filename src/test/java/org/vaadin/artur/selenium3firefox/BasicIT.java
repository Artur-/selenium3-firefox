package org.vaadin.artur.selenium3firefox;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class BasicIT {

    private static String getBrowserExecutable(String version) {
        return "/Applications/Firefox " + version
                + ".app/Contents/MacOS/firefox";
    }

    @Test
    public void FF45() {
        // java.lang.AssertionError: window.something was incorrect
        // expected:<something else> but was:<null>
        test("45 ESR");
    }

    @Test
    public void FF46() {
        // java.lang.AssertionError: window.something was incorrect
        // expected:<something else> but was:<null>
        test("46");
    }

    @Test
    public void FF47() {
        // java.lang.AssertionError: window.something was incorrect
        // expected:<something else> but was:<null>
        test("47");
    }

    @Test
    public void FF48() {
        // org.openqa.selenium.TimeoutException: Expected condition failed:
        // waiting for BasicIT$1@... (tried for 5 second(s) with 500
        // MILLISECONDS interval)
        test("48");
    }

    @Test
    public void FF49() {
        // org.openqa.selenium.TimeoutException: Expected condition failed:
        // waiting for BasicIT$1@... (tried for 5 second(s) with 500
        // MILLISECONDS interval)
        test("49");
    }

    @Test
    public void FF50() {
        // org.openqa.selenium.TimeoutException: Expected condition failed:
        // waiting for BasicIT$1@... (tried for 5 second(s) with 500
        // MILLISECONDS interval)
        test("50");
    }

    @Test
    public void FF51() {
        // org.junit.ComparisonFailure: expected:<timer[ double-clicked]> but
        // was:<timer[]>
        test("51b8");
    }

    private void test(String version) {
        FirefoxDriver driver = null;
        try {
            driver = new FirefoxDriver(
                    new FirefoxBinary(new File(getBrowserExecutable(version))),
                    null);
            driver.get("http://localhost:3000/testpage.html");
            Assert.assertEquals("window.something failure", "something else",
                    driver.executeScript("return window.something;"));
            new WebDriverWait(driver, 5).until(new Predicate<WebDriver>() {
                @Override
                public boolean apply(WebDriver driver) {
                    return ((FirefoxDriver) driver)
                            .executeScript("return div.innerText")
                            .equals("timer");
                }
            });
            WebElement div = driver.findElement(By.xpath("//div"));
            new Actions(driver).doubleClick(div);
            Assert.assertEquals("timer double-clicked", div.getText());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }

    }

}