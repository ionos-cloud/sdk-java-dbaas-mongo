/*
 * IONOS DBaaS MongoDB REST API
 * With IONOS Cloud Database as a Service, you have the ability to quickly set up and manage a MongoDB database. You can also delete clusters, manage backups and users via the API.   MongoDB is an open source, cross-platform, document-oriented database program. Classified as a NoSQL database program, it uses JSON-like documents with optional schemas.  The MongoDB API allows you to create additional database clusters or modify existing ones. Both tools, the Data Center Designer (DCD) and the API use the same concepts consistently and are well suited for smooth and intuitive use. 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Properties of a snapshot.
 */
@ApiModel(description = "Properties of a snapshot.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-12T08:52:41.764Z[Etc/UTC]")

public class SnapshotProperties {
  
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;


  public static final String SERIALIZED_NAME_CREATION_TIME = "creationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  

  public SnapshotProperties version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The MongoDB version this backup was created from.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.0", value = "The MongoDB version this backup was created from.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  public SnapshotProperties size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size of the snapshot in Mebibytes.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150", value = "The size of the snapshot in Mebibytes.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }



  public SnapshotProperties creationTime(OffsetDateTime creationTime) {
    
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The date the resource was created.
   * @return creationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-10T13:37:50+01:00", value = "The date the resource was created.")

  public OffsetDateTime getCreationTime() {
    return creationTime;
  }


  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotProperties snapshotProperties = (SnapshotProperties) o;
    return Objects.equals(this.version, snapshotProperties.version) && Objects.equals(this.size, snapshotProperties.size) && Objects.equals(this.creationTime, snapshotProperties.creationTime);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotProperties {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");

    sb.append("    size: ").append(toIndentedString(size)).append("\n");

    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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

