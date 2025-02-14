package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import setup.UserProperties;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;


public class LoginSteps {
    private final LoginPage loginPage = new LoginPage();

    @Given("^User opens warehouse application$")
    public void userOpenWarehouseApp() {
        Selenide.open("https://skleptest.pl/my-account/");
    }

    @When("^User input credentials as (EXISTING|wrong account configuration) user to login$")
    public void userInputCredentialsToLogin(String userType) {
        switch (userType) {
            case "EXISTING" -> {
                loginPage.userLogsAs(UserProperties.USER_PROPERTIES.getUsername(), UserProperties.USER_PROPERTIES.getPassword());
            }
            case "wrong account configuration" -> {
                loginPage.userLogsAs("olgatest@gmail.com", "123123");
            }
        }
    }

    @Then("^Error validation message with text: \"(.*)\" should be displayed$")
    public void invalidInfoMessageShouldNotBeDisplayed(String invalidInfoMessageText) {
//        System.out.println(loginPage.invalidInfoMessage.getText());
        loginPage.invalidInfoMessage.should(exactText(invalidInfoMessageText));
    }

    @Then("Welcome message with text: {string} should be visible")
    public void welcomeMessageWithTextShouldBeVisible(String welcomeMessageText) {
        System.out.println(loginPage.welcomeMessage.getText());
        loginPage.welcomeMessage.shouldHave(text(welcomeMessageText));
    }
}
