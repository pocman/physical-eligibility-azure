package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-22T13:40:44.536Z")
public class Product   {
  
  private String productId = null;
  private String description = null;
  private String displayName = null;
  private String capacity = null;
  private String image = null;

  
  /**
   * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
   **/
  public Product productId(String productId) {
    this.productId = productId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.")
  @JsonProperty("product_id")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   * Description of product.
   **/
  public Product description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of product.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Display name of product.
   **/
  public Product displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(value = "Display name of product.")
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * Capacity of product. For example, 4 people.
   **/
  public Product capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  
  @ApiModelProperty(value = "Capacity of product. For example, 4 people.")
  @JsonProperty("capacity")
  public String getCapacity() {
    return capacity;
  }
  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  
  /**
   * Image URL representing the product.
   **/
  public Product image(String image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(value = "Image URL representing the product.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(productId, product.productId) &&
        Objects.equals(description, product.description) &&
        Objects.equals(displayName, product.displayName) &&
        Objects.equals(capacity, product.capacity) &&
        Objects.equals(image, product.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, description, displayName, capacity, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

