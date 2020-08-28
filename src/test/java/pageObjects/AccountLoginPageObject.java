package pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountLoginPageObject {

    private By emailField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//input[@value='Login']");

    public AccountLoginPageObject setEmailOntoEmailField(String email){
        $(emailField).setValue(email);
        return this;
    }

    public AccountLoginPageObject setPasswordOntoPasswordFiedl(String password){
        $(passwordField).setValue(password);
        return this;
    }

    public void clickLoginButton(){
        $(loginButton).click();
    }

}
