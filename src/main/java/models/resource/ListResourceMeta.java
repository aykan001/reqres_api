package models.resource;

import lombok.Data;
import models.resource.meta_cta.ResourceMetaCTA;

@Data
public class ListResourceMeta {
    private String powered_by;
    private String docs_url;
    private String upgrade_url;
    private String example_url;
    private String variant;
    private String message;
    private ResourceMetaCTA resourceMetaCTA;
    private String context;

}
