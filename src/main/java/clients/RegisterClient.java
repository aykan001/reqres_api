package clients;

import endpoints.RegisterEndpoints;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;

public class RegisterClient extends BaseClient{

    public static ValidatableResponse setRegister(Object body){
        return postRequest(RegisterEndpoints.REGISTER_ENDPOINT,body).statusCode(HttpStatus.SC_OK);
    }
    public static ValidatableResponse setWithoutAuthRegister(Object body){
        return postWithoutAuthRequest(RegisterEndpoints.REGISTER_ENDPOINT,body).statusCode(HttpStatus.SC_UNAUTHORIZED);
    }
    public static ValidatableResponse setWrongBodyRegister(Object body){
        return postRequest(RegisterEndpoints.REGISTER_ENDPOINT,body).statusCode(HttpStatus.SC_BAD_REQUEST);
    }
}
