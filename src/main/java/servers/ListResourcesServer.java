package servers;

import static endpoints.Api_Endpoints.*;
import io.restassured.response.Response;

public class ListResourcesServer {

    public static Response getListResources(){
        return BaseServer.getRequest(RESOURCES_ENDPOINT);
    }



}
