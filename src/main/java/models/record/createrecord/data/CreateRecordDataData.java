package models.record.createrecord.data;

import lombok.Data;

@Data
public class CreateRecordDataData {
    private String name;
    private float price;
    private String category;
    private boolean in_stock;
}
