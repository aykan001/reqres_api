package stepdefinitions;

import client.AuthClient;
import io.cucumber.java.en.*;
import utils.BodyBuilder;
import utils.TextContext;

public class AuthStep {

    TextContext context;

    public AuthStep(TextContext context) {
        this.context = context;
    }

    @Given("login icin {string} ve {string} body gönder")
    public void login(String email, String password) {
        context.response = AuthClient.login(
                BodyBuilder.auth(email, password)
        );
    }

    @Given("register icin {string} ve {string} body gönder")
    public void register(String email, String password) {
        context.response = AuthClient.register(
                BodyBuilder.auth(email, password)
        );
    }

    @Given("login without apikey")
    public void loginNoKey() {
        context.response = AuthClient.loginWithoutApiKey(
                BodyBuilder.auth("eve.holt@reqres.in", "cityslicka")
        );
    }
}