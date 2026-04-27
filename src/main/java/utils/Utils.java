package utils;

import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;

import static endpoints.Api_Endpoints.BASE_URL;

public class Utils {
    @BeforeAll
    public static void setup(){
        RestAssured.baseURI=BASE_URL;
    }
}
