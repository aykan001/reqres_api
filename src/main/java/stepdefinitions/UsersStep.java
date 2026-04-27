package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TextContext;
import static org.junit.Assert.*;
import static servers.UsersServer.*;

public class UsersStep {
    TextContext context;
    public UsersStep(TextContext context){
        this.context=context;
    }
    @Given("users list request atilir")
    public void sendUsersRequest(){
        context.response = getUsers();
    }

}
