package clients;

import endpoints.UserEndpoints;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;

public class UserClient extends BaseClient {
    public static void getUser(String id) {
        getRequest(UserEndpoints.USER_ENDPOINT + id).statusCode(HttpStatus.SC_OK);
    }
    public static ValidatableResponse getUsers() {
        return getRequest(UserEndpoints.USERS_LIST_ENDPOINT).statusCode(HttpStatus.SC_OK);
    }
    public static ValidatableResponse updateUser(Object body){
        return putRequest(UserEndpoints.UPDATE_USER_ENDPOINT,body).statusCode(HttpStatus.SC_OK);
    }
    public static void deleteUser(String id){
        deleteRequest(UserEndpoints.DELETE_USER_ENDPOINT + id).statusCode(HttpStatus.SC_NO_CONTENT);
    }
    public static void getWithoutAuthUser(String id){
        getWithoutAuthRequest(UserEndpoints.USER_ENDPOINT + id).statusCode(HttpStatus.SC_UNAUTHORIZED);
    }
    public static void getWithoutAuthUsers() {
        getWithoutAuthRequest(UserEndpoints.USERS_LIST_ENDPOINT).statusCode(HttpStatus.SC_UNAUTHORIZED);
    }
    public static ValidatableResponse updateWithoutAuthUser(Object body){
        return putWithoutAuthRequest(UserEndpoints.UPDATE_USER_ENDPOINT,body).statusCode(HttpStatus.SC_UNAUTHORIZED);
    }
    public static void deleteWithoutAuthUser(String id){
        deleteWithoutAuthRequest(UserEndpoints.DELETE_USER_ENDPOINT + id).statusCode(HttpStatus.SC_UNAUTHORIZED);
    }
    public static void getNoIdUser(){
        getRequest(UserEndpoints.USER_ENDPOINT).statusCode(HttpStatus.SC_NOT_FOUND);
    }
    public static void getWrongUrlUser(String id){
        getRequest(UserEndpoints.WRONG_USER_ENDPOINT + id).statusCode(HttpStatus.SC_NOT_FOUND);
    }
}