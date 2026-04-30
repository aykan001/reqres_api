package servers;

import endpoints.Api_Endpoints;
import io.restassured.response.Response;

public class UpdateUserServer {

    public Response getUserUpdate(Object body){
        return BaseServer.putRequest(Api_Endpoints.USER_UPDATE_ENDPOINT,body);
    }

}
