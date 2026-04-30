package servers;

import endpoints.Api_Endpoints;
import io.restassured.response.Response;

public class UserUpdateServer {
    public static Response getUserUpdate(Object body){
        return BaseServer.putRequest(Api_Endpoints.USER_UPDATE_ENDPOINT,body);
    }
    public static Response getUserUpdateInvalid(String rawBody){
        return BaseServer.putUserUpdateRaw(Api_Endpoints.USER_UPDATE_ENDPOINT,rawBody);
    }
}
