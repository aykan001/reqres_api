package stepdefinitions;

import io.cucumber.java.en.*;
import client.UserClient;
import models.UpdateBody;
import utils.BodyBuilder;
import utils.TextContext;
import java.time.Duration;
import java.time.OffsetDateTime;
import static org.junit.Assert.*;

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
    @Given("user update icin {string} ve {string} valid body gonder")
    public void updateInvalidBodyUser(String name, String job) {
        new UserClient();
        context.response = UserClient
                .updateUser(BodyBuilder.user(name, job));
    }
    @And("{string} {string} bos olmamali ve dogru olmali")
    public void fieldCheck(String field, String expected) {
        String actual = context.response.jsonPath().get(field);
        assertEquals(expected, actual);
    }
    @And("updatedAt bos olmamali ve dogru olmali")
    public void updatedAtCheck() {
        String updatedAt = context.response.jsonPath().get("updatedAt");

        assertNotNull(updatedAt);

        OffsetDateTime time = OffsetDateTime.parse(updatedAt);
        OffsetDateTime now = OffsetDateTime.now();

        assertTrue(Duration.between(time, now).getSeconds() < 5);
    }
    @Given("user updated icin without auth {string} {string} body gonder")
    public void userUpdatedIcinWithoutAuthBodyGonder(String name, String job) {
        new UserClient();
        UpdateBody body=new UpdateBody(name,job);
        context.response=UserClient.updateUserNoAuth(body);
    }

    @Given("delete icin {string} user request atilir")
    public void deleteUserByIdRequestAtilir(String id) {
        new UserClient();
        context.response=UserClient.deleteUser(id);
    }
}