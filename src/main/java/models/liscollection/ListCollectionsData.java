package models.liscollection;

import lombok.Data;
import models.liscollection.schema.ListCollectionsDataSchema;

@Data
public class ListCollectionsData {
    private String id;
    private int project_id;
    private int user_id;
    private String name;
    private String slug;
    private ListCollectionsDataSchema listCollectionsDataSchema;
    private String visibility;
    private String created_at;
    private String updated_at;
}
