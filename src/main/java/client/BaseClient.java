package client;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static endpoints.Api_Endpoints.*;
import static io.restassured.RestAssured.given;

public class BaseClient {

    private static RequestSpecification baseSpec() {

        RestAssuredConfig config = RestAssuredConfig.config();

        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setContentType("application/json")
                .setConfig(config)
                .build();
    }
    protected static RequestSpecification userSpec() {
        return given()
                .spec(baseSpec())
                .header("x-api-key", USER_API_KEY);
    }
    protected static RequestSpecification recordSpec() {
        return given()
                .spec(baseSpec())
                .header("x-api-key", RECORD_API_KEY)
                .header("X-Reqres-Env", RECORD_X_REQRES_ENV)
                .queryParam("project_id", "14226");
    }

    protected static RequestSpecification userNoAuthSpec() {
        return given()
                .spec(baseSpec());
    }
    public static Response sendUserRequest(String method, String endpoint, Object body) {

        return (body == null)
                ? userSpec().when().request(method, endpoint).then().extract().response()
                : userSpec().body(body).when().request(method, endpoint).then().extract().response();
    }
    public static Response sendRecordRequest(String method, String endpoint, Object body) {

        return (body == null)
                ? recordSpec().when().request(method, endpoint).then().extract().response()
                : recordSpec().body(body).when().request(method, endpoint).then().extract().response();
    }

    public static Response sendNoAuthRequest(String method, String endpoint, Object body) {

        return (body == null)
                ? userNoAuthSpec().when().request(method, endpoint).then().extract().response()
                : userNoAuthSpec().body(body).when().request(method, endpoint).then().extract().response();
    }
}