package stepdefinitions;

import io.cucumber.java.en.*;
import client.ResourceClient;
import utils.TextContext;

public class GenericResourcesStep {

    TextContext context;

    public GenericResourcesStep(TextContext context) {
        this.context = context;
    }

    @Given("generic resources request atilir")
    public void getGenericResources() {
        new ResourceClient();
        context.response = ResourceClient.getGenericResources("1");
    }

    @Given("different {string} generic resources request atilir")
    public void differentGenericResourcesRequestAtilir(String page) {
        new ResourceClient();
        context.response = ResourceClient.getGenericResources(page);
    }
}