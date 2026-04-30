package servers;

import models.LoginBody;
import models.UpdateBody;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static endpoints.Api_Endpoints.*;
import static io.restassured.RestAssured.*;

public class BaseServer {
    protected static RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .addHeader("x-api-key", API_KEY)
            .setContentType("application/json")
            .build();
    protected static RequestSpecification noAuthSpec = new RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .setContentType("application/json")
            .build();
    public static Response getRequest(String endpoint){
            return  given()
                    .spec(BaseServer.requestSpec)
                    .when()
                    .get(endpoint)
                    .andReturn();
    }
    public static Response postRequest(String endpoint, Object body){
        return given()
                .spec(requestSpec)
                .body(body)
                .when()
                .post(endpoint);
    }


    public static Response putRequest(String endpoint, Object body){
        return given()
                .spec(requestSpec)
                .body(body)
                .when()
                .put(endpoint);
    }
    public static Response deleteRequest(String endpoint){
        return given()
                .spec(requestSpec)
                .when()
                .delete(endpoint);
    }
    public static Response getRequestWithoutAuth(String endpoint){
        return given()
                .spec(noAuthSpec)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }
    public static Response putUserUpdateRaw(String endpoint,String rawBody){
        return given()
                .spec(requestSpec)
                .body(rawBody)
                .when()
                .put(endpoint);

    }
}
