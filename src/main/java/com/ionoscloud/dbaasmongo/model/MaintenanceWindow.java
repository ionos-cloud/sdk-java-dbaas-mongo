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
import com.ionoscloud.dbaasmongo.model.DayOfTheWeek;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A weekly window of 4 hours during which maintenance work can be performed. 
 */
@ApiModel(description = "A weekly window of 4 hours during which maintenance work can be performed. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-24T12:17:12.722Z[Etc/UTC]")

public class MaintenanceWindow {
  
  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;


  public static final String SERIALIZED_NAME_DAY_OF_THE_WEEK = "dayOfTheWeek";
  @SerializedName(SERIALIZED_NAME_DAY_OF_THE_WEEK)
  private DayOfTheWeek dayOfTheWeek;

  

  public MaintenanceWindow time(String time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "16:30:59", required = true, value = "")

  public String getTime() {
    return time;
  }


  public void setTime(String time) {
    this.time = time;
  }



  public MaintenanceWindow dayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
    
    this.dayOfTheWeek = dayOfTheWeek;
    return this;
  }

   /**
   * Get dayOfTheWeek
   * @return dayOfTheWeek
  **/
  @ApiModelProperty(required = true, value = "")

  public DayOfTheWeek getDayOfTheWeek() {
    return dayOfTheWeek;
  }


  public void setDayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
    this.dayOfTheWeek = dayOfTheWeek;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindow maintenanceWindow = (MaintenanceWindow) o;
    return Objects.equals(this.time, maintenanceWindow.time) && Objects.equals(this.dayOfTheWeek, maintenanceWindow.dayOfTheWeek);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindow {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");

    sb.append("    dayOfTheWeek: ").append(toIndentedString(dayOfTheWeek)).append("\n");
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

