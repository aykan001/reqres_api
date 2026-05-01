package client;


import io.restassured.response.Response;

import static endpoints.Api_Endpoints.*;
import static io.restassured.RestAssured.given;

public class ResourceClient extends BaseClient {

    // GET RESOURCES
    public static Response getResources() {
        return given()
                .spec(spec())
                .get(RESOURCES_ENDPOINT);
    }

    // PAGINATION
    public static Response getGenericResources(String page) {
        return given()
                .spec(spec())
                .get(WITHOUT_PAGE_GENERIC_RESOURCE_ENDPOINT + page);
    }

    // WRONG ENDPOINT
    public static Response getWrongEndpoint(String endpoint) {
        return given()
                .spec(spec())
                .get(endpoint);
    }

    // NO AUTH
    public static Response getWithoutAuth(String endpoint) {
        return given()
                .spec(noAuthSpec())
                .get(endpoint);
    }
}