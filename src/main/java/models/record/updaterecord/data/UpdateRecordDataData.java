package models.record.updaterecord.data;

import lombok.Data;

@Data
public class UpdateRecordDataData {
    private String name;
    private float price;
    private String category;
    private boolean in_stock;
}
