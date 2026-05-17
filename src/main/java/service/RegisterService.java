package service;

import bodys.RegisterBody;
import clients.RegisterClient;
import utils.TextContext;

public class RegisterService {

    TextContext context;
    public RegisterService(TextContext context){this.context=context;}

    public void setRegisterDetail(String email, String password){
        RegisterBody body=new RegisterBody(email, password);
        body.setEmail(email);
        body.setPassword(password);
        RegisterClient.setRegister(body).extract().as(RegisterBody.class);
    }
    public void setWrongBodyRegisterDetail(String email,String password){
        RegisterBody body=new RegisterBody(email, password);
        body.setEmail(email);
        body.setPassword(password);
        RegisterClient.setWrongBodyRegister(body).extract().as(RegisterBody.class);
    }
    public void setWithoutAuthRegisterDetail(String email,String password){
        RegisterBody body=new RegisterBody(email, password);
        body.setEmail(email);
        body.setPassword(password);
        RegisterClient.setWithoutAuthRegister(body).extract().as(RegisterBody.class);
    }
}
