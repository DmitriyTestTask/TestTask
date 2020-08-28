package test_file;

import com.codeborne.selenide.Configuration;

public class TestBase {

    static {
        Configuration.baseUrl = "https://cryptic-retreat-46933.herokuapp.com";
        Configuration.timeout = 12000;
    }
}
