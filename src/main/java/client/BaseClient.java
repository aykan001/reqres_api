package client;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import static endpoints.Api_Endpoints.*;

public class BaseClient {

    protected static RequestSpecification spec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .addHeader("x-api-key", API_KEY)
                .setContentType("application/json")
                .build();
    }

    protected static RequestSpecification noAuthSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setContentType("application/json")
                .build();
    }
}