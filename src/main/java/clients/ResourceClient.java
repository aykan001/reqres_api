package clients;

import endpoints.ResourceEndpoints;
import org.apache.http.HttpStatus;

public class ResourceClient extends BaseClient {

    public static void getResources() {
        getRequest(ResourceEndpoints.LIST_RESOURCES_ENDPOINT).statusCode(HttpStatus.SC_OK);
    }
    public static void  getWrongEndpointResources(String endpoint){
        getRequest(ResourceEndpoints.WRONG_LIST_RESOURCES_ENDPOINT+endpoint).statusCode(HttpStatus.SC_OK);
    }
    public static void getWithoutAuthResources(){
        getWithoutAuthRequest(ResourceEndpoints.LIST_RESOURCES_ENDPOINT).statusCode(HttpStatus.SC_UNAUTHORIZED);
    }


}