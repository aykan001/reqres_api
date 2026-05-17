package models.resource;

import lombok.Data;
import java.util.List;

@Data
public class ListResourceResponse {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<ListResourceData> data;
    private ListResourceSupport resourceSupport;

}
