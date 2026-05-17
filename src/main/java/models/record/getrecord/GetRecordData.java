package models.record.getrecord;

import lombok.Data;
import models.record.getrecord.data.GetRecordDataData;

@Data
public class GetRecordData {
    private String id;
    private String collection_id;
    private int project_id;
    private String app_user_id=null;
    private int created_by;
    private String created_at;
    private String updated_at;
    private String deleted_at=null;
    private GetRecordDataData recordData;
}
