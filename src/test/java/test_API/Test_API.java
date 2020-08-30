package test_API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Test_API {
    //registration form
    private String nameParam = "test-1";
    private String emailParam = "test-1@gmail.com";
    private String passwordParam = "qwetest82";

    private String idContact = "5f4bd55592b2d80017dcedf7";
    private String addName = "1";
    private String addEmail = "qwe567@gmail.com";
    private String addPhone = "589123753";
    private String addType = "personal";
    private String auth_token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVmNGI4MmZhNWE5ZGYxMDAxNzE2Y2VjYy" +
            "IsImlhdCI6MTU5ODc4NDI1MCwiZXhwIjoxNTk4ODIwMjUwfQ.XaRSqj7jx2m96VpxKUfOjAXwIjuRZyjewrzjDwPDNa0";



    @Test
    public void getWebSite(){
        RestAssured.given()
                .get("https://cryptic-retreat-46933.herokuapp.com/api/auth/me")
                .then()
                .statusCode(401);
    }

    @Test
    public void registrationNewUser(){
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body("{\n"+ "\"name\"  : \"test-19\" ,\n"  +
                               "\"email\" : \"test-19@gmail.com\", \n" +
                                "\"password\" : \"qwetest82\"}")
                .post("https://cryptic-retreat-46933.herokuapp.com/api/users")
                .then()
                .statusCode(200);
    }

    @Test
    public void loginUser() {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body("{\n"+ "\"email\" : \"test-1@gmail.com\", \n"+
                             "\"password\" : \"qwetest82\"}" )
                .post("https://cryptic-retreat-46933.herokuapp.com/api/auth/login")
                .then()
                .statusCode(200);

    }

//    @Test
//    public void loginUser() {
//        RestAssured.given()
//                .param("email", emailParam)
//                .param("password", passwordParam)
//                .post("https://cryptic-retreat-46933.herokuapp.com/api/auth/login")
//                .then()
//                .statusCode(200);
//    }

//    @Test
//    public void addContact(){
//        RestAssured.given()
//                .header("x-auth-token", auth_token)
//                .header("Content-Type", "Application/JSON")
//
//                .param("name", addName)
//                .param("email", addEmail)
//                .param("phone",addPhone)
//                .param("type", addType)
//                .post("https://cryptic-retreat-46933.herokuapp.com/api/contacts/")
//                .then()
//                .statusCode(200);
//    }

    @Test
    public void addContact(){
        RestAssured.given()
                .header("x-auth-token", auth_token)
                .header("Content-Type", "Application/JSON")
                .contentType(ContentType.JSON)
                .body("{\n" +       "\"name\":\"15\"        ,\n" +
                                    "\"email\":\"25\", \n"+
                                    "\"phone\":\"38\" , \n" +
                                     "\" type\": \" personal\"+\n}")
                .post("https://cryptic-retreat-46933.herokuapp.com/api/contacts/")
                .then()
                .statusCode(200);
    }
    @Test
    public void deleteContact(){
        RestAssured.given()
                .header("x-auth-token", auth_token)
                .header("Content-Type", "Application/JSON")
//                .contentType(ContentType.JSON)
//                .body("{\n" + "\"id\": \"5f4b7da55a9df1001716cecb\",+\n}" )
                .delete("https://cryptic-retreat-46933.herokuapp.com/api/contacts/" + idContact)
                .then()
                .statusCode(200);
    }


}


