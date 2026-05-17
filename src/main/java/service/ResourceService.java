package service;

import clients.ResourceClient;
import utils.TextContext;

public class ResourceService {

    TextContext context;
    public ResourceService(TextContext context){this.context=context;}

    public void getResourcesDetail(){ResourceClient.getResources();}
    public void getWrongEndpointResourcesDetail(String endpoint){ResourceClient.getWrongEndpointResources(endpoint);}
    public void getWithoutAuthResourcesDetail(){ResourceClient.getWithoutAuthResources();}
}
