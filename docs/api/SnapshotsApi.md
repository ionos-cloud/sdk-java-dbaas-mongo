# SnapshotsApi

All URIs are relative to *https://api.ionos.com/databases/mongodb*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clustersSnapshotsGet**](SnapshotsApi.md#clusterssnapshotsget) | **GET** /clusters/{clusterId}/snapshots | Get the snapshots of your cluster |


<a name="clustersSnapshotsGet"></a>
# **clustersSnapshotsGet**
> SnapshotList clustersSnapshotsGet(clusterId, limit, offset)

Get the snapshots of your cluster

Retrieves MongoDB snapshots.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    try {
      SnapshotList result = apiInstance.clustersSnapshotsGet(clusterId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#clustersSnapshotsGet");
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
| **limit** | **Integer**| The maximum number of elements to return. Use together with &#39;offset&#39; for pagination. | [optional] [default to 100]
| **offset** | **Integer**| The first element to return. Use together with &#39;limit&#39; for pagination. | [optional] [default to 0]

### Return type

[**SnapshotList**](../models/SnapshotList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

