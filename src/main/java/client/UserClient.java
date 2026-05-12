package client;

import io.restassured.response.Response;
import static endpoints.Api_Endpoints.*;

public class UserClient extends BaseClient {

    public static Response getUser(String id) {
        return sendUserRequest("GET", USER_ENDPOINT + id, null);
    }

    public static Response getUsers() {
        return sendUserRequest("GET", USERS_LIST_ENDPOINT, null);
    }

    public static Response updateUser(Object body) {
        return sendUserRequest("PUT", USER_UPDATE_ENDPOINT, body);
    }

    public static Response updateUserNoAuth(Object body) {
        return sendNoAuthRequest("PUT", USER_UPDATE_ENDPOINT, body);
    }

    public static Response deleteUser(String id) {
        return sendUserRequest("DELETE", USER_ENDPOINT + id, null);
    }
}