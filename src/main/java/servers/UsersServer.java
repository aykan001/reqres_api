package servers;

import io.restassured.response.Response;

import static endpoints.Api_Endpoints.*;

public class UsersServer {

    public static Response getUsers(){
        return BaseServer.getRequest(USERS_LIST_ENDPOINT);
    }
}

