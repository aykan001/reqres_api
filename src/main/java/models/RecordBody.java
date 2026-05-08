package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecordBody {
    @JsonProperty("data")
    private String data;
    @JsonProperty("price")
    private int price;
    @JsonProperty("category")
    private  String category;
    @JsonProperty("in_stock")
    private boolean in_stock;

    public RecordBody(String data, boolean in_stock, int price, String category) {
        this.data = data;
        this.in_stock = in_stock;
        this.price = price;
        this.category = category;
    }
}
