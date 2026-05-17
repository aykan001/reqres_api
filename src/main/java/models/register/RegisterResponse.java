package models.register;

import lombok.Data;

@Data
public class RegisterResponse {
    private int id;
    private String token;
    private Register_Meta registerMeta;
}
