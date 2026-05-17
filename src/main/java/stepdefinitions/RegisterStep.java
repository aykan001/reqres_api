package stepdefinitions;

import io.cucumber.java.en.*;
import service.RegisterService;
import utils.TextContext;

public class RegisterStep {
    RegisterService registerService;
    TextContext context;

    public RegisterStep(TextContext context) {
        this.context = context;
    }

    @Given("user register icin {string} ve {string} body gönder")
    public void register(String email, String password) {
        registerService.setRegisterDetail(email,password);
    }

    @Given("user register icin {string} ve {string} invalid body gönder")
    public void userRegisterIcinVeInvalidBodyGonder(String email, String password) {
        registerService.setWrongBodyRegisterDetail(email, password);
    }

    @Given("without auth register {string} ve {string} request atilir")
    public void withoutAuthRegisterRequestAtilir(String email,String password) {
        registerService.setWithoutAuthRegisterDetail(email, password);
    }
}