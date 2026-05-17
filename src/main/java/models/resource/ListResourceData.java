package models.resource;

import lombok.Data;

@Data
public class ListResourceData {
    private int id;
    private String name;
    private int year;
    private String color;
    private String pantone_value;
}
