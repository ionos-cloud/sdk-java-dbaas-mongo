/*
 * IONOS DBaaS MongoDB REST API
 * With IONOS Cloud Database as a Service, you have the ability to quickly set up and manage a MongoDB database. You can also delete clusters, manage backups and users via the API.  MongoDB is an open source, cross-platform, document-oriented database program. Classified as a NoSQL database program, it uses JSON-like documents with optional schemas.  The MongoDB API allows you to create additional database clusters or modify existing ones. Both tools, the Data Center Designer (DCD) and the API use the same concepts consistently and are well suited for smooth and intuitive use. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.dbaasmongo.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionoscloud.dbaasmongo.model.ResourceType;
import com.ionoscloud.dbaasmongo.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * List of cluster users.
 */
@ApiModel(description = "List of cluster users.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-24T12:17:12.722Z[Etc/UTC]")

public class UsersList {
  
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ResourceType type;


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<User> items = null;

  

  public UsersList type(ResourceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceType getType() {
    return type;
  }


  public void setType(ResourceType type) {
    this.type = type;
  }



  public UsersList id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "498ae72f-411f-11eb-9d07-046c59cc737e", value = "The unique ID of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



  public UsersList items(List<User> items) {
    
    this.items = items;
    return this;
  }

  public UsersList addItemsItem(User itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<User>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<User> getItems() {
    return items;
  }


  public void setItems(List<User> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersList usersList = (UsersList) o;
    return Objects.equals(this.type, usersList.type) && Objects.equals(this.id, usersList.id) && Objects.equals(this.items, usersList.items);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersList {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

