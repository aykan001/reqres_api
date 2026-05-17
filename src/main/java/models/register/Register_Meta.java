package models.register;

import lombok.Data;
import models.register._meta.Register_MetaCTA;

@Data
public class Register_Meta {
    private String powered_by;
    private String docs_url;
    private String upgrade_url;
    private String example_url;
    private String variant;
    private String message;
    private Register_MetaCTA registerMetaCTA;
    private String context;

}
