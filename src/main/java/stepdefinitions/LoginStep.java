package stepdefinitions;

import io.cucumber.java.en.*;
import models.LoginBody;
import servers.LoginServer;
import servers.RegisterServer;
import utils.TextContext;

import java.util.HashMap;
import java.util.Map;

public class LoginStep {
    TextContext context;

    public LoginStep(TextContext context) {
        this.context = context;
    }
    
    @Given("login icin {string} ve {string} body gönder")
    public void setLoginBody(String email, String password) {
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
        }else {
            LoginBody body=new LoginBody(email, password);
            context.response= LoginServer.postLogin(body);
        }


    }
}
