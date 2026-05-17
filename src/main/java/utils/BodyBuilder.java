package utils;

import java.util.HashMap;
import java.util.Map;

public class BodyBuilder {
    public static RecordBody recordBodyBuilder(String name,
                                               String price,
                                               String category,
                                               String in_stock){
        RecordData recordData=new RecordData(
                name,
                Double.parseDouble(price),
                category,
                Boolean.parseBoolean(in_stock)
        );
        return new RecordBody(recordData);
    }

    public static Map<String, Object> auth(String email, String password) {

        Map<String, Object> body = new HashMap<>();

        if (!"NULL".equals(email)) {
            body.put("email", "EMPTY".equals(email) ? "" : email);
        }

        if (!"NULL".equals(password)) {
            body.put("password", "EMPTY".equals(password) ? "" : password);
        }

        return body;
    }
    public static Map<String, Object> user(String name, String job) {

        Map<String, Object> body = new HashMap<>();

        if (!"NULL".equals(name)) {
            body.put("name", "EMPTY".equals(name) ? "" : name);
        }

        if (!"NULL".equals(job)) {
            body.put("job", "EMPTY".equals(job) ? "" : job);
        }

        return body;
    }
    public static Map<String,Object> record(String name, boolean in_stock, double price, String category){
        Map<String,Object> body=new HashMap<>();

        if (!"NULL".equals(name)) {
            body.put("name", "EMPTY".equals(name) ? "" : name);
        }
        if (!"NULL".equals(in_stock)) {
            body.put("in_stock", "EMPTY".equals(in_stock) ? "" : in_stock);
        }
        if (!"NULL".equals(price)) {
            body.put("price", "EMPTY".equals(price) ? "" : price);
        }

        if (!"NULL".equals(category)) {
            body.put("category", "EMPTY".equals(category) ? "" : category);
        }
        return body;
    }
}