# ClustersApi

All URIs are relative to *https://api.ionos.com/databases/mongodb*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clustersDelete**](ClustersApi.md#clustersdelete) | **DELETE** /clusters/{clusterId} | Delete a Cluster |
| [**clustersFindById**](ClustersApi.md#clustersfindbyid) | **GET** /clusters/{clusterId} | Get a cluster by id |
| [**clustersGet**](ClustersApi.md#clustersget) | **GET** /clusters | Get Clusters |
| [**clustersPatch**](ClustersApi.md#clusterspatch) | **PATCH** /clusters/{clusterId} | Patch a cluster |
| [**clustersPost**](ClustersApi.md#clusterspost) | **POST** /clusters | Create a Cluster |


<a name="clustersDelete"></a>
# **clustersDelete**
> ClusterResponse clustersDelete(clusterId)

Delete a Cluster

Deletes a MongoDB cluster.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ClustersApi apiInstance = new ClustersApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    try {
      ClusterResponse result = apiInstance.clustersDelete(clusterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |

### Return type

[**ClusterResponse**](../models/ClusterResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersFindById"></a>
# **clustersFindById**
> ClusterResponse clustersFindById(clusterId)

Get a cluster by id

Get a cluster by id.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ClustersApi apiInstance = new ClustersApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    try {
      ClusterResponse result = apiInstance.clustersFindById(clusterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |

### Return type

[**ClusterResponse**](../models/ClusterResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersGet"></a>
# **clustersGet**
> ClusterList clustersGet(limit, offset, filterName)

Get Clusters

Retrieves a list of MongoDB clusters.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ClustersApi apiInstance = new ClustersApi(defaultClient);
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    String filterName = "filterName_example"; // String | Response filter to list only the MongoDB clusters that contain the specified name. The value is case insensitive and matched on the 'displayName' field. 
    try {
      ClusterList result = apiInstance.clustersGet(limit, offset, filterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **Integer**| The maximum number of elements to return. Use together with &#39;offset&#39; for pagination. | [optional] [default to 100]
| **offset** | **Integer**| The first element to return. Use together with &#39;limit&#39; for pagination. | [optional] [default to 0]
| **filterName** | **String**| Response filter to list only the MongoDB clusters that contain the specified name. The value is case insensitive and matched on the &#39;displayName&#39; field.  | [optional]

### Return type

[**ClusterList**](../models/ClusterList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersPatch"></a>
# **clustersPatch**
> ClusterResponse clustersPatch(clusterId, patchClusterRequest)

Patch a cluster

Patch attributes of a MongoDB cluster.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ClustersApi apiInstance = new ClustersApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    PatchClusterRequest patchClusterRequest = new PatchClusterRequest(); // PatchClusterRequest | Part of the cluster which should be modified.
    try {
      ClusterResponse result = apiInstance.clustersPatch(clusterId, patchClusterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **patchClusterRequest** |  [**PatchClusterRequest**](../models/PatchClusterRequest.md)| Part of the cluster which should be modified. |

### Return type

[**ClusterResponse**](../models/ClusterResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersPost"></a>
# **clustersPost**
> ClusterResponse clustersPost(createClusterRequest)

Create a Cluster

Creates a new MongoDB cluster. 

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ClustersApi apiInstance = new ClustersApi(defaultClient);
    CreateClusterRequest createClusterRequest = new CreateClusterRequest(); // CreateClusterRequest | The cluster to be created.
    try {
      ClusterResponse result = apiInstance.clustersPost(createClusterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createClusterRequest** |  [**CreateClusterRequest**](../models/CreateClusterRequest.md)| The cluster to be created. |

### Return type

[**ClusterResponse**](../models/ClusterResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

