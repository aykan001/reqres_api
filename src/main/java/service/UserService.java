package service;

import bodys.UpdateBody;
import clients.UserClient;
import utils.TextContext;

public class UserService {

    TextContext context;

    public UserService(TextContext context){
        this.context = context;
    }

    public void getUserDetail(String id){
        UserClient.getUser(id);
    }

    public void getUsersDetail(){
        UserClient.getUsers();
    }

    public String fieldCheckDetail(String field){

        return context.response
                .jsonPath()
                .getString(field);
    }

    public UpdateBody updateUserEndpointDetail(String name, String job){

        UpdateBody body = new UpdateBody();

        body.setName(name);
        body.setJob(job);

        return UserClient
                .updateUser(body)
                .extract()
                .as(UpdateBody.class);
    }
    public String updatedAtCheckDetail(){
        return  context.response
                .jsonPath()
                .getString("updatedAt");

    }
    public void userUpdatedIcinWithoutAuthBodyDetail(String name, String job){
        UpdateBody body=new UpdateBody();
        body.setName(name);
        body.setJob(job);

        UserClient
                .updateWithoutAuthUser(body)
                .extract()
                .as(UpdateBody.class);
    }
    public void deleteUserByIdDetail(String id){
        UserClient.deleteUser(id);
    }
    public void getWithoutAuthUserDetail(String id){
        UserClient.getWithoutAuthUser(id);
    }
    public void getWithoutAuthUsersDetail(){
        UserClient.getWithoutAuthUsers();
    }
    public void deleteWithoutAuthUserDetail(String id){
        UserClient.deleteWithoutAuthUser(id);
    }
    public void getNoIdUserDetail(){
        UserClient.getNoIdUser();
    }
    public void getWrongUrlUserDetail(String id){
        UserClient.getWrongUrlUser(id);
    }
}