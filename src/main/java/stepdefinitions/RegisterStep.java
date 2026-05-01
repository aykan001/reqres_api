package stepdefinitions;

import io.cucumber.java.en.*;
import client.AuthClient;
import utils.BodyBuilder;
import utils.TextContext;

public class RegisterStep {

    TextContext context;

    public RegisterStep(TextContext context) {
        this.context = context;
    }

    @Given("user register icin {string} ve {string} body gönder")
    public void register(String email, String password) {
        new AuthClient();
        context.response = AuthClient
                .register(BodyBuilder.auth(email, password));
    }
}