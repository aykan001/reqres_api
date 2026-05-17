package models.liscollection.schema;

import lombok.Data;

@Data
public class ListCollectionsDataSchema {
    private String name;
    private String price;
    private String  category;
    private String in_stock;
}
