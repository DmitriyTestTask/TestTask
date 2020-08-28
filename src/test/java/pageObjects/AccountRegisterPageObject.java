package pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountRegisterPageObject {

    private By nameField = By.xpath("//input[@name='name']");
    private By emailField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By confirmPasswordField = By.xpath("//input[@name='passwordConfirmation']");
    private By registerButton = By.xpath("//input[@value='Register']");

    public AccountRegisterPageObject setNameOntoNameField(String name){
        $(nameField).setValue(name);
        return this;
    }

    public AccountRegisterPageObject setEmailOntoEmailField(String email){
        $(emailField).setValue(email);
        return this;
    }

    public AccountRegisterPageObject setPasswordOntoPasswordField(String password){
        $(passwordField).setValue(password);
        return this;
    }

    public AccountRegisterPageObject setPasswordOntoConfirmPasswordField(String password){
        $(confirmPasswordField).setValue(password);
        return this;
    }

    public AccountRegisterPageObject clickRegisterButton(){
        $(registerButton).click();
        return this;
    }
}
