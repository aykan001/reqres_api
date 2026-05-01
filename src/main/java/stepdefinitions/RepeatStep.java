package stepdefinitions;

import io.cucumber.java.en.*;
import client.ResourceClient;
import utils.TextContext;

import static org.junit.Assert.*;

public class RepeatStep {

    TextContext context;

    public RepeatStep(TextContext context) {
        this.context = context;
    }

    @Given("wrong {string} request atilir")
    public void wrongEndpoint(String endpoint) {
        new ResourceClient();
        context.response = ResourceClient.getWrongEndpoint(endpoint);
    }

    @Given("without auth {string} request atilir")
    public void withoutAuth(String endpoint) {
        new ResourceClient();
        context.response = ResourceClient.getWithoutAuth(endpoint);
    }

    @And("response bos olmamali")
    public void responseNotEmpty() {
        assertNotNull(context.response.jsonPath().get("data"));
    }

    @And("response icin token olmali")
    public void tokenCheck() {
        String token = context.response.jsonPath().get("token");
        assertNotNull(token);
        assertFalse(token.isEmpty());
    }
    @Then("user bos olmamali")
    public void userNotEmpty() {
        assertNotNull(context.response.jsonPath().get("data"));
    }
}