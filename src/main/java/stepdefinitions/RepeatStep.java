package stepdefinitions;

import io.cucumber.java.en.*;
import servers.RepeatServer;
import utils.TextContext;

import static org.junit.Assert.*;

public class RepeatStep {
    TextContext context;
    public RepeatStep(TextContext context){this.context=context;}

    @Given("wrong {string} request atilir")
    public void getWrongEndpointRequestAtilir(String endpoint) {
        context.response= RepeatServer.getWrongEndpoint(endpoint);
    }
    @Given("without auth {string} request atilir")
    public void getWithoutAuthRequestAtilir(String endpoint) {
        context.response=RepeatServer.getWithoutAuth(endpoint);
    }
    @And("response bos olmamali")
    public void getNoEmptyResponse(){
        assertNotNull(context.response.jsonPath().get("data"));
    }

    @And("response icin token olmali")
    public void responseIcinTokenOlmali() {
        String token=context.response.jsonPath().get("token");
        assertNotNull(token);
        assertFalse(token.isEmpty());
        assertEquals(200,context.response.statusCode());
    }
}
