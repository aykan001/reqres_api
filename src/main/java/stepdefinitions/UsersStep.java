package stepdefinitions;

import client.UserClient;
import io.cucumber.java.en.*;
import utils.BodyBuilder;
import utils.TextContext;

import static org.junit.Assert.*;

public class UsersStep {

    TextContext context;

    public UsersStep(TextContext context) {
        this.context = context;
    }
    @Given("users list request atilir")
    public void getUsers() {
        context.response = UserClient.getUsers();
    }

    @Given("user update icin {string} ve {string} body gonder")
    public void updateUser(String name, String job) {
        context.response = UserClient.updateUser(
                BodyBuilder.user(name, job)
        );
    }


}