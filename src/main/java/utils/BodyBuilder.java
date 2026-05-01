package utils;

import java.util.HashMap;
import java.util.Map;

public class BodyBuilder {

    // LOGIN + REGISTER
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

    // USER UPDATE
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
}