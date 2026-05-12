package client;

import endpoints.Api_Endpoints;
import io.restassured.response.Response;

public class RecordClient extends BaseClient {

    public static Response getListRecords() {
        return sendRecordRequest("GET", Api_Endpoints.LIST_RECORDS_ENDPOINT, null);
    }

    public static Response getRecord(String recordId) {
        return sendRecordRequest("GET", Api_Endpoints.RECORD_ENDPOINT + "/" + recordId, null);
    }

    public static Response postRecord(Object body) {
        return sendRecordRequest("POST", Api_Endpoints.CREATE_RECORD_ENDPOINT, body);
    }

    public static Response putRecord(String recordId, Object body) {
        return sendRecordRequest("PUT", Api_Endpoints.RECORD_ENDPOINT + "/" + recordId, body);
    }

    public static Response deleteRecord(String recordId) {
        return sendRecordRequest("DELETE", Api_Endpoints.RECORD_ENDPOINT + "/" + recordId, null);
    }
}