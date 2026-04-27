package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginBody {
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;

    public LoginBody(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }


}
