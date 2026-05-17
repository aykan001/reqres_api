package clients;

import endpoints.LoginEndpoints;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;

public class LoginClient extends BaseClient{
    public static ValidatableResponse setLogin(Object body){
        return postRequest(LoginEndpoints.LOGIN_ENDPOINT,body).statusCode(HttpStatus.SC_OK);
    }
    public static ValidatableResponse setWithoutAuthLogin(Object body){
        return postWithoutAuthRequest(LoginEndpoints.LOGIN_ENDPOINT,body).statusCode(HttpStatus.SC_UNAUTHORIZED);
    }
}
