package service;

import bodys.LoginBody;
import clients.LoginClient;
import utils.TextContext;

public class LoginService {

    TextContext context;
    public LoginService(TextContext context){this.context=context;}

    public void setLoginDetail(String email, String password){
        LoginBody body=new LoginBody();
        body.setEmail(email);
        body.setPassword(password);
        LoginClient
                .setLogin(body)
                .extract()
                .as(LoginBody.class);
    }
    public void setWithoutAuthLogin(String email,String password){
        LoginBody body=new LoginBody();
        body.setEmail(email);
        body.setPassword(password);
        LoginClient
                .setWithoutAuthLogin(body)
                .extract()
                .as(LoginBody.class);
    }
}
