package utils;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class VerifyStatusCode {

    TextContext context;

    public VerifyStatusCode(TextContext context) {
        this.context = context;
    }
    @Then("response status code {int} olmali")
    public void verifyStatusCode(int expected) {

        int actual = context.response.getStatusCode();

        assertEquals(expected, actual);

        // debug için
        context.response.then().log().ifValidationFails();
    }
}