package models.user.updateuser;

import lombok.Data;
import models.user.updateuser.meta_cta.MetaCTA;

@Data
public class UpdateUserMeta {
    private String powered_by;
    private String docs_url;
    private String upgrade_url;
    private String example_url;
    private String variant;
    private String message;
    private MetaCTA metaCTA;
    private String context;
}
