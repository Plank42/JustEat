package bdd.gherkin;



import com.sentinel.Driver;
import com.sentinel.pageobjects.FooterSection;
import com.sentinel.pageobjects.HomePage;
import com.sentinel.pageobjects.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.lang.reflect.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.PageFactory;
// import org.openqa.selenium.support.ui.ExpectedCondition;
// import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

public class StepDefinition {

    private WebDriver driver;
    private String baseURL;
//    PageBeanObject expected;
//    PageBeanObject actual;
    public HomePage homepage;
    public ResultPage resultsPage;
    public FooterSection footer;

    @Before
    public void init(){
        driver = Driver.init("Chrome", BrowserType.GOOGLECHROME);
        baseURL = "http://" + Driver.getProperty("base_url");
        driver.get(baseURL);

        homepage = PageFactory.initElements(driver, HomePage.class);
        resultsPage = PageFactory.initElements(driver, ResultPage.class);
        footer = PageFactory.initElements(driver, FooterSection.class);
    }

    @After
    public void tearDown(){
        driver.close();
        driver = null;
    }

    @Given("^I want food in \"([^\"]*)\"$")
    public void iWantFoodInPlace(String term)  {
        if (!homepage.verifyPageLoaded().equals(null)){
            homepage.enterSearch(term);
        }
    }

    @Given("^I want food in \"([^\"]*)\" metropolitan area$")
    public void iWantFoodInMetropolitanArea(String arg0) throws Throwable {
        if (homepage.verifyPageLoaded().equals(null)){
            Assert.fail();
        }
    }

    @When("^I search for restaurants$")
    public void iSearchForRestaurants() {
        HomePage temp = homepage.verifyPageLoaded();
        if ( temp != null ){
            homepage.clickFindTakeawaysButton();
        }
        else {
            Assert.fail();
        }
    }

    @Then("^I should see some restaurants in \"([^\"]*)\"$")
    public void iShouldSeeSomeRestaurantsIn(String arg0) {
        if (resultsPage.verifyPageLoaded() != null) {

            if (!resultsPage.getOpenRestaurants().isEmpty()) {
                Assert.assertTrue(resultsPage.getNumberOfOpenRestaurants() > 0);
            }
            if (!resultsPage.getClosedRestaurants().isEmpty()) {
                Assert.assertTrue(resultsPage.getNumberOfClosedRestaurants() > 0);
            }
            if (!resultsPage.getCurrentlyOffline().isEmpty()) {
                Assert.assertTrue(resultsPage.getNumberOfOffline() > 0);
            }
            if (!resultsPage.getTakeAwayAreas().isEmpty()){
                Assert.assertTrue(resultsPage.getNumberOfTakeAwayAreas() > 0 );
            }
        }
        else {
            Assert.fail();
        }
    }

    @When("^I enter the search term into the search field$")
    public void iEnterTheSearchTermIntoTheSearchField() throws Throwable {
        this.iSearchForRestaurants();
    }

    @Then("^I should see get an appropriate error message - \"([^\"]*)\"$")
    public void iShouldSeeGetAnAppropriateErrorMessage(String arg0) throws Throwable {

        Assert.assertEquals(homepage.getErrorMessagesString().toLowerCase(), arg0.toLowerCase());
    }

    @When("^I click on the \"([^\"]*)\" link in the footer$")
    public void iClickOnTheLinkInTheFooter(String arg0) throws Throwable {
        Method[] methodArray = footer.getClass().getMethods();
        for(Method m: methodArray) {
            if (m.toGenericString().toLowerCase().contains(arg0.toLowerCase())){
                m.invoke(footer, (Object[]) null);
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail();
    }

}
