package servers;

import endpoints.Api_Endpoints;
import io.restassured.response.Response;

public class RegisterServer {
    public static Response postRegister(Object body){
        return BaseServer.postRequest(Api_Endpoints.REGISTER_ENDPOINT, body);
    }
}
