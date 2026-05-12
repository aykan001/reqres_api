package client;

import io.restassured.response.Response;

import static endpoints.Api_Endpoints.*;

public class AuthClient extends BaseClient {

    public static Response login(Object body) {
        return BaseClient.sendUserRequest("POST", LOGIN_ENDPOINT, body);
    }

    public static Response register(Object body) {
        return BaseClient.sendUserRequest("POST", REGISTER_ENDPOINT, body);
    }

    public static Response loginWithoutApiKey(Object body) {
        return BaseClient.sendNoAuthRequest("POST", LOGIN_ENDPOINT, body);
    }
}