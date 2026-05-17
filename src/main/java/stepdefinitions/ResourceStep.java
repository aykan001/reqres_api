package stepdefinitions;

import io.cucumber.java.en.*;
import service.ResourceService;
import utils.TextContext;

public class ResourceStep {
    ResourceService resourceService;
    TextContext context;

    public ResourceStep(TextContext context) {
        this.context = context;
    }

    @Given("list resources request atilir")
    public void listResourcesRequestAtilir() {
        resourceService.getResourcesDetail();
    }
    @Given("wrong list resources  {string} request atilir")
    public void wrongListResourcesRequestAtilir(String endpoint) {
        resourceService.getWrongEndpointResourcesDetail(endpoint);
    }

    @Given("without auth list resources {string} request atilir")
    public void withoutAuthListResourcesRequestAtilir() {
        resourceService.getWithoutAuthResourcesDetail();
    }
}