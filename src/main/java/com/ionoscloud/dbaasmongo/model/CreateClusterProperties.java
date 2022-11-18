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
import com.ionoscloud.dbaasmongo.model.Connection;
import com.ionoscloud.dbaasmongo.model.MaintenanceWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The properties with all data needed to create a new MongoDB cluster. 
 */
@ApiModel(description = "The properties with all data needed to create a new MongoDB cluster. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-18T17:02:46.259Z[Etc/UTC]")

public class CreateClusterProperties {
  
  public static final String SERIALIZED_NAME_TEMPLATE_I_D = "templateID";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_I_D)
  private String templateID;


  public static final String SERIALIZED_NAME_MONGO_D_B_VERSION = "mongoDBVersion";
  @SerializedName(SERIALIZED_NAME_MONGO_D_B_VERSION)
  private String mongoDBVersion;


  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private Integer instances;


  public static final String SERIALIZED_NAME_CONNECTIONS = "connections";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS)
  private List<Connection> connections = new ArrayList<Connection>();


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;


  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;


  public static final String SERIALIZED_NAME_MAINTENANCE_WINDOW = "maintenanceWindow";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_WINDOW)
  private MaintenanceWindow maintenanceWindow;

  

  public CreateClusterProperties templateID(String templateID) {
    
    this.templateID = templateID;
    return this;
  }

   /**
   * The unique ID of the template, which specifies the number of cores, storage size, and memory. You cannot downgrade to a smaller template or minor edition (e.g. from business to playground). To get a list of all templates to confirm the changes use the /templates endpoint. 
   * @return templateID
  **/
  @ApiModelProperty(example = "498ae72f-411f-11eb-9d07-046c59cc737e", required = true, value = "The unique ID of the template, which specifies the number of cores, storage size, and memory. You cannot downgrade to a smaller template or minor edition (e.g. from business to playground). To get a list of all templates to confirm the changes use the /templates endpoint. ")

  public String getTemplateID() {
    return templateID;
  }


  public void setTemplateID(String templateID) {
    this.templateID = templateID;
  }



  public CreateClusterProperties mongoDBVersion(String mongoDBVersion) {
    
    this.mongoDBVersion = mongoDBVersion;
    return this;
  }

   /**
   * The MongoDB version of your cluster.
   * @return mongoDBVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.0", value = "The MongoDB version of your cluster.")

  public String getMongoDBVersion() {
    return mongoDBVersion;
  }


  public void setMongoDBVersion(String mongoDBVersion) {
    this.mongoDBVersion = mongoDBVersion;
  }



  public CreateClusterProperties instances(Integer instances) {
    
    this.instances = instances;
    return this;
  }

   /**
   * The total number of instances in the cluster (one primary and n-1 secondaries). 
   * @return instances
  **/
  @ApiModelProperty(example = "3", required = true, value = "The total number of instances in the cluster (one primary and n-1 secondaries). ")

  public Integer getInstances() {
    return instances;
  }


  public void setInstances(Integer instances) {
    this.instances = instances;
  }



  public CreateClusterProperties connections(List<Connection> connections) {
    
    this.connections = connections;
    return this;
  }

  public CreateClusterProperties addConnectionsItem(Connection connectionsItem) {
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Connection> getConnections() {
    return connections;
  }


  public void setConnections(List<Connection> connections) {
    this.connections = connections;
  }



  public CreateClusterProperties location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The physical location where the cluster will be created. This is the location where all your instances will be located. This property is immutable. 
   * @return location
  **/
  @ApiModelProperty(example = "de/txl", required = true, value = "The physical location where the cluster will be created. This is the location where all your instances will be located. This property is immutable. ")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }



  public CreateClusterProperties displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of your cluster.
   * @return displayName
  **/
  @ApiModelProperty(example = "MongoDB cluster", required = true, value = "The name of your cluster.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }



  public CreateClusterProperties maintenanceWindow(MaintenanceWindow maintenanceWindow) {
    
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }


  public void setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterProperties createClusterProperties = (CreateClusterProperties) o;
    return Objects.equals(this.templateID, createClusterProperties.templateID) && Objects.equals(this.mongoDBVersion, createClusterProperties.mongoDBVersion) && Objects.equals(this.instances, createClusterProperties.instances) && Objects.equals(this.connections, createClusterProperties.connections) && Objects.equals(this.location, createClusterProperties.location) && Objects.equals(this.displayName, createClusterProperties.displayName) && Objects.equals(this.maintenanceWindow, createClusterProperties.maintenanceWindow);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterProperties {\n");
    
    sb.append("    templateID: ").append(toIndentedString(templateID)).append("\n");

    sb.append("    mongoDBVersion: ").append(toIndentedString(mongoDBVersion)).append("\n");

    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");

    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");

    sb.append("    location: ").append(toIndentedString(location)).append("\n");

    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");

    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
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

