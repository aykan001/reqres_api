package client;

import io.restassured.response.Response;
import static endpoints.Api_Endpoints.*;
import static io.restassured.RestAssured.given;

public class UserClient extends BaseClient {

    // GET SINGLE USER
    public static Response getUser(String id) {
        return given()
                .spec(spec())
                .get(WITHOUT_ID_USER_ENDPOINT + id);
    }

    // GET USERS LIST
    public static Response getUsers() {
        return given()
                .spec(spec())
                .get(USERS_LIST_ENDPOINT);
    }

    // UPDATE USER
    public static Response updateUser(Object body) {
        return given()
                .spec(spec())
                .body(body)
                .put(USER_UPDATE_ENDPOINT);
    }

    // NEGATIVE: NO AUTH
    public Response updateUserNoAuth(Object body) {
        return given()
                .spec(noAuthSpec())
                .body(body)
                .put(USER_UPDATE_ENDPOINT);
    }

    // NEGATIVE: WRONG METHOD
    public Response updateUserWithPost(Object body) {
        return given()
                .spec(spec())
                .body(body)
                .post(USER_UPDATE_ENDPOINT);
    }
}