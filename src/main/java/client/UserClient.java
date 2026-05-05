package client;

import io.restassured.response.Response;
import static endpoints.Api_Endpoints.*;

public class UserClient extends BaseClient {
    public static Response getUser(String id) {
        return BaseClient.getRequest(USER_ENDPOINT+id);
    }
    public static Response getUsers() {
        return BaseClient.getRequest(USERS_LIST_ENDPOINT);
    }
    public static Response updateUser(Object body) {
        return BaseClient.putRequest(USER_UPDATE_ENDPOINT,body);
    }
    public static Response updateUserNoAuth(Object body) {
        return BaseClient.putNoAuthRequest(USER_UPDATE_ENDPOINT,body);
    }
    public static Response deleteUser(String id){
        return BaseClient.deleteRequest(USER_ENDPOINT+id);
    }
}