package stepdefinitions;

import client.RecordClient;
import io.cucumber.java.en.Given;
import utils.TextContext;

public class RecordsStep {
    TextContext context;

    public RecordsStep(TextContext context){
        this.context=context;
    }
    @Given("list records request at")
    public void getListRecordsRequest(){
        new RecordClient();
        context.response=RecordClient.getListRecords();
    }

    @Given("records request at")
    public void recordsRequestAt() {
        new RecordClient();
        context.response=RecordClient.getRecord();
    }
}
