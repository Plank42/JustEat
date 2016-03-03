package com.sentinel.pageobjects;

import java.util.List;
import java.util.Map;

import com.sentinel.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ResultPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ResultPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    @FindBy(css = "#searchResults > div.restaurants > div.openRestaurants > a")  @CacheLookup private List<WebElement> openRestaurants;
    @FindBy(css = "#searchResults > div.restaurants > div.closedRestaurants > a") @CacheLookup private List<WebElement> closedRestaurants;
    @FindBy(css = "#takeawayAreas > div.linkArchitectureLinks > ul > li") @CacheLookup private  List<WebElement> takeAwayAreas;
    @FindBy(css = "#searchResults * p.offline") @CacheLookup private List<WebElement> currentlyOffline;

    public List<WebElement> getOpenRestaurants() {
        if (!this.openRestaurants.isEmpty()) {
            return openRestaurants;
        }
        return null;
    }


    public List<WebElement> getClosedRestaurants() {
        if (!this.closedRestaurants.isEmpty()) {
            return closedRestaurants;
        }
        return null;
    }
    public List<WebElement> getCurrentlyOffline() {
        if (!this.currentlyOffline.isEmpty()) {
            return currentlyOffline;
        }
        return null;
    }

    public List<WebElement> getTakeAwayAreas() {
        if (!this.closedRestaurants.isEmpty()) {
            return takeAwayAreas;
        }
        return null;
    }

    public int getNumberOfOpenRestaurants() {
        return this.getOpenRestaurants().size();
    }
    public int getNumberOfClosedRestaurants() {
        return this.getClosedRestaurants().size();
    }
    public int getNumberOfOffline(){
        return this.getCurrentlyOffline().size();
    }
    public int getNumberOfTakeAwayAreas() {return this.getTakeAwayAreas().size();}


    @FindBy(css = "a[href='/help']") @CacheLookup private WebElement help;
    @FindBy(css = "a[title='Go to JUST EAT Home']") @CacheLookup private WebElement home;
    @FindBy(id = "menu-visible") @CacheLookup private WebElement menu;


// Sort By Filters
    @FindBy(xpath = "//*[@id=\"filters\"]/div[1]/ul/li[1]") @CacheLookup private WebElement bestMatch;
    @FindBy(xpath = "//*[@id=\"filters\"]/div[1]/ul/li[2]") @CacheLookup private WebElement distance;
    @FindBy(xpath = "//*[@id=\"filters\"]/div[1]/ul/li[3]") @CacheLookup private WebElement newestFirst;
    @FindBy(xpath = "//*[@id=\"filters\"]/div[1]/ul/li[4]") @CacheLookup private WebElement userRating;
    @FindBy(xpath = "//*[@id=\"filters\"]/div[1]/ul/li[5]") @CacheLookup private WebElement restaurantName;

    public void clickRestaurantName() {
        if (this.verifyPageLoaded() != null){
            restaurantName.click();
        }
        else {
            Assert.fail();
        }
    }

    public void getUserRating() {
        if (this.verifyPageLoaded()!= null) {
            this.userRating.click();
        }
        else {
            Assert.fail();
        }
    }

    public void getNewestFirst() {
        if (this.verifyPageLoaded()!= null) {
            this.newestFirst.click();
        }
        else {
                Assert.fail();
        }
    }

    public void getDistance() {
        if (this.verifyPageLoaded()!= null){
            this.distance.click();
        }
        else{
            Assert.fail();
        }
    }

    public void getBestMatch() {
        if (this.verifyPageLoaded() != null){
            this.bestMatch.click();
        }
        else{
            Assert.fail();
        }
    }

    @FindBy(css = "#content div:nth-of-type(3) p.pageFeedback a")private WebElement pageFeedback;
    @FindBy(css = "#searchResultsHeaderInner h1 span.changeLocation a") @CacheLookup private WebElement changeLocation;

    String postcodepart;
    String postcodeprefix;

//    private final String pageLoadedText = String.format("Takeaway Restaurants in Area%1, %2 | JUST EAT", postcodepart, postcodeprefix);
//    private final String pageUrl = "https://www.just-eat.co.uk/area/";

    /**
     * Click on Change Location Link.
     *
     * @return the ResultPage class instance.
     */
    public ResultPage clickChangeLocationLink() {
        changeLocation.click();
        return this;
    }

    /**
     * Click on Distance Link.
     * @return the ResultPage class instance.
     */
    public ResultPage clickDistanceLink() {
        distance.click();
        return this;
    }

   /**
     * Click on Help Link.
     * @return the ResultPage class instance.
     */
    public ResultPage clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on Home Link.
     * @return the ResultPage class instance.
     */
    public ResultPage clickHomeLink() {
        home.click();
        return this;
    }




    /**
     * Click on Newest First Link.
     * @return the ResultPage class instance.
     */
    public ResultPage clickNewestFirstLink() {
        newestFirst.click();
        return this;
    }

    /**
     * Click on Page Feedback Link.
     * @return the ResultPage class instance.
     */
    public ResultPage clickPageFeedbackLink() {
        pageFeedback.click();
        return this;
    }
    /**
     * Click on Restaurant Name Link.
     *
     * @return the ResultPage class instance.
     */
    public ResultPage clickRestaurantNameLink() {
        restaurantName.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the ResultPage class instance.
     */
    public ResultPage fill() {
        setMenuCheckboxField();
        return this;
    }

    /**
     * Set Menu Checkbox field.
     * @return the ResultPage class instance.
     */
    public ResultPage setMenuCheckboxField() {
        if (!menu.isSelected()) {
            menu.click();
        }
        return this;
    }

    /**
     * Unset Menu Checkbox field.
     * @return the ResultPage class instance.
     */
    public ResultPage unsetMenuCheckboxField() {
        if (menu.isSelected()) {
            menu.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     * @return the ResultPage class instance.
     */
    public ResultPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(org.openqa.selenium.WebDriver d) {
                return d.getPageSource().contains(driver.getTitle());
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     * @return the ResultPage class instance.
     */
    public ResultPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(org.openqa.selenium.WebDriver d) {
                return d.getCurrentUrl().contains(Driver.getProperty("base-url"));
            }
        });
        return this;
    }
}
