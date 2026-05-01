package stepdefinitions;

import client.ResourceClient;
import io.cucumber.java.en.*;
import utils.TextContext;

public class ResourceStep {

    TextContext context;

    public ResourceStep(TextContext context) {
        this.context = context;
    }

    @Given("resources request atilir")
    public void getResources() {
        context.response = ResourceClient.getResources();
    }

    @Given("generic {string} request atilir")
    public void getGeneric(String page) {
        context.response = ResourceClient.getGenericResources(page);
    }

}