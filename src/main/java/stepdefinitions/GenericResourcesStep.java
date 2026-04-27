package stepdefinitions;

import io.cucumber.java.en.*;
import servers.GenericResourcesServer;
import utils.TextContext;

public class GenericResourcesStep {
    TextContext context;
    public GenericResourcesStep(TextContext context){this.context=context;}
    @Given("generic resources request atilir")
    public void getGenericResources(){
        context.response= GenericResourcesServer.getGenericResources();
    }

    @Given("different {string} generic resources request atilir")
    public void differentGenericResourcesRequestAtilir(String page) {
        context.response=GenericResourcesServer.getDifferentGenericResources(page);
    }
}
