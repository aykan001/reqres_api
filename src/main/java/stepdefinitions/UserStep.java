package stepdefinitions;

import io.cucumber.java.en.*;
import client.UserClient;
import utils.TextContext;

public class UserStep {

    TextContext context;
    public UserStep(TextContext context) {
        this.context = context;
    }
    @Given("{string} user request atilir")
    public void getUser(String id) {
        new UserClient();
        context.response = UserClient.getUser(id);
    }
    @Given("url de id olan user requst atilir")
    public void userByUrl() {
        new UserClient();
        context.response = UserClient.getUser("2");
    }
}