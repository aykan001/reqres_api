package stepdefinitions;

import bodys.UpdateBody;
import io.cucumber.java.en.*;
import service.UserService;
import utils.TextContext;
import java.time.Duration;
import java.time.OffsetDateTime;

import static org.junit.Assert.*;

public class UserStep {

    UserService userService;
    TextContext context;

    public UserStep(TextContext context) {
        this.context = context;
        this.userService = new UserService(context); // 🔥 KRİTİK FIX
    }

    @Given("{string} user request atilir")
    public void getUser(String id) {
        userService.getUserDetail(id);
    }

    @Given("users list request atilir")
    public void getUsers() {
        userService.getUsersDetail();
    }

    @Given("user update icin {string} ve {string} body gonder")
    public void updateUser(String name, String job) {

        UpdateBody response =
                userService.updateUserEndpointDetail(name, job);

        assertEquals(name, response.getName());
        assertEquals(job, response.getJob());
    }

    @Given("user update icin {string} ve {string} valid body gonder")
    public void updateInvalidBodyUser(String name, String job) {

        UpdateBody response =
                userService.updateUserEndpointDetail(name, job);

        assertEquals(name, response.getName());
        assertEquals(job, response.getJob());
    }

    @And("{string} {string} bos olmamali ve dogru olmali")
    public void fieldCheck(String field, String expected) {

        String actual = userService.fieldCheckDetail(field);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @And("updatedAt bos olmamali ve dogru olmali")
    public void updatedAtCheck() {

        String updatedAt = userService.updatedAtCheckDetail();

        assertNotNull(updatedAt);

        OffsetDateTime time = OffsetDateTime.parse(updatedAt);
        OffsetDateTime now = OffsetDateTime.now();

        assertTrue(Duration.between(time, now).getSeconds() < 5);
    }

    @Given("user updated icin without auth {string} {string} body gonder")
    public void userUpdatedIcinWithoutAuthBodyGonder(String name, String job) {

        userService.userUpdatedIcinWithoutAuthBodyDetail(name, job);
    }

    @Given("delete icin {string} user request atilir")
    public void deleteUserByIdRequestAtilir(String id) {

        userService.deleteUserByIdDetail(id);
    }

    @Given("without auth user {string} request atilir")
    public void withoutAuthUserStringRequestAtilir(String id) {
        userService.getWithoutAuthUserDetail(id);
    }

    @Given("without auth users request atilir")
    public void withoutAuthUsers() {
        userService.getWithoutAuthUsersDetail();
    }
    @Given("delete without auth user {string} request atilir")
    public void withoutAuthDeleteUser(String id){
        userService.deleteWithoutAuthUserDetail(id);
    }

    @Given("no id user request atilir")
    public void noIdUserRequestAtilir() {
        userService.getNoIdUserDetail();
    }

    @Given("wrong url user {string} request atilir")
    public void wrongUrlUserRequestAtilir(String id) {
        userService.getWrongUrlUserDetail(id);
    }

}