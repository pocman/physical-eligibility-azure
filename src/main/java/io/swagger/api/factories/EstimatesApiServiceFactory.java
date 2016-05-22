package io.swagger.api.factories;

import io.swagger.api.EstimatesApiService;
import io.swagger.api.impl.EstimatesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-22T13:40:44.536Z")
public class EstimatesApiServiceFactory {

   private final static EstimatesApiService service = new EstimatesApiServiceImpl();

   public static EstimatesApiService getEstimatesApi()
   {
      return service;
   }
}
