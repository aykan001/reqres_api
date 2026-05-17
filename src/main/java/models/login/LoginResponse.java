package models.login;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private LoginMeta loginMeta;
}
