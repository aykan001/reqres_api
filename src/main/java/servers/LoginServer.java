package servers;

import endpoints.Api_Endpoints;
import io.restassured.response.Response;

public class LoginServer {

    public static Response postLogin(Object body){
        return BaseServer.postRequest(Api_Endpoints.LOGIN_ENDPOINT,body);
    }
}
