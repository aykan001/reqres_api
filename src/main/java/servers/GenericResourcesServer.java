package servers;

import endpoints.Api_Endpoints;
import io.restassured.response.Response;

public class GenericResourcesServer {

    public static Response getGenericResources(){
        return BaseServer.getRequest(Api_Endpoints.GENERIC_RESOURCE_ENDPOINT);
    }
    public static Response getDifferentGenericResources(String page){
        return BaseServer.getRequest(Api_Endpoints.WITHOUT_PAGE_GENERIC_RESOURCE_ENDPOINT+page);
    }

}
