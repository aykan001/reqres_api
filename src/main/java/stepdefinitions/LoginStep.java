package stepdefinitions;

import io.cucumber.java.en.*;
import service.LoginService;
import utils.BodyBuilder;
import utils.TextContext;

public class LoginStep {
    LoginService loginService;
    TextContext context;

    public LoginStep(TextContext context) {
        this.context = context;
    }

    @Given("login icin {string} ve {string} body gönder")
    public void login(String email, String password) {
        loginService.setLoginDetail(email,password);
    }
    @Given("login without apikey {string} {string}")
    public void loginNoKey(String email,String password) {
        loginService.setWithoutAuthLogin(email,password);
    }
}