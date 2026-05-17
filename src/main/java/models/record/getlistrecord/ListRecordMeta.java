package models.record.getlistrecord;

import lombok.Data;

@Data
public class ListRecordMeta {
    private int page;
    private int limit;
    private int total;
    private  int pages;
}
