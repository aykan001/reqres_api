package stepdefinitions;

import io.cucumber.java.en.*;
import client.ResourceClient;
import utils.TextContext;

import static org.junit.Assert.*;

public class ListResourcesStep {

    TextContext context;

    public ListResourcesStep(TextContext context) {
        this.context = context;
    }

    @Given("list resources request atilir")
    public void getListResources() {
        new ResourceClient();
        context.response = ResourceClient.getResources();
    }

    @And("list resources bos olmamali")
    public void listNotEmpty() {
        assertNotNull(context.response.jsonPath().get("data"));
    }
}