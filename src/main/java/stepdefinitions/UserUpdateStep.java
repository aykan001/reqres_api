package stepdefinitions;

import io.cucumber.java.en.*;
import client.UserClient;
import utils.BodyBuilder;
import utils.TextContext;
import static org.junit.Assert.*;
import java.time.*;

public class UserUpdateStep {

    TextContext context;

    public UserUpdateStep(TextContext context) {
        this.context = context;
    }
    @Given("user update icin {string} ve {string} valid body gonder")
    public void updateUser(String name, String job) {
        new UserClient();
        context.response = UserClient
                .updateUser(BodyBuilder.user(name, job));
    }
    @Given("user update icin bos body gonder")
    public void emptyBody() {
        new UserClient();
        context.response = UserClient.updateUser(new java.util.HashMap<>());
    }
    @Given("user update icin empty body gonder")
    public void emptyJson() {
        new UserClient();
        context.response = UserClient.updateUser(new java.util.HashMap<>());
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
}