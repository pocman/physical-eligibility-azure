package io.swagger.api.factories;

import io.swagger.api.HistoryApiService;
import io.swagger.api.impl.HistoryApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-22T13:40:44.536Z")
public class HistoryApiServiceFactory {

   private final static HistoryApiService service = new HistoryApiServiceImpl();

   public static HistoryApiService getHistoryApi()
   {
      return service;
   }
}
