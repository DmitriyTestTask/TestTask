package test_API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Test_API {

    private String nameParam = "1";
    private String emailParam = "234@gmail.com";
    private String passwordParam = "458iop";
    private String idContact = "";
    private String addName = "1";
    private String addEmail = "qwe567@gmail.com";
    private String addPhone = "589123753";
    private String addType = "personal";


    @Test
    public void getWebSite(){
        RestAssured.given()
                .get("https://cryptic-retreat-46933.herokuapp.com/api/auth/me")
                .then()
                .statusCode(401);
    }

    @Test
    public void loginUser() {
        RestAssured.given()
                .param("email:", emailParam)
                .param("password:", passwordParam)
                .post("https://cryptic-retreat-46933.herokuapp.com/api/auth/login")
                .then();
//                .statusCode(200);
//
    }

    @Test
    public void registrationNewUser(){
        RestAssured.given()
                .param("name", nameParam)
                .param("email", emailParam)
                .param("password", passwordParam)
                .post("https://cryptic-retreat-46933.herokuapp.com/api/users")
                .then()
                .statusCode(200);

    }
    @Test
    public void addContact(){
        RestAssured.given()
                .param("name", addName)
                .param("email", addEmail)
                .param("phone",addPhone)
                .param("type", addType)
                .post("https://cryptic-retreat-46933.herokuapp.com/api/contacts/")
                .then()
                .statusCode(200);
    }

    @Test
    public void deleteContact(){
        RestAssured.given()
                .param("id", idContact)
                .delete("https://cryptic-retreat-46933.herokuapp.com/api/contacts/" + idContact)
                .then()
                .statusCode(200);
    }


}


