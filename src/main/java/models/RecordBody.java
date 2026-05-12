package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecordBody {

    @JsonProperty("data")
    private RecordData data;

    public RecordBody(RecordData data){
        this.data=data;
    }
    public RecordData getData() {
        return data;
    }
    public void setData(RecordData data) {
        this.data = data;
    }
}
