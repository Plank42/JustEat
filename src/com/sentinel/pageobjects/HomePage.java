package com.sentinel.pageobjects;

import java.util.Map;
import com.sentinel.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private Map<String, String> data;
    private org.openqa.selenium.WebDriver driver;
    private int timeout = 15;
    private String title;


    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        this();
        this.driver = driver;
        this.title = Driver.getProperty("base_title");
    }

    public HomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    @FindBy(id = "where") @CacheLookup private WebElement searchField;
    @FindBy(id = "btnSearch") @CacheLookup private WebElement findTakeaways;
    @FindBy(css = "a[href='/account/login?returnurl=%2f']") @CacheLookup private WebElement logInTop;
    @FindBy(id = "menu-visible") @CacheLookup private WebElement menu;
    private final String pageLoadedText = "Choose from over 20,000 takeaways";
    private final String pageUrl = "/";
    @FindBy(css = "a[class='je-skip-to-menu-link']") @CacheLookup private WebElement skipToMenu;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/suggest-a-restaurant']") @CacheLookup private WebElement suggestATakeaway;
    @FindBy(id = "addItemsToBasket") @CacheLookup private WebElement undefined;


    /**
     * Get the error message web element
     * @return
     */
    public WebElement getErrorMessages() {
        return errorMessages;
    }

    @FindBy(css = "* div.l-col.l-size1of4.postcodeField > label") @CacheLookup WebElement errorMessages;

    /**
     * Get the text from the error message web element
     *
     * @return
     */
    public String getErrorMessagesString() {
        return errorMessages.getText();
    }

    /**
     * Click on Find Takeaways Button.
     *
     * @return the HomePage class instance.
     */
    public void clickFindTakeawaysButton() {
        findTakeaways.click();
    }

    /**
     * Type in a post code to the search field
     * @param postcode
     * @return
     */
    public boolean enterSearch(String postcode) {
        if (postcode != "") {
            this.searchField.sendKeys(postcode.toLowerCase());
            return true;
        }
        return false;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    /**
     * Click on Log In Link.
     *
     * @return the HomePage class instance.
     */
    public void clickLogIn1Link() {
        logInTop.click();

    }

     /**
     * Click on Skip To Menu Link.
     *
     * @return the HomePage class instance.
     */
    public void clickSkipToMenuLink() {
        skipToMenu.click();

    }

    /**
     * Click on Suggest A Takeaway Link.
     *
     * @return the HomePage class instance.
     */
    public void clickSuggestATakeawayLink() {
        suggestATakeaway.click();

    }


    /**
     * Click on Undefined Button.
     *
     * @return the HomePage class instance.
     */
    public void clickUndefinedButton() {
        undefined.click();

    }

    /**
     * Unset Menu Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public void unsetMenuCheckboxField() {
        if (menu.isSelected()) {
            menu.click();
        }

    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(org.openqa.selenium.WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(org.openqa.selenium.WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }


    public WebElement getUndefined() {
        return undefined;
    }

    public WebElement getSuggestATakeaway() {
        return suggestATakeaway;
    }

    public WebElement getSkipToMenu() {
        return skipToMenu;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public String getPageLoadedText() {
        return pageLoadedText;
    }

    public WebElement getMenu() {
        return menu;
    }

    public WebElement getLogInTop() {
        return logInTop;
    }

    public WebElement getFindTakeaways() {
        return findTakeaways;
    }

    public String getTitle() {
        return title;
    }

    public int getTimeout() {
        return timeout;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Map<String, String> getData() {
        return data;
    }
}
