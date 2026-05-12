package client;

import io.restassured.response.Response;
import static endpoints.Api_Endpoints.*;

public class ResourceClient extends BaseClient {

    public static Response getResources() {
        return sendUserRequest("GET", RESOURCES_ENDPOINT, null);
    }

    public static Response getGenericResources(String page) {
        return sendUserRequest("GET", WITHOUT_PAGE_GENERIC_RESOURCE_ENDPOINT + page, null);
    }

    public static Response getWrongEndpoint(String endpoint) {
        return sendUserRequest("GET", endpoint, null);
    }

    public static Response getWithoutAuth(String endpoint) {
        return sendNoAuthRequest("GET", endpoint, null);
    }
}