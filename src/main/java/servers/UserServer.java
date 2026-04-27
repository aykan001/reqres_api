package servers;

import io.restassured.response.Response;
import static endpoints.Api_Endpoints.*;
public class UserServer {

    public static Response getUser(String id){
        return BaseServer.getRequest(WITHOUT_ID_USER_ENDPOINT+id);
    }
    public static Response getUser(){
        return BaseServer.getRequest(USER_ENDPOINT);
    }
}
