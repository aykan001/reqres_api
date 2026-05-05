package client;

import io.restassured.response.Response;
import static endpoints.Api_Endpoints.*;

public class ResourceClient extends BaseClient {

    public static Response getResources() {
        return BaseClient.getRequest(RESOURCES_ENDPOINT);
    }
    public static Response getGenericResources(String page) {
        return BaseClient.getRequest(WITHOUT_PAGE_GENERIC_RESOURCE_ENDPOINT+page);
    }
    public static Response getWrongEndpoint(String endpoint) {
        return BaseClient.getRequest(endpoint);
    }
    public static Response getWithoutAuth(String endpoint) {
        return BaseClient.getWithoutAuthRequest(endpoint);
    }
}