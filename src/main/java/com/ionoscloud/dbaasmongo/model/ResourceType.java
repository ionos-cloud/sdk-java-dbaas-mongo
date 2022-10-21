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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The resource type.
 */
@JsonAdapter(ResourceType.Adapter.class)
public enum ResourceType {
  
  COLLECTION("collection"),
  
  CLUSTER("cluster"),
  
  USER("user");

  private String value;

  ResourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResourceType fromValue(String value) {
    for (ResourceType b : ResourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ResourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResourceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResourceType.fromValue(value);
    }
  }
}
