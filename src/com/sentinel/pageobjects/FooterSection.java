package com.sentinel.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sentinel on 02/03/2016.
 */
public class FooterSection {

    private String title;
    private org.openqa.selenium.WebDriver driver;
    private int timeout = 15;

    public FooterSection(WebDriver driver) {
        this.driver = driver;
        this.title = "footer";
    }

    public FooterSection(WebDriver driver, int timeout) {
        this(driver);
        this.timeout = timeout;
    }

    //Take Away Types
    @FindBy(css = "a[href='http://www.just-eat.co.uk/take-away']") @CacheLookup private WebElement browseTakeaways;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/new-takeaways']") @CacheLookup private WebElement newTakeaways;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/chinese-takeaways']") @CacheLookup private WebElement chinese;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/indian-takeaways']") @CacheLookup private WebElement indian;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/italian-takeaways']") @CacheLookup private WebElement italian;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/japanese-takeaways']") @CacheLookup private WebElement japanese;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/pizza-delivery']") @CacheLookup private WebElement pizzaDelivery;


    @FindBy(css = "a[href=' http://www.just-eat.co.uk/help']") @CacheLookup private WebElement contactUs;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/account/login?returnurl=%2f']") @CacheLookup  private WebElement logInFooter;

    //Just Eat Town  Sites
    @FindBy(css = "a[href='http://www.just-eat.co.uk/birmingham-takeaway']") @CacheLookup private WebElement birmingham;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/bristol-takeaway']")@CacheLookup private WebElement bristol;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/cardiff-takeaway']") @CacheLookup private WebElement cardiff;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/edinburgh-takeaway']") @CacheLookup private WebElement edinburgh;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/glasgow-takeaway']") @CacheLookup private WebElement glasgow;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/leeds-takeaway']") @CacheLookup private WebElement leeds;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/liverpool-takeaway']") @CacheLookup private WebElement liverpool;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/manchester-takeaway']") @CacheLookup private WebElement manchester;


    // JUST EAT Country SITES
    @FindBy(css = "a[href='http://www.just-eat.com.ar']") @CacheLookup private WebElement argentina;
    @FindBy(css = "a[href='http://www.just-eat.be']") @CacheLookup private WebElement belgium;
    @FindBy(css = "a[href='http://www.restauranteweb.com.br/']") @CacheLookup private WebElement brasil;
    @FindBy(css = "a[href='http://www.just-eat.ca']") @CacheLookup private WebElement canada;
    @FindBy(css = "a[href='http://www.just-eat.dk']") @CacheLookup private WebElement denmark;
    @FindBy(css = "a[href='http://www.alloresto.fr/']") @CacheLookup private WebElement france;
    @FindBy(css = "a[href='http://justeat.in']") @CacheLookup private WebElement india;
    @FindBy(css = "a[href='http://www.just-eat.ie']")@CacheLookup private WebElement ireland;
    @FindBy(css = "a[href='http://www.just-eat.it']") @CacheLookup private WebElement italy;
    @FindBy(css = "a[href='http://www.justeat.nl']") @CacheLookup private WebElement netherlands;
    @FindBy(css = "a[href='http://www.just-eat.no']") @CacheLookup private WebElement norway;
    @FindBy(css = "a[href='http://www.just-eat.es']") @CacheLookup private WebElement spain;
    @FindBy(css = "a[href='http://www.eat.ch']") @CacheLookup private WebElement switzerland;
    @FindBy(css = "a[href='http://www.just-eat.co.uk']") @CacheLookup private WebElement unitedKingdom;


    //Other
    @FindBy(css = "a[href='http://www.just-eat.co.uk/cookiespolicy']") @CacheLookup private WebElement howDoWeUseCookies;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/blog']") @CacheLookup private WebElement blog;
    @FindBy(css = "a[class='activator']") @CacheLookup private WebElement justEatSites;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/apps']") @CacheLookup private WebElement mobileApps;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/pricepromise/']") @CacheLookup private WebElement pricePromise;
    @FindBy(css = "a[href=' http://www.just-eat.co.uk/privacy-policy']") @CacheLookup private WebElement privacyPolicyTcs;
    @FindBy(css = "a[href='http://restaurants.just-eat.co.uk']") @CacheLookup private WebElement restaurantSignUp;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/member/updateuserinfo']") @CacheLookup private WebElement myAccount;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/suggest-a-restaurant']") @CacheLookup private WebElement suggestATakeaway;
    @FindBy(css = "a[href='http://www.just-eat.co.uk/account/register?returnurl=%2f']") @CacheLookup private WebElement signUp;
    @FindBy(css = "a[href=' http://www.just-eat.co.uk/about']") @CacheLookup private WebElement aboutUs;
    @FindBy(css = "a[href='http://www.just-eat.com/current-uk-roles/']") @CacheLookup private WebElement jobs;


    /**
     * Click on About Us Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Argentina Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickArgentinaLink() {
        argentina.click();
        return this;
    }

    /**
     * Click on Belgium Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickBelgiumLink() {
        belgium.click();
        return this;
    }

    /**
     * Click on Birmingham Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickBirminghamLink() {
        birmingham.click();
        return this;
    }

    /**
     * Click on Blog Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickBlogLink() {
        blog.click();
        return this;
    }

    /**
     * Click on Brasil Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickBrasilLink() {
        brasil.click();
        return this;
    }

    /**
     * Click on Bristol Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickBristolLink() {
        bristol.click();
        return this;
    }

    /**
     * Click on Browse Takeaways Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickBrowseTakeawaysLink() {
        browseTakeaways.click();
        return this;
    }

    /**
     * Click on Canada Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickCanadaLink() {
        canada.click();
        return this;
    }

    /**
     * Click on Cardiff Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickCardiffLink() {
        cardiff.click();
        return this;
    }


    /**
     * Click on Contact Us Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Denmark Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickDenmarkLink() {
        denmark.click();
        return this;
    }


    /**
     * Click on Edinburgh Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickEdinburghLink() {
        edinburgh.click();
        return this;
    }


    /**
     * Click on France Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickFranceLink() {
        france.click();
        return this;
    }


    /**
     * Click on Glasgow Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickGlasgowLink() {
        glasgow.click();
        return this;
    }

    /**
     * Click on How Do We Use Cookies Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickHowDoWeUseCookiesLink() {
        howDoWeUseCookies.click();
        return this;
    }

    /**
     * Click on India Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickIndiaLink() {
        india.click();
        return this;
    }
    /**
     * Click on Ireland Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickIrelandLink() {
        ireland.click();
        return this;
    }

    /**
     * Click on Italy Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickItalyLink() {
        italy.click();
        return this;
    }
    /**
     * Click on Jobs Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickJobsLink() {
        jobs.click();
        return this;
    }
    /**
     * Click on Just Eat Sites Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickJustEatSitesLink() {
        justEatSites.click();
        return this;
    }

    /**
     * Click on Chinese Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickChineseLink() {
        chinese.click();
        return this;
    }

    /**
     * Click on Italian Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickItalianLink() {
        italian.click();
        return this;
    }


    /**
     * Click on Japanese Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickJapaneseLink() {
        japanese.click();
        return this;
    }


    /**
     * Click on Leeds Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickLeedsLink() {
        leeds.click();
        return this;
    }

    /**
     * Click on Liverpool Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickLiverpoolLink() {
        liverpool.click();
        return this;
    }


    /**
     * Click on Log In Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickLogIn2Link() {
        logInFooter.click();
        return this;
    }

    /**
     * Click on Manchester Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickManchesterLink() {
        manchester.click();
        return this;
    }

    /**
     * Click on Mobile Apps Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickMobileAppsLink() {
        mobileApps.click();
        return this;
    }

    /**
     * Click on My Account Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on Netherlands Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickNetherlandsLink() {
        netherlands.click();
        return this;
    }
    /**
     * Click on Norway Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickNorwayLink() {
        norway.click();
        return this;
    }


    /**
     * Click on Pizza Delivery Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickPizzaDeliveryLink() {
        pizzaDelivery.click();
        return this;
    }

    /**
     * Click on Price Promise Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickPricePromiseLink() {
        pricePromise.click();
        return this;
    }


    /**
     * Click on Privacy Policy Tcs Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickPrivacyPolicyTcsLink() {
        privacyPolicyTcs.click();
        return this;
    }

    /**
     * Click on Restaurant Sign Up Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickRestaurantSignUpLink() {
        restaurantSignUp.click();
        return this;
    }

    /**
     * Click on Sign Up Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickSignUpLink() {
        signUp.click();
        return this;
    }

    /**
     * Click on Spain Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickSpainLink() {
        spain.click();
        return this;
    }

    /**
     * Click on Suggest A Takeaway Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickSuggestATakeawayLink() {
        suggestATakeaway.click();
        return this;
    }

    /**
     * Click on Switzerland Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickSwitzerlandLink() {
        switzerland.click();
        return this;
    }

    /**
     * Click on United Kingdom Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickUnitedKingdomLink() {
        unitedKingdom.click();
        return this;
    }

    /**
     * Click on New Takeaways Link.
     * @return the ResultPage class instance.
     */
    public FooterSection clickNewTakeawaysLink() {
        newTakeaways.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePage class instance.
     */
    public FooterSection verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(org.openqa.selenium.WebDriver d) {
                return d.getPageSource().contains("http://www.just-eat.co.uk/blog");
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the HomePage class instance.
     */
    public FooterSection verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(org.openqa.selenium.WebDriver d) {
                return d.getCurrentUrl().contains("www.just-eat.co.uk/");
            }
        });
        return this;
    }
}
