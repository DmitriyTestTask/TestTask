package pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddEditDeleteContactPageObject {

    private By nameField = By.xpath("//input[@name='name']");
    private By emailField = By.xpath("//input[@name='email']");
    private By phoneField = By.xpath("//input[@name='phone']");
    private By contactType = By.xpath("//input[@value='professional']");
    private By addContactButton = By.xpath("//input[@value='Add contact']");
    private By editButton = By.xpath("//button[@class='btn btn-dark btn-sm']");
    private By editContactBtn = By.xpath("//input[@value='Edit contact']");
    private By deleteContactBtn =By.xpath("//button[@class='btn btn-danger btn-sm']");
    private By logoutBtn = By.xpath("//span[@class='hide-sm']");

    public AddEditDeleteContactPageObject setNameOntoNameField(String name){
        $(nameField).setValue(name);
        return this;
    }

    public AddEditDeleteContactPageObject setEmailOntoEmailField(String email){
        $(emailField).setValue(email);
        return this;
    }

    public AddEditDeleteContactPageObject setPhoneOntoPhoneField(String phone){
        $(phoneField).setValue(phone);
        return this;
    }

    public AddEditDeleteContactPageObject chooseContactType(){
        $(contactType).click();
        return this;
    }

    public AddEditDeleteContactPageObject clickAddContactButton(){
        $(addContactButton).click();
        return this;
    }

    public AddEditDeleteContactPageObject editContactInformation(String editName, String editEmail, String editPhone){
        $(editButton).click();
        $(nameField).setValue(editName);
        $(emailField).setValue(editEmail);
        $(phoneField).setValue(editPhone);
        $(editContactBtn).click();
        return this;
    }


    public AddEditDeleteContactPageObject deleteContact(){
        $(deleteContactBtn).click();
        return this;
    }

    public void logout(){
        $(logoutBtn).click();

    }
}
