package client;


import io.restassured.response.Response;
import static endpoints.Api_Endpoints.*;
import static io.restassured.RestAssured.given;

public class AuthClient extends BaseClient {

    public static Response login(Object body) {
        return given()
                .spec(spec())
                .body(body)
                .post(LOGIN_ENDPOINT);
    }

    public static Response register(Object body) {
        return given()
                .spec(spec())
                .body(body)
                .post(REGISTER_ENDPOINT);
    }

    public static Response loginWithoutApiKey(Object body) {
        return given()
                .spec(noAuthSpec())
                .body(body)
                .post(LOGIN_ENDPOINT);
    }
}