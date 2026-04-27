package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TextContext;

import static org.junit.Assert.*;
import static servers.UserServer.*;

public class UserStep {
    TextContext context;
    public UserStep(TextContext context){this.context=context;}
    @Given("{string} user request atilir")
    public void getSingleUser(String id) {
        context.response= getUser(id);
    }
    @And("user bos olmamali")
    public void userBosOlmamali() {
        assertNotNull(context.response.jsonPath().get("data"));
    }
    @Given("url de id olan user requst atilir")
    public void urlDeIdOlanUserRequstAtilir() {
        context.response= getUser();
    }
}
