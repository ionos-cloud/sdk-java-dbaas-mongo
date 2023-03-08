# LogsApi

All URIs are relative to *https://api.ionos.com/databases/mongodb*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clustersLogsGet**](LogsApi.md#clusterslogsget) | **GET** /clusters/{clusterId}/logs | Get logs of your cluster |


<a name="clustersLogsGet"></a>
# **clustersLogsGet**
> ClusterLogs clustersLogsGet(clusterId, start, end, direction, limit)

Get logs of your cluster

Retrieves MongoDB logs based on the given parameters.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.LogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LogsApi apiInstance = new LogsApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | The start time for the query in RFC3339 format. Must not be more than 30 days ago but before the end parameter. The default is 30 days ago.
    OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | The end time for the query in RFC3339 format. Must not be greater than now. The default is the current timestamp.
    String direction = "BACKWARD"; // String | The direction in which to scan through the logs. The logs are returned in order of the direction.
    Integer limit = 100; // Integer | The maximal number of log lines to return.  If the limit is reached then log lines will be cut at the end (respecting the scan direction).
    try {
      ClusterLogs result = apiInstance.clustersLogsGet(clusterId, start, end, direction, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#clustersLogsGet");
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
| **start** | **OffsetDateTime**| The start time for the query in RFC3339 format. Must not be more than 30 days ago but before the end parameter. The default is 30 days ago. | [optional]
| **end** | **OffsetDateTime**| The end time for the query in RFC3339 format. Must not be greater than now. The default is the current timestamp. | [optional]
| **direction** | **String**| The direction in which to scan through the logs. The logs are returned in order of the direction. | [optional] [default to BACKWARD] [enum: BACKWARD, FORWARD]
| **limit** | **Integer**| The maximal number of log lines to return.  If the limit is reached then log lines will be cut at the end (respecting the scan direction). | [optional] [default to 100]

### Return type

[**ClusterLogs**](../models/ClusterLogs.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

