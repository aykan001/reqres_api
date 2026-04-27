package stepdefinitions;

import io.cucumber.java.en.*;
import servers.ListResourcesServer;
import utils.TextContext;

import static org.junit.Assert.*;

public class ListResourcesStep {
    TextContext context;
    public ListResourcesStep(TextContext context){this.context=context;}
    @Given("list resources request atilir")
    public void getListResources(){
        context.response= ListResourcesServer.getListResources();
    }
    @And("list resources bos olmamali")
    public void getNoEmptyListResources(){
        assertNotNull(context.response.jsonPath().get("data"));
    }

}
