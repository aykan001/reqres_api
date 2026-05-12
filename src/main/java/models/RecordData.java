package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecordData {

    @JsonProperty("name")
    private String name;

    @JsonProperty("price")
    private double price;

    @JsonProperty("category")
    private String category;

    @JsonProperty("in_stock")
    private boolean in_stock;

    public RecordData(String name, double price, String category, boolean in_stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.in_stock = in_stock;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isIn_stock() {
        return in_stock;
    }
}