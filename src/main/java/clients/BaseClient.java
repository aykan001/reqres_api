package clients;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static endpoints.Api_Endpoints.*;
import static io.restassured.RestAssured.given;
import static utils.constant.HttpHeaderConstant.*;
import static utils.constant.HttpHeaderValueConstants.*;

public class BaseClient {

    private static RequestSpecification baseSpec() {
        RestAssuredConfig config = RestAssuredConfig.config();
        RequestSpecBuilder builder =new RequestSpecBuilder();
        return  builder
                .setBaseUri(BASE_URL)
                .setContentType("application/json")
                .setConfig(config)
                .build();
    }

    protected static RequestSpecification spec() {
        return given()
                .spec(baseSpec())
                .header(API_KEY,USER_API_KEY_VALUE)
                .header(API_KEY,RECORD_API_KEY_VALUE)
                .header(X_REQRES_ENV,X_REQRES_ENV_VALUE)
                .queryParam(PROJECT_ID,PROJECT_ID_VALUE);

    }
    public static ValidatableResponse getRequest(String endpoint){
        return given()
                .spec(spec())
                .when()
                .get(endpoint)
                .then()
                .log().all();
    }
    public static ValidatableResponse postRequest(String endpoint ,Object body){
        return given()
                .spec(spec())
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .log().all();
    }
    public static ValidatableResponse putRequest(String endpoint,Object body){
        return given()
                .spec(spec())
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .log().all();
    }
    public static ValidatableResponse deleteRequest(String endpoint){
        return given()
                .spec(spec())
                .when()
                .delete()
                .then()
                .log().all();
    }
    public static ValidatableResponse getWithoutAuthRequest(String endpoint){
        return given()
                .spec(baseSpec())
                .when()
                .get(endpoint)
                .then()
                .log().all();
    }
    public static ValidatableResponse postWithoutAuthRequest(String endpoint,Object body){
        return given()
                .spec(baseSpec())
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .log().all();
    }
    public static ValidatableResponse putWithoutAuthRequest(String endpoint,Object body){
        return given()
                .spec(baseSpec())
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .log().all();
    }
    public static ValidatableResponse deleteWithoutAuthRequest(String endpoint){
        return given()
                .spec(baseSpec())
                .when()
                .delete(endpoint)
                .then()
                .log().all();
    }
}