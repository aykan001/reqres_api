package models.liscollection;

import lombok.Data;

import java.util.List;
@Data
public class ListCollectionResponse {
    private List<ListCollectionsData> data;
}
