package stepdefinitions;

import io.cucumber.java.en.*;
import service.GenericResourcesService;
import utils.TextContext;

public class GenericResourcesStep {
    GenericResourcesService genericResourcesService;
    TextContext context;

    public GenericResourcesStep(TextContext context) {
        this.context = context;
    }

    @Given("generic resources request atilir")
    public void getGenericResources(String page) {
        genericResourcesService.getGenericResourcesDetail(page);
    }
    @Given("different {string} generic resources request atilir")
    public void differentGenericResourcesRequestAtilir(String page) {
        genericResourcesService.getGenericResourcesDetail(page);
    }
    @Given("without auth generic resources {string} request atilir")
    public void withoutAuthGenericResourcesRequestAtilir(String page) {
        genericResourcesService.getWithoutAuthGenericResourcesDetail(page);
    }
}