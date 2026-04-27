package stepdefinitions;

import io.cucumber.java.en.*;
import models.RegisterBody;
import servers.RegisterServer;
import utils.TextContext;
import java.util.HashMap;
import java.util.Map;

public class RegisterStep {
    TextContext context;
    public RegisterStep(TextContext context){this.context=context;}
    @Given("user register icin {string} ve {string} body gönder")
    public void setBody(String email, String password) {

        if(email.equals("NULL") || password.equals("NULL") ||
                email.equals("EMPTY") || password.equals("EMPTY")) {

            Map<String, Object> body = new HashMap<>();

            if (!email.equals("NULL")) {
                body.put("email", email.equals("EMPTY") ? "" : email);
            }

            if (!password.equals("NULL")) {
                body.put("password", password.equals("EMPTY") ? "" : password);
            }

            context.response = RegisterServer.postRegister(body);
        }
        else {
            RegisterBody body = new RegisterBody(email, password);
            context.response = RegisterServer.postRegister(body);
        }
    }
}
