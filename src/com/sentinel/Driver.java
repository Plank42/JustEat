package com.sentinel;


import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.util.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sentinel on 25/02/2016.
 */
public final class Driver implements WebDriver, BrowserType{
    private static String drivername;
    private static String browsertype;
    private static Platform currentPlatform;
    private static PropertyLoader props = new PropertyLoader();
    private static org.openqa.selenium.WebDriver driver;
    private static String url;
    private static Calendar rightNow = new GregorianCalendar();
    private static String date;
    private static String currentWindowHandle;


//    public Browser(String name, String type) {
//        init(name, type);
//    }

    public static WebDriver init(String name, String type) {

        drivername = name;
        browsertype = type;
        url = "http://" + props.loadProperty("base_url");

        if (type.equals(BrowserType.GOOGLECHROME)) {
            //System.setProperty("webdriver.chrome.driver", "../BasicSetup/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (type.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        }
        else {
            driver = new InternetExplorerDriver();
        }
        date =  rightNow.getTime().toString();

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    public String getName() {
        return drivername;
    }

    public String getType() {
        return browsertype;
    }

    public String getDate() {
        return date;
    }

    public Platform getCurrentPlatform() {
        return currentPlatform;
    }

    @Override
    public void get(String s) {
        if (s.isEmpty()) {
            url = props.loadProperty("base_url");
        }
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        System.out.println(driver.getTitle());
        return driver.getTitle();

    }

    @Override
    public List<WebElement> findElements(By by) {
        List<WebElement> tempList = driver.findElements(by);
        if (tempList.isEmpty()) {
            return null;
        }
        return tempList;
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        // Note that when you put these in a list they are listed in the order that they have been opened.
        Set<String> availableWindows = driver.getWindowHandles();
        if (availableWindows.size() > 1){
            return availableWindows;
        }
        return null;
    }

    @Override
    public String getWindowHandle() {
        if (currentWindowHandle.isEmpty()){
            currentWindowHandle = driver.getWindowHandle();
        }

        return currentWindowHandle;
    }

    @Override
    public TargetLocator switchTo() {

        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    public void refresh(){
        Navigation o = this.navigate();
        o.refresh();
    }

    public void back(){
        Navigation o = this.navigate();
        o.back();
    }

    public void forward() {
        Navigation o = this.navigate();
        o.forward();
    }

    public void to(String url){
        Navigation o = this.navigate();
        if (Driver.url.isEmpty()){
            Driver.url = url;
        }
        o.to(Driver.url);
    }

    @Override
    public Options manage() throws PendingException{

        throw new PendingException();
    }

    public static String getProperty(String property){
        PropertyLoader pl = new PropertyLoader();
        String temp = pl.loadProperty(property);
        pl = null;
        return temp;
    }
}

class PropertyLoader{

    private Properties properties;

    private static final String PROP_FILE = "resource/application.properties";

    public String loadProperty(String property) {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(PROP_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!property.isEmpty()){
            return properties.getProperty(property);
        }
        return null;
    }
}