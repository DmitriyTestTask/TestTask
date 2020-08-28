package test_file;

import org.testng.annotations.Test;
import pageObjects.AccountLoginPageObject;
import pageObjects.AccountRegisterPageObject;
import pageObjects.AddEditDeleteContactPageObject;

import static com.codeborne.selenide.Selenide.open;

public class TestClass extends TestBase {

    // registration and login
    private String name = "Te";
    private String email = "xiao@gmail.com";
    private String password = "58gh14";

    //add contact

    private String nameOfContact = "friendOfTest";
    private String emailOfContact = "friendOfTest@gmail.com";
    private String phoneOfContact = "380973584291";

    //edit contact

    String editName = "test29";
    String editEmail = "Test@gmail.com";
    String editPhone = "380973584219";


    @Test (priority = 1)
    public void createNewUser(){

        AccountRegisterPageObject accountRegisterPageObject = new AccountRegisterPageObject();

        open("/register");
        accountRegisterPageObject
                .setNameOntoNameField(name)
                .setEmailOntoEmailField(email)
                .setPasswordOntoPasswordField(password)
                .setPasswordOntoConfirmPasswordField(password)
                .clickRegisterButton();

    }


    @Test (priority = 2)
    public void  logInRegisteredUser(){

        AccountLoginPageObject accountLoginPageObject = new  AccountLoginPageObject();

        open("/login");
        accountLoginPageObject
                .setEmailOntoEmailField(email)
                .setPasswordOntoPasswordFiedl(password)
                .clickLoginButton();

    }

    @Test (priority = 3)
    public void addContact(){

        AddEditDeleteContactPageObject addAndEditContactPageObject = new AddEditDeleteContactPageObject();

        addAndEditContactPageObject
                .setNameOntoNameField(nameOfContact)
                .setEmailOntoEmailField(emailOfContact)
                .setPhoneOntoPhoneField(phoneOfContact)
                .chooseContactType()
                .clickAddContactButton();

    }

    @Test (priority = 4)
    public void editContact(){

        AddEditDeleteContactPageObject addEditDeleteContactPageObject = new AddEditDeleteContactPageObject();

        addEditDeleteContactPageObject.editContactInformation(editName, editEmail, editPhone);

    }

    @Test (priority = 5)
    public void deleteContact(){

        AddEditDeleteContactPageObject addEditDeleteContactPageObject = new AddEditDeleteContactPageObject();

        addEditDeleteContactPageObject.deleteContact();

    }

    @Test (priority = 6)
    public void logout(){

        AddEditDeleteContactPageObject addEditDeleteContactPageObject = new AddEditDeleteContactPageObject();

        addEditDeleteContactPageObject.logout();

    }



}
