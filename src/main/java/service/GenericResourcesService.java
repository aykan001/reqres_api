package service;

import clients.GenericResourcesClient;
import clients.ResourceClient;
import utils.TextContext;

public class GenericResourcesService {

    TextContext context;
    public GenericResourcesService(TextContext context){this.context=context;}

    public void getGenericResourcesDetail(String page){
        GenericResourcesClient.getGenericResources(page);
    }
    public void getWithoutAuthGenericResourcesDetail(String page){
        GenericResourcesClient.getWithoutAuthGenericResources(page);
    }
}
