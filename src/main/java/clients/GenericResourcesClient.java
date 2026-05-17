package clients;

import endpoints.ResourceEndpoints;
import org.apache.http.HttpStatus;

public class GenericResourcesClient extends BaseClient {
    public static void getGenericResources(String page) {
        getRequest(ResourceEndpoints.GENERIC_RESOURCE_ENDPOINT + page).statusCode(HttpStatus.SC_OK);
    }
    public static void getWithoutAuthGenericResources(String page){
        getWithoutAuthRequest(ResourceEndpoints.GENERIC_RESOURCE_ENDPOINT + page).statusCode(HttpStatus.SC_UNAUTHORIZED);
    }
}
