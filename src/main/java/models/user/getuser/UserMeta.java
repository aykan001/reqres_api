package models.user.getuser;

import lombok.Data;
import models.user.getuser.meta_cta.UserMetaCTA;

@Data
public class UserMeta {
    private String powered_by;
    private String docs_url;
    private String upgrade_url;
    private String example_url;
    private String variant;
    private UserMetaCTA userMetaCta;
    private String context;

}
