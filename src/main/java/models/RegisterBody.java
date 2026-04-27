package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterBody {
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;

    public RegisterBody(String email, String password){
        this.email=email;
        this.password=password;
    }
    public String getEmail() {return email;}

    public String getPassword() {return password;}
}
