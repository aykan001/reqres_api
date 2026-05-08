package client;

import endpoints.Api_Endpoints;
import io.restassured.response.Response;

public class RecordClient extends BaseClient{

    public static Response getListRecords(){
        return BaseClient.getRequest(Api_Endpoints.LIST_RECORDS_ENDPOINT);
    }
    public static Response getRecord(){
        return BaseClient.getRequest(Api_Endpoints.RECORD_ENDPOINT);
    }



}
