package clients;

import endpoints.CollectionEndpoint;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;

public class CollectionClient extends BaseClient{
    public static ValidatableResponse getCollections(String id){
        return getRequest(CollectionEndpoint.GET_LIST_COLLECTIONS_ENDPOINT+id).statusCode(HttpStatus.SC_OK);
    }
}
