package stepdefinitions;

import io.cucumber.java.en.*;
import models.UpdateBody;
import servers.UserUpdateServer;
import utils.TextContext;
import java.time.*;
import java.util.*;
import static org.junit.Assert.*;

public class UserUpdateStep {
    TextContext context;
    public UserUpdateStep(TextContext context) {
        this.context = context;
    }
    @Given("user update icin {string} ve {string} valid body gonder")
    public void setUserUpdateBody(String name,String job){
        if (name.equals("NULL")||job.equals("NULL")
                ||name.equals("EMPTY")||job.equals("EMPTY")){
            Map<String,Object> body=new HashMap<>();
            if (!name.equals("NULL")){
                body.put("name",name.equals("EMPTY") ? "":name);
            }
            if (!job.equals("NULL")){
                body.put("job",job.equals("EMPTY") ? "":job);
            }
            context.response=UserUpdateServer.getUserUpdate(body);
        }
        else {
            UpdateBody body=new UpdateBody(name,job);
            context.response= UserUpdateServer.getUserUpdate(body);
        }
    }
    @And("{string} {string} bos olmamali ve dogru olmali")
    public void fieldKontrol(String field, String expectedValue) {
        String actual = context.response.jsonPath().get(field);

        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expectedValue, actual);
    }

    @And("updatedAt bos olmamali ve dogru olmali")
    public void updatedatBosOlmamaliVeDogruOlmali() {
        String updatedAt = context.response.jsonPath().get("updatedAt");
        assertNotNull(updatedAt);
        assertFalse(updatedAt.isEmpty());

        OffsetDateTime responseTime = OffsetDateTime.parse(updatedAt);
        OffsetDateTime now = OffsetDateTime.now();

        Duration diff = Duration.between(responseTime, now);

        assertTrue("Not within the expected range",Math.abs(diff.getSeconds()) < 5);

        assertEquals(200, context.response.statusCode());
    }

    @Given("user update icin bos body gonder")
    public void userUpdateIcinBosBodyGonder() {
        Map<String, Object> body=new HashMap<>();
        context.response=UserUpdateServer.getUserUpdate(body);
    }

    @And("the response returned is an {string}")
    public void theResponseReturnedIsAnAndA(String updatedError) {
        String error=context.response.jsonPath().get("error");
        assertNotNull(error);
        assertFalse(error.isEmpty());
        assertEquals(updatedError,error);
    }

    @And("the response returned is a {string}")
    public void theResponseReturnedIsA(String updatedMessage) {
        String message=context.response.jsonPath().get("message");
        assertNotNull(message);
        assertFalse(message.isEmpty());
        assertEquals(updatedMessage,message);

    }
    @Given("user update icin empty body gonder")
    public void emptyBodyGonder() {

        String emptyJson = "{}";

        context.response = UserUpdateServer.getUserUpdateInvalid(emptyJson);
    }
}
