/*
 * IONOS DBaaS MongoDB REST API
 * With IONOS Cloud Database as a Service, you have the ability to quickly set up and manage a MongoDB database. You can also delete clusters, manage backups and users via the API.   MongoDB is an open source, cross-platform, document-oriented database program. Classified as a NoSQL database program, it uses JSON-like documents with optional schemas.  The MongoDB API allows you to create additional database clusters or modify existing ones. Both tools, the Data Center Designer (DCD) and the API use the same concepts consistently and are well suited for smooth and intuitive use. 
 *
 * The version of the OpenAPI document: 0.1.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A MongoDB template item.
 */
@ApiModel(description = "A MongoDB template item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-21T07:42:31.609Z[Etc/UTC]")

public class TemplateResponse {
  
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;


  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private Integer ram;


  public static final String SERIALIZED_NAME_STORAGE_SIZE = "storageSize";
  @SerializedName(SERIALIZED_NAME_STORAGE_SIZE)
  private Integer storageSize;

  

  public TemplateResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique template ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15c6dd2f-02d2-4987-b439-9a58dd59ecc3", value = "The unique template ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



  public TemplateResponse cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * The number of CPU cores.
   * @return cores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of CPU cores.")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }



  public TemplateResponse ram(Integer ram) {
    
    this.ram = ram;
    return this;
  }

   /**
   * The amount of memory in GB.
   * @return ram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The amount of memory in GB.")

  public Integer getRam() {
    return ram;
  }


  public void setRam(Integer ram) {
    this.ram = ram;
  }



  public TemplateResponse storageSize(Integer storageSize) {
    
    this.storageSize = storageSize;
    return this;
  }

   /**
   * The amount of storage size in GB.
   * @return storageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "The amount of storage size in GB.")

  public Integer getStorageSize() {
    return storageSize;
  }


  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponse templateResponse = (TemplateResponse) o;
    return Objects.equals(this.id, templateResponse.id) && Objects.equals(this.cores, templateResponse.cores) && Objects.equals(this.ram, templateResponse.ram) && Objects.equals(this.storageSize, templateResponse.storageSize);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");

    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");

    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
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

