package methods;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class Methods extends BaseClass {

    public static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void dropDownElement(By by) {
        WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(by));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Bireysel");
    }
    public static void dropDownElement1(By by) {
        WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(by));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Araştırma Asistanı");
    }
    public static void dropDownElement2(By by) {
        WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(by));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Tezayak Grup");
    }
    public static void dropDownElement3(By by) {
        WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(by));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Araştırma");
    }
    public static void dropDownExpenseCategory(By by) {
        WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(by));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Amortismanlar ve Tükenme Payları");
    }
    public static void dropDownExpenseSubcategory(By by) {
        WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(by));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Amortisman Gideri-Bilgisayar ve Elektronik Cihazlar");
    }
    public static WebElement findElement(By by) {
        return driver.findElement(by);
    }
    public static List<WebElement> findElements(By by) {
        List<WebElement> elements=driver.findElements(by);
        return elements;
    }
    public static void waitVisibilityClick(By by) {
        WebElement web=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        web.click();
        logger.info(by+"Görüldü ve tıklan");
    }
    public static void waitClicableClick(By by) {
        WebElement we =wait.until(ExpectedConditions.elementToBeClickable(by));
        we.click();
        logger.info(by+"Görüldü ven tıklandı!");
    }
    public static void waitVisibilitySendKey(By by, String key) {
        WebElement we= wait.until(ExpectedConditions.elementToBeClickable(by));
        we.sendKeys(key);
        logger.info(by+"'lı  görüldü   "+key+" değerimiz girildi");
    }
    public static void clearToElement(By by) {

        findElement(by).clear();
    }

}
