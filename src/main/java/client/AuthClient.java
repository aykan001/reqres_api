package client;

import io.restassured.response.Response;
import static endpoints.Api_Endpoints.*;

public class AuthClient extends BaseClient {

    public static Response login(Object body) {
        return BaseClient.postRequest(LOGIN_ENDPOINT,body);
    }
    public static Response register(Object body) {
        return BaseClient.postRequest(REGISTER_ENDPOINT,body);
    }
    public static Response loginWithoutApiKey(Object body) {
        return BaseClient.postWithoutApiKey(LOGIN_ENDPOINT,body);
    }
}