package clients;

import endpoints.ProductRecordEndpoints;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;

public class RecordClient extends BaseClient {
    public static ValidatableResponse getRecord(String id){
        return getRequest(ProductRecordEndpoints.GET_RECORD_ENDPOINT+id).statusCode(HttpStatus.SC_OK);
    }
    public static ValidatableResponse getListRecords(String id){
        return getRequest(ProductRecordEndpoints.GET_LIST_RECORDS_ENDPOINT+id).statusCode(HttpStatus.SC_OK);
    }
    public static ValidatableResponse setRecord(String id,Object body){
        return postRequest(ProductRecordEndpoints.CREATE_RECORD_ENDPOINT+id,body).statusCode(HttpStatus.SC_CREATED);
    }
    public static ValidatableResponse updateRecord(String id,Object body){
        return putRequest(ProductRecordEndpoints.PUT_RECORD_ENDPOINT+id,body).statusCode(HttpStatus.SC_OK);
    }
    public static ValidatableResponse deleteRecord(String id){
        return deleteRequest(ProductRecordEndpoints.DELETE_RECORD_ENDPOINT+id).statusCode(HttpStatus.SC_NO_CONTENT);
    }
}