package utils;

import io.cucumber.java.en.Then;

public class VerifyStatusCode {
   TextContext context;
   public VerifyStatusCode(TextContext context){
       this.context=context;
   }
    @Then("response status code {int} olmali")
    public void verifyStatusCode(int expectedStatusCode) {
        context.response.then()
                .statusCode(expectedStatusCode)
                .log().all();
    }
}
