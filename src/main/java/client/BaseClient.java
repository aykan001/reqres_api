package client;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static endpoints.Api_Endpoints.*;
import static io.restassured.RestAssured.*;

public class BaseClient {

    protected static RequestSpecification spec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .addHeader("x-api-key", API_KEY)
                .setContentType("application/json")
                .build();
    }

    protected static RequestSpecification noAuthSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setContentType("application/json")
                .build();
    }
    public static Response getRequest(String endpoint){
        return given()
                .spec(spec())
                .get(endpoint);
    }

    public static Response postRequest(String endpoint,Object body) {
        return given()
                .spec(spec())
                .body(body)
                .post(endpoint);
    }
    public static Response putRequest(String endpoint,Object body) {
        return given()
                .spec(spec())
                .body(body)
                .put(endpoint);
    }

    public static Response getWithoutAuthRequest(String endpoint) {
        return given()
                .spec(noAuthSpec())
                .get(endpoint);
    }
    public static Response postWithoutApiKey(String endpoint,Object body) {
        return given()
                .spec(noAuthSpec())
                .body(body)
                .post(endpoint);
    }
    public static Response putNoAuthRequest(String endpoint,Object body) {
        return given()
                .spec(noAuthSpec())
                .body(body)
                .put(endpoint);
    }
}