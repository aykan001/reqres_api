package models.user.getuser;

import lombok.Data;

@Data
public class UserResponse {
    private UserData data;
    private UserSupport support;
    private UserMeta meta;
}
