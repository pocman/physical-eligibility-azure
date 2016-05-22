package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.PriceEstimate;
import io.swagger.model.Product;
import java.util.UUID;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-22T13:40:44.536Z")
public abstract class EstimatesApiService {
  
      public abstract Response estimatesPriceGet(Double startLatitude,Double startLongitude,Double endLatitude,Double endLongitude,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response estimatesTimeGet(Double startLatitude,Double startLongitude,UUID customerUuid,String productId,SecurityContext securityContext)
      throws NotFoundException;
  
}
