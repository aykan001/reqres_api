package models.user.updateuser;

import lombok.Data;

@Data
public class UpdateUserResponse {
    private String name;
    private String job;
    private String updateAt;
    private UpdateUserMeta updateUserMeta;

}
