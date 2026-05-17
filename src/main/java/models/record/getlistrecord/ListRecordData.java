package models.record.getlistrecord;

import lombok.Data;
import models.record.getlistrecord.data.RecordDataData;

@Data
public class ListRecordData {
    private String id;
    private String collection_id;
    private String project_id=null;
    private int app_user_id;
    private int created_by;
    private String created_at;
    private String updated_at;
    private String deleted_at=null;
    private RecordDataData recordDataData;

}
