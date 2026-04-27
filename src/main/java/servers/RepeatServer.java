package servers;

import io.restassured.response.Response;

public class RepeatServer {

    public static Response getWrongEndpoint(String endpoint){
        return BaseServer.getRequest(endpoint);
    }
    public static Response getWithoutAuth(String endpoint){
        return BaseServer.getRequestWithoutAuth(endpoint);
    }


}
