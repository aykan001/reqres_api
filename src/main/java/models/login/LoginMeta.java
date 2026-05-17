package models.login;

import lombok.Data;
import models.login.metacta.LoginMetaCTA;

@Data
public class LoginMeta {
    private String powered_by;
    private String docs_url;
    private String upgrade_url;
    private String example_url;
    private String variant;
    private String message;
    private LoginMetaCTA loginMetaCTA;
    private String context;


}
