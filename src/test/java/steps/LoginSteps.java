package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import setup.UserProperties;
import static com.codeborne.selenide.Condition.exactText;


public class LoginSteps {
    private final LoginPage loginPage = new LoginPage();

    @Given("^User opens warehouse application$")
    public void userOpenWarehouseApp() {
        Selenide.open("https://skleptest.pl/my-account/");
    }

    @When("User input credentials to login")
    public void userInputCredentialsToLogin() {
        loginPage.userLogsAs(UserProperties.USER_PROPERTIES.getUsername(), UserProperties.USER_PROPERTIES.getPassword());
    }

    @Then("^Error validation message with text: \"(.*)\" should be displayed$")
    public void invalidInfoMessageShouldNotBeDisplayed(String invalidInfoMessageText) {
//        System.out.println(loginPage.invalidInfoMessage.getText());
        loginPage.invalidInfoMessage.should(exactText(invalidInfoMessageText));
    }
}
