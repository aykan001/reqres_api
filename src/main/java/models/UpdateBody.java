package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateBody {

    @JsonProperty("name")
    private String name;

    @JsonProperty("job")
    private String job;

    // Jackson için zorunlu
    public UpdateBody() {
    }

    public UpdateBody(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}