# RestoresApi

All URIs are relative to *https://api.ionos.com/databases/mongodb*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clustersRestorePost**](RestoresApi.md#clustersrestorepost) | **POST** /clusters/{clusterId}/restore | In-place restore of a cluster |


<a name="clustersRestorePost"></a>
# **clustersRestorePost**
> clustersRestorePost(clusterId, createRestoreRequest)

In-place restore of a cluster

Triggers an in-place restore of the given MongoDB cluster.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.RestoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RestoresApi apiInstance = new RestoresApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    CreateRestoreRequest createRestoreRequest = new CreateRestoreRequest(); // CreateRestoreRequest | The restore request to create.
    try {
      apiInstance.clustersRestorePost(clusterId, createRestoreRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RestoresApi#clustersRestorePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **createRestoreRequest** |  [**CreateRestoreRequest**](CreateRestoreRequest.md)| The restore request to create. |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

