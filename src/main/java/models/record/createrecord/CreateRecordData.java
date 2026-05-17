package models.record.createrecord;

import lombok.Data;

@Data
public class CreateRecordData {
    private String id;
    private String collection_id;
    private int project_id;
    private String app_user_id=null;
    private int created_by;
    private String created_at;
    private String updated_at;
    private String deleted_at=null;



}
