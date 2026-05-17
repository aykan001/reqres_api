package stepdefinitions;

import clients.RecordClient;
import io.cucumber.java.en.*;
import utils.BodyBuilder;
import utils.TextContext;

public class RecordsStep {

    TextContext context;

    public RecordsStep(TextContext context) {
        this.context = context;
    }

    @Given("list records request at")
    public void getListRecordsRequest() {
        context.response = RecordClient.getListRecords();
    }

    @Given("record id {string} request at")
    public void getRecordById(String id) {
        context.response = RecordClient.getRecord(id);
    }

    @Given("record body {string} {string} {string} {string} request atilir")
    public void createRecordRequestAtilir(String name,
                                          String price,
                                          String category,
                                          String in_stock) {

        RecordBody body = BodyBuilder.recordBodyBuilder(
                name,
                price,
                category,
                in_stock
        );

        context.response = RecordClient.postRecord(body);

        context.recordId = context.response.jsonPath().getString("id");
        System.out.println("CREATED RECORD ID = " + context.recordId);
    }

    @Given("update record id {string} body {string} {string} {string} {string} request atilir")
    public void updateRecordRequestAtilir(String id,
                                          String name,
                                          String price,
                                          String category,
                                          String in_stock) {

        RecordBody body = BodyBuilder.recordBodyBuilder(
                name,
                price,
                category,
                in_stock
        );

        context.response = RecordClient.putRecord(id, body);
    }

    @Given("delete record id {string} request at")
    public void deleteRecordRequestAt(String id) {
        context.response = RecordClient.deleteRecord(id);
    }

    @Given("list collections {string} request at")
    public void listCollectionsRequestAt(String project_id) {
        context.response=RecordClient.getListCollections();


    }
}